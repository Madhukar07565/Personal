/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.ApprovalWorkFlow;
import com.cnk.travelogix.presales.jalo.AssuredBusiness;
import com.cnk.travelogix.presales.jalo.Checklist;
import com.cnk.travelogix.presales.jalo.CompanyAdditionalDetails;
import com.cnk.travelogix.presales.jalo.Competitor;
import com.cnk.travelogix.presales.jalo.LeadMedia;
import com.cnk.travelogix.presales.jalo.LeadStatus;
import com.cnk.travelogix.presales.jalo.Partner;
import com.cnk.travelogix.presales.jalo.ProfitAndLoss;
import com.cnk.travelogix.presales.jalo.Prospect;
import com.cnk.travelogix.presales.jalo.QuestionInformation;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Lead Lead}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLead extends TravelogixB2BUnit
{
	/** Qualifier of the <code>Lead.staffDetails</code> attribute **/
	public static final String STAFFDETAILS = "staffDetails";
	/** Qualifier of the <code>Lead.servicingLocation</code> attribute **/
	public static final String SERVICINGLOCATION = "servicingLocation";
	/** Qualifier of the <code>Lead.companyDetails</code> attribute **/
	public static final String COMPANYDETAILS = "companyDetails";
	/** Qualifier of the <code>Lead.leadStatus</code> attribute **/
	public static final String LEADSTATUS = "leadStatus";
	/** Qualifier of the <code>Lead.approvalWorkFlow</code> attribute **/
	public static final String APPROVALWORKFLOW = "approvalWorkFlow";
	/** Qualifier of the <code>Lead.profitAndLoss</code> attribute **/
	public static final String PROFITANDLOSS = "profitAndLoss";
	/** Qualifier of the <code>Lead.checklist</code> attribute **/
	public static final String CHECKLIST = "checklist";
	/** Qualifier of the <code>Lead.assuredBusiness</code> attribute **/
	public static final String ASSUREDBUSINESS = "assuredBusiness";
	/** Qualifier of the <code>Lead.leadinfoQuestions</code> attribute **/
	public static final String LEADINFOQUESTIONS = "leadinfoQuestions";
	/** Qualifier of the <code>Lead.leadCompetitors</code> attribute **/
	public static final String LEADCOMPETITORS = "leadCompetitors";
	/** Qualifier of the <code>Lead.currentPartners</code> attribute **/
	public static final String CURRENTPARTNERS = "currentPartners";
	/** Qualifier of the <code>Lead.prospect</code> attribute **/
	public static final String PROSPECT = "prospect";
	/** Qualifier of the <code>Lead.leadUploads</code> attribute **/
	public static final String LEADUPLOADS = "leadUploads";
	/**
	* {@link OneToManyHandler} for handling 1:n LEADINFOQUESTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<QuestionInformation> LEADINFOQUESTIONSHANDLER = new OneToManyHandler<QuestionInformation>(
	PresalescoreConstants.TC.QUESTIONINFORMATION,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LEADCOMPETITORS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Competitor> LEADCOMPETITORSHANDLER = new OneToManyHandler<Competitor>(
	PresalescoreConstants.TC.COMPETITOR,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CURRENTPARTNERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Partner> CURRENTPARTNERSHANDLER = new OneToManyHandler<Partner>(
	PresalescoreConstants.TC.PARTNER,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PROSPECT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedLead> PROSPECTHANDLER = new BidirectionalOneToManyHandler<GeneratedLead>(
	PresalescoreConstants.TC.LEAD,
	false,
	"prospect",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LEADUPLOADS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<LeadMedia> LEADUPLOADSHANDLER = new OneToManyHandler<LeadMedia>(
	PresalescoreConstants.TC.LEADMEDIA,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelogixB2BUnit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STAFFDETAILS, AttributeMode.INITIAL);
		tmp.put(SERVICINGLOCATION, AttributeMode.INITIAL);
		tmp.put(COMPANYDETAILS, AttributeMode.INITIAL);
		tmp.put(LEADSTATUS, AttributeMode.INITIAL);
		tmp.put(APPROVALWORKFLOW, AttributeMode.INITIAL);
		tmp.put(PROFITANDLOSS, AttributeMode.INITIAL);
		tmp.put(CHECKLIST, AttributeMode.INITIAL);
		tmp.put(ASSUREDBUSINESS, AttributeMode.INITIAL);
		tmp.put(PROSPECT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.approvalWorkFlow</code> attribute.
	 * @return the approvalWorkFlow - Approval Work Flow for Lead
	 */
	public List<ApprovalWorkFlow> getApprovalWorkFlow(final SessionContext ctx)
	{
		List<ApprovalWorkFlow> coll = (List<ApprovalWorkFlow>)getProperty( ctx, APPROVALWORKFLOW);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.approvalWorkFlow</code> attribute.
	 * @return the approvalWorkFlow - Approval Work Flow for Lead
	 */
	public List<ApprovalWorkFlow> getApprovalWorkFlow()
	{
		return getApprovalWorkFlow( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.approvalWorkFlow</code> attribute. 
	 * @param value the approvalWorkFlow - Approval Work Flow for Lead
	 */
	public void setApprovalWorkFlow(final SessionContext ctx, final List<ApprovalWorkFlow> value)
	{
		setProperty(ctx, APPROVALWORKFLOW,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.approvalWorkFlow</code> attribute. 
	 * @param value the approvalWorkFlow - Approval Work Flow for Lead
	 */
	public void setApprovalWorkFlow(final List<ApprovalWorkFlow> value)
	{
		setApprovalWorkFlow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.assuredBusiness</code> attribute.
	 * @return the assuredBusiness - Lead to AssuredBusiness association
	 */
	public AssuredBusiness getAssuredBusiness(final SessionContext ctx)
	{
		return (AssuredBusiness)getProperty( ctx, ASSUREDBUSINESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.assuredBusiness</code> attribute.
	 * @return the assuredBusiness - Lead to AssuredBusiness association
	 */
	public AssuredBusiness getAssuredBusiness()
	{
		return getAssuredBusiness( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.assuredBusiness</code> attribute. 
	 * @param value the assuredBusiness - Lead to AssuredBusiness association
	 */
	public void setAssuredBusiness(final SessionContext ctx, final AssuredBusiness value)
	{
		setProperty(ctx, ASSUREDBUSINESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.assuredBusiness</code> attribute. 
	 * @param value the assuredBusiness - Lead to AssuredBusiness association
	 */
	public void setAssuredBusiness(final AssuredBusiness value)
	{
		setAssuredBusiness( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.checklist</code> attribute.
	 * @return the checklist - Lead to Checklist association
	 */
	public Checklist getChecklist(final SessionContext ctx)
	{
		return (Checklist)getProperty( ctx, CHECKLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.checklist</code> attribute.
	 * @return the checklist - Lead to Checklist association
	 */
	public Checklist getChecklist()
	{
		return getChecklist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.checklist</code> attribute. 
	 * @param value the checklist - Lead to Checklist association
	 */
	public void setChecklist(final SessionContext ctx, final Checklist value)
	{
		setProperty(ctx, CHECKLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.checklist</code> attribute. 
	 * @param value the checklist - Lead to Checklist association
	 */
	public void setChecklist(final Checklist value)
	{
		setChecklist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.companyDetails</code> attribute.
	 * @return the companyDetails - Additional details of Company
	 */
	public CompanyAdditionalDetails getCompanyDetails(final SessionContext ctx)
	{
		return (CompanyAdditionalDetails)getProperty( ctx, COMPANYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.companyDetails</code> attribute.
	 * @return the companyDetails - Additional details of Company
	 */
	public CompanyAdditionalDetails getCompanyDetails()
	{
		return getCompanyDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.companyDetails</code> attribute. 
	 * @param value the companyDetails - Additional details of Company
	 */
	public void setCompanyDetails(final SessionContext ctx, final CompanyAdditionalDetails value)
	{
		setProperty(ctx, COMPANYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.companyDetails</code> attribute. 
	 * @param value the companyDetails - Additional details of Company
	 */
	public void setCompanyDetails(final CompanyAdditionalDetails value)
	{
		setCompanyDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PROSPECTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.currentPartners</code> attribute.
	 * @return the currentPartners
	 */
	public Collection<Partner> getCurrentPartners(final SessionContext ctx)
	{
		return CURRENTPARTNERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.currentPartners</code> attribute.
	 * @return the currentPartners
	 */
	public Collection<Partner> getCurrentPartners()
	{
		return getCurrentPartners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.currentPartners</code> attribute. 
	 * @param value the currentPartners
	 */
	public void setCurrentPartners(final SessionContext ctx, final Collection<Partner> value)
	{
		CURRENTPARTNERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.currentPartners</code> attribute. 
	 * @param value the currentPartners
	 */
	public void setCurrentPartners(final Collection<Partner> value)
	{
		setCurrentPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to currentPartners. 
	 * @param value the item to add to currentPartners
	 */
	public void addToCurrentPartners(final SessionContext ctx, final Partner value)
	{
		CURRENTPARTNERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to currentPartners. 
	 * @param value the item to add to currentPartners
	 */
	public void addToCurrentPartners(final Partner value)
	{
		addToCurrentPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from currentPartners. 
	 * @param value the item to remove from currentPartners
	 */
	public void removeFromCurrentPartners(final SessionContext ctx, final Partner value)
	{
		CURRENTPARTNERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from currentPartners. 
	 * @param value the item to remove from currentPartners
	 */
	public void removeFromCurrentPartners(final Partner value)
	{
		removeFromCurrentPartners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadCompetitors</code> attribute.
	 * @return the leadCompetitors
	 */
	public Collection<Competitor> getLeadCompetitors(final SessionContext ctx)
	{
		return LEADCOMPETITORSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadCompetitors</code> attribute.
	 * @return the leadCompetitors
	 */
	public Collection<Competitor> getLeadCompetitors()
	{
		return getLeadCompetitors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadCompetitors</code> attribute. 
	 * @param value the leadCompetitors
	 */
	public void setLeadCompetitors(final SessionContext ctx, final Collection<Competitor> value)
	{
		LEADCOMPETITORSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadCompetitors</code> attribute. 
	 * @param value the leadCompetitors
	 */
	public void setLeadCompetitors(final Collection<Competitor> value)
	{
		setLeadCompetitors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadCompetitors. 
	 * @param value the item to add to leadCompetitors
	 */
	public void addToLeadCompetitors(final SessionContext ctx, final Competitor value)
	{
		LEADCOMPETITORSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadCompetitors. 
	 * @param value the item to add to leadCompetitors
	 */
	public void addToLeadCompetitors(final Competitor value)
	{
		addToLeadCompetitors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadCompetitors. 
	 * @param value the item to remove from leadCompetitors
	 */
	public void removeFromLeadCompetitors(final SessionContext ctx, final Competitor value)
	{
		LEADCOMPETITORSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadCompetitors. 
	 * @param value the item to remove from leadCompetitors
	 */
	public void removeFromLeadCompetitors(final Competitor value)
	{
		removeFromLeadCompetitors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadinfoQuestions</code> attribute.
	 * @return the leadinfoQuestions
	 */
	public Collection<QuestionInformation> getLeadinfoQuestions(final SessionContext ctx)
	{
		return LEADINFOQUESTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadinfoQuestions</code> attribute.
	 * @return the leadinfoQuestions
	 */
	public Collection<QuestionInformation> getLeadinfoQuestions()
	{
		return getLeadinfoQuestions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadinfoQuestions</code> attribute. 
	 * @param value the leadinfoQuestions
	 */
	public void setLeadinfoQuestions(final SessionContext ctx, final Collection<QuestionInformation> value)
	{
		LEADINFOQUESTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadinfoQuestions</code> attribute. 
	 * @param value the leadinfoQuestions
	 */
	public void setLeadinfoQuestions(final Collection<QuestionInformation> value)
	{
		setLeadinfoQuestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadinfoQuestions. 
	 * @param value the item to add to leadinfoQuestions
	 */
	public void addToLeadinfoQuestions(final SessionContext ctx, final QuestionInformation value)
	{
		LEADINFOQUESTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadinfoQuestions. 
	 * @param value the item to add to leadinfoQuestions
	 */
	public void addToLeadinfoQuestions(final QuestionInformation value)
	{
		addToLeadinfoQuestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadinfoQuestions. 
	 * @param value the item to remove from leadinfoQuestions
	 */
	public void removeFromLeadinfoQuestions(final SessionContext ctx, final QuestionInformation value)
	{
		LEADINFOQUESTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadinfoQuestions. 
	 * @param value the item to remove from leadinfoQuestions
	 */
	public void removeFromLeadinfoQuestions(final QuestionInformation value)
	{
		removeFromLeadinfoQuestions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadStatus</code> attribute.
	 * @return the leadStatus - LeadStatus for Lead
	 */
	public LeadStatus getLeadStatus(final SessionContext ctx)
	{
		return (LeadStatus)getProperty( ctx, LEADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadStatus</code> attribute.
	 * @return the leadStatus - LeadStatus for Lead
	 */
	public LeadStatus getLeadStatus()
	{
		return getLeadStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadStatus</code> attribute. 
	 * @param value the leadStatus - LeadStatus for Lead
	 */
	public void setLeadStatus(final SessionContext ctx, final LeadStatus value)
	{
		setProperty(ctx, LEADSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadStatus</code> attribute. 
	 * @param value the leadStatus - LeadStatus for Lead
	 */
	public void setLeadStatus(final LeadStatus value)
	{
		setLeadStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadUploads</code> attribute.
	 * @return the leadUploads
	 */
	public Collection<LeadMedia> getLeadUploads(final SessionContext ctx)
	{
		return LEADUPLOADSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.leadUploads</code> attribute.
	 * @return the leadUploads
	 */
	public Collection<LeadMedia> getLeadUploads()
	{
		return getLeadUploads( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadUploads</code> attribute. 
	 * @param value the leadUploads
	 */
	public void setLeadUploads(final SessionContext ctx, final Collection<LeadMedia> value)
	{
		LEADUPLOADSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.leadUploads</code> attribute. 
	 * @param value the leadUploads
	 */
	public void setLeadUploads(final Collection<LeadMedia> value)
	{
		setLeadUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadUploads. 
	 * @param value the item to add to leadUploads
	 */
	public void addToLeadUploads(final SessionContext ctx, final LeadMedia value)
	{
		LEADUPLOADSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to leadUploads. 
	 * @param value the item to add to leadUploads
	 */
	public void addToLeadUploads(final LeadMedia value)
	{
		addToLeadUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadUploads. 
	 * @param value the item to remove from leadUploads
	 */
	public void removeFromLeadUploads(final SessionContext ctx, final LeadMedia value)
	{
		LEADUPLOADSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from leadUploads. 
	 * @param value the item to remove from leadUploads
	 */
	public void removeFromLeadUploads(final LeadMedia value)
	{
		removeFromLeadUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.profitAndLoss</code> attribute.
	 * @return the profitAndLoss - Profit And Loss for Lead
	 */
	public ProfitAndLoss getProfitAndLoss(final SessionContext ctx)
	{
		return (ProfitAndLoss)getProperty( ctx, PROFITANDLOSS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.profitAndLoss</code> attribute.
	 * @return the profitAndLoss - Profit And Loss for Lead
	 */
	public ProfitAndLoss getProfitAndLoss()
	{
		return getProfitAndLoss( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss - Profit And Loss for Lead
	 */
	public void setProfitAndLoss(final SessionContext ctx, final ProfitAndLoss value)
	{
		setProperty(ctx, PROFITANDLOSS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss - Profit And Loss for Lead
	 */
	public void setProfitAndLoss(final ProfitAndLoss value)
	{
		setProfitAndLoss( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect(final SessionContext ctx)
	{
		return (Prospect)getProperty( ctx, PROSPECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect()
	{
		return getProspect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final SessionContext ctx, final Prospect value)
	{
		PROSPECTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final Prospect value)
	{
		setProspect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.servicingLocation</code> attribute.
	 * @return the servicingLocation - service Location for Lead
	 */
	public EnumerationValue getServicingLocation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVICINGLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.servicingLocation</code> attribute.
	 * @return the servicingLocation - service Location for Lead
	 */
	public EnumerationValue getServicingLocation()
	{
		return getServicingLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.servicingLocation</code> attribute. 
	 * @param value the servicingLocation - service Location for Lead
	 */
	public void setServicingLocation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVICINGLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.servicingLocation</code> attribute. 
	 * @param value the servicingLocation - service Location for Lead
	 */
	public void setServicingLocation(final EnumerationValue value)
	{
		setServicingLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.staffDetails</code> attribute.
	 * @return the staffDetails - StaffDetails for Lead
	 */
	public StaffInformation getStaffDetails(final SessionContext ctx)
	{
		return (StaffInformation)getProperty( ctx, STAFFDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Lead.staffDetails</code> attribute.
	 * @return the staffDetails - StaffDetails for Lead
	 */
	public StaffInformation getStaffDetails()
	{
		return getStaffDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.staffDetails</code> attribute. 
	 * @param value the staffDetails - StaffDetails for Lead
	 */
	public void setStaffDetails(final SessionContext ctx, final StaffInformation value)
	{
		setProperty(ctx, STAFFDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Lead.staffDetails</code> attribute. 
	 * @param value the staffDetails - StaffDetails for Lead
	 */
	public void setStaffDetails(final StaffInformation value)
	{
		setStaffDetails( getSession().getSessionContext(), value );
	}
	
}
