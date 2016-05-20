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

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;
import edu.harvard.hms.dbmi.i2b2.api.ont.ONTCell;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ConceptType;
import edu.harvard.hms.dbmi.i2b2.api.ont.xml.ConceptsType;

/**
 * Provides an example of i2b2-Java-API for traversing paths
 * 
 * A simple example would be the following:
 * 
 * java TraversePaths i2b2demo demo demouser http://192.168.56.101:9090/i2b2/services/OntologyService Demo 3
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public class TraversePaths {
	private ONTCell ontCell = new ONTCell();
	private int totalCount = 0;

	/**
	 * Runs the traverse paths example.
	 * 
	 * Requires 6 parameters:
	 * domain userName password ontologyCellURL project depth
	 * 
	 * @param args
	 *            arguments
	 */
	public static void main(String[] args) {
		if (args.length != 6) {
			System.out.println("Invalid number of arguments.");
			System.out
					.println("java TraversePaths domain userName password ontologyCellURL project depth");
		}
		String domain = args[0];
		String userName = args[1];
		String password = args[2];
		String ontologyCellURL = args[3];
		String project = args[4];
		int depth = Integer.parseInt(args[5]);

		TraversePaths traversePaths = new TraversePaths();
		try {
			traversePaths.setup(userName, domain, password, ontologyCellURL,
					project);

			HttpClient httpClient = HttpClients.createDefault();

			traversePaths.printPath(httpClient, null, 0, depth);

		} catch (JAXBException | IOException | I2B2InterfaceException e) {
			System.out.println("An error occurred traverse the paths");
			e.printStackTrace();
		}
		System.out.println("\nFinished with " + traversePaths.getTotalCount()
				+ " returned in total");
	}

	/**
	 * Prints the current path and continues
	 * 
	 * @param httpClient
	 *            HTTP client
	 * @param currentConcept
	 *            Current concept
	 * @param currentDepth
	 *            Current position
	 * @param max
	 *            Max distance to traverse
	 * @throws ClientProtocolException
	 *             A client protocol exception occurred
	 * @throws JAXBException
	 *             An XML exception occurred
	 * @throws IOException
	 *             An IO exception occurred
	 * @throws I2B2InterfaceException
	 *             An exception occurred on the I2B2 server
	 */
	private void printPath(HttpClient httpClient, ConceptType currentConcept,
			int currentDepth, int max) throws ClientProtocolException,
			JAXBException, IOException, I2B2InterfaceException {
		ConceptsType conceptsType = null;
		// If we are at the base level we get categories
		// All other levels we get children
		if (currentConcept == null) {
			conceptsType = ontCell.getCategories(httpClient, false, false,
					true, "core");
			currentDepth = 0;
		} else {
			// Print some tabs for display
			for (int i = 0; i < currentDepth; i++) {
				System.out.print("\t");
			}
			// Print the name
			System.out.println("|-----> " + currentConcept.getName() + "\t" + currentConcept.getKey());
			// Increase the depth we are at
			currentDepth++;

			// Get all children if they will be needed
			if (currentDepth < max) {
				conceptsType = ontCell.getChildren(httpClient,
						currentConcept.getKey(), false, false, false, -1,
						"core");
			}
		}
		// Traverse through the children
		if (currentDepth < max) {
			for (ConceptType conceptType : conceptsType.getConcept()) {
				totalCount++;
				printPath(httpClient, conceptType, currentDepth, max);
			}
		}

	}

	/**
	 * Sets up the Ontology cell
	 * 
	 * @param userName
	 *            User name
	 * @param domain
	 *            Domain
	 * @param password
	 *            Password
	 * @param ontologyCellURL
	 *            Ontology cell URL
	 * @param project
	 *            Project
	 * @throws JAXBException
	 *             An XML exception occurred
	 */
	private void setup(String userName, String domain, String password,
			String ontologyCellURL, String project) throws JAXBException {
		ontCell.setup(ontologyCellURL, domain, userName, password, project, false, null);
	}

	/**
	 * Returns the total count of entries traversed
	 * 
	 * @return Total count
	 */
	private int getTotalCount() {
		return totalCount;
	}

}
