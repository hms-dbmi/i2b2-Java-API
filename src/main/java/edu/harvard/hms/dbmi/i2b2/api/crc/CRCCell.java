/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import edu.harvard.hms.dbmi.i2b2.api.Cell;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ApplicationType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.BodyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ConceptPrimaryKeyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.EventPrimaryKeyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.FacilityType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.FactPrimaryKeyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetConceptByPrimaryKeyRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetEventByPrimaryKeyRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetObservationFactByPrimaryKeyRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetObserverByPrimaryKeyRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetPDOFromInputListRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.GetPatientByPrimaryKeyRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.InputOptionListType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.MessageHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ObjectFactory;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ObserverPrimaryKeyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.OutputOptionListType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.OutputOptionSelectType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.OutputOptionType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PasswordType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientDataResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientListType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientPrimaryKeyType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PdoQryHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PdoRequestTypeType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.Proxy;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.RequestHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.RequestMessageType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ResponseMessageType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.SecurityType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.AnalysisDefinitionRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.AnalysisDefinitionType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.CrcXmlResultResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.InstanceRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.InstanceResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.InstanceResultResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterDeleteRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterInstanceResultResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterRenameRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.QueryDefinitionRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.QueryMasterType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.QueryResultInstanceType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestXmlResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResultOutputOptionListType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResultRequestType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResultResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.UserRequestType;
import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;

/**
 * The CRC Cell communication class makes requests to the i2b2 CRC Cell via XML
 * and returns a corresponding representation of an object.
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public class CRCCell implements Cell {
	// PDO
	private static ObjectFactory pdoOF;
	private static JAXBContext pdoJC;
	private static Marshaller pdoMarshaller;

	// PSM
	private static edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ObjectFactory psmOF;
	private static JAXBContext psmJC;
	private static Marshaller psmMarshaller;

	// Loader
//	private static edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader.ObjectFactory loaderOF;
//	private static JAXBContext loaderJC;
//	private static Marshaller loaderMarshaller;

	// Connection and Configuration Parameters
	private String domain;
	private String userName;
	private String password;
	private String projectId;
	private String connectionURL;
	private boolean useProxy;
	private String proxyURL;

	private String token;
	private long timeout;

	
	@Override
	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId, boolean useProxy, String proxyURL)
			throws JAXBException {
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.projectId = projectId;
		this.useProxy = useProxy;	
		this.proxyURL = proxyURL;
		setup();
	}

	@Override
	public void setup(String connectionURL, String domain, String userName,
			String token, long timeout, String projectId, boolean useProxy, String proxyURL)
			throws JAXBException {
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.token = token;
		this.timeout = timeout;
		this.projectId = projectId;
		this.useProxy = useProxy;
		this.proxyURL = proxyURL;
		setup();
	}
	
	@Override
	public void setupConnection(String connectionURL, String domain, String userName,
			String password, String projectId, boolean useProxy, String proxyURL) {
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.projectId = projectId;
		this.useProxy = useProxy;	
		this.proxyURL = proxyURL;
	}
	
	/**
	 * Sets up the system without any parameters of the Data Repository Cell
	 * 
	 * @throws JAXBException
	 */
	public void setup() throws JAXBException {
		// Setup PDO
		pdoOF = new ObjectFactory();
		pdoJC = JAXBContext
				.newInstance("edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo");
		pdoMarshaller = pdoJC.createMarshaller();
		pdoMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Setup PSM
		psmOF = new edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ObjectFactory();
		psmJC = JAXBContext
				.newInstance("edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm");
		psmMarshaller = psmJC.createMarshaller();
		psmMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Setup Loader
//		loaderOF = new edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader.ObjectFactory();
//		loaderJC = JAXBContext
//				.newInstance("edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader");
//		loaderMarshaller = loaderJC.createMarshaller();
//		loaderMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}

	// -------------------------------------------------------------------------
	// PSM Calls
	// -------------------------------------------------------------------------
	
	public InstanceResponseType getQueryInstanceListFromQueryId(
			HttpClient client, String queryMasterId) throws JAXBException,
			ClientProtocolException, I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_QUERY_INSTANCE_LIST_FROM_QUERY_MASTER_ID, "/request");
		
		MasterRequestType mrt = psmOF.createMasterRequestType();
		mrt.setQueryMasterId(queryMasterId);
		rmt.getMessageBody().getAny().add(psmOF.createRequest(mrt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);
		
		return (InstanceResponseType) getPSMResponseType(runRequest(client,
				sw.toString(), "/request"));
	}
	
	//
	/**
	 * Returns the query definition information for a given query master id
	 * 
	 * @param client
	 *            HTTPClient
	 * @param queryMasterId
	 *            The query id
	 * @return XML query definition
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public RequestXmlResponseType getRequestXMLFromQueryMasterId(
			HttpClient client, String queryMasterId)
			throws ClientProtocolException, I2B2InterfaceException,
			IOException, JAXBException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_REQUEST_XML_FROM_QUERY_MASTER_ID, "/request");

		MasterRequestType mrt = psmOF.createMasterRequestType();
		mrt.setQueryMasterId(queryMasterId);
		rmt.getMessageBody().getAny().add(psmOF.createRequest(mrt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return (RequestXmlResponseType) getPSMResponseType(runRequest(client,
				sw.toString(), "/request"));
	}

	/**
	 * Returns a list of queries from the the given user id.
	 * 
	 * If fetch size is set to -1 then all queries will be returned.
	 * 
	 * @param client
	 *            HTTPClient
	 * @param userId
	 *            The user id
	 * @param fetchSize
	 *            The number of items to return
	 * @return A list of Queries
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public List<QueryMasterType> getQueryMasterListFromUserId(
			HttpClient client, String userId, int fetchSize)
			throws ClientProtocolException, I2B2InterfaceException,
			IOException, JAXBException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_QUERY_MASTER_LIST_FROM_USER_ID, "/request");

		UserRequestType urt = psmOF.createUserRequestType();
		urt.setUserId(userId);
		if (fetchSize != -1) {
			urt.setFetchSize(fetchSize);
		}
		rmt.getMessageBody().getAny().add(psmOF.createRequest(urt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);
		return ((MasterResponseType) getPSMResponseType(runRequest(client,
				sw.toString(), "/request"))).getQueryMaster();
	}

	/**
	 * Returns a list of queries from the given group id.
	 * 
	 * If the fetch size is set to -1 then all queries will be returned
	 * 
	 * @param client
	 *            HTTPClient
	 * @param groupId
	 *            The group id
	 * @param fetchSize
	 *            The number of items to return
	 * @return A list of Queries
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public List<QueryMasterType> getQueryMasterListFromGroupId(
			HttpClient client, String groupId, int fetchSize)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_QUERY_MASTER_LIST_FROM_GROUP_ID, "/request");

		UserRequestType urt = psmOF.createUserRequestType();
		urt.setGroupId(groupId);
		if (fetchSize != -1) {
			urt.setFetchSize(fetchSize);
		}
		rmt.getMessageBody().getAny().add(psmOF.createRequest(urt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);
		return ((MasterResponseType) getPSMResponseType(runRequest(client,
				sw.toString(), "/request"))).getQueryMaster();
	}

	/**
	 * Runs a query given a query definition that may include many panels
	 * 
	 * @param client
	 *            HTTPClient
	 * @param queryId
	 *            The query id (Optional)
	 * @param queryType
	 *            The query type (Optional)
	 * @param queryName
	 *            The query name
	 * @param queryDescription
	 *            The query Description (Optional)
	 * @param queryTiming
	 *            The query timing
	 * @param querySpecifityScale
	 *            The query specificity scale
	 * @param resultOptions
	 *            The parameters for outputting the results
	 * @param panels
	 *            An array of panels
	 * @return The response of the server
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public MasterInstanceResultResponseType runQueryInstanceFromQueryDefinition(
			HttpClient client, String queryId, String queryType,
			String queryName, String queryDescription, String queryTiming,
			int querySpecifityScale, ResultOutputOptionListType resultOptions,
			edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PanelType... panels)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_RUN_QUERY_INSTANCE_FROM_QUERY_DEFINITION, "/request");

		QueryDefinitionRequestType qdrt = psmOF
				.createQueryDefinitionRequestType();

		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.QueryDefinitionType qdt = psmOF
				.createQueryDefinitionType();
		if (queryId != null) {
			qdt.setQueryId(queryId);
		}
		if (queryType != null) {
			qdt.setQueryType(queryType);
		}
		qdt.setQueryName(queryName);
		if (queryDescription != null) {
			qdt.setQueryDescription(queryDescription);
		}
		qdt.setQueryTiming(queryTiming);
		qdt.setSpecificityScale(querySpecifityScale);
		qdt.getPanel().addAll(Arrays.asList(panels));
		qdrt.setQueryDefinition(qdt);

		qdrt.setResultOutputList(resultOptions);

		rmt.getMessageBody().getAny().add(psmOF.createRequest(qdrt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return (MasterInstanceResultResponseType) this
				.getPSMResponseType(runRequest(client, sw.toString(),
						"/request"));
	}

	/**
	 * Checks to see if the query is complete and get its results
	 * 
	 * @param client
	 *            HTTPClient
	 * @param queryInstanceId
	 *            The query instance id
	 * @return The query status information
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public List<QueryResultInstanceType> getQueryResultInstanceListFromQueryInstanceId(
			HttpClient client, String queryInstanceId) throws JAXBException,
			ClientProtocolException, I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_QUERY_RESULT_INSTANCE_LIST_FROM_QUERY_INSTANCE_ID, "/request");
		InstanceRequestType irt = psmOF.createInstanceRequestType();

		irt.setQueryInstanceId(queryInstanceId);
		rmt.getMessageBody().getAny().add(psmOF.createRequest(irt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return ((ResultResponseType) this.getPSMResponseType(runRequest(client,
				sw.toString(), "/request"))).getQueryResultInstance();
	}

	/**
	 * Deletes a query master
	 * 
	 * @param client
	 *            HTTPClient
	 * @param userId
	 *            The user id
	 * @param queryMasterId
	 *            The query master id
	 * @return A list of results
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public List<QueryMasterType> deleteQueryMaster(HttpClient client,
			String userId, String queryMasterId)
			throws ClientProtocolException, I2B2InterfaceException,
			IOException, JAXBException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_DELETE_QUERY_MASTER, "/request");
		MasterDeleteRequestType mdrt = psmOF.createMasterDeleteRequestType();

		mdrt.setUserId(userId);
		mdrt.setQueryMasterId(queryMasterId);

		StringWriter sw = new StringWriter();
		rmt.getMessageBody().getAny().add(psmOF.createRequest(mdrt));
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return ((MasterResponseType) this.getPSMResponseType(runRequest(client,
				sw.toString(), "/request"))).getQueryMaster();
	}

	/**
	 * Renames a query master
	 * 
	 * @param client
	 *            HTTPClient
	 * @param userId
	 *            The user id
	 * @param queryMasterId
	 *            The query master id
	 * @param queryName
	 *            The new name of the query
	 * @return A list of results
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public List<QueryMasterType> renameQueryMaster(HttpClient client,
			String userId, String queryMasterId, String queryName)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_RENAME_QUERY_MASTER, "/request");
		MasterRenameRequestType mrrt = psmOF.createMasterRenameRequestType();
		mrrt.setUserId(userId);
		mrrt.setQueryMasterId(queryMasterId);
		mrrt.setQueryName(queryName);

		rmt.getMessageBody().getAny().add(psmOF.createRequest(mrrt));
		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return ((MasterResponseType) this.getPSMResponseType(runRequest(client,
				sw.toString(), "/request"))).getQueryMaster();
	}

	/**
	 * Returns the document results of a query
	 * 
	 * @param client
	 *            HTTPClient
	 * @param queryResultInstanceId
	 *            The query result instance id
	 * @return The document results of a query
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public CrcXmlResultResponseType getResultDocumentFromResultInstanceId(
			HttpClient client, String queryResultInstanceId)
			throws ClientProtocolException, I2B2InterfaceException,
			IOException, JAXBException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_GET_RESULT_DOCUMENT_FROM_RESULT_INSTANCE_ID, "/request");
		ResultRequestType rrt = psmOF.createResultRequestType();

		rrt.setQueryResultInstanceId(queryResultInstanceId);

		rmt.getMessageBody().getAny().add(psmOF.createRequest(rrt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return (CrcXmlResultResponseType) this.getPSMResponseType(runRequest(
				client, sw.toString(), "/request"));
	}

	/**
	 * Run an analysis plug-in by passing the plug in name and its parameters
	 * 
	 * @param client
	 *            HTTPCleint
	 * @param analysisDefinition
	 *            The analysis definition
	 * @return The result response
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public MasterInstanceResultResponseType runQueryInstanceFromAnalysisDefinition(
			HttpClient client, AnalysisDefinitionType analysisDefinition)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_RUN_QUERY_INSTANCE_FROM_ANALYSIS_DEFINITION, "/request");
		AnalysisDefinitionRequestType adrt = psmOF
				.createAnalysisDefinitionRequestType();
		adrt.setAnalysisDefinition(analysisDefinition);

		rmt.getMessageBody().getAny().add(psmOF.createRequest(adrt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return (MasterInstanceResultResponseType) this
				.getPSMResponseType(runRequest(client, sw.toString(),
						"/request"));
	}

	/**
	 * Cancels a query
	 * 
	 * @param client
	 *            HTTPClient
	 * @param queryInstanceId
	 *            The query instance
	 * @return The instance result response
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public InstanceResultResponseType cancelQuery(HttpClient client,
			String queryInstanceId) throws JAXBException,
			ClientProtocolException, I2B2InterfaceException, IOException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = createMinimumPSMBaseMessage(edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmRequestTypeType.CRC_QRY_CANCEL_QUERY, "/request");
		InstanceRequestType irt = psmOF.createInstanceRequestType();

		irt.setQueryInstanceId(queryInstanceId);

		rmt.getMessageBody().getAny().add(psmOF.createRequest(irt));

		StringWriter sw = new StringWriter();
		psmMarshaller.marshal(psmOF.createHiveRequest(rmt), sw);

		return (InstanceResultResponseType) this.getPSMResponseType(runRequest(
				client, sw.toString(), "/request"));
	}

	// -------------------------------------------------------------------------
	// PDO Calls
	// -------------------------------------------------------------------------

	/**
	 * Returns a list of PDOs from an Input List
	 * 
	 * @param client
	 *            HTTPClient
	 * @param collectionId
	 *            Collection Id
	 * @param min
	 *            Minimum to return
	 * @param max
	 *            Maximum to return
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return An object containing the PDO
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getPDOfromInputList(HttpClient client,
			String collectionId, int min, int max, boolean onlyKeys,
			boolean blob, boolean techdata, OutputOptionSelectType select)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_PDO_FROM_INPUT_LIST, "/pdorequest");
		GetPDOFromInputListRequestType ilrt = pdoOF
				.createGetPDOFromInputListRequestType();

		InputOptionListType iolt = pdoOF.createInputOptionListType();
		PatientListType plt = pdoOF.createPatientListType();
		plt.setMin(min);
		plt.setMax(max);

		plt.setPatientSetCollId(collectionId);
		iolt.setPatientList(plt);
		ilrt.setInputList(iolt);

		ilrt.setFilterList(pdoOF.createFilterListType());

		OutputOptionListType oolt = pdoOF.createOutputOptionListType();
		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);

		oolt.setPatientSet(oot);

		ilrt.setOutputOption(oolt);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(ilrt));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	/**
	 * Returns observation facts as described by the primary key
	 * 
	 * @param client
	 *            HTTPClient
	 * @param eventId
	 *            Event id
	 * @param patientId
	 *            Patient id
	 * @param conceptCd
	 *            Concept
	 * @param observerId
	 *            Observer
	 * @param startDate
	 *            Start Date
	 * @param modifierCd
	 *            Modifier
	 * @param instanceNum
	 *            instance number
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return The observation facts
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 * @throws DatatypeConfigurationException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getObservationFactByPrimaryKey(
			HttpClient client, String eventId, String patientId,
			String conceptCd, String observerId, GregorianCalendar startDate,
			String modifierCd, String instanceNum, boolean onlyKeys,
			boolean blob, boolean techdata, OutputOptionSelectType select)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException, DatatypeConfigurationException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_OBSERVATIONFACT_BY_PRIMARY_KEY, "/pdorequest");
		GetObservationFactByPrimaryKeyRequestType irct = pdoOF
				.createGetObservationFactByPrimaryKeyRequestType();

		FactPrimaryKeyType fpkt = pdoOF.createFactPrimaryKeyType();
		fpkt.setEventId(eventId);
		fpkt.setPatientId(patientId);
		fpkt.setConceptCd(conceptCd);
		fpkt.setObserverId(observerId);
		fpkt.setStartDate(DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(startDate));
		fpkt.setModifierCd(modifierCd);
		fpkt.setInstanceNum(instanceNum);
		irct.setFactPrimaryKey(fpkt);

		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);
		irct.setFactOutputOption(oot);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(irct));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	/**
	 * Returns a patient by its primary key
	 * 
	 * @param client
	 *            HTTPClient
	 * @param patientId
	 *            Patient Id
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return Patient requested
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getPatientByPrimaryKey(HttpClient client,
			String patientId, boolean onlyKeys, boolean blob, boolean techdata,
			OutputOptionSelectType select) throws JAXBException,
			ClientProtocolException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_PATIENT_BY_PRIMARY_KEY, "/pdorequest");
		GetPatientByPrimaryKeyRequestType irct = pdoOF
				.createGetPatientByPrimaryKeyRequestType();

		PatientPrimaryKeyType ppkt = pdoOF.createPatientPrimaryKeyType();
		ppkt.setPatientId(patientId);
		irct.setPatientPrimaryKey(ppkt);

		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);
		irct.setPatientOutputOption(oot);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(irct));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	/**
	 * Returns an event based on a primary key
	 * 
	 * @param client
	 *            HTTPClient
	 * @param eventId
	 *            Event id
	 * @param patientId
	 *            Patient id
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return Event
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getEventByPrimaryKey(HttpClient client,
			String eventId, String patientId, boolean onlyKeys, boolean blob,
			boolean techdata, OutputOptionSelectType select)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_EVENT_BY_PRIMARY_KEY, "/pdorequest");
		GetEventByPrimaryKeyRequestType irct = pdoOF
				.createGetEventByPrimaryKeyRequestType();

		EventPrimaryKeyType epkt = pdoOF.createEventPrimaryKeyType();
		epkt.setEventId(eventId);
		epkt.setPatientId(patientId);
		irct.setEventPrimaryKey(epkt);

		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);
		irct.setEventOutputOption(oot);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(irct));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	/**
	 * Returns a concept based on the primary key
	 * 
	 * @param client
	 *            HTTPClient
	 * @param conceptPath
	 *            Primary key
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return Concept
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getConceptByPrimaryKey(HttpClient client,
			String conceptPath, boolean onlyKeys, boolean blob,
			boolean techdata, OutputOptionSelectType select)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_CONCEPT_BY_PRIMARY_KEY, "/pdorequest");
		GetConceptByPrimaryKeyRequestType irct = pdoOF
				.createGetConceptByPrimaryKeyRequestType();

		ConceptPrimaryKeyType cpkt = pdoOF.createConceptPrimaryKeyType();
		cpkt.setConceptPath(conceptPath);
		irct.setConceptPrimaryKey(cpkt);

		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);
		irct.setConceptOutputOption(oot);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(irct));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	/**
	 * Returns the observer by primary key
	 * 
	 * @param client
	 *            HTTPClient
	 * @param observerPath
	 *            Observer path
	 * @param observerId
	 *            Observer Id
	 * @param onlyKeys
	 *            Only keys
	 * @param blob
	 *            Blobs
	 * @param techdata
	 *            Techdata
	 * @param select
	 *            Output option
	 * @return Observer
	 * @throws JAXBException
	 *             An Exception Occurred
	 * @throws ClientProtocolException
	 *             An Exception Occurred
	 * @throws I2B2InterfaceException
	 *             An Exception Occurred
	 * @throws IOException
	 *             An Exception Occurred
	 */
	public PatientDataResponseType getObserverByPrimaryKey(HttpClient client,
			String observerPath, String observerId, boolean onlyKeys,
			boolean blob, boolean techdata, OutputOptionSelectType select)
			throws JAXBException, ClientProtocolException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumPDOBaseMessage(PdoRequestTypeType.GET_OBSERVER_BY_PRIMARY_KEY, "/pdorequest");
		GetObserverByPrimaryKeyRequestType irct = pdoOF
				.createGetObserverByPrimaryKeyRequestType();

		ObserverPrimaryKeyType opkt = pdoOF.createObserverPrimaryKeyType();
		opkt.setObserverPath(observerPath);
		opkt.setObserverId(observerId);
		irct.setObserverPrimaryKey(opkt);

		OutputOptionType oot = pdoOF.createOutputOptionType();
		oot.setOnlykeys(onlyKeys);
		oot.setBlob(blob);
		oot.setTechdata(techdata);
		oot.setSelect(select);
		irct.setObserverOutputOption(oot);

		rmt.getMessageBody().getAny().add(pdoOF.createRequest(irct));

		StringWriter sw = new StringWriter();
		pdoMarshaller.marshal(pdoOF.createHiveRequest(rmt), sw);

		return (PatientDataResponseType) this.getPDOResponseType(runRequest(
				client, sw.toString(), "/pdorequest"));
	}

	// -------------------------------------------------------------------------
	// Loader Calls
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Utility Methods
	// -------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	private edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResponseType getPSMResponseType(
			InputStream inputStream) throws I2B2InterfaceException {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResponseMessageType rmt = JAXB
				.unmarshal(
						inputStream,
						edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResponseMessageType.class);

		if (!rmt.getResponseHeader().getResultStatus().getStatus().getType()
				.equals("DONE")) {
			throw new I2B2InterfaceException(rmt.getResponseHeader()
					.getResultStatus().getStatus().getValue());
		}

		return ((JAXBElement<edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResponseType>) rmt
				.getMessageBody().getAny().get(0)).getValue();
	}

	@SuppressWarnings("unchecked")
	private ResponseType getPDOResponseType(InputStream inputStream)
			throws I2B2InterfaceException {
		
		ResponseMessageType rmt = JAXB.unmarshal(inputStream,
				ResponseMessageType.class);
		
		if (!rmt.getResponseHeader().getResultStatus().getStatus().getType()
				.equals("DONE")) {
			throw new I2B2InterfaceException(rmt.getResponseHeader()
					.getResultStatus().getStatus().getValue());
		}

		return ((JAXBElement<ResponseType>) rmt.getMessageBody().getAny()
				.get(0)).getValue();

	}

	private InputStream runRequest(HttpClient client, String entity,
			String urlAppend) throws ClientProtocolException, IOException {
		// Create Post
		String postURL = connectionURL;
		
		if(!this.useProxy) {
			if ((urlAppend.startsWith("/")) && (connectionURL.endsWith("/"))) {
				urlAppend = urlAppend.substring(1);
			}
			postURL = postURL + urlAppend;
		}

		HttpPost post = new HttpPost(postURL);
		// Set Header
		post.setHeader("Content-Type", "text/xml");
		post.setEntity(new StringEntity(entity));

		HttpResponse response = client.execute(post);
		return response.getEntity().getContent();

	}

	private RequestMessageType createMinimumPDOBaseMessage(PdoRequestTypeType requestPDOType, String appendURL) {
		RequestMessageType rmt = pdoOF.createRequestMessageType();
		// Create Message Header Type
		MessageHeaderType mht = pdoOF.createMessageHeaderType();
		
		// Set proxy
		if((useProxy) && (appendURL != null)) {
			Proxy proxy = new Proxy();
			proxy.setRedirect_url(this.proxyURL + appendURL);
			mht.setProxy(proxy);
		}

		// Set Sending Application
		ApplicationType sat = pdoOF.createApplicationType();
		sat.setApplicationName("IRCT");
		sat.setApplicationVersion("1.0");

		mht.setSendingApplication(sat);

		// Set Sending Facility
		FacilityType ft = pdoOF.createFacilityType();
		ft.setFacilityName("IRCT");

		mht.setSendingFacility(ft);

		// Create Security Type
		SecurityType st = pdoOF.createSecurityType();
		st.setDomain(this.domain);
		st.setUsername(this.userName);

		PasswordType pt = pdoOF.createPasswordType();

		if (this.password != null) {
			pt.setValue(this.password);
		} else {
			pt.setIsToken(true);
			pt.setValue(this.token);
			pt.setTokenMsTimeout((int) this.timeout);
		}
		st.setPassword(pt);

		mht.setSecurity(st);

		mht.setProjectId(this.projectId);
		rmt.setMessageHeader(mht);

		// Create Request Header Type
		RequestHeaderType rht = pdoOF.createRequestHeaderType();
		rht.setResultWaittimeMs(180000);
		rmt.setRequestHeader(rht);

		// Create a Body Type
		BodyType bt = pdoOF.createBodyType();

		PdoQryHeaderType pqht = pdoOF.createPdoQryHeaderType();
		pqht.setPatientSetLimit(0);
		pqht.setRequestType(requestPDOType);
		pqht.setEstimatedTime(180000);

		bt.getAny().add(pdoOF.createPdoheader(pqht));

		rmt.setMessageBody(bt);
		return rmt;
	}

	private edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType createMinimumPSMBaseMessage(
			PsmRequestTypeType requestPSMType, String appendURL) {
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestMessageType rmt = psmOF
				.createRequestMessageType();

		// Create Message Header Type
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MessageHeaderType mht = psmOF
				.createMessageHeaderType();
		
		// Set proxy
		if((useProxy) && (appendURL != null)) {
			edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.Proxy proxy = new edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.Proxy();
			proxy.setRedirect_url(this.proxyURL + appendURL);
			mht.setProxy(proxy);
		}

		// Set Sending Application
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ApplicationType sat = psmOF
				.createApplicationType();
		sat.setApplicationName("IRCT");
		sat.setApplicationVersion("1.0");

		mht.setSendingApplication(sat);

		// Set Sending Facility
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.FacilityType ft = psmOF
				.createFacilityType();
		ft.setFacilityName("IRCT");

		mht.setSendingFacility(ft);

		// Create Security Type
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.SecurityType st = psmOF
				.createSecurityType();
		st.setDomain(this.domain);
		st.setUsername(this.userName);

		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PasswordType pt = psmOF
				.createPasswordType();

		if (this.password != null) {
			pt.setValue(this.password);
		} else {
			pt.setIsToken(true);
			pt.setValue(this.token);
			pt.setTokenMsTimeout((int) this.timeout);
		}
		st.setPassword(pt);

		mht.setSecurity(st);

		mht.setProjectId(this.projectId);
		rmt.setMessageHeader(mht);

		// Create Request Header Type
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.RequestHeaderType rht = psmOF
				.createRequestHeaderType();
		rht.setResultWaittimeMs(180000);

		rmt.setRequestHeader(rht);

		// Create a Body Type
		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.BodyType bt = psmOF
				.createBodyType();

		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PsmQryHeaderType pqht = psmOF
				.createPsmQryHeaderType();
		pqht.setRequestType(requestPSMType);

		edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.UserType ut = psmOF.createUserType();
		// <user group="Demo" login="Demo">Demo</user>
		ut.setLogin(this.userName);
		ut.setValue(this.userName);
		pqht.setUser(ut);

		bt.getAny().add(psmOF.createPsmheader(pqht));

		rmt.setMessageBody(bt);
		return rmt;
	}

}
