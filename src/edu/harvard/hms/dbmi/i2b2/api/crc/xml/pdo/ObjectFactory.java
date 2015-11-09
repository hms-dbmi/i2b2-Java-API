/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.crc.xml.pdo package. 
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

    private final static QName _Sql_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "sql");
    private final static QName _ConceptPath_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "concept_path");
    private final static QName _Panel_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "panel");
    private final static QName _Response_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "response");
    private final static QName _Request_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "request");
    private final static QName _PatientSetCollId_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "patient_set_coll_id");
    private final static QName _FilterlistType_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "filterlistType");
    private final static QName _PatientData_QNAME = new QName("http://www.i2b2.org/xsd/hive/pdo/1.1/", "patient_data");
    private final static QName _Pdoheader_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "pdoheader");
    private final static QName _ObservationFact_QNAME = new QName("http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", "observation_fact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.crc.xml.pdo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Examples }
     * 
     */
    public Examples createExamples() {
        return new Examples();
    }

    /**
     * Create an instance of {@link PidType }
     * 
     */
    public PidType createPidType() {
        return new PidType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link ObservationType }
     * 
     */
    public ObservationType createObservationType() {
        return new ObservationType();
    }
    
    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link EidType }
     * 
     */
    public EidType createEidType() {
        return new EidType();
    }

    /**
     * Create an instance of {@link PidListType }
     * 
     */
    public PidListType createPidListType() {
        return new PidListType();
    }

    /**
     * Create an instance of {@link EventListType }
     * 
     */
    public EventListType createEventListType() {
        return new EventListType();
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
     * Create an instance of {@link EidListType }
     * 
     */
    public EidListType createEidListType() {
        return new EidListType();
    }

    /**
     * Create an instance of {@link PatientListType }
     * 
     */
    public PatientListType createPatientListType() {
        return new PatientListType();
    }

    /**
     * Create an instance of {@link ObserverListType }
     * 
     */
    public ObserverListType createObserverListType() {
        return new ObserverListType();
    }

    /**
     * Create an instance of {@link CRCStatusType }
     * 
     */
    public CRCStatusType createCRCStatusType() {
        return new CRCStatusType();
    }

    /**
     * Create an instance of {@link PanelType }
     * 
     */
    public PanelType createPanelType() {
        return new PanelType();
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
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
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
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
     * Create an instance of {@link Examples.MessageBody }
     * 
     */
    public Examples.MessageBody createExamplesMessageBody() {
        return new Examples.MessageBody();
    }

    /**
     * Create an instance of {@link PdoQryHeaderType }
     * 
     */
    public PdoQryHeaderType createPdoQryHeaderType() {
        return new PdoQryHeaderType();
    }

    /**
     * Create an instance of {@link FilterListType }
     * 
     */
    public FilterListType createFilterListType() {
        return new FilterListType();
    }

    /**
     * Create an instance of {@link GetPDOFromInputListRequestType }
     * 
     */
    public GetPDOFromInputListRequestType createGetPDOFromInputListRequestType() {
        return new GetPDOFromInputListRequestType();
    }

    /**
     * Create an instance of {@link OutputOptionListType }
     * 
     */
    public OutputOptionListType createOutputOptionListType() {
        return new OutputOptionListType();
    }

    /**
     * Create an instance of {@link PatientPrimaryKeyType }
     * 
     */
    public PatientPrimaryKeyType createPatientPrimaryKeyType() {
        return new PatientPrimaryKeyType();
    }

    /**
     * Create an instance of {@link EventPrimaryKeyType }
     * 
     */
    public EventPrimaryKeyType createEventPrimaryKeyType() {
        return new EventPrimaryKeyType();
    }

    /**
     * Create an instance of {@link PageByPatientType }
     * 
     */
    public PageByPatientType createPageByPatientType() {
        return new PageByPatientType();
    }

    /**
     * Create an instance of {@link PatientDataResponseType }
     * 
     */
    public PatientDataResponseType createPatientDataResponseType() {
        return new PatientDataResponseType();
    }

    /**
     * Create an instance of {@link RangeType }
     * 
     */
    public RangeType createRangeType() {
        return new RangeType();
    }

    /**
     * Create an instance of {@link ConstrainDateType }
     * 
     */
    public ConstrainDateType createConstrainDateType() {
        return new ConstrainDateType();
    }

    /**
     * Create an instance of {@link OutputOptionType }
     * 
     */
    public OutputOptionType createOutputOptionType() {
        return new OutputOptionType();
    }

    /**
     * Create an instance of {@link GetObservationFactByPrimaryKeyRequestType }
     * 
     */
    public GetObservationFactByPrimaryKeyRequestType createGetObservationFactByPrimaryKeyRequestType() {
        return new GetObservationFactByPrimaryKeyRequestType();
    }

    /**
     * Create an instance of {@link DimensionOutputOptionType }
     * 
     */
    public DimensionOutputOptionType createDimensionOutputOptionType() {
        return new DimensionOutputOptionType();
    }

    /**
     * Create an instance of {@link GetPatientByPrimaryKeyRequestType }
     * 
     */
    public GetPatientByPrimaryKeyRequestType createGetPatientByPrimaryKeyRequestType() {
        return new GetPatientByPrimaryKeyRequestType();
    }

    /**
     * Create an instance of {@link FactOutputOptionType }
     * 
     */
    public FactOutputOptionType createFactOutputOptionType() {
        return new FactOutputOptionType();
    }

    /**
     * Create an instance of {@link GetModifierByPrimaryKeyRequestType }
     * 
     */
    public GetModifierByPrimaryKeyRequestType createGetModifierByPrimaryKeyRequestType() {
        return new GetModifierByPrimaryKeyRequestType();
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
     * Create an instance of {@link GetConceptByPrimaryKeyRequestType }
     * 
     */
    public GetConceptByPrimaryKeyRequestType createGetConceptByPrimaryKeyRequestType() {
        return new GetConceptByPrimaryKeyRequestType();
    }

    /**
     * Create an instance of {@link GetObserverByPrimaryKeyRequestType }
     * 
     */
    public GetObserverByPrimaryKeyRequestType createGetObserverByPrimaryKeyRequestType() {
        return new GetObserverByPrimaryKeyRequestType();
    }

    /**
     * Create an instance of {@link GetEventByPrimaryKeyRequestType }
     * 
     */
    public GetEventByPrimaryKeyRequestType createGetEventByPrimaryKeyRequestType() {
        return new GetEventByPrimaryKeyRequestType();
    }

    /**
     * Create an instance of {@link ConceptPrimaryKeyType }
     * 
     */
    public ConceptPrimaryKeyType createConceptPrimaryKeyType() {
        return new ConceptPrimaryKeyType();
    }

    /**
     * Create an instance of {@link PageType }
     * 
     */
    public PageType createPageType() {
        return new PageType();
    }

    /**
     * Create an instance of {@link InputOptionListType }
     * 
     */
    public InputOptionListType createInputOptionListType() {
        return new InputOptionListType();
    }

    /**
     * Create an instance of {@link ModifierPrimaryKeyType }
     * 
     */
    public ModifierPrimaryKeyType createModifierPrimaryKeyType() {
        return new ModifierPrimaryKeyType();
    }

    /**
     * Create an instance of {@link MetadataxmlValueType }
     * 
     */
    public MetadataxmlValueType createMetadataxmlValueType() {
        return new MetadataxmlValueType();
    }

    /**
     * Create an instance of {@link FactPrimaryKeyType }
     * 
     */
    public FactPrimaryKeyType createFactPrimaryKeyType() {
        return new FactPrimaryKeyType();
    }

    /**
     * Create an instance of {@link GetPDOTemplateRequestType }
     * 
     */
    public GetPDOTemplateRequestType createGetPDOTemplateRequestType() {
        return new GetPDOTemplateRequestType();
    }

    /**
     * Create an instance of {@link ObserverPrimaryKeyType }
     * 
     */
    public ObserverPrimaryKeyType createObserverPrimaryKeyType() {
        return new ObserverPrimaryKeyType();
    }

    /**
     * Create an instance of {@link PageRangeType }
     * 
     */
    public PageRangeType createPageRangeType() {
        return new PageRangeType();
    }

    /**
     * Create an instance of {@link PatientSet }
     * 
     */
    public PatientSet createPatientSet() {
        return new PatientSet();
    }

    /**
     * Create an instance of {@link PatientType }
     * 
     */
    public PatientType createPatientType() {
        return new PatientType();
    }

    /**
     * Create an instance of {@link ConceptSet }
     * 
     */
    public ConceptSet createConceptSet() {
        return new ConceptSet();
    }

    /**
     * Create an instance of {@link ConceptType }
     * 
     */
    public ConceptType createConceptType() {
        return new ConceptType();
    }

    /**
     * Create an instance of {@link EidSet }
     * 
     */
    public EidSet createEidSet() {
        return new EidSet();
    }

    /**
     * Create an instance of {@link ObservationSet }
     * 
     */
    public ObservationSet createObservationSet() {
        return new ObservationSet();
    }

    /**
     * Create an instance of {@link EventSet }
     * 
     */
    public EventSet createEventSet() {
        return new EventSet();
    }

    /**
     * Create an instance of {@link PidSet }
     * 
     */
    public PidSet createPidSet() {
        return new PidSet();
    }

    /**
     * Create an instance of {@link ModifierSet }
     * 
     */
    public ModifierSet createModifierSet() {
        return new ModifierSet();
    }

    /**
     * Create an instance of {@link ModifierType }
     * 
     */
    public ModifierType createModifierType() {
        return new ModifierType();
    }

    /**
     * Create an instance of {@link ObserverSet }
     * 
     */
    public ObserverSet createObserverSet() {
        return new ObserverSet();
    }

    /**
     * Create an instance of {@link ObserverType }
     * 
     */
    public ObserverType createObserverType() {
        return new ObserverType();
    }

    /**
     * Create an instance of {@link PatientDataType }
     * 
     */
    public PatientDataType createPatientDataType() {
        return new PatientDataType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link PatientIdType }
     * 
     */
    public PatientIdType createPatientIdType() {
        return new PatientIdType();
    }

    /**
     * Create an instance of {@link BlobType }
     * 
     */
    public BlobType createBlobType() {
        return new BlobType();
    }

    /**
     * Create an instance of {@link PidType.PatientId }
     * 
     */
    public PidType.PatientId createPidTypePatientId() {
        return new PidType.PatientId();
    }

    /**
     * Create an instance of {@link PidType.PatientMapId }
     * 
     */
    public PidType.PatientMapId createPidTypePatientMapId() {
        return new PidType.PatientMapId();
    }

    /**
     * Create an instance of {@link EventType.EventId }
     * 
     */
    public EventType.EventId createEventTypeEventId() {
        return new EventType.EventId();
    }

    /**
     * Create an instance of {@link ObservationType.EventId }
     * 
     */
    public ObservationType.EventId createObservationTypeEventId() {
        return new ObservationType.EventId();
    }

    /**
     * Create an instance of {@link ObservationType.ConceptCd }
     * 
     */
    public ObservationType.ConceptCd createObservationTypeConceptCd() {
        return new ObservationType.ConceptCd();
    }

    /**
     * Create an instance of {@link ObservationType.ObserverCd }
     * 
     */
    public ObservationType.ObserverCd createObservationTypeObserverCd() {
        return new ObservationType.ObserverCd();
    }

    /**
     * Create an instance of {@link ObservationType.ModifierCd }
     * 
     */
    public ObservationType.ModifierCd createObservationTypeModifierCd() {
        return new ObservationType.ModifierCd();
    }

    /**
     * Create an instance of {@link ObservationType.InstanceNum }
     * 
     */
    public ObservationType.InstanceNum createObservationTypeInstanceNum() {
        return new ObservationType.InstanceNum();
    }

    /**
     * Create an instance of {@link ObservationType.NvalNum }
     * 
     */
    public ObservationType.NvalNum createObservationTypeNvalNum() {
        return new ObservationType.NvalNum();
    }

    /**
     * Create an instance of {@link ObservationType.ValueflagCd }
     * 
     */
    public ObservationType.ValueflagCd createObservationTypeValueflagCd() {
        return new ObservationType.ValueflagCd();
    }

    /**
     * Create an instance of {@link ObservationType.LocationCd }
     * 
     */
    public ObservationType.LocationCd createObservationTypeLocationCd() {
        return new ObservationType.LocationCd();
    }

    /**
     * Create an instance of {@link EidType.EventId }
     * 
     */
    public EidType.EventId createEidTypeEventId() {
        return new EidType.EventId();
    }

    /**
     * Create an instance of {@link EidType.EventMapId }
     * 
     */
    public EidType.EventMapId createEidTypeEventMapId() {
        return new EidType.EventMapId();
    }

    /**
     * Create an instance of {@link PidListType.Pid }
     * 
     */
    public PidListType.Pid createPidListTypePid() {
        return new PidListType.Pid();
    }

    /**
     * Create an instance of {@link EventListType.EventId }
     * 
     */
    public EventListType.EventId createEventListTypeEventId() {
        return new EventListType.EventId();
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
     * Create an instance of {@link EidListType.Eid }
     * 
     */
    public EidListType.Eid createEidListTypeEid() {
        return new EidListType.Eid();
    }

    /**
     * Create an instance of {@link PatientListType.PatientId }
     * 
     */
    public PatientListType.PatientId createPatientListTypePatientId() {
        return new PatientListType.PatientId();
    }

    /**
     * Create an instance of {@link ObserverListType.ObserverPath }
     * 
     */
    public ObserverListType.ObserverPath createObserverListTypeObserverPath() {
        return new ObserverListType.ObserverPath();
    }

    /**
     * Create an instance of {@link CRCStatusType.Condition }
     * 
     */
    public CRCStatusType.Condition createCRCStatusTypeCondition() {
        return new CRCStatusType.Condition();
    }

    /**
     * Create an instance of {@link PanelType.TotalItemOccurrences }
     * 
     */
    public PanelType.TotalItemOccurrences createPanelTypeTotalItemOccurrences() {
        return new PanelType.TotalItemOccurrences();
    }

    /**
     * Create an instance of {@link ConditionsType.Condition }
     * 
     */
    public ConditionsType.Condition createConditionsTypeCondition() {
        return new ConditionsType.Condition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "sql")
    public JAXBElement<String> createSql(String value) {
        return new JAXBElement<String>(_Sql_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "concept_path")
    public JAXBElement<String> createConceptPath(String value) {
        return new JAXBElement<String>(_ConceptPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "panel")
    public JAXBElement<PanelType> createPanel(PanelType value) {
        return new JAXBElement<PanelType>(_Panel_QNAME, PanelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "response")
    public JAXBElement<ResponseMessageType> createResponse(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_Response_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "patient_set_coll_id")
    public JAXBElement<String> createPatientSetCollId(String value) {
        return new JAXBElement<String>(_PatientSetCollId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "filterlistType")
    public JAXBElement<FilterListType> createFilterlistType(FilterListType value) {
        return new JAXBElement<FilterListType>(_FilterlistType_QNAME, FilterListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", name = "patient_data")
    public JAXBElement<PatientDataType> createPatientData(PatientDataType value) {
        return new JAXBElement<PatientDataType>(_PatientData_QNAME, PatientDataType.class, null, value);
    }

    /**
     * Create an instance of {@link CRCResponse }}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "response")
    public CRCResponse createCRCResponse(ResponseType value) {
        return new CRCResponse(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdoQryHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "pdoheader")
    public JAXBElement<PdoQryHeaderType> createPdoheader(PdoQryHeaderType value) {
        return new JAXBElement<PdoQryHeaderType>(_Pdoheader_QNAME, PdoQryHeaderType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/crc/pdo/1.1/", name = "observation_fact")
    public JAXBElement<Object> createObservationFact(Object value) {
        return new JAXBElement<Object>(_ObservationFact_QNAME, Object.class, null, value);
    }

}
