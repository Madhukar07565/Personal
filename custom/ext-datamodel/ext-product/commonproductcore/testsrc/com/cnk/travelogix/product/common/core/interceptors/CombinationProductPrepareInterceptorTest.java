package com.cnk.travelogix.product.common.core.interceptors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.product.common.core.model.CombinationProductModel;
import com.cnk.travelogix.product.common.core.model.ProductDefinitionModel;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class CombinationProductPrepareInterceptorTest
{
	@InjectMocks
	private final CombinationProductPrepareInterceptor combinationProductPrepareInterceptor = new CombinationProductPrepareInterceptor();
	@Mock
	private KeyGenerator mockKeyGenerator;
	@Mock
	CategoryService categoryService;
	@Mock
	ModelService modelService;
	@Mock
	private InterceptorContext mockInterceptorContext;

	CombinationProductModel combinationProductModel;
	ProductDefinitionModel productDefinitionModel1;
	ProductDefinitionModel productDefinitionModel2;
	ProductDefinitionModel productDefinitionModel3;
	ProductDefinitionModel productDefinitionModel4;
	ProductCategorySubTypeModel productCategorySubTypeModel1;
	ProductCategorySubTypeModel productCategorySubTypeModel2;
	ProductCategorySubTypeModel productCategorySubTypeModel3;
	ProductCategorySubTypeModel productCategorySubTypeModel4;
	CategoryModel combinationSuperCat;
	CategoryModel superCatExist;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		combinationProductModel = (Mockito.mock(CombinationProductModel.class));
		productDefinitionModel1 = (Mockito.mock(ProductDefinitionModel.class));
		productDefinitionModel2 = (Mockito.mock(ProductDefinitionModel.class));
		productDefinitionModel3 = (Mockito.mock(ProductDefinitionModel.class));
		productDefinitionModel4 = (Mockito.mock(ProductDefinitionModel.class));
		productCategorySubTypeModel1 = (Mockito.mock(ProductCategorySubTypeModel.class));
		productCategorySubTypeModel2 = (Mockito.mock(ProductCategorySubTypeModel.class));
		productCategorySubTypeModel3 = (Mockito.mock(ProductCategorySubTypeModel.class));
		productCategorySubTypeModel4 = (Mockito.mock(ProductCategorySubTypeModel.class));

		final Collection<ProductDefinitionModel> productDefinitions = new ArrayList();

		Mockito.when(productCategorySubTypeModel1.getName()).thenReturn("mno");
		Mockito.when(productCategorySubTypeModel2.getName()).thenReturn("xyz");
		Mockito.when(productCategorySubTypeModel3.getName()).thenReturn("pqr");

		Mockito.when(productDefinitionModel1.getCategory()).thenReturn(productCategorySubTypeModel1);
		Mockito.when(productDefinitionModel2.getCategory()).thenReturn(productCategorySubTypeModel2);
		Mockito.when(productDefinitionModel3.getCategory()).thenReturn(productCategorySubTypeModel3);
		Mockito.when(productDefinitionModel4.getCategory()).thenReturn(productCategorySubTypeModel4);

		productDefinitions.add(productDefinitionModel1);
		productDefinitions.add(productDefinitionModel2);
		productDefinitions.add(productDefinitionModel3);
		productDefinitions.add(productDefinitionModel4);

		Mockito.when(combinationProductModel.getProducts()).thenReturn(productDefinitions);

		combinationProductPrepareInterceptor.setKeyGenerator(mockKeyGenerator);
	}

	@Test(expected = InterceptorException.class)
	public void testProductCategorySubTypeName() throws InterceptorException
	{
		combinationProductPrepareInterceptor.onPrepare(combinationProductModel, mockInterceptorContext);
	}

	@Test
	public void testCombinationProductPrepareWithoutNull() throws Exception
	{
		final CombinationProductModel combinationProduct = new CombinationProductModel();
		combinationProduct.setCode("123");
		when(mockKeyGenerator.generate()).thenReturn("0001");
		combinationProductPrepareInterceptor.onPrepare(combinationProduct, mockInterceptorContext);
		assertEquals("CombinationProduct code wasn't set by prepare interceptor", "123", combinationProduct.getCode());

	}

	@Test
	public void testCombinationProductPrepareWithNull() throws Exception
	{
		final CombinationProductModel combinationProduct = new CombinationProductModel();
		when(mockKeyGenerator.generate()).thenReturn("001");
		combinationProductPrepareInterceptor.onPrepare(combinationProduct, mockInterceptorContext);
		assertEquals("CombinationProduct code was set by prepare interceptor", "001", combinationProduct.getCode());
	}
}