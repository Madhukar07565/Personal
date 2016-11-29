/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.core.jalo;

import com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.AdvanceParameter;
import com.cnk.travelogix.presales.jalo.ApprovalWorkFlow;
import com.cnk.travelogix.presales.jalo.AssuredBusiness;
import com.cnk.travelogix.presales.jalo.AssuredBusinessTargetProductVolume;
import com.cnk.travelogix.presales.jalo.Checklist;
import com.cnk.travelogix.presales.jalo.ChecklistDetails;
import com.cnk.travelogix.presales.jalo.CommercialTerms;
import com.cnk.travelogix.presales.jalo.CompanyAdditionalDetails;
import com.cnk.travelogix.presales.jalo.Competitor;
import com.cnk.travelogix.presales.jalo.ContractDocuments;
import com.cnk.travelogix.presales.jalo.Lead;
import com.cnk.travelogix.presales.jalo.LeadMedia;
import com.cnk.travelogix.presales.jalo.LeadStatus;
import com.cnk.travelogix.presales.jalo.PandLTragetProductVolume;
import com.cnk.travelogix.presales.jalo.Partner;
import com.cnk.travelogix.presales.jalo.PresalesAddress;
import com.cnk.travelogix.presales.jalo.ProfitAndLoss;
import com.cnk.travelogix.presales.jalo.Prospect;
import com.cnk.travelogix.presales.jalo.Question;
import com.cnk.travelogix.presales.jalo.QuestionInformation;
import com.cnk.travelogix.presales.jalo.Role;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>PresalescoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPresalescoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactPersonType", AttributeMode.INITIAL);
		tmp.put("influencer", AttributeMode.INITIAL);
		tmp.put("decisionMaker", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("prospect", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("profitAndLoss", AttributeMode.INITIAL);
		tmp.put("leadMedia", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.contactPersonType</code> attribute.
	 * @return the contactPersonType - Contact Person Type
	 */
	public List<EnumerationValue> getContactPersonType(final SessionContext ctx, final StaffInformation item)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)item.getProperty( ctx, PresalescoreConstants.Attributes.StaffInformation.CONTACTPERSONTYPE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.contactPersonType</code> attribute.
	 * @return the contactPersonType - Contact Person Type
	 */
	public List<EnumerationValue> getContactPersonType(final StaffInformation item)
	{
		return getContactPersonType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.contactPersonType</code> attribute. 
	 * @param value the contactPersonType - Contact Person Type
	 */
	public void setContactPersonType(final SessionContext ctx, final StaffInformation item, final List<EnumerationValue> value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.StaffInformation.CONTACTPERSONTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.contactPersonType</code> attribute. 
	 * @param value the contactPersonType - Contact Person Type
	 */
	public void setContactPersonType(final StaffInformation item, final List<EnumerationValue> value)
	{
		setContactPersonType( getSession().getSessionContext(), item, value );
	}
	
	public AdvanceParameter createAdvanceParameter(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.ADVANCEPARAMETER );
			return (AdvanceParameter)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AdvanceParameter : "+e.getMessage(), 0 );
		}
	}
	
	public AdvanceParameter createAdvanceParameter(final Map attributeValues)
	{
		return createAdvanceParameter( getSession().getSessionContext(), attributeValues );
	}
	
	public ApprovalWorkFlow createApprovalWorkFlow(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.APPROVALWORKFLOW );
			return (ApprovalWorkFlow)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApprovalWorkFlow : "+e.getMessage(), 0 );
		}
	}
	
	public ApprovalWorkFlow createApprovalWorkFlow(final Map attributeValues)
	{
		return createApprovalWorkFlow( getSession().getSessionContext(), attributeValues );
	}
	
	public AssuredBusiness createAssuredBusiness(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.ASSUREDBUSINESS );
			return (AssuredBusiness)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AssuredBusiness : "+e.getMessage(), 0 );
		}
	}
	
	public AssuredBusiness createAssuredBusiness(final Map attributeValues)
	{
		return createAssuredBusiness( getSession().getSessionContext(), attributeValues );
	}
	
	public AssuredBusinessTargetProductVolume createAssuredBusinessTargetProductVolume(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.ASSUREDBUSINESSTARGETPRODUCTVOLUME );
			return (AssuredBusinessTargetProductVolume)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AssuredBusinessTargetProductVolume : "+e.getMessage(), 0 );
		}
	}
	
	public AssuredBusinessTargetProductVolume createAssuredBusinessTargetProductVolume(final Map attributeValues)
	{
		return createAssuredBusinessTargetProductVolume( getSession().getSessionContext(), attributeValues );
	}
	
	public Checklist createChecklist(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.CHECKLIST );
			return (Checklist)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Checklist : "+e.getMessage(), 0 );
		}
	}
	
	public Checklist createChecklist(final Map attributeValues)
	{
		return createChecklist( getSession().getSessionContext(), attributeValues );
	}
	
	public ChecklistDetails createChecklistDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.CHECKLISTDETAILS );
			return (ChecklistDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ChecklistDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ChecklistDetails createChecklistDetails(final Map attributeValues)
	{
		return createChecklistDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialTerms createCommercialTerms(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.COMMERCIALTERMS );
			return (CommercialTerms)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CommercialTerms : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialTerms createCommercialTerms(final Map attributeValues)
	{
		return createCommercialTerms( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyAdditionalDetails createCompanyAdditionalDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.COMPANYADDITIONALDETAILS );
			return (CompanyAdditionalDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CompanyAdditionalDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyAdditionalDetails createCompanyAdditionalDetails(final Map attributeValues)
	{
		return createCompanyAdditionalDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Competitor createCompetitor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.COMPETITOR );
			return (Competitor)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Competitor : "+e.getMessage(), 0 );
		}
	}
	
	public Competitor createCompetitor(final Map attributeValues)
	{
		return createCompetitor( getSession().getSessionContext(), attributeValues );
	}
	
	public ContractDocuments createContractDocuments(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.CONTRACTDOCUMENTS );
			return (ContractDocuments)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContractDocuments : "+e.getMessage(), 0 );
		}
	}
	
	public ContractDocuments createContractDocuments(final Map attributeValues)
	{
		return createContractDocuments( getSession().getSessionContext(), attributeValues );
	}
	
	public Lead createLead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.LEAD );
			return (Lead)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Lead : "+e.getMessage(), 0 );
		}
	}
	
	public Lead createLead(final Map attributeValues)
	{
		return createLead( getSession().getSessionContext(), attributeValues );
	}
	
	public LeadMedia createLeadMedia(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.LEADMEDIA );
			return (LeadMedia)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LeadMedia : "+e.getMessage(), 0 );
		}
	}
	
	public LeadMedia createLeadMedia(final Map attributeValues)
	{
		return createLeadMedia( getSession().getSessionContext(), attributeValues );
	}
	
	public LeadStatus createLeadStatus(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.LEADSTATUS );
			return (LeadStatus)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LeadStatus : "+e.getMessage(), 0 );
		}
	}
	
	public LeadStatus createLeadStatus(final Map attributeValues)
	{
		return createLeadStatus( getSession().getSessionContext(), attributeValues );
	}
	
	public PandLTragetProductVolume createPandLTragetProductVolume(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.PANDLTRAGETPRODUCTVOLUME );
			return (PandLTragetProductVolume)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PandLTragetProductVolume : "+e.getMessage(), 0 );
		}
	}
	
	public PandLTragetProductVolume createPandLTragetProductVolume(final Map attributeValues)
	{
		return createPandLTragetProductVolume( getSession().getSessionContext(), attributeValues );
	}
	
	public Partner createPartner(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.PARTNER );
			return (Partner)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Partner : "+e.getMessage(), 0 );
		}
	}
	
	public Partner createPartner(final Map attributeValues)
	{
		return createPartner( getSession().getSessionContext(), attributeValues );
	}
	
	public PresalesAddress createPresalesAddress(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.PRESALESADDRESS );
			return (PresalesAddress)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PresalesAddress : "+e.getMessage(), 0 );
		}
	}
	
	public PresalesAddress createPresalesAddress(final Map attributeValues)
	{
		return createPresalesAddress( getSession().getSessionContext(), attributeValues );
	}
	
	public ProfitAndLoss createProfitAndLoss(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.PROFITANDLOSS );
			return (ProfitAndLoss)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProfitAndLoss : "+e.getMessage(), 0 );
		}
	}
	
	public ProfitAndLoss createProfitAndLoss(final Map attributeValues)
	{
		return createProfitAndLoss( getSession().getSessionContext(), attributeValues );
	}
	
	public Prospect createProspect(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.PROSPECT );
			return (Prospect)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Prospect : "+e.getMessage(), 0 );
		}
	}
	
	public Prospect createProspect(final Map attributeValues)
	{
		return createProspect( getSession().getSessionContext(), attributeValues );
	}
	
	public Question createQuestion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.QUESTION );
			return (Question)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Question : "+e.getMessage(), 0 );
		}
	}
	
	public Question createQuestion(final Map attributeValues)
	{
		return createQuestion( getSession().getSessionContext(), attributeValues );
	}
	
	public QuestionInformation createQuestionInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.QUESTIONINFORMATION );
			return (QuestionInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating QuestionInformation : "+e.getMessage(), 0 );
		}
	}
	
	public QuestionInformation createQuestionInformation(final Map attributeValues)
	{
		return createQuestionInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public Role createRole(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PresalescoreConstants.TC.ROLE );
			return (Role)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Role : "+e.getMessage(), 0 );
		}
	}
	
	public Role createRole(final Map attributeValues)
	{
		return createRole( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.decisionMaker</code> attribute.
	 * @return the decisionMaker - Decision Maker Person
	 */
	public Boolean isDecisionMaker(final SessionContext ctx, final StaffInformation item)
	{
		return (Boolean)item.getProperty( ctx, PresalescoreConstants.Attributes.StaffInformation.DECISIONMAKER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.decisionMaker</code> attribute.
	 * @return the decisionMaker - Decision Maker Person
	 */
	public Boolean isDecisionMaker(final StaffInformation item)
	{
		return isDecisionMaker( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @return the decisionMaker - Decision Maker Person
	 */
	public boolean isDecisionMakerAsPrimitive(final SessionContext ctx, final StaffInformation item)
	{
		Boolean value = isDecisionMaker( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @return the decisionMaker - Decision Maker Person
	 */
	public boolean isDecisionMakerAsPrimitive(final StaffInformation item)
	{
		return isDecisionMakerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @param value the decisionMaker - Decision Maker Person
	 */
	public void setDecisionMaker(final SessionContext ctx, final StaffInformation item, final Boolean value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.StaffInformation.DECISIONMAKER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @param value the decisionMaker - Decision Maker Person
	 */
	public void setDecisionMaker(final StaffInformation item, final Boolean value)
	{
		setDecisionMaker( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @param value the decisionMaker - Decision Maker Person
	 */
	public void setDecisionMaker(final SessionContext ctx, final StaffInformation item, final boolean value)
	{
		setDecisionMaker( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.decisionMaker</code> attribute. 
	 * @param value the decisionMaker - Decision Maker Person
	 */
	public void setDecisionMaker(final StaffInformation item, final boolean value)
	{
		setDecisionMaker( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return PresalescoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.influencer</code> attribute.
	 * @return the influencer - Person is Influencer
	 */
	public Boolean isInfluencer(final SessionContext ctx, final StaffInformation item)
	{
		return (Boolean)item.getProperty( ctx, PresalescoreConstants.Attributes.StaffInformation.INFLUENCER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.influencer</code> attribute.
	 * @return the influencer - Person is Influencer
	 */
	public Boolean isInfluencer(final StaffInformation item)
	{
		return isInfluencer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.influencer</code> attribute. 
	 * @return the influencer - Person is Influencer
	 */
	public boolean isInfluencerAsPrimitive(final SessionContext ctx, final StaffInformation item)
	{
		Boolean value = isInfluencer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.influencer</code> attribute. 
	 * @return the influencer - Person is Influencer
	 */
	public boolean isInfluencerAsPrimitive(final StaffInformation item)
	{
		return isInfluencerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.influencer</code> attribute. 
	 * @param value the influencer - Person is Influencer
	 */
	public void setInfluencer(final SessionContext ctx, final StaffInformation item, final Boolean value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.StaffInformation.INFLUENCER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.influencer</code> attribute. 
	 * @param value the influencer - Person is Influencer
	 */
	public void setInfluencer(final StaffInformation item, final Boolean value)
	{
		setInfluencer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.influencer</code> attribute. 
	 * @param value the influencer - Person is Influencer
	 */
	public void setInfluencer(final SessionContext ctx, final StaffInformation item, final boolean value)
	{
		setInfluencer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.influencer</code> attribute. 
	 * @param value the influencer - Person is Influencer
	 */
	public void setInfluencer(final StaffInformation item, final boolean value)
	{
		setInfluencer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.leadMedia</code> attribute.
	 * @return the leadMedia
	 */
	public LeadMedia getLeadMedia(final SessionContext ctx, final Media item)
	{
		return (LeadMedia)item.getProperty( ctx, PresalescoreConstants.Attributes.Media.LEADMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.leadMedia</code> attribute.
	 * @return the leadMedia
	 */
	public LeadMedia getLeadMedia(final Media item)
	{
		return getLeadMedia( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.leadMedia</code> attribute. 
	 * @param value the leadMedia
	 */
	public void setLeadMedia(final SessionContext ctx, final Media item, final LeadMedia value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.Media.LEADMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.leadMedia</code> attribute. 
	 * @param value the leadMedia
	 */
	public void setLeadMedia(final Media item, final LeadMedia value)
	{
		setLeadMedia( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.profitAndLoss</code> attribute.
	 * @return the profitAndLoss
	 */
	public ProfitAndLoss getProfitAndLoss(final SessionContext ctx, final Media item)
	{
		return (ProfitAndLoss)item.getProperty( ctx, PresalescoreConstants.Attributes.Media.PROFITANDLOSS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.profitAndLoss</code> attribute.
	 * @return the profitAndLoss
	 */
	public ProfitAndLoss getProfitAndLoss(final Media item)
	{
		return getProfitAndLoss( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss
	 */
	public void setProfitAndLoss(final SessionContext ctx, final Media item, final ProfitAndLoss value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.Media.PROFITANDLOSS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss
	 */
	public void setProfitAndLoss(final Media item, final ProfitAndLoss value)
	{
		setProfitAndLoss( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect(final SessionContext ctx, final BusinessInformation item)
	{
		return (Prospect)item.getProperty( ctx, PresalescoreConstants.Attributes.BusinessInformation.PROSPECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect(final BusinessInformation item)
	{
		return getProspect( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final SessionContext ctx, final BusinessInformation item, final Prospect value)
	{
		item.setProperty(ctx, PresalescoreConstants.Attributes.BusinessInformation.PROSPECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final BusinessInformation item, final Prospect value)
	{
		setProspect( getSession().getSessionContext(), item, value );
	}
	
}
