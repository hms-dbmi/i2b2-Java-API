package edu.harvard.hms.dbmi.i2b2.api;

import javax.xml.bind.JAXBException;

public interface Cell {
	public void setup(String connectionURL, String domain, String userName,
			String password, String projectId) throws JAXBException;
	public void setup(String connectionURL, String domain, String userName, String token, long timeout, String project) throws JAXBException;
}
