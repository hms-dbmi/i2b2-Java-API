package edu.harvard.hms.dbmi.i2b2.api;

import javax.xml.bind.JAXBException;

/**
 * Provides an implementation that describes the API for setting up connectors
 * to individuals i2b2 cells.
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public interface Cell {
	/**
	 * Sets up all needed parameters to communicate with the implementing
	 * classes cell
	 * 
	 * @param connectionURL
	 *            URL of the cell
	 * @param domain
	 *            Domain of the user
	 * @param userName
	 *            User Name
	 * @param password
	 *            Password
	 * @param projectId
	 *            Project ID
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId) throws JAXBException;

	/**
	 * Sets up all needed parameters to communicate with the implementing
	 * classes cell
	 * 
	 * @param connectionURL
	 *            URL of the cell
	 * @param domain
	 *            Domain of the user
	 * @param userName
	 *            User Name
	 * @param token
	 *            i2b2 Token
	 * @param timeout
	 *            i2b2 token timeout time
	 * @param projectId
	 *            Project Id
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public void setup(String connectionURL, String domain, String userName,
			String token, long timeout, String projectId) throws JAXBException;
}
