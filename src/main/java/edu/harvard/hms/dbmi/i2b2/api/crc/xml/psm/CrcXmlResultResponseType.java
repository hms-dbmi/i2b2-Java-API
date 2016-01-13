/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crc_xml_result_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crc_xml_result_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="query_result_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_instanceType"/>
 *         &lt;element name="crc_xml_result" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}xml_resultType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crc_xml_result_responseType", propOrder = {
    "queryResultInstance",
    "crcXmlResult"
})
public class CrcXmlResultResponseType
    extends ResponseType
{

    @XmlElement(name = "query_result_instance", required = true)
    protected QueryResultInstanceType queryResultInstance;
    @XmlElement(name = "crc_xml_result", required = true)
    protected XmlResultType crcXmlResult;

    /**
     * Gets the value of the queryResultInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultInstanceType }
     *     
     */
    public QueryResultInstanceType getQueryResultInstance() {
        return queryResultInstance;
    }

    /**
     * Sets the value of the queryResultInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultInstanceType }
     *     
     */
    public void setQueryResultInstance(QueryResultInstanceType value) {
        this.queryResultInstance = value;
    }

    /**
     * Gets the value of the crcXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link XmlResultType }
     *     
     */
    public XmlResultType getCrcXmlResult() {
        return crcXmlResult;
    }

    /**
     * Sets the value of the crcXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlResultType }
     *     
     */
    public void setCrcXmlResult(XmlResultType value) {
        this.crcXmlResult = value;
    }

}
