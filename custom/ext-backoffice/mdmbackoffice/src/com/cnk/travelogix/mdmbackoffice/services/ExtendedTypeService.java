package com.cnk.travelogix.mdmbackoffice.services;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.CollectionTypeModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.core.model.type.MapTypeModel;
import de.hybris.platform.core.model.type.TypeModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.type.impl.DefaultTypeService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;


/**
 *
 * Search customization for getting relational search
 */
public class ExtendedTypeService extends DefaultTypeService
{
	private static final Logger LOG = Logger.getLogger(ExtendedTypeService.class);

	@Override
	public AttributeDescriptorModel getAttributeDescriptor(final ComposedTypeModel composedType, final String qualifier)
	{
		ServicesUtil.validateParameterNotNull(composedType, "Parameter 'composedType' must not be null!");
		if (LOG.isDebugEnabled())
		{
			LOG.debug("get Attribute Descriptor");
		}
		return getAttributeDescriptor(composedType.getCode(), qualifier);
	}

	@Override
	public AttributeDescriptorModel getAttributeDescriptor(final String composedType, final String qualifier)
	{
		ServicesUtil.validateParameterNotNull(composedType, "Parameter 'composedType' must not be null!");
		ServicesUtil.validateParameterNotNull(qualifier, "Parameter 'qualifier' must not be null!");
		final ComposedTypeModel composedTypeModel = getComposedTypeForCode(composedType);
		if (composedTypeModel == null)
		{
			throw new UnknownIdentifierException("No composed type with code " + composedType + " found.");
		}
		for (final AttributeDescriptorModel attributeDescriptor : composedTypeModel.getDeclaredattributedescriptors())
		{
			if (qualifier.equalsIgnoreCase(attributeDescriptor.getQualifier()))
			{
				return attributeDescriptor;
			}
		}

		for (final AttributeDescriptorModel attributeDescriptor : composedTypeModel.getInheritedattributedescriptors())
		{
			if (qualifier.equalsIgnoreCase(attributeDescriptor.getQualifier()))
			{
				return attributeDescriptor;
			}
		}
		return getAttributeDiscriptor(qualifier, composedTypeModel);
	}

	protected AttributeDescriptorModel getAttributeDiscriptor(final String qualifier, final ComposedTypeModel composedTypeModel)
	{
		ComposedTypeModel composedType = composedTypeModel;
		if (qualifier.indexOf(".") != -1)
		{
			final List<String> qualis = Arrays.asList(qualifier.split("\\."));
			final List attributes = new ArrayList(qualis.size());
			int index = 0;
			do
			{
				final AttributeDescriptorModel attributeDescriptor = getAttributeDescriptor(composedType, qualis.get(index));
				final ComposedTypeModel enclosingType = getComposedTypeForCode(getValueType(attributeDescriptor).getCode());
				composedType = enclosingType;
				final AttributeDescriptorModel attributeDescriptornew = getAttributeDescriptor(composedType, qualis.get(++index));
				attributes.add(attributeDescriptornew);
			}
			while (index < qualis.size() - 1);

			if (!(attributes.isEmpty()))
			{
				return (AttributeDescriptorModel) attributes.get(attributes.size() - 1);
			}
		}
		throw new UnknownIdentifierException("No attribute with qualifier " + qualifier + " found.");
	}

	protected String getAttributeCodeFromPropertyQualifier(final String propertyQualifier)
	{
		final String attributeCode = propertyQualifier.substring(propertyQualifier.indexOf(".") + 1);
		return (attributeCode == null) ? propertyQualifier.substring(propertyQualifier.indexOf(".") + 1) : attributeCode;
	}

	protected TypeModel getValueType(final AttributeDescriptorModel attributeDescriptor)
	{
		TypeModel type = attributeDescriptor.getAttributeType();
		if (type instanceof CollectionTypeModel)
		{
			type = ((CollectionTypeModel) type).getElementType();
		}
		else if (type instanceof MapTypeModel)
		{
			type = ((MapTypeModel) type).getReturntype();
		}
		return type;
	}
}