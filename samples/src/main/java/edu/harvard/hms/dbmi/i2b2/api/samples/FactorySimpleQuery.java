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
package edu.harvard.hms.dbmi.i2b2.api.samples;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import edu.harvard.hms.dbmi.i2b2.api.I2B2Factory;
import edu.harvard.hms.dbmi.i2b2.api.crc.CRCCell;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.OutputOptionSelectType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.ParamType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientDataResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientSet;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo.PatientType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ItemType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.MasterInstanceResultResponseType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.PanelType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.QueryResultInstanceType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResultOutputOptionListType;
import edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm.ResultOutputOptionType;
import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;

/**
 * Provides an example of performing a simple query using the i2b2-Java-API
 * 
 * A simple example would be the following:
 * 
 * java SimpleQuery i2b2demo demo demouser http://192.168.56.101:9090/i2b2/services/QueryToolService Demo \\\\i2b2_DEMO\\i2b2\\Demographics\\Gender\\
 * @author Jeremy R. Easton-Marks
 *
 */
public class FactorySimpleQuery {
	private CRCCell crcCell = new CRCCell();
	
	/**
	 * Runs the simple query example
	 * 
	 * Requires 6 parameters:
	 * domain userName password ontologyCellURL project path
	 * 
	 * @param args
	 *            arguments
	 */
	public static void main(String[] args) {
		if (args.length != 6) {
			System.out.println("Invalid number of arguments.");
			System.out
					.println("java SimpleQuery domain userName password ontologyCellURL project path");
		}
		
		String domain = args[0];
		String userName = args[1];
		String password = args[2];
		String crcCellURL = args[3];
		String project = args[4];
		String path = args[5];
		
		FactorySimpleQuery simpleQuery = new FactorySimpleQuery();
		try {
			simpleQuery.setup(userName, domain, password, crcCellURL, project);
			HttpClient httpClient = HttpClients.createDefault();
			
			String queryMasterId = simpleQuery.runQuery(httpClient, path);
			simpleQuery.printResults(httpClient, queryMasterId);
			
		} catch (JAXBException | IOException | I2B2InterfaceException e) {
			System.out.println("An error occurred running the simple query");
			e.printStackTrace();
		}

	}
	
	/**
	 * Runs the query
	 * 
	 * @param httpClient HTTP client
	 * @param path Path to query on
	 * @return The query master id
	 * @throws ClientProtocolException
	 *             A client protocol exception occurred
	 * @throws JAXBException
	 *             An XML exception occurred
	 * @throws IOException
	 *             An IO exception occurred
	 * @throws I2B2InterfaceException
	 *             An exception occurred on the I2B2 server
	 */
	private String runQuery(HttpClient httpClient, String path) throws ClientProtocolException, JAXBException, I2B2InterfaceException, IOException {
		PanelType panel = new PanelType();
		panel.setPanelNumber(1);
		panel.setPanelAccuracyScale(100);
		panel.setInvert(0);
		panel.setPanelTiming("ANY");
		PanelType.TotalItemOccurrences tio = new PanelType.TotalItemOccurrences();
		tio.setValue(1);
		panel.setTotalItemOccurrences(tio);
		
		ItemType itemType = new ItemType();
		itemType.setItemKey(path);
		panel.getItem().add(itemType);
		
		//Set up the result option to return a patient set
		ResultOutputOptionListType roolt = new ResultOutputOptionListType();
		ResultOutputOptionType root = new ResultOutputOptionType();
		root.setPriorityIndex(9);
		root.setName("patientset");
		
		roolt.getResultOutput().add(root);
		
		MasterInstanceResultResponseType mirrt = crcCell
				.runQueryInstanceFromQueryDefinition(httpClient, null, null,
						"Simple Query", null, "ANY", 0, roolt, panel);

		return mirrt.getQueryInstance().getQueryMasterId();
	}
	/**
	 * Prints the results of the query
	 * 
	 * @param httpClient HTTP Client
	 * @param queryMasterId Master Query Id
	 * @throws ClientProtocolException
	 *             A client protocol exception occurred
	 * @throws JAXBException
	 *             An XML exception occurred
	 * @throws IOException
	 *             An IO exception occurred
	 * @throws I2B2InterfaceException
	 *             An exception occurred on the I2B2 server
	 */
	private void printResults(HttpClient httpClient, String queryMasterId) throws ClientProtocolException, JAXBException, I2B2InterfaceException, IOException {
		List<QueryResultInstanceType> response = crcCell
				.getQueryResultInstanceListFromQueryInstanceId(httpClient, queryMasterId);
		String resultInstanceId = response.get(0).getResultInstanceId();
		PatientDataResponseType pdrt = crcCell.getPDOfromInputList(httpClient, resultInstanceId, 0, 100000, false, false, false, OutputOptionSelectType.USING_INPUT_LIST);
		
		PatientSet patientSet = pdrt.getPatientData().getPatientSet();
		if(patientSet.getPatient().size() == 0) {
			System.out.println("No results returned");
			return;
		}
		
		System.out.print("Patient Id\t|");
		
		PatientType columnPatientType = patientSet.getPatient().get(0);
		String[] columns = new String[columnPatientType.getParam().size()];
		for (int i = 0; i < columnPatientType.getParam().size(); i++) {
			String columnName =columnPatientType.getParam().get(i).getColumn(); 
			columns[i] = columnName;
			System.out.print("\t|\t" + columnName);
		}
		System.out.println("\t|\n");
		
		for(PatientType patientType : patientSet.getPatient()) {
			System.out.println(patientType.getPatientId().getValue() + "\t|");
			
			List<ParamType> patientParams = patientType.getParam();
			for(String column : columns) {
				for(ParamType patientParam : patientParams) {
					if(patientParam.getColumn().equalsIgnoreCase(column)) {
						System.out.print("\t|\t" + patientParam.getValue());
					}
				}
			}
			System.out.println("\t|");
			
		}
		
		System.out.println("\nResults: " + patientSet.getPatient().size());
	}
	
	private void setup(String userName, String domain, String password,
			String connectionURL, String project) throws I2B2InterfaceException {
		
		I2B2Factory i2b2Factory = new I2B2Factory();
		i2b2Factory.setup();
		i2b2Factory.login(connectionURL, domain, userName, password, true);
		for(String projectId : i2b2Factory.getProjects()) {
			System.out.println(projectId);
		}
		
		crcCell = (CRCCell) i2b2Factory.getCell("CRC", project, true);
	}
}
