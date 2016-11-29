package com.cnk.travelogix.product.common.core.interceptors;

import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.model.CombinationProductModel;
import com.cnk.travelogix.product.common.core.model.ProductDefinitionModel;


public class CombinationProductPrepareInterceptor implements PrepareInterceptor<CombinationProductModel>
{
	private static final Logger LOG = Logger.getLogger(CombinationProductPrepareInterceptor.class);

	private KeyGenerator keyGenerator;
	private CategoryService categoryService;
	private ModelService modelService;

	static final String COMBINATIONCATEGORYNAME = "C006";

	@Override
	public void onPrepare(final CombinationProductModel combinationProductModel, final InterceptorContext cntxt)
			throws InterceptorException
	{
		CategoryModel combinationProductSuperCategoryExist = null;
		CategoryModel combinationCategory = null;

		final List combinationSuperCategories = new ArrayList();
		final Set<String> categoryList = new HashSet<String>();

		if (combinationProductModel.getCode() == null)
		{
			combinationProductModel.setCode(keyGenerator.generate().toString());
			LOG.debug("Set new code for CombinationProductModel Model -" + combinationProductModel.getCode());
		}

		for (final ProductDefinitionModel productDefinition : combinationProductModel.getProducts())
		{
			if (productDefinition.getCategory().getName() != null)
			{
				final String category = productDefinition.getCategory().getName();
				categoryList.add(category);
			}
			else
			{
				throw new InterceptorException("Missing ProductCategorySubType name.");
			}
		}

		final TreeSet sortedCategoryList = new TreeSet<String>(categoryList);
		final String categoryCombinationCode = StringUtils.join(sortedCategoryList, "+");
		try
		{
			combinationProductSuperCategoryExist = categoryService.getCategoryForCode(categoryCombinationCode);
			combinationSuperCategories.add(combinationProductSuperCategoryExist);
			combinationProductModel.setSupercategories(combinationSuperCategories);
		}
		catch (final UnknownIdentifierException ex)
		{
			combinationCategory = categoryService.getCategoryForCode(COMBINATIONCATEGORYNAME);
			final CategoryModel categoryModel = modelService.create(CategoryModel.class);
			final List supercategories = new ArrayList();
			supercategories.add(combinationCategory);
			categoryModel.setSupercategories(supercategories);
			categoryModel.setCode(categoryCombinationCode);
			categoryModel.setName(categoryCombinationCode);
			categoryModel.setCatalogVersion(combinationCategory.getCatalogVersion());
			modelService.save(categoryModel);
			combinationSuperCategories.add(categoryModel);
			combinationProductModel.setSupercategories(combinationSuperCategories);
		}

	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

	/**
	 * @return the categoryService
	 */
	public CategoryService getCategoryService()
	{
		return categoryService;
	}

	/**
	 * @param categoryService
	 *           the categoryService to set
	 */
	public void setCategoryService(final CategoryService categoryService)
	{
		this.categoryService = categoryService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}