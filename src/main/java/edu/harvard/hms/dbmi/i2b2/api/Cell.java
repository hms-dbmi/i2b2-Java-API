/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
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
	 * @param useProxy Use a proxy
	 * @param proxyURL URL of the proxy if used
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId, boolean useProxy, String proxyURL) throws JAXBException;

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
	 * @param useProxy Use a proxy
	 * @param proxyURL URL of the proxy if used
	 * @throws JAXBException
	 *             An Exception Occurred
	 */
	public void setup(String connectionURL, String domain, String userName,
			String token, long timeout, String projectId, boolean useProxy, String proxyURL) throws JAXBException;

	/**
	 * Sets/Updates the connection information.
	 * 
	 * @param connectionURL URL of the cell
	 * @param domain Domain of the user
	 * @param userName User Name
	 * @param password Password
	 * @param projectId Project id
	 * @param useProxy Use a proxy
	 * @param proxyURL URL of the proxy if used
	 */
	void setupConnection(String connectionURL, String domain, String userName,
			String password, String projectId, boolean useProxy, String proxyURL);
}
