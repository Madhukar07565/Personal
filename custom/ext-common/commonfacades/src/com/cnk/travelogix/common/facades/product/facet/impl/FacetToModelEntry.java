/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;



import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.facet.CnkFacetCalculationHelper;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;



/**
 * @author i313879
 *
 */
public class FacetToModelEntry
{
	public static final String MIN = "min";
	public static final String MAX = "max";

	private final FacetToModelMapper mapper;

	private String facetCode;
	private String facetName;
	private String beanClass;
	private String beanPropertyName;
	private boolean needAccumulate;
	private boolean needMinPrice;
	private CnkFacetValueProvider facetCodeProvider;
	private CnkFacetValueProvider priceValueProvider;
	private CnkFacetValueProvider facetValueProvider;


	private CnkFacetCalculationHelper facetHelper;

	//		public static enum RangeType{
	//			 RANGEONLY;
	//		}


	public FacetToModelEntry(final FacetToModelMapper mapper)
	{
		this.mapper = mapper;
	}



	public boolean process(final BaseProductData singleData, final CnkFacetData facet)
	{
		return getFacetHelper().process(singleData, facet, this);
	}

	protected double getCaculatedPrice(final BaseProductData signleData)
	{
		if (priceValueProvider == null)
		{
			return ((Double) getFacetValue(signleData)).doubleValue();
		}

		return ((Double) priceValueProvider.getFacetValue(signleData, beanPropertyName)).doubleValue();
	}

	protected Object getFacetValueCode(final BaseProductData signleData)
	{
		if (StringUtils.isEmpty(beanPropertyName))
		{
			return null;
		}
		return this.getFacetCodeProvider().getFacetValue(signleData, beanPropertyName);
	}

	protected Object getFacetValue(final BaseProductData signleData)
	{
		if (StringUtils.isEmpty(beanPropertyName))
		{
			return null;
		}
		return this.getFacetValueProvider().getFacetValue(signleData, beanPropertyName);
	}

	/**
	 * @return the facetName
	 */
	public String getFacetName()
	{
		return facetName;
	}

	/**
	 * @param priceValueProvider
	 *           the priceValueProvider to set
	 */
	public void setPriceValueProvider(final CnkFacetValueProvider priceValueProvider)
	{
		this.priceValueProvider = priceValueProvider;
	}



	/**
	 * @param facetName
	 *           the facetName to set
	 */
	public void setFacetName(final String facetName)
	{
		this.facetName = facetName;
	}

	/**
	 * @return the needAccumulate
	 */
	public boolean isNeedAccumulate()
	{
		return needAccumulate;
	}

	/**
	 * @param needAccumulate
	 *           the needAccumulate to set
	 */
	public void setNeedAccumulate(final boolean needAccumulate)
	{
		this.needAccumulate = needAccumulate;
	}

	/**
	 * @return the needMinPrice
	 */
	public boolean isNeedMinPrice()
	{
		return needMinPrice;
	}

	/**
	 * @param needMinPrice
	 *           the needMinPrice to set
	 */
	public void setNeedMinPrice(final boolean needMinPrice)
	{
		this.needMinPrice = needMinPrice;
	}

	private FacetType facetType = FacetType.NORMAL;

	public static enum FacetType
	{
		DEPATURETIME, RETURNTIME, PRICERANGE, BUDGETRANGE, NORMAL
	}

	/**
	 * @return the facetCode
	 */
	public String getFacetCode()
	{
		return facetCode;
	}

	/**
	 * @param facetCode
	 *           the facetCode to set
	 */
	public void setFacetCode(final String facetCode)
	{
		this.facetCode = facetCode;
	}

	/**
	 * @return the beanClass
	 */
	public String getBeanClass()
	{
		return beanClass;
	}

	/**
	 * @param beanClass
	 *           the beanClass to set
	 */
	public void setBeanClass(final String beanClass)
	{
		this.beanClass = beanClass;
	}

	/**
	 * @return the beanPropertyName
	 */
	public String getBeanPropertyName()
	{
		return beanPropertyName;
	}

	/**
	 * @param beanPropertyName
	 *           the beanPropertyName to set
	 */
	public void setBeanPropertyName(final String beanPropertyName)
	{
		this.beanPropertyName = beanPropertyName;
	}

	/**
	 * @return the facetType
	 */
	public FacetType getFacetType()
	{
		return facetType;
	}

	/**
	 * @param facetType
	 *           the facetType to set
	 */
	public void setFacetType(final FacetType facetType)
	{
		this.facetType = facetType;
	}

	/**
	 * @return the propertyValueProvider
	 */
	public CnkFacetValueProvider getFacetCodeProvider()
	{
		if (facetCodeProvider == null)
		{
			facetCodeProvider = mapper.getDefaultCnkFacetValueProvider();
		}
		return facetCodeProvider;
	}

	/**
	 * @param propertyValueProvider
	 *           the propertyValueProvider to set
	 */
	public void setFacetCodeProvider(final CnkFacetValueProvider propertyValueProvider)
	{
		this.facetCodeProvider = propertyValueProvider;
	}

	/**
	 * @return the facetHelper
	 */
	public CnkFacetCalculationHelper getFacetHelper()
	{
		if (facetHelper == null)
		{
			facetHelper = mapper.getDefaultFacetCalculationHelper();
		}
		return facetHelper;
	}

	/**
	 * @param facetHelper
	 *           the facetHelper to set
	 */
	public void setFacetHelper(final CnkFacetCalculationHelper facetHelper)
	{
		this.facetHelper = facetHelper;
	}

	/**
	 * @return the facetValueProvider
	 */
	public CnkFacetValueProvider getFacetValueProvider()
	{
		if (facetValueProvider == null)
		{
			facetValueProvider = mapper.getDefaultCnkFacetValueProvider();
		}
		return facetValueProvider;
	}



	/**
	 * @param facetValueProvider
	 *           the facetValueProvider to set
	 */
	public void setFacetValueProvider(final CnkFacetValueProvider facetValueProvider)
	{
		this.facetValueProvider = facetValueProvider;
	}

}
