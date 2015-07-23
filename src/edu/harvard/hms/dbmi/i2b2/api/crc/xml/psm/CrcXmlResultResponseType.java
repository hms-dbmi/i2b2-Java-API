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
