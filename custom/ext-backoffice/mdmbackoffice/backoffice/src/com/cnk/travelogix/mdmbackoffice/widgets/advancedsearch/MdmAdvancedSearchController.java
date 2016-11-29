/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.widgets.advancedsearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.Component;

import com.hybris.backoffice.widgets.advancedsearch.AdvancedSearchController;
import com.hybris.backoffice.widgets.advancedsearch.impl.AdvancedSearchData;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.AdvancedSearch;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.ConnectionOperatorType;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.FieldListType;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.FieldType;
import com.hybris.cockpitng.core.util.Validate;
import com.hybris.cockpitng.dataaccess.facades.type.DataAttribute;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.dataaccess.facades.type.exceptions.TypeNotFoundException;
import com.hybris.cockpitng.renderers.header.WidgetCaptionWrapper;
import com.hybris.cockpitng.search.data.SortData;
import com.hybris.cockpitng.search.data.ValueComparisonOperator;



/**
 *
 */
public class MdmAdvancedSearchController extends AdvancedSearchController
{

	private static final Logger LOG = LoggerFactory.getLogger(MdmAdvancedSearchController.class);

	/**
	 *
	 */
	public MdmAdvancedSearchController()
	{
		super();
	}

	@Override
	protected void initCaptionComponents()
	{
		getAttributesGrid().setVisible(true);
		super.initCaptionComponents();
		getAttributesGrid().setVisible(true);
	}

	@Override
	public Component renderCaption(final WidgetCaptionWrapper captionWrapper)
	{
		getAttributesGrid().setVisible(true);
		final Component model = super.renderCaption(captionWrapper);
		getAttributesGrid().setVisible(true);
		return model;
	}

	@Override
	protected AdvancedSearchData initOrLoadAdvancedSearchModel(final AdvancedSearch advancedSearch, final DataType dataType)
	{
		Validate.notNull("Configuration may not be null", new Object[]
		{ advancedSearch });
		Validate.notNull("Data type may not be null", new Object[]
		{ dataType });
		final HashMap<String, AdvancedSearchData> cache = updateCache();
		if (cache.containsKey(dataType.getCode())
				&& BooleanUtils.isFalse(Boolean.valueOf(getWidgetSettings().getBoolean("disableSearchModelCache"))))
		{
			return cache.get(dataType.getCode());
		}

		final AdvancedSearchData model = new AdvancedSearchData(advancedSearch.getFieldList());
		final FieldListType fieldList = advancedSearch.getFieldList();

		for (final FieldType field : fieldList.getField())
		{
			final DataAttribute dataAttr = getDataAttribute(field, dataType);
			if (dataAttr == null)
			{
				continue;
			}
			Validate.notNull(String.format("Cannot find attribute = %s for type = %s ", field.getName(), dataType.getCode()),
					new Object[]
					{ dataAttr });
			final ValueComparisonOperator operator = getAdvancedSearchOperatorService().findMatchingOperator(dataAttr,
					field.getOperator());
			if (operator != null)
			{
				model.addCondition(field, operator, (Object) null);
			}
		}

		model.setTypeCode(dataType.getCode());
		if (advancedSearch.getSortField() != null)
		{
			model.setSortData(new SortData(advancedSearch.getSortField().getName(), advancedSearch.getSortField().isAsc()));
		}

		model.setIncludeSubtypes(Boolean.valueOf(fieldList.isIncludeSubtypes()));

		if (advancedSearch.getConnectionOperator() != null)
		{
			model.setGlobalOperator(ObjectUtils.equals(advancedSearch.getConnectionOperator(), ConnectionOperatorType.OR)
					? ValueComparisonOperator.OR : ValueComparisonOperator.AND);
		}
		else
		{
			model.setGlobalOperator(ValueComparisonOperator.OR);
		}
		cache.put(dataType.getCode(), model);
		return model;
	}

	protected DataAttribute getDataAttribute(final FieldType field, final DataType dataType)
	{
		DataAttribute dataAttr = null;
		if (field.getName().contains("."))
		{
			DataType dataType1 = dataType;
			final List<String> dataElement = Arrays.asList(field.getName().split("\\."));
			int index = 0;
			do
			{
				final String typecode = dataType1.getAttribute(dataElement.get(index)).getValueType().getCode();
				dataType1 = loadDataForCode(typecode);
				index++;
				dataAttr = !getPermissionFacade().canReadProperty(dataType.getCode(), field.getName()) ? null
						: dataType1.getAttribute(dataElement.get(index));
			}
			while (index < dataElement.size() - 1);
		}
		else if (!getPermissionFacade().canReadProperty(dataType.getCode(), field.getName()) || !field.isSelected()
				|| (dataAttr = dataType.getAttribute(field.getName())) == null || !dataAttr.isSearchable())
		{
			dataAttr = null;
		}
		return dataAttr;
	}

	protected DataType loadDataForCode(final String typeCode)
	{
		DataType result = null;
		if (StringUtils.isNotBlank(typeCode))
		{
			final String type = typeCode.trim();
			try
			{
				result = getTypeFacade().load(type);
			}
			catch (final TypeNotFoundException e)
			{
				LOG.error(e.getMessage(), e);
			}
		}
		return result;
	}

	protected HashMap<String, AdvancedSearchData> updateCache()
	{
		HashMap<String, AdvancedSearchData> cache = (HashMap<String, AdvancedSearchData>) this.getValue("searchModelCache",
				(Class) Map.class);
		if (cache == null)
		{
			cache = new HashMap<String, AdvancedSearchData>();
			this.setValue("searchModelCache", cache);
		}
		return cache;
	}
}