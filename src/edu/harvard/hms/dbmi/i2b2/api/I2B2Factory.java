package edu.harvard.hms.dbmi.i2b2.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBException;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import edu.harvard.hms.dbmi.i2b2.api.crc.CRCCell;
import edu.harvard.hms.dbmi.i2b2.api.exception.I2B2InterfaceException;
import edu.harvard.hms.dbmi.i2b2.api.ont.ONTCell;
import edu.harvard.hms.dbmi.i2b2.api.pm.PMCell;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.CellDataType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ConfigureType;
import edu.harvard.hms.dbmi.i2b2.api.pm.xml.ProjectType;

public class I2B2Factory {

	private String connectionURL;
	private String domain;
	private String userName;
	private String password;
	private Map<String, String> projects;
	private boolean setup;
	private String token;
	private long tokenTimeOut;
	private List<CellDataType> cellData;

	public I2B2Factory() {
		this.tokenTimeOut = 0;
		this.setup = false;
		this.projects = new HashMap<String, String>();
	}

	public void setup() {
		tokenTimeOut = 0;
		this.setup = true;
	}

	public String login(String connectionURL, String domain, String userName,
			String password) throws I2B2InterfaceException {
		String token = null;
		try {
			PMCell pmCell = new PMCell();
			this.connectionURL = connectionURL;
			this.domain = domain;
			this.userName = userName;
			this.password = password;
			pmCell.setup(connectionURL, domain, userName, password);

			HttpClient httpClient = HttpClients.createDefault();
			ConfigureType configureType = pmCell.getUserConfiguration(
					httpClient, null, new String[] { "undefined" });

			this.token = configureType.getUser().getPassword().getValue();
			this.tokenTimeOut = configureType.getUser().getPassword()
					.getTokenMsTimeout();

			for (ProjectType pt : configureType.getUser().getProject()) {
				this.projects.put(pt.getId(), pt.getPath());
			}

			this.cellData = configureType.getCellDatas().getCellData();

			this.setup = true;
		} catch (UnsupportedOperationException | JAXBException
				| I2B2InterfaceException | IOException e) {
			throw new I2B2InterfaceException("Unable to login", e);
		}

		return token;
	}

	public Cell getCell(String cellName, String project)
			throws I2B2InterfaceException {
		if(!this.setup) {
			throw new I2B2InterfaceException("Factory has not been setup");
		}
		
		Cell cell = null;
		String projectPath = this.projects.get(project);

		for (CellDataType cdt : cellData) {
			if (cdt.getId().equalsIgnoreCase(cellName)) {
				String cellURL = null;
				if(cdt.getProjectPath().equals("/")) {
					cellURL = cdt.getUrl();
					if (cellName.equalsIgnoreCase("PM")) {
						cell = new PMCell();
					} else if (cellName.equalsIgnoreCase("CRC")) {
						cell = new CRCCell();
					} else if (cellName.equalsIgnoreCase("ONT")) {
						cell = new ONTCell();
					} else {
						throw new I2B2InterfaceException(cellName
								+ " is not a supported cell type");
					}
				} else if(cdt.getProjectPath().equals(projectPath)) {
					cellURL = cdt.getUrl();
					if (cellName.equalsIgnoreCase("PM")) {
						cell = new PMCell();
						break;
					} else if (cellName.equalsIgnoreCase("CRC")) {
						cell = new CRCCell();
						break;
					} else if (cellName.equalsIgnoreCase("ONT")) {
						cell = new ONTCell();
						break;
					} else {
						throw new I2B2InterfaceException(cellName
								+ " is not a supported cell type");
					}
				}
				try {
					cell.setup(cellURL, domain, userName, token, tokenTimeOut,
							project);
				} catch (JAXBException e) {
					throw new I2B2InterfaceException("Unable to initiate "
							+ cellName, e);
				}
			}
		}
		return cell;
	}

	// -------------------------------------------------------------------------
	// Setters and Getters
	// -------------------------------------------------------------------------

	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getProjects() {
		return projects.keySet();
	}

	public boolean isSetup() {
		return setup;
	}

	public String getToken() {
		return token;
	}
}
