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
 * <p>Java class for xml_resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xml_resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xml_result_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}xml_result_idType"/>
 *         &lt;element name="result_instance_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_instance_idType"/>
 *         &lt;element name="xml_value" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}xml_valueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xml_resultType", propOrder = {
    "xmlResultId",
    "resultInstanceId",
    "xmlValue"
})
public class XmlResultType {

    @XmlElement(name = "xml_result_id", required = true)
    protected String xmlResultId;
    @XmlElement(name = "result_instance_id", required = true)
    protected String resultInstanceId;
    @XmlElement(name = "xml_value", required = true)
    protected XmlValueType xmlValue;

    /**
     * Gets the value of the xmlResultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlResultId() {
        return xmlResultId;
    }

    /**
     * Sets the value of the xmlResultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlResultId(String value) {
        this.xmlResultId = value;
    }

    /**
     * Gets the value of the resultInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultInstanceId() {
        return resultInstanceId;
    }

    /**
     * Sets the value of the resultInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultInstanceId(String value) {
        this.resultInstanceId = value;
    }

    /**
     * Gets the value of the xmlValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValueType }
     *     
     */
    public XmlValueType getXmlValue() {
        return xmlValue;
    }

    /**
     * Sets the value of the xmlValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValueType }
     *     
     */
    public void setXmlValue(XmlValueType value) {
        this.xmlValue = value;
    }

}
