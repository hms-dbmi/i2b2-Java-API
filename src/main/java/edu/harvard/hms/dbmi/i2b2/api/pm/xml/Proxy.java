package edu.harvard.hms.dbmi.i2b2.api.pm.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proxy", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "redirect_url"
})
public class Proxy {

	@XmlElement(name = "redirect_url", required = true)
	private String redirect_url;

	/**
	 * @return the redirect_url
	 */
	public String getRedirect_url() {
		return redirect_url;
	}

	/**
	 * @param redirect_url the redirect_url to set
	 */
	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}
}
