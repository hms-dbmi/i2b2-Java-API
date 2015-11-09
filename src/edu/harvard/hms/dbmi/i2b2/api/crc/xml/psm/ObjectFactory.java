/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.crc.xml.psm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessStepTiming_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "process_step_timing");
    private final static QName _QueryDefinition_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", "query_definition");
    private final static QName _QueryConstraints_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", "query_constraints");
    private final static QName _QueryMaster_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "query_master");
    private final static QName _Response_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "response");
    private final static QName _QueryResultInstance_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "query_result_instance");
    private final static QName _GetNameInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "get_name_info");
    private final static QName _Sql_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "sql");
    private final static QName _Panel_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", "panel");
    private final static QName _AnalysisDefinition_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/", "analysis_definition");
    private final static QName _Psmheader_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "psmheader");
    private final static QName _QueryInstance_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "query_instance");
    private final static QName _Request_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/1.1/", "request");
    private final static QName _QueryConstraint_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", "query_constraint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.crc.xml.psm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemType.ConstrainByModifier }
     * 
     */
    public ItemType.ConstrainByModifier createItemTypeConstrainByModifier() {
        return new ItemType.ConstrainByModifier();
    }
    
    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link PanelType }
     * 
     */
    public PanelType createPanelType() {
        return new PanelType();
    }

    /**
     * Create an instance of {@link PatientSetType }
     * 
     */
    public PatientSetType createPatientSetType() {
        return new PatientSetType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link PsmQryHeaderType }
     * 
     */
    public PsmQryHeaderType createPsmQryHeaderType() {
        return new PsmQryHeaderType();
    }

    /**
     * Create an instance of {@link QueryInstanceType }
     * 
     */
    public QueryInstanceType createQueryInstanceType() {
        return new QueryInstanceType();
    }

    /**
     * Create an instance of {@link QueryResultInstanceType }
     * 
     */
    public QueryResultInstanceType createQueryResultInstanceType() {
        return new QueryResultInstanceType();
    }

    /**
     * Create an instance of {@link QueryMasterType }
     * 
     */
    public QueryMasterType createQueryMasterType() {
        return new QueryMasterType();
    }

    /**
     * Create an instance of {@link TimingStepType }
     * 
     */
    public TimingStepType createTimingStepType() {
        return new TimingStepType();
    }

    /**
     * Create an instance of {@link FindByChildType }
     * 
     */
    public FindByChildType createFindByChildType() {
        return new FindByChildType();
    }

    /**
     * Create an instance of {@link DatatypesExample }
     * 
     */
    public DatatypesExample createDatatypesExample() {
        return new DatatypesExample();
    }

    /**
     * Create an instance of {@link QueryStatusTypeType }
     * 
     */
    public QueryStatusTypeType createQueryStatusTypeType() {
        return new QueryStatusTypeType();
    }

    /**
     * Create an instance of {@link QueryResultTypeType }
     * 
     */
    public QueryResultTypeType createQueryResultTypeType() {
        return new QueryResultTypeType();
    }

    /**
     * Create an instance of {@link PatientEncCollectionType }
     * 
     */
    public PatientEncCollectionType createPatientEncCollectionType() {
        return new PatientEncCollectionType();
    }

    /**
     * Create an instance of {@link PatientSetCollectionType }
     * 
     */
    public PatientSetCollectionType createPatientSetCollectionType() {
        return new PatientSetCollectionType();
    }

    /**
     * Create an instance of {@link XmlResultType }
     * 
     */
    public XmlResultType createXmlResultType() {
        return new XmlResultType();
    }

    /**
     * Create an instance of {@link XmlValueType }
     * 
     */
    public XmlValueType createXmlValueType() {
        return new XmlValueType();
    }

    /**
     * Create an instance of {@link AnalysisPluginMetadataRequestType }
     * 
     */
    public AnalysisPluginMetadataRequestType createAnalysisPluginMetadataRequestType() {
        return new AnalysisPluginMetadataRequestType();
    }

    /**
     * Create an instance of {@link RequestXmlResponseType }
     * 
     */
    public RequestXmlResponseType createRequestXmlResponseType() {
        return new RequestXmlResponseType();
    }

    /**
     * Create an instance of {@link MasterDeleteRequestType }
     * 
     */
    public MasterDeleteRequestType createMasterDeleteRequestType() {
        return new MasterDeleteRequestType();
    }

    /**
     * Create an instance of {@link ResultResponseType }
     * 
     */
    public ResultResponseType createResultResponseType() {
        return new ResultResponseType();
    }

    /**
     * Create an instance of {@link InstanceResultResponseType }
     * 
     */
    public InstanceResultResponseType createInstanceResultResponseType() {
        return new InstanceResultResponseType();
    }

    /**
     * Create an instance of {@link InstanceRequestType }
     * 
     */
    public InstanceRequestType createInstanceRequestType() {
        return new InstanceRequestType();
    }

    /**
     * Create an instance of {@link MasterResponseType }
     * 
     */
    public MasterResponseType createMasterResponseType() {
        return new MasterResponseType();
    }

    /**
     * Create an instance of {@link AnalysisPluginMetadataResponseType }
     * 
     */
    public AnalysisPluginMetadataResponseType createAnalysisPluginMetadataResponseType() {
        return new AnalysisPluginMetadataResponseType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link InstanceResponseType }
     * 
     */
    public InstanceResponseType createInstanceResponseType() {
        return new InstanceResponseType();
    }

    /**
     * Create an instance of {@link AnalysisPluginMetadataTypeType }
     * 
     */
    public AnalysisPluginMetadataTypeType createAnalysisPluginMetadataTypeType() {
        return new AnalysisPluginMetadataTypeType();
    }

    /**
     * Create an instance of {@link ResultTypeRequestType }
     * 
     */
    public ResultTypeRequestType createResultTypeRequestType() {
        return new ResultTypeRequestType();
    }

    /**
     * Create an instance of {@link MasterRequestType }
     * 
     */
    public MasterRequestType createMasterRequestType() {
        return new MasterRequestType();
    }

    /**
     * Create an instance of {@link AnalysisDefinitionRequestType }
     * 
     */
    public AnalysisDefinitionRequestType createAnalysisDefinitionRequestType() {
        return new AnalysisDefinitionRequestType();
    }

    /**
     * Create an instance of {@link RequestXmlType }
     * 
     */
    public RequestXmlType createRequestXmlType() {
        return new RequestXmlType();
    }

    /**
     * Create an instance of {@link AnalysisParameterXmlType }
     * 
     */
    public AnalysisParameterXmlType createAnalysisParameterXmlType() {
        return new AnalysisParameterXmlType();
    }

    /**
     * Create an instance of {@link PatientSetResponseType }
     * 
     */
    public PatientSetResponseType createPatientSetResponseType() {
        return new PatientSetResponseType();
    }

    /**
     * Create an instance of {@link MatchStrType }
     * 
     */
    public MatchStrType createMatchStrType() {
        return new MatchStrType();
    }

    /**
     * Create an instance of {@link QueryDefinitionRequestType }
     * 
     */
    public QueryDefinitionRequestType createQueryDefinitionRequestType() {
        return new QueryDefinitionRequestType();
    }

    /**
     * Create an instance of {@link CrcXmlResultResponseType }
     * 
     */
    public CrcXmlResultResponseType createCrcXmlResultResponseType() {
        return new CrcXmlResultResponseType();
    }

    /**
     * Create an instance of {@link MasterInstanceResultResponseType }
     * 
     */
    public MasterInstanceResultResponseType createMasterInstanceResultResponseType() {
        return new MasterInstanceResultResponseType();
    }

    /**
     * Create an instance of {@link ResultOutputOptionType }
     * 
     */
    public ResultOutputOptionType createResultOutputOptionType() {
        return new ResultOutputOptionType();
    }

    /**
     * Create an instance of {@link ResultTypeResponseType }
     * 
     */
    public ResultTypeResponseType createResultTypeResponseType() {
        return new ResultTypeResponseType();
    }

    /**
     * Create an instance of {@link ResultRequestType }
     * 
     */
    public ResultRequestType createResultRequestType() {
        return new ResultRequestType();
    }

    /**
     * Create an instance of {@link MasterRenameRequestType }
     * 
     */
    public MasterRenameRequestType createMasterRenameRequestType() {
        return new MasterRenameRequestType();
    }

    /**
     * Create an instance of {@link UserRequestType }
     * 
     */
    public UserRequestType createUserRequestType() {
        return new UserRequestType();
    }

    /**
     * Create an instance of {@link ResultOutputOptionListType }
     * 
     */
    public ResultOutputOptionListType createResultOutputOptionListType() {
        return new ResultOutputOptionListType();
    }

    /**
     * Create an instance of {@link QueryConstraintType }
     * 
     */
    public QueryConstraintType createQueryConstraintType() {
        return new QueryConstraintType();
    }

    /**
     * Create an instance of {@link QueryDefinitionType }
     * 
     */
    public QueryDefinitionType createQueryDefinitionType() {
        return new QueryDefinitionType();
    }

    /**
     * Create an instance of {@link QueryConstraintsType }
     * 
     */
    public QueryConstraintsType createQueryConstraintsType() {
        return new QueryConstraintsType();
    }

    /**
     * Create an instance of {@link QuerySpanConstraintType }
     * 
     */
    public QuerySpanConstraintType createQuerySpanConstraintType() {
        return new QuerySpanConstraintType();
    }

    /**
     * Create an instance of {@link MetadataxmlValueType }
     * 
     */
    public MetadataxmlValueType createMetadataxmlValueType() {
        return new MetadataxmlValueType();
    }

    /**
     * Create an instance of {@link ConstrainDateType }
     * 
     */
    public ConstrainDateType createConstrainDateType() {
        return new ConstrainDateType();
    }

    /**
     * Create an instance of {@link QueryJoinType }
     * 
     */
    public QueryJoinType createQueryJoinType() {
        return new QueryJoinType();
    }

    /**
     * Create an instance of {@link AnalysisDefinitionType }
     * 
     */
    public AnalysisDefinitionType createAnalysisDefinitionType() {
        return new AnalysisDefinitionType();
    }

    /**
     * Create an instance of {@link AnalysisParamType }
     * 
     */
    public AnalysisParamType createAnalysisParamType() {
        return new AnalysisParamType();
    }

    /**
     * Create an instance of {@link AnalysisResultOptionType }
     * 
     */
    public AnalysisResultOptionType createAnalysisResultOptionType() {
        return new AnalysisResultOptionType();
    }

    /**
     * Create an instance of {@link CrcAnalysisInputParamType }
     * 
     */
    public CrcAnalysisInputParamType createCrcAnalysisInputParamType() {
        return new CrcAnalysisInputParamType();
    }

    /**
     * Create an instance of {@link AnalysisResultOptionListType }
     * 
     */
    public AnalysisResultOptionListType createAnalysisResultOptionListType() {
        return new AnalysisResultOptionListType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link MessageTypeType }
     * 
     */
    public MessageTypeType createMessageTypeType() {
        return new MessageTypeType();
    }

    /**
     * Create an instance of {@link MessageControlIdType }
     * 
     */
    public MessageControlIdType createMessageControlIdType() {
        return new MessageControlIdType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link HiveStatusType }
     * 
     */
    public HiveStatusType createHiveStatusType() {
        return new HiveStatusType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link ResultStatusType }
     * 
     */
    public ResultStatusType createResultStatusType() {
        return new ResultStatusType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link ProcessingIdType }
     * 
     */
    public ProcessingIdType createProcessingIdType() {
        return new ProcessingIdType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link PollingUrlType }
     * 
     */
    public PollingUrlType createPollingUrlType() {
        return new PollingUrlType();
    }

    /**
     * Create an instance of {@link ConditionsType.Condition }
     * 
     */
    public ConditionsType.Condition createConditionsTypeCondition() {
        return new ConditionsType.Condition();
    }

    /**
     * Create an instance of {@link ItemType.ConstrainByValue }
     * 
     */
    public ItemType.ConstrainByValue createItemTypeConstrainByValue() {
        return new ItemType.ConstrainByValue();
    }

    /**
     * Create an instance of {@link ItemType.ConstrainByDate }
     * 
     */
    public ItemType.ConstrainByDate createItemTypeConstrainByDate() {
        return new ItemType.ConstrainByDate();
    }

    /**
     * Create an instance of {@link ItemType.ConstrainByModifier.ConstrainByValue }
     * 
     */
    public ItemType.ConstrainByModifier.ConstrainByValue createItemTypeConstrainByModifierConstrainByValue() {
        return new ItemType.ConstrainByModifier.ConstrainByValue();
    }

    /**
     * Create an instance of {@link PanelType.TotalItemOccurrences }
     * 
     */
    public PanelType.TotalItemOccurrences createPanelTypeTotalItemOccurrences() {
        return new PanelType.TotalItemOccurrences();
    }

    /**
     * Create an instance of {@link PatientSetType.CohortPatient }
     * 
     */
    public PatientSetType.CohortPatient createPatientSetTypeCohortPatient() {
        return new PatientSetType.CohortPatient();
    }

    /**
     * Create an instance of {@link StatusType.Condition }
     * 
     */
    public StatusType.Condition createStatusTypeCondition() {
        return new StatusType.Condition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimingStepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "process_step_timing")
    public JAXBElement<TimingStepType> createProcessStepTiming(TimingStepType value) {
        return new JAXBElement<TimingStepType>(_ProcessStepTiming_QNAME, TimingStepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", name = "query_definition")
    public JAXBElement<QueryDefinitionType> createQueryDefinition(QueryDefinitionType value) {
        return new JAXBElement<QueryDefinitionType>(_QueryDefinition_QNAME, QueryDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", name = "query_constraints")
    public JAXBElement<QueryConstraintsType> createQueryConstraints(QueryConstraintsType value) {
        return new JAXBElement<QueryConstraintsType>(_QueryConstraints_QNAME, QueryConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMasterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "query_master")
    public JAXBElement<QueryMasterType> createQueryMaster(QueryMasterType value) {
        return new JAXBElement<QueryMasterType>(_QueryMaster_QNAME, QueryMasterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResultInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "query_result_instance")
    public JAXBElement<QueryResultInstanceType> createQueryResultInstance(QueryResultInstanceType value) {
        return new JAXBElement<QueryResultInstanceType>(_QueryResultInstance_QNAME, QueryResultInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link HiveRequest }}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "request")
    public HiveRequest createHiveRequest(RequestMessageType value) {
        return new HiveRequest(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByChildType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "get_name_info")
    public JAXBElement<FindByChildType> createGetNameInfo(FindByChildType value) {
        return new JAXBElement<FindByChildType>(_GetNameInfo_QNAME, FindByChildType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "sql")
    public JAXBElement<String> createSql(String value) {
        return new JAXBElement<String>(_Sql_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", name = "panel")
    public JAXBElement<PanelType> createPanel(PanelType value) {
        return new JAXBElement<PanelType>(_Panel_QNAME, PanelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalysisDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/", name = "analysis_definition")
    public JAXBElement<AnalysisDefinitionType> createAnalysisDefinition(AnalysisDefinitionType value) {
        return new JAXBElement<AnalysisDefinitionType>(_AnalysisDefinition_QNAME, AnalysisDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link HiveResponse }}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "response")
    public HiveResponse createHiveResponse(ResponseMessageType value) {
        return new HiveResponse(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmQryHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "psmheader")
    public JAXBElement<PsmQryHeaderType> createPsmheader(PsmQryHeaderType value) {
        return new JAXBElement<PsmQryHeaderType>(_Psmheader_QNAME, PsmQryHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "query_instance")
    public JAXBElement<QueryInstanceType> createQueryInstance(QueryInstanceType value) {
        return new JAXBElement<QueryInstanceType>(_QueryInstance_QNAME, QueryInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/1.1/", name = "request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryConstraintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", name = "query_constraint")
    public JAXBElement<QueryConstraintType> createQueryConstraint(QueryConstraintType value) {
        return new JAXBElement<QueryConstraintType>(_QueryConstraint_QNAME, QueryConstraintType.class, null, value);
    }

}
