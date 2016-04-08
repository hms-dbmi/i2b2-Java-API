/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import edu.harvard.hms.dbmi.i2b2.api.Cell;
import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ApplicationType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ApprovalType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ApprovalsType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.BodyType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.CellDataType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.CellDatasType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ConfigureType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ConfiguresType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.FacilityType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.GetUserConfigurationType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.GlobalDataType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.GlobalDatasType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.MessageHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ObjectFactory;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ParamType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ParamsType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.PasswordType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ProjectType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ProjectsType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.Proxy;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.RequestHeaderType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.RequestMessageType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ResponseMessageType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.RoleType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.RolesType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.SecurityType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.UserType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.UsersType;

/**
 * The Project Management Cell communication class makes requests to the i2b2
 * Project Management Cell via XML and returns a corresponding representation of
 * an object
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public class PMCell implements Cell {
	private static JAXBContext pmJC;
	private static Marshaller pmMarshaller;
	private static ObjectFactory pmOF;

	private String domain;
	private String userName;
	private String password;
	private String projectId;
	private String connectionURL;
	private boolean useProxy;
	
	private String token;
	private long timeout;
	private String proxyURL;

	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId, boolean useProxy, String proxyURL) throws JAXBException {
		// Setup Parameters
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.password = password;
		this.projectId = projectId;
		this.useProxy = useProxy;
		this.proxyURL = proxyURL;

		setup();

	}
	
	/**
	 * Sets up all the needed parameters to communicate with the Project
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
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * 
	 */
	public void setup(String connectionURL, String domain, String userName,
			String password, boolean useProxy, String proxyURL) throws JAXBException {
		// Setup Parameters
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.password = password;
		this.useProxy = useProxy;
		this.proxyURL = proxyURL;
		
		setup();

	}
	
	public void setup(String connectionURL, String domain, String userName, String token, long timeout, String project, boolean useProxy, String proxyURL) throws JAXBException {
		this.connectionURL = connectionURL;
		this.domain = domain;
		this.userName = userName;
		this.token = token;
		this.timeout = timeout;
		this.projectId = project;
		this.useProxy = useProxy;
		this.proxyURL = proxyURL;
		
		setup();
	}

	/**
	 * Sets up the system without any parameters of the Project Management Cell
	 * 
	 * @throws JAXBException
	 */
	public void setup() throws JAXBException {
		// Setup System
		pmOF = new ObjectFactory();
		pmJC = JAXBContext.newInstance("edu.harvard.hms.dbmi.i2b2.api.pm.xml");
		pmMarshaller = pmJC.createMarshaller();
		pmMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}

	/**
	 * Returns the user configure
	 * 
	 * @param client
	 *            HTTP Client
	 * @param dataNeeded
	 *            Data needed
	 * @param projects
	 *            Projects needed
	 * @return User Configuration
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ConfigureType getUserConfiguration(HttpClient client,
			String[] dataNeeded, String[] projects) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("/getServices");

		GetUserConfigurationType guct = pmOF.createGetUserConfigurationType();
		if(dataNeeded != null) {
			guct.getDataNeeded().addAll(Arrays.asList(dataNeeded));
		}
		guct.getProject().addAll(Arrays.asList(projects));

		rmt.getMessageBody().getAny()
				.add(pmOF.createGetUserConfiguration(guct));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ConfigureType(),
				runRequest(client, sw.toString(), ""));
	}

	/**
	 * Sets the user
	 * 
	 * @param client
	 *            HTTP Client
	 * @param domain
	 *            User domain
	 * @param email
	 *            Email
	 * @param fullName
	 *            Full Name
	 * @param isAdmin
	 *            is Admin
	 * @param key
	 *            Key
	 * @param passwordToken
	 *            Password token
	 * @param tokenMsTimeout
	 *            tokenMLS
	 * @param token
	 *            token
	 * @param username
	 *            Username
	 * @throws IOException
	 *             An IO exception occurred An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 */
	public void setUser(HttpClient client, String domain, String email,
			String fullName, boolean isAdmin, String key,
			boolean passwordToken, int tokenMsTimeout, String token,
			String username) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		UserType ut = pmOF.createUserType();
		ut.setDomain(domain);
		ut.setEmail(email);
		ut.setFullName(fullName);
		ut.setIsAdmin(isAdmin);
		ut.setKey(key);

		PasswordType pt = pmOF.createPasswordType();
		pt.setIsToken(passwordToken);
		pt.setTokenMsTimeout(tokenMsTimeout);
		pt.setValue(token);
		ut.setPassword(pt);
		ut.setUserName(username);

		rmt.getMessageBody().getAny().add(pmOF.createSetUser(ut));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Deletes a user
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username Username
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteUser(HttpClient client, String userName)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		StringWriter sw = new StringWriter();

		rmt.getMessageBody().getAny().add(pmOF.createDeleteUser(userName));
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Gets all users
	 * 
	 * @param client
	 *            HTTP Client
	 * @return All users
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public UsersType getAllUsers(HttpClient client) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createGetAllUser(""));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new UsersType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get User
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username Username
	 * @return User
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public UsersType getUser(HttpClient client, String userName)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createGetUser(userName));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new UsersType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Set a user parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username Username
	 * @param dataType
	 *            Data type
	 * @param name
	 *            Name
	 * @param value
	 *            Value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setUserParam(HttpClient client, String userName,
			String dataType, String name, String value) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		UserType ut = pmOF.createUserType();
		ut.setUserName(userName);

		ParamType pt = pmOF.createParamType();
		pt.setDatatype(dataType);
		pt.setName(name);
		pt.setValue(value);

		ut.getParam().add(pt);

		rmt.getMessageBody().getAny().add(pmOF.createSetUserParam(ut));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Delete user Parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id Parameter id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteUserParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createDeleteUserParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all users parameters
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username Username
	 * @return Users
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public UsersType getAllUserParam(HttpClient client, String userName)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		UserType ut = pmOF.createUserType();
		ut.setUserName(userName);

		rmt.getMessageBody().getAny().add(pmOF.createGetAllUserParam(ut));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new UsersType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get user parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userParam
	 *            Parameter
	 * @return Parameter
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamType getUserParam(HttpClient client, String userParam)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createGetUserParam(userParam));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamType(), runRequest(client, sw.toString(), ""));
	}

	/**
	 * Set global parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param canOverride
	 *            Can override
	 * @param projectPath
	 *            The project path
	 * @param paramId
	 *            Parameter id
	 * @param paramDataType
	 *            Parameter data type
	 * @param paramName
	 *            Parameter name
	 * @param paramvalue
	 *            Parameter value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setGlobal(HttpClient client, boolean canOverride,
			String projectPath, int paramId, String paramDataType,
			String paramName, String paramValue) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		GlobalDataType gdt = pmOF.createGlobalDataType();
		gdt.setCanOverride(canOverride);
		gdt.setProjectPath(projectPath);

		ParamType pt = pmOF.createParamType();
		pt.setId(paramId);
		pt.setDatatype(paramDataType);
		pt.setName(paramName);
		pt.setValue(paramValue);

		gdt.getParam().add(pt);

		rmt.getMessageBody().getAny().add(pmOF.createSetGlobal(gdt));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Deletes a global parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param globalId
	 *            Global Id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteGlobal(HttpClient client, String globalId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createDeleteGlobal(globalId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all global parameters
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectPath
	 *            The project path
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getAllGlobal(HttpClient client, String projectPath)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createGetAllGlobal(projectPath));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get the global parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param globalParameterId
	 *            Global parameter Id
	 * @return Parameter
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public GlobalDatasType getGlobal(HttpClient client, String globalParameterId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny()
				.add(pmOF.createGetGlobal(globalParameterId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new GlobalDatasType(),
				runRequest(client, sw.toString(), ""));
	}

	/**
	 * Set a user role
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username
	 * @param projectId
	 *            Project Id
	 * @param role
	 *            Role
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setRole(HttpClient client, String userName, String projectId,
			String role) throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		RoleType rt = pmOF.createRoleType();
		rt.setProjectId(projectId);
		rt.setRole(role);
		rt.setUserName(userName);

		rmt.getMessageBody().getAny().add(pmOF.createSetRole(rt));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a user role
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userName
	 *            Username
	 * @param projectId
	 *            Project Id
	 * @param role
	 *            Role
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteRole(HttpClient client, String userName,
			String projectId, String role) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		RoleType rt = pmOF.createRoleType();
		rt.setProjectId(projectId);
		rt.setRole(role);
		rt.setUserName(userName);

		rmt.getMessageBody().getAny().add(pmOF.createDeleteRole(rt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get all roles
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @return Roles
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public RolesType getAllRole(HttpClient client, String projectId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		RoleType rt = pmOF.createRoleType();
		rt.setProjectId(projectId);

		rmt.getMessageBody().getAny().add(pmOF.createGetAllRole(rt));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new RolesType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get a user roles
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param userName
	 *            Username
	 * @return Roles
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public RolesType getRole(HttpClient client, String projectId,
			String userName) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		RoleType rt = pmOF.createRoleType();
		rt.setProjectId(projectId);
		rt.setUserName(userName);

		rmt.getMessageBody().getAny().add(pmOF.createGetRole(rt));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new RolesType(), runRequest(client, sw.toString(), ""));
	}

	/**
	 * Set a project user parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param id
	 *            Project Id
	 * @param userName
	 *            Username
	 * @param paramDataType
	 *            Parameter data type
	 * @param paramName
	 *            Parameter name
	 * @param paramvalue
	 *            Parameter value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setProjectUserParm(HttpClient client, String id,
			String userName, String paramDataType, String paramName,
			String paramValue) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ProjectType projt = pmOF.createProjectType();
		projt.setId(id);
		projt.setUserName(userName);

		ParamType pt = pmOF.createParamType();
		pt.setDatatype(paramDataType);
		pt.setName(paramName);
		pt.setValue(paramValue);

		projt.getParam().add(pt);

		rmt.getMessageBody().getAny()
				.add(pmOF.createSetProjectUserParam(projt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Delete a project user parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param userParamId
	 *            Parameter id
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 */
	public void deleteProjectUserParam(HttpClient client, String userParamId)
			throws UnsupportedOperationException, I2B2InterfaceException,
			IOException, JAXBException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny()
				.add(pmOF.createDeleteProjectUserParam(userParamId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);
		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get all parameters of user in a project
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param userName
	 *            Username
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getAllProjectUserParam(HttpClient client,
			String projectId, String userName) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ProjectType pt = pmOF.createProjectType();
		pt.setId(projectId);
		pt.setUserName(userName);

		rmt.getMessageBody().getAny()
				.add(pmOF.createGetAllProjectUserParam(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get project user parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getProjectUserParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny()
				.add(pmOF.createGetProjectUserParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));
	}

	/**
	 * Set a project
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param projectName
	 *            Project Name
	 * @param projectKey
	 *            Project key
	 * @param projectWiki
	 *            Project wiki
	 * @param projectPath
	 *            The project path
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setProject(HttpClient client, String projectId,
			String projectName, String projectKey, String projectWiki,
			String projectPath) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ProjectType pt = pmOF.createProjectType();
		pt.setId(projectId);
		pt.setName(projectName);
		pt.setKey(projectKey);
		pt.setWiki(projectWiki);
		pt.setPath(projectPath);

		rmt.getMessageBody().getAny().add(pmOF.createSetProject(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a project
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param projectPath
	 *            The project path
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteProject(HttpClient client, String projectId,
			String projectPath) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ProjectType pt = pmOF.createProjectType();
		pt.setId(projectId);
		pt.setPath(projectPath);

		rmt.getMessageBody().getAny().add(pmOF.createDeleteProject(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all projects
	 * 
	 * @param client
	 *            HTTP Client
	 * @return Projects
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ProjectsType getAllProject(HttpClient client) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ProjectType pt = pmOF.createProjectType();
		rmt.getMessageBody().getAny().add(pmOF.createGetAllProject(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ProjectsType(),
				runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get a project
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param projectPath
	 *            The project path
	 * @return Project
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ProjectType getProject(HttpClient client, String projectId,
			String projectPath) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ProjectType pt = pmOF.createProjectType();
		pt.setId(projectId);
		pt.setPath(projectPath);
		rmt.getMessageBody().getAny().add(pmOF.createGetAllProject(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ProjectType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Set a project parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @param paramDataType
	 *            Parameter data type
	 * @param paramName
	 *            Parameter name
	 * @param paramvalue
	 *            Parameter value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setProjectParam(HttpClient client, String projectId,
			String paramDataType, String paramName, String paramValue)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ProjectType pt = pmOF.createProjectType();
		if (projectId != null) {
			pt.setId(projectId);
		}
		ParamType paramType = pmOF.createParamType();
		paramType.setDatatype(paramDataType);
		paramType.setName(paramName);
		paramType.setValue(paramValue);
		pt.getParam().add(paramType);

		rmt.getMessageBody().getAny().add(pmOF.createSetProjectParam(pt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a project parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteProjectParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny()
				.add(pmOF.createDeleteProjectParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get all parameters of all projects
	 * 
	 * @param client
	 *            HTTP Client
	 * @param projectId
	 *            Project Id
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getAllProjectParam(HttpClient client, String projectId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny()
				.add(pmOF.createGetAllProjectParam(projectId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get a project Parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getProjectParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetProjectParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Set a Hive
	 * 
	 * @param client
	 *            HTTP Client
	 * @param environment
	 *            Environment
	 * @param helpURL
	 *            Help URL
	 * @param active
	 *            Is active
	 * @param domainName
	 *            Domain
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setHive(HttpClient client, String environment, String helpURL,
			boolean active, String domainName) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ConfigureType ct = pmOF.createConfigureType();
		ct.setEnvironment(environment);
		ct.setHelpURL(helpURL);
		ct.setActive(active);
		ct.setDomainName(domainName);

		rmt.getMessageBody().getAny().add(pmOF.createSetHive(ct));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Delete a hive
	 * 
	 * @param client
	 *            HTTP Client
	 * @param hiveId
	 *            Hive Id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteHive(HttpClient client, String hiveId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createDeleteHive(hiveId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all hives
	 * 
	 * @param client
	 *            HTTP Client
	 * @return Hives
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ConfiguresType getAllHive(HttpClient client) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetAllHive(null));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ConfiguresType(),
				runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get a hive
	 * 
	 * @param client
	 *            HTTP Client
	 * @param domainId
	 *            DomainId
	 * @return Hive
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ConfigureType getHive(HttpClient client, String domainId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ConfigureType ct = pmOF.createConfigureType();
		ct.setDomainId(domainId);

		rmt.getMessageBody().getAny().add(pmOF.createGetHive(ct));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ConfigureType(),
				runRequest(client, sw.toString(), ""));
	}

	/**
	 * Set a hive parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param domainId
	 *            Domain Id
	 * @param paramDataType
	 *            Parameter data type
	 * @param paramName
	 *            Parameter name
	 * @param paramvalue
	 *            Parameter value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setHiveParam(HttpClient client, String domainId,
			String paramDataType, String paramName, String paramValue)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ConfigureType ct = pmOF.createConfigureType();
		ct.setDomainId(domainId);
		ParamType pt = pmOF.createParamType();
		pt.setDatatype(paramDataType);
		pt.setName(paramName);
		pt.setValue(paramValue);
		ct.getParam().add(pt);

		rmt.getMessageBody().getAny().add(pmOF.createSetHiveParam(ct));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a hive parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteHiveParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createDeleteHiveParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get a hives parameters
	 * 
	 * @param client
	 *            HTTP Client
	 * @param hiveName
	 *            Hive name
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getAllHiveParam(HttpClient client, String hiveName)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createGetAllHiveParam(hiveName));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get a hive parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param hiveParamId
	 * @return Parameter
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getHiveParam(HttpClient client, String hiveParamId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetHiveParam(hiveParamId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Sets a cell name
	 * 
	 * @param client
	 *            HTTP Client
	 * @param cellId
	 *            Cell Id
	 * @param projectPath
	 *            The project path
	 * @param cellName
	 *            Cell name
	 * @param cellUrl
	 *            Cell URL
	 * @param cellSpecial
	 *            Cell special
	 * @param cellMethod
	 *            Cell method
	 * @param cellCanOverride
	 *            Cell can override
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setCell(HttpClient client, String cellId, String projectPath,
			String cellName, String cellUrl, String cellSpecial,
			String cellMethod, boolean cellCanOverride) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		CellDataType cdt = pmOF.createCellDataType();
		cdt.setProjectPath(projectPath);
		cdt.setId(cellId);
		cdt.setName(cellName);
		cdt.setUrl(cellUrl);
		cdt.setSpecial(cellSpecial);
		cdt.setMethod(cellMethod);
		cdt.setCanOverride(cellCanOverride);

		rmt.getMessageBody().getAny().add(pmOF.createSetCell(cdt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a cell
	 * 
	 * @param client
	 *            HTTP Client
	 * @param cellId
	 *            Cell Id
	 * @param projectPath
	 *            The project path
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 */
	public void deleteCell(HttpClient client, String cellId, String projectPath)
			throws UnsupportedOperationException, I2B2InterfaceException,
			IOException, JAXBException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		CellDataType cdt = pmOF.createCellDataType();
		cdt.setId(cellId);
		cdt.setProjectPath(projectPath);

		rmt.getMessageBody().getAny().add(pmOF.createDeleteCell(cdt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all cell data
	 * 
	 * @param client
	 *            HTTP Client
	 * @return Cell data
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public CellDatasType getAllCell(HttpClient client) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetAllCell(null));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new CellDatasType(),
				runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get a cell
	 * 
	 * @param client
	 *            HTTP Client
	 * @param cellId
	 *            Cell Id
	 * @param projectPath
	 *            The project path
	 * @return Cell data
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public CellDataType getCell(HttpClient client, String cellId,
			String projectPath) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		CellDataType cdt = pmOF.createCellDataType();
		cdt.setId(cellId);
		cdt.setProjectPath(projectPath);

		rmt.getMessageBody().getAny().add(pmOF.createGetCell(cdt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new CellDataType(),
				runRequest(client, sw.toString(), ""));

	}

	/**
	 * Set a cell parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param cellId
	 *            Cell Id
	 * @param paramDataType
	 *            Parameter data type
	 * @param paramName
	 *            Parameter name
	 * @param paramvalue
	 *            Parameter value
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setCellParam(HttpClient client, String cellId,
			String paramDataType, String paramName, String paramValue)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		CellDataType cdt = pmOF.createCellDataType();
		cdt.setId(cellId);

		ParamType pt = pmOF.createParamType();
		pt.setDatatype(paramDataType);
		pt.setName(paramName);
		pt.setValue(paramValue);
		cdt.getParam().add(pt);

		rmt.getMessageBody().getAny().add(pmOF.createSetCellParam(cdt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete a cell parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteCellParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createDeleteCellParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get all cell parameters
	 * 
	 * @param client
	 *            HTTP Client
	 * @param cellId
	 *            Cell Id
	 * @param projectPath
	 *            The project path
	 * @return Parameters
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamsType getAllCellParam(HttpClient client, String cellId,
			String projectPath) throws JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		CellDataType cdt = pmOF.createCellDataType();
		cdt.setId(cellId);
		cdt.setProjectPath(projectPath);

		rmt.getMessageBody().getAny().add(pmOF.createGetAllCellParam(cdt));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamsType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get cell parameter
	 * 
	 * @param client
	 *            HTTP Client
	 * @param paramId
	 *            Parameter id
	 * @return Parameter
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ParamType getCellParam(HttpClient client, String paramId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetCellParam(paramId));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ParamType(), runRequest(client, sw.toString(), ""));

	}

	/**
	 * Set a new password for the logged in user
	 * 
	 * @param client
	 *            HTTP Client
	 * @param newPassword
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setPassword(HttpClient client, String newPassword)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		rmt.getMessageBody().getAny().add(pmOF.createSetPassword(newPassword));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Create an approval
	 * 
	 * @param client
	 *            HTTP Client
	 * @param id
	 *            Approval id
	 * @param approvalName
	 *            Approval Name
	 * @param approvalDescription
	 *            Approval description
	 * @param approvalObservationCd
	 *            Approval observation cd
	 * @param activationDate
	 *            Activation date
	 * @param expirationDate
	 *            Expiration date
	 * @throws DatatypeConfigurationException
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void setApproval(HttpClient client, String id, String approvalName,
			String approvalDescription, String approvalObservationCd,
			GregorianCalendar activationDate, GregorianCalendar expirationDate)
			throws DatatypeConfigurationException, JAXBException,
			UnsupportedOperationException, I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ApprovalType at = pmOF.createApprovalType();
		at.setId(id);
		at.setName(approvalName);
		at.setDescription(approvalDescription);
		at.setObjectCd(approvalObservationCd);
		at.setActivationDate((DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(activationDate)));
		at.setExpirationDate((DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(expirationDate)));

		rmt.getMessageBody().getAny().add(pmOF.createSetApproval(at));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));

	}

	/**
	 * Delete an approval
	 * 
	 * @param client
	 *            HTTP Client
	 * @param approvalId
	 *            Approval Id
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public void deleteApproval(HttpClient client, String approvalId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");

		ApprovalType at = pmOF.createApprovalType();
		at.setId(approvalId);

		rmt.getMessageBody().getAny().add(pmOF.createDeleteApproval(at));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		checkForError(runRequest(client, sw.toString(), ""));
	}

	/**
	 * Get all approvals
	 * 
	 * @param client
	 *            HTTP Client
	 * @return Approvals
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ApprovalsType getAllApproval(HttpClient client)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		rmt.getMessageBody().getAny().add(pmOF.createGetAllApproval(null));

		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ApprovalsType(),
				runRequest(client, sw.toString(), ""));

	}

	/**
	 * Get an approval
	 * 
	 * @param client
	 *            HTTP Client
	 * @param approvalId
	 *            Approval Id
	 * @return Approval
	 * @throws JAXBException
	 *             An XML processing exception occurred
	 * @throws UnsupportedOperationException
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 * @throws IOException
	 *             An IO exception occurred
	 */
	public ApprovalType getApproval(HttpClient client, String approvalId)
			throws JAXBException, UnsupportedOperationException,
			I2B2InterfaceException, IOException {
		RequestMessageType rmt = createMinimumBaseMessage("");
		ApprovalType at = pmOF.createApprovalType();
		at.setId(approvalId);
		rmt.getMessageBody().getAny().add(pmOF.createGetApproval(at));
		StringWriter sw = new StringWriter();
		pmMarshaller.marshal(pmOF.createRequest(rmt), sw);

		return getType(new ApprovalType(),
				runRequest(client, sw.toString(), ""));

	}

	// -------------------------------------------------------------------------
	// Utility Methods
	// -------------------------------------------------------------------------

	/**
	 * Returns an object of whatever type specified in the return type from the
	 * given inputStream
	 * 
	 * @param returnType
	 *            Type to return
	 * @param inputStream
	 *            InputStream
	 * @return Object
	 * @throws I2B2InterfaceException
	 *             An error occurred on the i2b2 server
	 */
	@SuppressWarnings("unchecked")
	private <T> T getType(T returnType, InputStream inputStream)
			throws I2B2InterfaceException {
//		System.out.println("!" + convertStreamToString(inputStream));
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
	
	static String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
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
	 *             An IO exception occurred An IO Exception occurred
	 */
	private InputStream runRequest(HttpClient client, String entity,
			String urlAppend) throws UnsupportedOperationException, IOException {
//		System.out.println(entity);
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

	/**
	 * Creates the minimum message needed to send a request to the i2b2 server
	 * 
	 * @param appendURL URL to append to message
	 * @return Request Message Base
	 */
	private RequestMessageType createMinimumBaseMessage(String appendURL) {
		RequestMessageType rmt = pmOF.createRequestMessageType();

		// Create Message Header Type
		MessageHeaderType mht = pmOF.createMessageHeaderType();
		
		// Set proxy
		if((useProxy) && (appendURL != null)) {
			Proxy proxy = new Proxy();
			proxy.setRedirect_url(this.proxyURL + appendURL);
			mht.setProxy(proxy);
		}
		
		// Set Sending Application
		ApplicationType sat = pmOF.createApplicationType();
		sat.setApplicationName("IRCT");
		sat.setApplicationVersion("1.0");

		mht.setSendingApplication(sat);

		// Set Sending Facility
		FacilityType ft = pmOF.createFacilityType();
		ft.setFacilityName("IRCT");

		mht.setSendingFacility(ft);

		// Create Security Type
		SecurityType st = pmOF.createSecurityType();
		st.setDomain(this.domain);
		st.setUsername(this.userName);
		
		PasswordType pt = pmOF.createPasswordType();
		
		if(this.password != null) {
			pt.setValue(this.password);
		} else {
			pt.setIsToken(true);
			pt.setValue(this.token);
			pt.setTokenMsTimeout((int) this.timeout); 
		}
		st.setPassword(pt);
		
		mht.setSecurity(st);

		rmt.setMessageHeader(mht);

		// Create Request Header Type
		RequestHeaderType rht = pmOF.createRequestHeaderType();
		rht.setResultWaittimeMs(180000);
		rmt.setRequestHeader(rht);

		// Create Body Type
		BodyType bt = pmOF.createBodyType();
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

	public boolean isUseProxy() {
		return useProxy;
	}

	public void setUseProxy(boolean useProxy) {
		this.useProxy = useProxy;
	}

}
