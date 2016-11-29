/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.cnk.travelogix.operations.facades;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.operations.data.ActivateParameterData;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.facades.impl.TravelogixReconfirmationConfigFacadeImpl;
import com.cnk.travelogix.operations.services.LockUnlockService;
import com.cnk.travelogix.operations.services.TravelogixReconfirmationConfigService;


@UnitTest
public class TravelogixReconfirmationConfigFacadeImplTest
{
	@Mock
	private TravelogixReconfirmationConfigService reconfirmationConfigService;
	@Mock
	private Converter<ReconfirmationConfigModel, ReconfirmationConfigData> reconfirmationConfigConverter;
	@Mock
	private ModelService mockModelService;
	@Mock
	private EnumerationService enumerationService;
	@Mock
	private AlertNotificationService defaultAlertNotificationService;
	@Mock
	private Converter<ReconfirmationConfigData, ReconfirmationConfigModel> reconfirmationConfigReverseConverter;
	@Mock
	private LockUnlockService<ReconfirmationConfigModel> lockUnlockService;

	@InjectMocks
	private final TravelogixReconfirmationConfigFacadeImpl configFacadeImpl = new TravelogixReconfirmationConfigFacadeImpl();

	ReconfirmationSearchParameterData reconfirmationSearchParameterData;
	PageableData pageableData;
	private SearchPageData<ReconfirmationConfigData> searchList;
	@Mock
	private ReconfirmationConfigData reconfirmationConfigData;
	@Mock
	private PaginationData paginationData;

	private static String RC_CODE = "0010010";
	final String PRODUCT_CATEGORY = "C001";
	final String PRODUCT_SUB_CATEGORY = "C001S001";

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		this.reconfirmationSearchParameterData = new ReconfirmationSearchParameterData();
		this.reconfirmationSearchParameterData.setClientCategory("ClientCategory");
		this.reconfirmationSearchParameterData.setClientCode("clientCode");
		this.reconfirmationSearchParameterData.setClientGroup("clientGroup");
		this.reconfirmationSearchParameterData.setClientSubCategory("clientSubCategory");
		this.reconfirmationSearchParameterData.setClientType("clientType");
		this.reconfirmationSearchParameterData.setConfigurationFor("configurationFor");
		this.reconfirmationSearchParameterData.setProductCategoryCode("productCategoryCode");
		this.reconfirmationSearchParameterData.setProductCategorySubTypeCode("productCategorySubTypeCode");
		this.reconfirmationSearchParameterData.setProductCode("productCode");
		this.reconfirmationSearchParameterData.setSupplierCode("supplierCode");
		this.pageableData = new PageableData();
		this.pageableData.setCurrentPage(0);
		this.pageableData.setPageSize(0);
		this.pageableData.setSort("sort");
		BDDMockito.given(Integer.valueOf(this.paginationData.getNumberOfPages())).willReturn(Integer.valueOf(1));
		final ArrayList reconfirmationConfigDatas = new ArrayList();
		reconfirmationConfigDatas.add(this.reconfirmationConfigData);
		this.searchList = new SearchPageData();
		this.searchList.setResults(reconfirmationConfigDatas);
		this.searchList.setPagination(this.paginationData);
	}

	@Test
	public void getAllReconfirmationConfigsTest()
	{
		final ArrayList list = new ArrayList();
		final ReconfirmationConfigData configData = new ReconfirmationConfigData();
		list.add(configData);
		SearchPageData searchPageDatas = new SearchPageData<>();
		searchPageDatas.setResults(list);

		final ArrayList list1 = new ArrayList();
		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		list1.add(configModel);
		final SearchPageData searchPageModels = new SearchPageData<>();
		searchPageModels.setResults(list1);

		given(reconfirmationConfigService.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData))
				.willReturn(searchPageModels);

		searchPageDatas = configFacadeImpl.getAllReconfirmationConfigs(this.reconfirmationSearchParameterData, pageableData);

		verify(reconfirmationConfigService).getAllReconfirmationConfigs(this.reconfirmationSearchParameterData, pageableData);
	}

	@Test
	public void getReconfirmationConfigForCodeTest()
	{
		ReconfirmationConfigData configData = Mockito.mock(ReconfirmationConfigData.class);
		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		given(reconfirmationConfigService.getReconfirmationConfigForCode(RC_CODE)).willReturn(configModel);
		given(reconfirmationConfigConverter.convert(configModel)).willReturn(configData);

		configData = configFacadeImpl.getReconfirmationConfigForCode(RC_CODE);

		verify(reconfirmationConfigService).getReconfirmationConfigForCode(RC_CODE);
	}


	/*
	 * @Test public void deleteReconfirmationRecordForCodeTest() { final ReconfirmationConfigModel configModel =
	 * Mockito.mock(ReconfirmationConfigModel.class);
	 * given(reconfirmationConfigService.getReconfirmationConfigForCode(RC_CODE)).willReturn(configModel);
	 * Assert.assertNotNull(configModel); configFacadeImpl.deleteReconfirmationRecordForCode(RC_CODE);
	 *
	 * verify(reconfirmationConfigService).getReconfirmationConfigForCode(RC_CODE); //
	 * verify(mockModelService).remove(configModel); }
	 */
	@Test
	public void deleteReconfirmationRecordNullForCodeTest()
	{
		ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		configModel = null;
		given(reconfirmationConfigService.getReconfirmationConfigForCode(RC_CODE)).willReturn(configModel);

		configFacadeImpl.deleteReconfirmationRecordForCode(RC_CODE);

		verify(reconfirmationConfigService).getReconfirmationConfigForCode(RC_CODE);
	}

	@Test
	public void activateReconfirmationRecordTest()
	{

		final EmployeeModel employeeModel = Mockito.mock(EmployeeModel.class);
		employeeModel.setUid("admin");
		final ActivateParameterData activateData = Mockito.mock(ActivateParameterData.class);

		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);

		given(reconfirmationConfigService.getReconfirmationConfigForCode(activateData.getCode())).willReturn(configModel);

		configFacadeImpl.activateReconfirmationRecord(activateData);

		verify(mockModelService).save(configModel);
		//		verify(defaultAlertNotificationService).sendNotification(RC_CODE, "Test Message", "Pending", employeeModel);
	}

	@Test
	public void activateReconfirmationRecordNullTest()
	{
		final ActivateParameterData activateData = Mockito.mock(ActivateParameterData.class);
		ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		configModel = null;
		given(reconfirmationConfigService.getReconfirmationConfigForCode(activateData.getCode())).willReturn(configModel);

		configFacadeImpl.activateReconfirmationRecord(activateData);
	}


	@Test
	public void releaseLockReconfirmationRecordTest()
	{
		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		given(reconfirmationConfigService.getReconfirmationConfigForCode(RC_CODE)).willReturn(configModel);
		configFacadeImpl.releaseLockReconfirmationRecord(RC_CODE);
		lockUnlockService.unlock(configModel, configModel.getLockedBy());

		verify(lockUnlockService).unlock(configModel, configModel.getLockedBy());
	}

	@Test
	public void lockReconfirmationRecordTest()
	{
		final EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setUid("admin");

		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		final ReconfirmationConfigModel configModel1 = new ReconfirmationConfigModel();
		configModel1.setLockedBy(employeeModel);
		given(reconfirmationConfigService.getReconfirmationConfigForCode(RC_CODE)).willReturn(configModel);

		configFacadeImpl.lockReconfirmationRecord(RC_CODE);
		lockUnlockService.lock(configModel1, configModel1.getLockedBy());

		verify(lockUnlockService).lock(configModel1, configModel1.getLockedBy());
	}

	@Test
	public void addRecofirmationRecord()
	{
		final ReconfirmationConfigData configData = Mockito.mock(ReconfirmationConfigData.class);
		final ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		given(reconfirmationConfigReverseConverter.convert(configData)).willReturn(configModel);

		configFacadeImpl.addRecofirmationRecord(configData);
		verify(mockModelService).save(configModel);
	}
}