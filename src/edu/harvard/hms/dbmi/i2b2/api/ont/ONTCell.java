/*
 *  This file is part of i2b2-Java-API.
 *
 *  The i2b2-Java-API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  i2b2-Java-API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with i2b2-Java-API.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.harvard.hms.dbmi.i2b2.api.ont;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.GregorianCalendar;

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
import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ApplicationType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.BodyType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ConceptType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ConceptsType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.DirtyValueType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.FacilityType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetCategoriesType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetChildrenType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetModifierChildrenType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetModifierInfoType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetModifiersType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetOntProcessStatusType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetReturnType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetTermInfoType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.MatchStrType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.MessageHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ModifierType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ModifiersType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ModifyChildType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ObjectFactory;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.OntologyProcessStatusListType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.OntologyProcessStatusType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.PasswordType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.RequestHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.RequestMessageType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ResponseMessageType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.SecurityType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.UpdateConceptTotalNumType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.UpdateCrcConceptType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.VocabRequestType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetOntProcessStatusType.ProcessEndDate;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.GetOntProcessStatusType.ProcessStartDate;

/**
 * The Ontology Management Cell communication class makes requests to the i2b2
 * Ontology Management Cell via XML and returns a corresponding representation
 * of an object.
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public class ONTCell implements Cell {
	private static JAXBContext ontJC;
	private static Marshaller ontMarshaller;
	private static ObjectFactory ontOF;
	private String domain;
	private String userName;
	private String password;
	private String projectId;
	private String connectionURL;
	
	private String token;
	private long timeout;

	/**
	 * 
	 * Sets up all the needed parameters to communicate with the Ontology
	 * Management Cell
	 * 
	 * @param connectionURL
	 *            URL of the cell
	 * @param domain
	 *            Domain
	 * @param userName
	 *            User name
	 * @param password
	 *            Password
	 * @param projectId
	 *            Project Id
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId) throws JAXBException {
		// Setup Parameters
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.password = password;
		this.projectId = projectId;

		// Setup System
		setup();
	}

	/**
	 * Sets up the system without any parameters of the Ontology Management Cell
	 * 
	 * @throws JAXBException
	 */
	public void setup() throws JAXBException {
		// Setup System
		ontOF = new ObjectFactory();
		ontJC = JAXBContext
				.newInstance("edu.harvard.hms.dbmi.i2b2.api.ont.xml");
		ontMarshaller = ontJC.createMarshaller();
		ontMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}
	
	public void setup(String connectionURL, String domain, String userName, String token, long timeout, String project) throws JAXBException {
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.token = token;
		this.timeout = timeout;
		this.projectId = project;
		
		// Setup System
		setup();
	}

	/**
	 * Returns a list of categories available for a given user.
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blobCategories
	 *            Return data stored as Blob or Clob
	 * @param hiddenCategories
	 *            Return hidden data
	 * @param synonymsCategories
	 *            Return synonyms
	 * @param typeCategories
	 *            Sets type of categories
	 * @return A concepts Type that contains concepts
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws ClientProtocolException
	 *             A Client Protocol Exception occurred
	 * @throws IOException
	 *             An IO Exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 */
	public ConceptsType getCategories(HttpClient client,
			boolean blobCategories, boolean hiddenCategories,
			boolean synonymsCategories, String typeCategories)
			throws JAXBException, ClientProtocolException, IOException,
			I2B2InterfaceException {

		// Create the XML Object
		RequestMessageType rmt = createMinimumBaseMessage();

		GetCategoriesType gct = ontOF.createGetCategoriesType();
		gct.setBlob(blobCategories);
		gct.setHiddens(hiddenCategories);
		gct.setSynonyms(synonymsCategories);
		if (typeCategories != null) {
			gct.setType(typeCategories);
		}

		rmt.getMessageBody().getAny().add(ontOF.createGetCategories(gct));

		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getCategories"));

	}

	/**
	 * Returns a list of children from a given category
	 * 
	 * @param client
	 *            HTTP Client
	 * @param parentKey
	 *            The parent of the children to be returned
	 * @param hidden
	 *            Return hidden data
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param synonyms
	 *            Return synonyms
	 * @param max
	 *            Max number to return
	 * @param type
	 *            Sets type of categories
	 * @return A concepts Type that contains concepts
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws ClientProtocolException
	 *             A Client Protocol Exception occurred
	 * @throws IOException
	 *             An IO Exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 */
	public ConceptsType getChildren(HttpClient client, String parentKey,
			boolean hidden, boolean blob, boolean synonyms, int max, String type)
			throws JAXBException, ClientProtocolException, IOException,
			I2B2InterfaceException {

		// Create the XML Object
		RequestMessageType rmt = createMinimumBaseMessage();

		GetChildrenType gct = ontOF.createGetChildrenType();
		gct.setParent(parentKey);
		gct.setHiddens(hidden);
		gct.setBlob(blob);
		gct.setSynonyms(synonyms);
		if (max != -1) {
			gct.setMax(max);
		}
		if (type != null) {
			gct.setType(type);
		}

		rmt.getMessageBody().getAny().add(ontOF.createGetChildren(gct));

		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getChildren"));
	}

	/**
	 * Gets name information
	 * 
	 * @param client
	 *            HTTPClient
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param matchStr
	 *            String to match on
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Name information
	 * @throws JAXBException
	 *             A XML processing exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ConceptsType getNameInfo(HttpClient client, boolean blob,
			String category, boolean hidden, String strategy, String matchStr,
			int max, String self, boolean synonyms, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		VocabRequestType vrt = ontOF.createVocabRequestType();
		vrt.setBlob(blob);
		vrt.setCategory(category);
		vrt.setHiddens(hidden);
		MatchStrType mst = ontOF.createMatchStrType();
		mst.setStrategy(strategy);
		mst.setValue(matchStr);

		vrt.setMatchStr(mst);
		vrt.setMax(max);
		vrt.setSelf(self);
		vrt.setSynonyms(synonyms);
		vrt.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetNameInfo(vrt));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getNameInfo"));

	}

	/**
	 * Gets the term information
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param self
	 *            self to search on
	 * @param hidden
	 *            Return hidden data
	 * @param max
	 *            Maximum results to return
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Term information
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ConceptsType getTermInfo(HttpClient client, boolean blob,
			String self, boolean hidden, int max, boolean synonyms,
			String type) throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetTermInfoType gtit = ontOF.createGetTermInfoType();
		gtit.setBlob(blob);
		gtit.setHiddens(hidden);
		gtit.setSynonyms(synonyms);
		gtit.setType(type);
		gtit.setMax(max);
		gtit.setSelf(self);
		
		rmt.getMessageBody().getAny().add(ontOF.createGetTermInfo(gtit));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getTermInfo"));
	}

	/**
	 * Gets the schemes
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param type
	 *            Sets type of categories
	 * @return Schemes
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ConceptsType getSchemes(HttpClient client, boolean blob, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetReturnType gst = ontOF.createGetReturnType();
		gst.setBlob(blob);
		gst.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetSchemes(gst));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getSchemes"));
	}

	/**
	 * Gets the code information
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param matchStr
	 *            String to match on
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Code Information
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ConceptsType getCodeInfo(HttpClient client, boolean blob,
			String category, boolean hidden, String strategy, String matchStr,
			int max, String self, boolean synonyms, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		VocabRequestType vrt = ontOF.createVocabRequestType();
		vrt.setBlob(blob);
		vrt.setCategory(category);
		vrt.setHiddens(hidden);
		MatchStrType mst = ontOF.createMatchStrType();
		mst.setStrategy(strategy);
		mst.setValue(matchStr);

		vrt.setMatchStr(mst);
		vrt.setMax(max);
		vrt.setSelf(self);
		vrt.setSynonyms(synonyms);
		vrt.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetCodeInfo(vrt));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createConceptsType(),
				runRequest(client, sw.toString(), "/getCodeInfo"));
	}

	/**
	 * Adds a child
	 * 
	 * @param client
	 *            HTTP Client
	 * @param conceptType
	 *            Concept Type
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public void addChild(HttpClient client, ConceptType conceptType)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		rmt.getMessageBody().getAny().add(ontOF.createAddChild(conceptType));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), "/addChild"));

	}

	/**
	 * Modify a child
	 * 
	 * @param client
	 *            HTTP Client
	 * @param inclSynonyms
	 *            Include Synonyms
	 * @param conceptType
	 *            Concept Type
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public void modifyChild(HttpClient client, boolean inclSynonyms,
			ConceptType conceptType) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		ModifyChildType mct = ontOF.createModifyChildType();
		mct.setInclSynonyms(inclSynonyms);
		mct.setSelf(conceptType);

		rmt.getMessageBody().getAny().add(ontOF.createModifyChild(mct));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), "/modifyChild"));

	}

	/**
	 * Updates a CRC Concept
	 * 
	 * @param client
	 *            HTTP Client
	 * @param hidden
	 *            Return hidden data
	 * @param operationType
	 *            Operation type
	 * @param synonyms
	 *            Return synonyms
	 * @return Result of update
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public OntologyProcessStatusType updateCRCConcept(HttpClient client,
			boolean hidden, String operationType, boolean synonyms)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		UpdateCrcConceptType ucct = ontOF.createUpdateCrcConceptType();
		ucct.setHiddens(hidden);
		ucct.setOperationType(operationType);
		ucct.setSynonyms(synonyms);

		rmt.getMessageBody().getAny().add(ontOF.createUpdateCrcConcept(ucct));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createOntologyProcessStatusType(),
				runRequest(client, sw.toString(), "/updateCRCConcept"));
	}

	/**
	 * Gets ontology process status
	 * 
	 * @param client
	 *            HTTP Client
	 * @param max
	 *            Maximum results to return
	 * @param startDateStartTime
	 *            start process start
	 * @param startDateEndTime
	 *            start process end
	 * @param endDateStartTime
	 *            end process start
	 * @param endDateEndTime
	 *            end process end
	 * @param processId
	 *            Process Id
	 * @param processStatusCd
	 *            Process Status
	 * @param processTypeCd
	 *            Process type
	 * @return Process status
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 * @throws DatatypeConfigurationException
	 */
	public OntologyProcessStatusListType getOntologyProcessStatus(
			HttpClient client, int max, GregorianCalendar startDateStartTime,
			GregorianCalendar startDateEndTime,
			GregorianCalendar endDateStartTime,
			GregorianCalendar endDateEndTime, String processId,
			String processStatusCd, String processTypeCd) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException,
			DatatypeConfigurationException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetOntProcessStatusType opst = ontOF.createGetOntProcessStatusType();
		opst.setMaxReturnRecords(max);

		ProcessStartDate psd = ontOF
				.createGetOntProcessStatusTypeProcessStartDate();
		psd.setEndTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(
				startDateEndTime));
		psd.setStartTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(
				startDateStartTime));

		opst.setProcessStartDate(psd);
		ProcessEndDate ped = ontOF
				.createGetOntProcessStatusTypeProcessEndDate();
		ped.setEndTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(
				endDateEndTime));
		ped.setStartTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(
				endDateStartTime));
		opst.setProcessEndDate(ped);

		opst.setProcessId(processId);
		opst.setProcessStatusCd(processStatusCd);
		opst.setProcessTypeCd(processTypeCd);

		rmt.getMessageBody().getAny()
				.add(ontOF.createGetOntProcessStatus(opst));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createOntologyProcessStatusListType(),
				runRequest(client, sw.toString(), "/getOntologyProcessStatus"));
	}

	/**
	 * Get dirty state
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param type
	 *            Sets type of categories
	 * @return Dirty state
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	@SuppressWarnings("unchecked")
	public DirtyValueType getDirtyState(HttpClient client, boolean blob,
			String type) throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetReturnType gst = ontOF.createGetReturnType();
		gst.setBlob(blob);
		gst.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetDirtyState(gst));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		ResponseMessageType responseMT = JAXB.unmarshal(
				runRequest(client, sw.toString(), "/getDirtyState"),
				ResponseMessageType.class);

		if (!responseMT.getResponseHeader().getResultStatus().getStatus()
				.getType().equals("DONE")) {
			throw new I2B2InterfaceException(responseMT.getResponseHeader()
					.getResultStatus().getStatus().getValue());
		}

		return ((JAXBElement<DirtyValueType>) responseMT.getMessageBody()
				.getAny().get(0)).getValue();
	}

	/**
	 * Update concept total num
	 * 
	 * @param client
	 *            HTTP Client
	 * @param operationType
	 * @return Result of update
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public OntologyProcessStatusType updateConceptTotalNum(HttpClient client,
			String operationType) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		UpdateConceptTotalNumType uctnt = ontOF
				.createUpdateConceptTotalNumType();
		uctnt.setOperationType(operationType);

		rmt.getMessageBody().getAny()
				.add(ontOF.createUpdateConceptTotalnum(uctnt));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createOntologyProcessStatusType(),
				runRequest(client, sw.toString(), "/updateConceptTotalNum"));

	}

	/**
	 * Get modifiers
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Modifiers
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ModifiersType getModifiers(HttpClient client, boolean blob,
			boolean hidden, String strategy, int max,
			String self, boolean synonyms, String type) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetModifiersType gmt = ontOF.createGetModifiersType();
		gmt.setBlob(blob);
		gmt.setHiddens(hidden);
		if (max != -1) {
			gmt.setMax(max);
		}
		gmt.setSelf(self);
		gmt.setSynonyms(synonyms);
		if(type != null) {
			gmt.setType(type);
		}
		rmt.getMessageBody().getAny().add(ontOF.createGetModifiers(gmt));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createModifiersType(),
				runRequest(client, sw.toString(), "/getModifiers"));
	}

	/**
	 * Get modifier information
	 * 
	 * @param client
	 *            HTTP Client
	 * @param appliedPath
	 *            Applied path
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Modifier information
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ModifiersType getModifierInfo(HttpClient client, String appliedPath,
			boolean blob, String category, boolean hidden, String strategy,
			int max, String self, boolean synonyms, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetModifierInfoType gmit = ontOF.createGetModifierInfoType();

		gmit.setAppliedPath(appliedPath);
		gmit.setBlob(blob);
		gmit.setHiddens(hidden);
		gmit.setMax(max);
		gmit.setSelf(self);
		gmit.setSynonyms(synonyms);
		gmit.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetModifierInfo(gmit));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createModifiersType(),
				runRequest(client, sw.toString(), "/getModifierInfo"));

	}

	/**
	 * Get modifier children
	 * 
	 * @param client
	 *            HTTP Client
	 * @param appliedConcept
	 *            Applied concept
	 * @param appliedPath
	 *            Applied path
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param max
	 *            Maximum results to return
	 * @param parent
	 *            Parent Modifier
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Modifier children
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ModifiersType getModifierChildren(HttpClient client,
			String appliedConcept, String appliedPath, boolean blob,
			String category, boolean hidden, String strategy, int max,
			String parent, boolean synonyms, String type) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		GetModifierChildrenType gmct = ontOF.createGetModifierChildrenType();
		gmct.setAppliedConcept(appliedConcept);
		gmct.setAppliedPath(appliedPath);
		gmct.setBlob(blob);
		gmct.setHiddens(hidden);
		gmct.setMax(max);
		gmct.setSynonyms(synonyms);
		gmct.setType(type);
		gmct.setParent(parent);

		rmt.getMessageBody().getAny()
				.add(ontOF.createGetModifierChildren(gmct));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);
		return getType(ontOF.createModifiersType(),
				runRequest(client, sw.toString(), "/getModifierChidlren"));
	}

	/**
	 * Get modifier name information
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param matchStr
	 *            String to match on
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Modifier name information
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ModifiersType getModifierNameInfo(HttpClient client, boolean blob,
			String category, boolean hidden, String strategy, String matchStr,
			int max, String self, boolean synonyms, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		VocabRequestType vrt = ontOF.createVocabRequestType();
		vrt.setBlob(blob);
		vrt.setCategory(category);
		vrt.setHiddens(hidden);
		MatchStrType mst = ontOF.createMatchStrType();
		mst.setStrategy(strategy);
		mst.setValue(matchStr);

		vrt.setMatchStr(mst);
		vrt.setMax(max);
		vrt.setSelf(self);
		vrt.setSynonyms(synonyms);
		vrt.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetModifierNameInfo(vrt));
		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);
		return getType(ontOF.createModifiersType(),
				runRequest(client, sw.toString(), "/getModifierNameInfo"));
	}

	/**
	 * Get modifier code information
	 * 
	 * @param client
	 *            HTTP Client
	 * @param blob
	 *            Return data stored as Blob or Clob
	 * @param category
	 *            Category to search on
	 * @param hidden
	 *            Return hidden data
	 * @param strategy
	 *            Strategy used for matching
	 * @param matchStr
	 *            String to match on
	 * @param max
	 *            Maximum results to return
	 * @param self
	 *            Self
	 * @param synonyms
	 *            Return synonyms
	 * @param type
	 *            Sets type of categories
	 * @return Modifier code information
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public ModifiersType getModifierCodeInfo(HttpClient client, boolean blob,
			String category, boolean hidden, String strategy, String matchStr,
			int max, String self, boolean synonyms, String type)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		VocabRequestType vrt = ontOF.createVocabRequestType();
		vrt.setBlob(blob);
		vrt.setCategory(category);
		vrt.setHiddens(hidden);
		MatchStrType mst = ontOF.createMatchStrType();
		mst.setStrategy(strategy);
		mst.setValue(matchStr);

		vrt.setMatchStr(mst);
		vrt.setMax(max);
		vrt.setSelf(self);
		vrt.setSynonyms(synonyms);
		vrt.setType(type);

		rmt.getMessageBody().getAny().add(ontOF.createGetModifierCodeInfo(vrt));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		return getType(ontOF.createModifiersType(),
				runRequest(client, sw.toString(), "/getModifierCodeInfo"));
	}

	/**
	 * Add a modifier
	 * 
	 * @param client
	 *            HTTP Client
	 * @param modifierType
	 *            Modifier type
	 * @throws JAXBException
	 *             An XML Processing Exception occurred
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	public void addModifier(HttpClient client, ModifierType modifierType)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage();

		rmt.getMessageBody().getAny()
				.add(ontOF.createAddModifier(modifierType));

		// Mashall the XML to String and attach it to the post request
		StringWriter sw = new StringWriter();
		ontMarshaller.marshal(ontOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), "/addModifier"));

	}

	// -------------------------------------------------------------------------
	// Utility Methods
	// -------------------------------------------------------------------------

	static String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
	
	@SuppressWarnings("unchecked")
	private <T> T getType(T returnType, InputStream inputStream)
			throws I2B2InterfaceException {
//		String xml = convertStreamToString(inputStream);
//		System.out.println(xml);
//		JAXB.unmarshal(xml, type)
//		ResponseMessageType rmt = JAXB.unmarshal(xml,
//				ResponseMessageType.class);
		ResponseMessageType rmt = JAXB.unmarshal(inputStream,
				ResponseMessageType.class);
		String status = rmt.getResponseHeader().getResultStatus().getStatus()
				.getType();
		if (!(status.equals("SUCCESS") || status.equals("DONE"))) {
			throw new I2B2InterfaceException(rmt.getResponseHeader()
					.getResultStatus().getStatus().getValue());
		}

		return ((JAXBElement<T>) rmt.getMessageBody().getAny().get(0))
				.getValue();
	}

	/**
	 * Check for any errors and throw an exception if they occur
	 * 
	 * @param inputStream
	 *            XML stream for input
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 */
	private void checkForError(InputStream inputStream)
			throws I2B2InterfaceException {
		ResponseMessageType rmt = JAXB.unmarshal(inputStream,
				ResponseMessageType.class);

		String status = rmt.getResponseHeader().getResultStatus().getStatus()
				.getType();
		if (!(status.equals("SUCCESS") || status.equals("DONE"))) {
			throw new I2B2InterfaceException(rmt.getResponseHeader()
					.getResultStatus().getStatus().getValue());
		}
	}

	/**
	 * Posts the xml to the i2b2 server
	 * 
	 * @param client
	 *            HTTP Client
	 * @param entity
	 *            Entity to attach to post
	 * @param urlAppend
	 *            URL to append to base URL
	 * @return InputStream from content
	 * @throws UnsupportedOperationException
	 *             An unsupported operation exception occurred
	 * @throws IOException
	 *             An IO Exception occurred
	 */
	private InputStream runRequest(HttpClient client, String entity,
			String urlAppend) throws UnsupportedOperationException, IOException {
//		 System.out.println("\n\n" + entity + "\n\n");
		// Create Post
		if((urlAppend.startsWith("/")) && (connectionURL.endsWith("/"))) {
			urlAppend = urlAppend.substring(1);
		}
		HttpPost post = new HttpPost(connectionURL + urlAppend);
		// Set Header
		post.setHeader("Content-Type", "text/xml");
		post.setEntity(new StringEntity(entity));

		HttpResponse response = client.execute(post);
		return response.getEntity().getContent();
	}

	/**
	 * Creates the minimum message needed to send a request to the i2b2 server
	 * 
	 * @return Request Message Base
	 */
	private RequestMessageType createMinimumBaseMessage() {
		RequestMessageType rmt = ontOF.createRequestMessageType();

		// Create Message Header Type
		MessageHeaderType mht = ontOF.createMessageHeaderType();

		// Set Sending Application
		ApplicationType sat = ontOF.createApplicationType();
		sat.setApplicationName("IRCT");
		sat.setApplicationVersion("1.0");

		mht.setSendingApplication(sat);

		// Set Sending Facility
		FacilityType ft = ontOF.createFacilityType();
		ft.setFacilityName("IRCT");

		mht.setSendingFacility(ft);

		// Create Security Type
		SecurityType st = ontOF.createSecurityType();
		st.setDomain(this.domain);
		st.setUsername(this.userName);
		
		PasswordType pt = ontOF.createPasswordType();
		
		if(this.password != null) {
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
		RequestHeaderType rht = ontOF.createRequestHeaderType();
		rht.setResultWaittimeMs(180000);
		rmt.setRequestHeader(rht);

		// Create Body Type
		BodyType bt = ontOF.createBodyType();
		rmt.setMessageBody(bt);

		return rmt;
	}

	/**
	 * Returns the domain
	 * 
	 * @return Domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Sets the domain
	 * 
	 * @param domain
	 *            Domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Returns the user name
	 * 
	 * @return User name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name
	 * 
	 * @param userName
	 *            User name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Returns the password
	 * 
	 * @return Password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password
	 * 
	 * @param password
	 *            Password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the project id
	 * 
	 * @return Project Id
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * Sets the project Id
	 * 
	 * @param projectId
	 *            Project Id
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * Returns the connection URL
	 * 
	 * @return Connection URL
	 */
	public String getConnectionURL() {
		return connectionURL;
	}

	/**
	 * Sets the conneciton URL
	 * 
	 * @param connectionURL
	 *            Connection URL
	 */
	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

}
