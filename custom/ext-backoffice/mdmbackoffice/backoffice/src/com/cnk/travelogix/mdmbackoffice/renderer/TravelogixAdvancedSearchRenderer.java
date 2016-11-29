/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.renderer;



import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.HtmlBasedComponent;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.SelectEvent;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Column;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.ComboitemRenderer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Row;
import org.zkoss.zul.RowRenderer;

import com.cnk.travelogix.mdmbackoffice.actions.EditAction;
import com.google.common.collect.Maps;
import com.hybris.backoffice.widgets.advancedsearch.AdvancedSearchOperatorService;
import com.hybris.backoffice.widgets.advancedsearch.impl.AdvancedSearchData;
import com.hybris.backoffice.widgets.advancedsearch.impl.AdvancedSearchDataConditionEvaluator;
import com.hybris.backoffice.widgets.advancedsearch.impl.SearchConditionData;
import com.hybris.backoffice.widgets.advancedsearch.impl.renderer.AdvancedSearchRenderer;
import com.hybris.cockpitng.components.Actions;
import com.hybris.cockpitng.components.Editor;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.AdvancedSearch;
import com.hybris.cockpitng.core.config.impl.jaxb.hybris.advancedsearch.FieldType;
import com.hybris.cockpitng.dataaccess.facades.permissions.PermissionFacade;
import com.hybris.cockpitng.dataaccess.facades.type.DataAttribute;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.dataaccess.facades.type.TypeFacade;
import com.hybris.cockpitng.dataaccess.facades.type.exceptions.TypeNotFoundException;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.i18n.CockpitLocaleService;
import com.hybris.cockpitng.labels.LabelService;
import com.hybris.cockpitng.search.data.SearchAttributeDescriptor;
import com.hybris.cockpitng.search.data.SortData;
import com.hybris.cockpitng.search.data.ValueComparisonOperator;
import com.hybris.cockpitng.testing.annotation.InextensibleMethod;
import com.hybris.cockpitng.util.UITools;
import com.hybris.cockpitng.util.YTestTools;


/**
 * Search Customization
 */
public class TravelogixAdvancedSearchRenderer extends AdvancedSearchRenderer
{
	private static final Logger LOG = Logger.getLogger(EditAction.class);
	private static final SearchConditionData GRID_ADD_LINE_HOLDER = new SearchConditionData(null, (Object) null, null);

	@Autowired
	private LabelService labelService;

	@Autowired
	private AdvancedSearchOperatorService advancedSearchOperatorService;

	@Autowired
	private PermissionFacade permissionFacade;

	public TravelogixAdvancedSearchRenderer(final TypeFacade typeFacade, final LabelService labelService,
			final AdvancedSearchOperatorService advancedSearchOperatorService, final PermissionFacade permissionFacade,
			final CockpitLocaleService cockpitLocaleService)
	{
		super(typeFacade, labelService, null, advancedSearchOperatorService, permissionFacade, cockpitLocaleService, null);
	}

	public TravelogixAdvancedSearchRenderer(final TypeFacade typeFacade, final LabelService labelService,
			final WidgetInstanceManager widgetInstanceManager, final AdvancedSearchOperatorService advancedSearchOperatorService,
			final PermissionFacade permissionFacade, final CockpitLocaleService cockpitLocaleService)
	{
		super(typeFacade, labelService, widgetInstanceManager, advancedSearchOperatorService, permissionFacade,
				cockpitLocaleService, null);
	}

	public TravelogixAdvancedSearchRenderer(final TypeFacade typeFacade, final LabelService labelService,
			final WidgetInstanceManager widgetInstanceManager, final AdvancedSearchOperatorService advancedSearchOperatorService,
			final PermissionFacade permissionFacade, final CockpitLocaleService cockpitLocaleService,
			final Consumer<Event> editorsEventConsumer)
	{
		super(typeFacade, labelService, widgetInstanceManager, advancedSearchOperatorService, permissionFacade,
				cockpitLocaleService, editorsEventConsumer);
	}

	@Override
	public void renderVisible(final Grid container, final Radiogroup sortControlCnt, final Actions actionSlot,
			final AdvancedSearch configuration, final DataType dataType)
	{
		final AdvancedSearchData advancedSearchData = this.getSearchDataFromModel();
		getFieldEditors().clear();
		final Column sortOrderColumn = getSortOrderColumn(container);
		container.setModel(this.prepareGridModel());
		this.adjustSortOrderColumnVisibility(sortOrderColumn, advancedSearchData);
		container.setRowRenderer(new TravelogixRowRenderer(container, sortControlCnt, actionSlot, configuration, dataType,
				advancedSearchData, sortOrderColumn));
	}

	protected DataType getDataType(final String typeCode)
	{
		try
		{
			return getTypeFacade().load(typeCode);
		}
		catch (final TypeNotFoundException e)
		{
			LOG.error(e);
		}
		return null;
	}

	private static Column getSortOrderColumn(final Grid container)
	{
		Column sortOrderColumn = null;
		for (final Component column : container.getColumns().getChildren())
		{
			if (!("sortOrderColumn").equalsIgnoreCase(column.getId()))
			{
				continue;
			}
			sortOrderColumn = (Column) column;
		}
		return sortOrderColumn;
	}

	private boolean isFieldComparatorDisabled(final AdvancedSearch configuration)
	{
		final boolean disabledByConfig = configuration.getFieldList().isDisableAttributesComparator();
		final boolean disabledBySetting = getWidgetInstanceManager().getWidgetSettings().getBoolean("disableAttributesComparator");
		return disabledByConfig || disabledBySetting;
	}

	private Combobox createOperator(final String fieldTypeName, final ValueComparisonOperator selectedOperator,
			final EventListener<SelectEvent> selectionListener)
	{
		DataAttribute attribute = null;
		if (fieldTypeName.contains("."))
		{
			final List<String> fields = Arrays.asList(fieldTypeName.split("\\."));
			DataType initialDataType = getDataType();
			int i = 0;
			do
			{
				final String typeCode = initialDataType.getAttribute(fields.get(i)).getValueType().getCode();
				initialDataType = getDataType(typeCode);
				attribute = initialDataType.getAttribute(fields.get(++i));
			}
			while (i < fields.size() - 1);
		}
		else
		{
			attribute = getDataType().getAttribute(fieldTypeName);
		}
		final Combobox operators = new Combobox();
		operators.setReadonly(true);
		final ListModelList model = new ListModelList();
		final Collection availableOperators = this.advancedSearchOperatorService.getAvailableOperators(attribute);
		if (selectedOperator != null && availableOperators.contains(selectedOperator))
		{
			model.setSelection(Collections.singletonList(selectedOperator));
		}
		model.addAll(availableOperators);
		operators.setModel(model);
		operators.setItemRenderer(new ComboitemRenderer<ValueComparisonOperator>()
		{

			@Override
			public void render(final Comboitem item, final ValueComparisonOperator operator, final int index)
			{
				item.setLabel(Labels.getLabel(operator.getLabelKey()));
				item.setValue((Object) operator);
			}
		});
		if (selectionListener != null)
		{
			operators.addEventListener("onSelect", selectionListener);
		}
		return operators;
	}

	private void renderAddAttributeRow(final Grid container, final Row row, final int rowIndex, final Actions actionSlot,
			final SearchConditionData data, final AdvancedSearch configuration, final DataType dataType)
	{
		UITools.modifySClass(row, "yw-add-field-row", true);
		YTestTools.modifyYTestId(row, "addFieldRow");
		final Collection<? extends FieldType> selectableAttributes = prepareAlphabeticallySortedAttributeList(
				configuration.getFieldList() != null ? configuration.getFieldList().getField() : null);
		if (CollectionUtils.isEmpty(selectableAttributes))
		{
			final Cell cell = new Cell();
			cell.appendChild(new Label(getWidgetInstanceManager().getLabel("cannotSpecifyAnySearchAttribute", new Object[]
			{ this.labelService.getObjectLabel(dataType.getCode()) })));
			row.appendChild(cell);
			cell.setColspan(5);
			return;
		}
		final FieldType selectedField = selectableAttributes.iterator().next();
		final Combobox attSelector = new Combobox();
		prepareAttributeSelectorCombobox(attSelector, selectableAttributes, selectedField);
		final Button addAttribute = new Button();
		addAttribute.setLabel(getWidgetInstanceManager().getLabel("add.attribute.button"));
		YTestTools.modifyYTestId(addAttribute, "addFieldBtn");
		final ValueComparisonOperator valueComparisonOperator = getValueComparisonOperator(selectedField, dataType);

		final Editor editor = this.createEditor(selectedField, rowIndex, data, true);
		YTestTools.modifyYTestId(editor, "addValueSelector");
		this.updateEditorStateAccordingToOperator(editor, valueComparisonOperator, selectedField);
		final Cell cellOperator = new Cell();
		UITools.modifySClass(cellOperator, "yw-advancedsearch-line", true);
		final Combobox operatorSelector = this.createOperator(selectedField.getName(), valueComparisonOperator,
				createSelectionListenerForOperatorsInAddAttributeRow(row, selectedField));
		YTestTools.modifyYTestId(operatorSelector, "addOperatorSelector");
		UITools.modifySClass(operatorSelector, "yw-advancedsearch-operator", true);
		cellOperator.appendChild(operatorSelector);
		addAttribute.addEventListener("onClick", event -> {
			final FieldType fieldType = (FieldType) attSelector.getSelectedItem().getValue();
			if (!fieldType.isDisabled())
			{
				final Comboitem selectedItem = operatorSelector.getSelectedItem();
				final ValueComparisonOperator operator = (ValueComparisonOperator) selectedItem.getValue();
				final Editor theEditor = getCurrentEditorForAddAttributeRow(row);
				final Object fieldValue = theEditor.getValue();
				this.getSearchDataFromModel().addCondition(fieldType, operator, fieldValue);
				container.setModel(this.prepareGridModel());
			}
		});
		row.appendChild(attSelector);
		row.appendChild(cellOperator);
		row.appendChild(editor);
		appendAddAttributeButtonAndActionSlot(container, row, addAttribute, actionSlot);
		final EventListener changeTypeEvent = event -> {
			FieldType fieldType;
			if (attSelector.getSelectedItem() != null && (fieldType = (FieldType) attSelector.getSelectedItem().getValue()) != null)
			{
				final ValueComparisonOperator matchingOperator = getValueComparisonOperator(fieldType, getDataType());
				final ListModelList model = new ListModelList();
				final Collection available = getValueComparisonOperatorCollection(fieldType, getDataType());
				model.addAll(available);
				final Editor currentEditor = this.getCurrentEditorForAddAttributeRow(row);
				final Editor newEditor = this.createEditor(fieldType, rowIndex, data, true);
				row.insertBefore(newEditor, currentEditor);
				row.removeChild(currentEditor);
				if (available.contains(matchingOperator))
				{
					model.setSelection(Collections.singletonList(matchingOperator));
					updateEditorStateAccordingToOperator(newEditor, matchingOperator, fieldType);
				}
				operatorSelector.setModel(model);
			}
		};
		attSelector.addEventListener("onChange", changeTypeEvent);
		attSelector.addEventListener("onOK", changeTypeEvent);
	}

	private ValueComparisonOperator getValueComparisonOperator(final FieldType selectedField, final DataType dataType)
	{
		ValueComparisonOperator valueComparisonOperator = null;
		if (selectedField.getName().contains("."))
		{
			final List<String> fields = Arrays.asList(selectedField.getName().split("\\."));
			DataType initialDataType = getDataType();
			int i = 0;
			do
			{
				final String typeCode = initialDataType.getAttribute(fields.get(i)).getValueType().getCode();
				initialDataType = getDataType(typeCode);
				valueComparisonOperator = this.advancedSearchOperatorService
						.findMatchingOperator(initialDataType.getAttribute(fields.get(++i)), selectedField.getOperator());
			}
			while (i < fields.size() - 1);
		}
		else
		{
			valueComparisonOperator = this.advancedSearchOperatorService
					.findMatchingOperator(dataType.getAttribute(selectedField.getName()), selectedField.getOperator());
		}
		return valueComparisonOperator;
	}

	private Collection getValueComparisonOperatorCollection(final FieldType fieldType, final DataType dataType)
	{
		Collection available = null;
		if (fieldType.getName().contains("."))
		{
			final List<String> fields = Arrays.asList(fieldType.getName().split("\\."));
			DataType initialDataType = getDataType();
			int i = 0;
			do
			{
				final String typeCode = initialDataType.getAttribute(fields.get(i)).getValueType().getCode();
				initialDataType = getDataType(typeCode);
				available = advancedSearchOperatorService.getAvailableOperators(initialDataType.getAttribute(fields.get(++i)));
			}
			while (i < fields.size() - 1);
		}
		else
		{
			available = advancedSearchOperatorService.getAvailableOperators(dataType.getAttribute(fieldType.getName()));
		}
		return available;
	}

	private static void updateEditorStateAccordingToOperator(final Editor editor,
			final ValueComparisonOperator valueComparisonOperator, final FieldType fieldType)
	{
		editor.setReadOnly(!valueComparisonOperator.isRequireValue() || fieldType.isDisabled());
	}

	private boolean isAddAttributeRowVisible()
	{
		return !"None".equalsIgnoreCase(this.getAddRowPosition());
	}

	private static boolean atLeastOneFieldSortable(final AdvancedSearchData advancedSearch)
	{
		if (advancedSearch != null)
		{
			return true;
		}
		return false;
	}

	private static Editor getCurrentEditorForAddAttributeRow(final Row row)
	{
		return (Editor) row.getChildren().get(2);
	}

	private Component createRemoveLine(final int attributeRowIndex, final Grid container,
			final AdvancedSearchData advancedSearchData, final SearchConditionData data)
	{
		final Div removeContainer = new Div();
		UITools.modifySClass(removeContainer, "yw-remove-container", true);
		if (!data.getFieldType().isMandatory())
		{
			final Button remove = new Button();
			remove.addEventListener("onClick", event -> {
				advancedSearchData.removeCondition(getActualIndexOfConditionInAdvancedSearchData(attributeRowIndex));
				container.setModel(this.prepareGridModel());
			});
			UITools.modifySClass(remove, "yw-advancedsearch-circle-delete y-btn-16x16", true);
			YTestTools.modifyYTestId(remove, "remove-" + data.getFieldType().getName() + "-" + attributeRowIndex);
			removeContainer.appendChild(remove);
		}
		return removeContainer;
	}

	private int getActualIndexOfConditionInAdvancedSearchData(final int rowIndex)
	{
		return rowIndex - ("Top".equalsIgnoreCase(this.getAddRowPosition()) ? 1 : 0);
	}

	private static void markEmptyMandatoryField(final Editor editor)
	{
		final HtmlBasedComponent parent = (HtmlBasedComponent) editor.getParent();
		UITools.modifySClass(parent, "yw-advancedsearch-mandatory-field", true);
		Clients.scrollIntoView(editor);
	}

	private Collection<? extends FieldType> prepareAlphabeticallySortedAttributeList(final List<FieldType> fields)
	{
		final DataType dataType = this.getDataType();
		final Predicate<FieldType> searchableAttribute = fieldType -> {
			final DataAttribute attribute = getDataAttributeForField(fieldType, dataType);
			return attribute != null && attribute.isSearchable()
					&& this.permissionFacade.canReadProperty(dataType.getCode(), fieldType.getName());
		};
		final Map<String, String> labelsCache = getAttributesLabels(fields);
		final Comparator alphabeticalComparator = (first, second) -> {
			final String fName = (String) StringUtils.defaultIfBlank((CharSequence) labelsCache.get(((FieldType) first).getName()),
					(CharSequence) "");
			final String sName = (String) StringUtils.defaultIfBlank((CharSequence) labelsCache.get(((FieldType) second).getName()),
					(CharSequence) "");
			return fName.compareToIgnoreCase(sName);
		};
		return fields.stream().filter(searchableAttribute).sorted(alphabeticalComparator).collect(Collectors.toList());
	}

	private DataAttribute getDataAttributeForField(final FieldType fieldType, final DataType dataType)
	{
		DataAttribute attribute = null;
		if (fieldType.getName().contains("."))
		{
			final List<String> fieldelement = Arrays.asList(fieldType.getName().split("\\."));
			DataType initialDataType = getDataType();
			int i = 0;
			do
			{
				final String typeCode = initialDataType.getAttribute(fieldelement.get(i)).getValueType().getCode();
				initialDataType = getDataType(typeCode);
				attribute = initialDataType.getAttribute(fieldelement.get(++i));
			}
			while (i < fieldelement.size() - 1);
		}
		else
		{
			attribute = dataType.getAttribute(fieldType.getName());
		}
		return attribute;
	}

	@InextensibleMethod
	private Map<String, String> getAttributesLabels(final List<FieldType> fields)
	{
		final String typeCode = this.getDataType().getCode();
		if (StringUtils.isNotBlank(typeCode) && typeCode.indexOf(46) == -1)
		{
			final HashMap fieldLabelMap = Maps.newHashMap();
			fields.forEach(field -> {
				if (!fieldLabelMap.containsKey(field.getName()))
				{
					fieldLabelMap.put(field.getName(), this.labelService.getObjectLabel(typeCode + '.' + field.getName()));
				}
			});
			return fieldLabelMap;
		}
		return Maps.newHashMap();
	}

	private void appendAddAttributeButtonAndActionSlot(final Grid container, final Row row, final Button addAttribute,
			final Actions actionSlot)
	{
		Column sortOrderColumn;
		if (actionSlot.getParent() != null)
		{
			actionSlot.getParent().removeChild(actionSlot);
		}
		if ((sortOrderColumn = this.getSortOrderColumn(container)) != null && sortOrderColumn.isVisible())
		{
			row.appendChild(addAttribute);
			row.appendChild(actionSlot);
		}
		else
		{
			row.appendChild(new Div());
			final Hbox hbox = new Hbox();
			hbox.appendChild(addAttribute);
			hbox.appendChild(actionSlot);
			row.appendChild(hbox);
		}
		actionSlot.reload();
	}

	private void prepareAttributeSelectorCombobox(final Combobox attSelector,
			final Collection<? extends FieldType> selectableAttributes, final FieldType selectedField)
	{
		UITools.modifySClass(attSelector, "yw-additional-attributes-selector", true);
		final ListModelList attributeModel = new ListModelList();
		attributeModel.addAll(selectableAttributes);
		attributeModel.setSelection(selectedField != null ? Collections.singletonList(selectedField) : Collections.emptyList());
		attSelector.setModel(attributeModel);
		YTestTools.modifyYTestId(attSelector, "addAttributeSelector");
		attSelector.setReadonly(true);
		attSelector.setItemRenderer(new ComboitemRenderer<FieldType>()
		{

			@Override
			public void render(final Comboitem item, final FieldType data, final int index)
			{
				item.setDisabled(isFieldDisabled(data));
				item.setLabel(getAttributeLabel(data.getName()));
				item.setValue((Object) data);
			}
		});
	}

	private EventListener<SelectEvent> createSelectionListenerForOperatorsInAddAttributeRow(final Row row,
			final FieldType fieldType)
	{
		return selectEvent -> {
			if (selectEvent.getSelectedItems() != null && !selectEvent.getSelectedItems().isEmpty())
			{
				final ValueComparisonOperator operator = (ValueComparisonOperator) selectEvent.getSelectedObjects().iterator().next();
				final Editor theEditor = this.getCurrentEditorForAddAttributeRow(row);
				this.updateEditorStateAccordingToOperator(theEditor, operator, fieldType);
			}
		};
	}

	private boolean isFieldDisabled(final FieldType fieldType)
	{
		boolean disabledField = true;
		final AdvancedSearchData searchData = this.getSearchDataFromModel();
		if (!fieldType.isDisabled())
		{
			final List<SearchConditionData> conditions = searchData.getConditions(fieldType.getName());
			if (CollectionUtils.isNotEmpty(conditions))
			{
				for (final SearchConditionData conditionData : conditions)
				{
					disabledField &= conditionData.getFieldType().isDisabled();
				}
			}
			else
			{
				disabledField = false;
			}
		}
		return disabledField;
	}

	@Override
	protected DataAttribute getDataAttribute(final FieldType field)
	{
		DataAttribute attribute = null;
		if (field.getName().contains("."))
		{
			final List<String> fieldelement = Arrays.asList(field.getName().split("\\."));
			DataType initialDataType = getDataType();
			int i = 0;
			do
			{
				final String typeCode = initialDataType.getAttribute(fieldelement.get(i)).getValueType().getCode();
				initialDataType = getDataType(typeCode);
				attribute = initialDataType.getAttribute(fieldelement.get(++i));
			}
			while (i < fieldelement.size() - 1);
		}
		else
		{
			attribute = getDataType().getAttribute(field.getName());
		}
		return attribute;
	}


	class TravelogixRowRenderer implements RowRenderer<SearchConditionData>
	{

		final Grid container;
		final Radiogroup sortControlCnt;
		final Actions actionSlot;
		final AdvancedSearch configuration;
		final DataType dataType;
		final AdvancedSearchData advancedSearchData;
		final Column sortOrderColumn;

		/**
		 *
		 */
		public TravelogixRowRenderer(final Grid container, final Radiogroup sortControlCnt, final Actions actionSlot,
				final AdvancedSearch configuration, final DataType dataType, final AdvancedSearchData advancedSearchData,
				final Column sortOrderColumn)
		{
			this.container = container;
			this.sortControlCnt = sortControlCnt;
			this.actionSlot = actionSlot;
			this.configuration = configuration;
			this.dataType = dataType;
			this.advancedSearchData = advancedSearchData;
			this.sortOrderColumn = sortOrderColumn;
		}

		@Override
		public void render(final Row row, final SearchConditionData data, final int rowIndex)
		{
			if (ObjectUtils.equals(GRID_ADD_LINE_HOLDER, data))
			{
				renderAddAttributeRow(container, row, rowIndex, actionSlot, data, configuration, dataType);
			}
			else
			{
				this.addCellLabel(row, data);
				this.addCellOperator(row, data, rowIndex);
				this.addCellEditor(row, data, rowIndex, sortOrderColumn);
				this.addCellSort(row, data);
				this.addCellRemove(row, data, rowIndex);
				this.mergeCellsForLabelAndSortButtonsIfNecessary(data, rowIndex);
				this.applyRowClassIfItIsLastRowForGivenCondition(data, row);
			}
		}

		private void addCellLabel(final Row row, final SearchConditionData data)
		{
			if (data != null && data.getFieldType() != null)
			{
				final String qualifier = data.getFieldType().getName();
				final int conditionIndexForGivenQualifier = advancedSearchData.getConditions(qualifier).indexOf(data);
				if (conditionIndexForGivenQualifier == 0)
				{
					final Cell cellLabel = new Cell();
					final Label label = new Label(getAttributeLabel(qualifier));
					UITools.modifySClass(label, "yw-advanced-search-cnd-disabled", data.getFieldType().isDisabled());
					cellLabel.appendChild(label);
					row.appendChild(cellLabel);
				}
			}
		}

		private void addCellOperator(final Row row, final SearchConditionData data, final int rowIndex)
		{
			Component operatorComponent = null;
			if (data.getFieldType() != null)
			{
				operatorComponent = this.createOperatorComponent(data.getFieldType(), data.getOperator(),
						this.createSearchOperatorSelectionListener(data, rowIndex), rowIndex);
			}
			final Cell cellOperator = new Cell();
			UITools.modifySClass(cellOperator, "yw-advancedsearch-line", true);
			YTestTools.modifyYTestId(cellOperator, "operators-container-" + data.getFieldType().getName());
			cellOperator.appendChild(operatorComponent);
			row.appendChild(cellOperator);
		}

		private void addCellEditor(final Row row, final SearchConditionData data, final int rowIndex, final Column sortOrderColumn2)
		{
			final Cell cellEditor = new Cell();
			final Editor editor = createEditor(data.getFieldType(), rowIndex, data);
			final SearchAttributeDescriptor searchAttributeDescriptor = new SearchAttributeDescriptor(data.getFieldType().getName(),
					rowIndex);
			assignEditorToField(searchAttributeDescriptor, editor);
			adjustEditor(searchAttributeDescriptor, data.getOperator(), data.getFieldType());
			adjustSearchDataModel(searchAttributeDescriptor, data.getOperator());
			UITools.modifySClass(cellEditor, "yw-advancedsearch-line", true);
			YTestTools.modifyYTestId(editor, "editor-" + data.getFieldType().getName() + "-" + rowIndex);
			YTestTools.modifyYTestId(cellEditor, "values-container-" + data.getFieldType().getName());
			cellEditor.appendChild(editor);
			row.appendChild(cellEditor);
			sortOrderColumn2.setVisible(atLeastOneFieldSortable(advancedSearchData));
			this.markIfMandatoryAndEmpty(editor, data);
		}

		private void markIfMandatoryAndEmpty(final Editor editor, final SearchConditionData data)
		{
			final String fieldName = data.getFieldType().getName();
			final AdvancedSearch config = (AdvancedSearch) getWidgetInstanceManager().getModel()
					.getValue("advancedSearchConfiguration", (Class) AdvancedSearch.class);
			if (AdvancedSearchDataConditionEvaluator.isMandatory(config, fieldName)
					&& !AdvancedSearchDataConditionEvaluator.atLeastOneConditionProvided(advancedSearchData, fieldName))
			{
				markEmptyMandatoryField(editor);
			}
		}

		private void addCellSort(final Row row, final SearchConditionData data)
		{
			final String qualifier = data.getFieldType().getName();
			final int conditionIndexForGivenQualifier = advancedSearchData.getConditions(qualifier).indexOf(data);
			if (conditionIndexForGivenQualifier == 0)
			{
				final Cell cellSort = new Cell();
				final SortData sortData = this.getSortData();
				final Div sortControls = createSortControls(sortControlCnt, data, sortData);
				cellSort.appendChild(sortControls);
				row.appendChild(cellSort);
			}
		}

		private SortData getSortData()
		{
			final SortData sortDataFromModel = advancedSearchData.getSortData();
			final SortData sortDataFromConfig = extractSortData(configuration);
			return sortDataFromModel != null ? sortDataFromModel : sortDataFromConfig;
		}

		private void addCellRemove(final Row row, final SearchConditionData data, final int rowIndex)
		{
			final Cell cellRemove = new Cell();
			UITools.modifySClass(cellRemove, "yw-advancedsearch-line", true);
			YTestTools.modifyYTestId(cellRemove, "removes-container-" + data.getFieldType().getName());
			if (isAddAttributeRowVisible() && !data.getFieldType().isDisabled())
			{
				cellRemove.appendChild(createRemoveLine(rowIndex, container, advancedSearchData, data));
			}
			row.appendChild(cellRemove);
		}

		private void mergeCellsForLabelAndSortButtonsIfNecessary(final SearchConditionData data, final int rowIndex)
		{
			final String qualifier = data.getFieldType().getName();
			final int conditionIndexForGivenQualifier = advancedSearchData.getConditions(qualifier).indexOf(data);
			if (conditionIndexForGivenQualifier > 0)
			{
				final Cell firstCellLabelForGivenQualifier = (Cell) container.getCell(rowIndex - conditionIndexForGivenQualifier, 0);
				firstCellLabelForGivenQualifier.setRowspan(conditionIndexForGivenQualifier + 1);
				firstCellLabelForGivenQualifier.setSclass("yw-advanced-search-rowspan");
				final Cell firstCellWithSortButtonsForGivenQualifier = (Cell) container
						.getCell(rowIndex - conditionIndexForGivenQualifier, 3);
				firstCellWithSortButtonsForGivenQualifier.setRowspan(conditionIndexForGivenQualifier + 1);
				firstCellWithSortButtonsForGivenQualifier.setSclass("yw-advanced-search-rowspan");
			}
		}

		private void applyRowClassIfItIsLastRowForGivenCondition(final SearchConditionData data, final Row row)
		{
			final String qualifier = data.getFieldType().getName();
			final int numberOfConditions = advancedSearchData.getConditions(qualifier).size();
			final int conditionIndexForGivenQualifier = advancedSearchData.getConditions(qualifier).indexOf(data);
			if (conditionIndexForGivenQualifier == numberOfConditions - 1)
			{
				UITools.modifySClass(row, "yw-advancedsearch-last-row-for-condition", true);
			}
		}

		private EventListener<SelectEvent> createSearchOperatorSelectionListener(final SearchConditionData data, final int tmpIndex)
		{
			return event -> {
				final Set selectedObjects = event.getSelectedObjects();
				if (selectedObjects.size() == 1)
				{
					final ValueComparisonOperator valueComparisonOperator = (ValueComparisonOperator) selectedObjects.iterator()
							.next();
					data.updateOperator(valueComparisonOperator);
					final SearchAttributeDescriptor searchAttributeDescriptor = new SearchAttributeDescriptor(
							data.getFieldType().getName(), tmpIndex);
					adjustEditor(searchAttributeDescriptor, valueComparisonOperator, data.getFieldType());
					adjustSearchDataModel(searchAttributeDescriptor, valueComparisonOperator);
				}
			};
		}

		private Component createOperatorComponent(final FieldType field, final ValueComparisonOperator selectedOperator,
				final EventListener<SelectEvent> selectionListener, final int index)
		{
			DataAttribute attribute = null;
			if (field.getName().contains("."))
			{
				final List<String> fields = Arrays.asList(field.getName().split("\\."));
				DataType initialDataType = getDataType();
				int i = 0;
				do
				{
					final String typeCode = initialDataType.getAttribute(fields.get(i)).getValueType().getCode();
					initialDataType = getDataType(typeCode);
					attribute = initialDataType.getAttribute(fields.get(++i));
				}
				while (i < fields.size() - 1);
			}
			else
			{
				attribute = getDataType().getAttribute(field.getName());
			}

			final DataType valueType = attribute.getValueType();
			if (valueType != null && (Boolean.class.equals(valueType.getClazz()) || Boolean.TYPE.equals(valueType.getClazz())))
			{
				return new Div();
			}
			final Div operatorContainer = new Div();
			final Combobox operator = createOperator(field.getName(), selectedOperator, selectionListener);
			YTestTools.modifyYTestId(operator, "operator-" + field.getName() + "-" + index);
			UITools.modifySClass(operator, "yw-advancedsearch-operator", true);
			operatorContainer.appendChild(operator);
			operator.setDisabled(field.isDisabled() ||

					isFieldComparatorDisabled(configuration));
			addEnterSupport(operator);
			return operatorContainer;
		}
	}

	@Override
	protected void adjustSearchDataModel(final SearchAttributeDescriptor searchAttributeDescriptor,
			final ValueComparisonOperator valueComparisonOperator)
	{
		final SearchConditionData searchConditionData = this.getSearchDataFromModel()
				.getCondition(this.getActualIndexOfConditionInAdvancedSearchData(searchAttributeDescriptor.getAttributeNumber()));
		if (ValueComparisonOperator.IS_EMPTY.equals(valueComparisonOperator)
				|| ValueComparisonOperator.IS_NOT_EMPTY.equals(valueComparisonOperator))
		{
			DataType genericType = this.getDataType();
			DataAttribute genericAttribute = null;
			if (searchAttributeDescriptor.getAttributeName().contains("."))
			{
				final List<String> fields = Arrays.asList(searchAttributeDescriptor.getAttributeName().split("\\."));
				int i = 0;
				do
				{
					final String typeCode = genericType.getAttribute(fields.get(i)).getValueType().getCode();
					genericType = getDataType(typeCode);
					genericAttribute = genericType.getAttribute(fields.get(++i));
				}
				while (i < fields.size() - 1);
			}
			else
			{
				genericAttribute = genericType.getAttribute(searchAttributeDescriptor.getAttributeName());
			}
			if (searchConditionData.getValue() == null && genericAttribute.isLocalized())
			{
				searchConditionData.updateLocalizedValue(this.getCockpitLocaleService().getCurrentLocale(), (Object) null);
			}
		}
	}
}