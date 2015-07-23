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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for query_result_instanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query_result_instanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_instance_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_instance_idType"/>
 *         &lt;element name="query_instance_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_instance_idType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="query_result_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_typeType"/>
 *         &lt;element name="set_size" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}set_sizeType"/>
 *         &lt;element name="obfuscate_method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_date" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}start_dateType"/>
 *         &lt;element name="end_date" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}end_dateType"/>
 *         &lt;element name="message" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}xml_valueType"/>
 *         &lt;element name="query_status_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_status_typeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query_result_instanceType", propOrder = {
    "resultInstanceId",
    "queryInstanceId",
    "description",
    "queryResultType",
    "setSize",
    "obfuscateMethod",
    "startDate",
    "endDate",
    "message",
    "queryStatusType"
})
public class QueryResultInstanceType {

    @XmlElement(name = "result_instance_id", required = true)
    protected String resultInstanceId;
    @XmlElement(name = "query_instance_id", required = true)
    protected String queryInstanceId;
    protected String description;
    @XmlElement(name = "query_result_type", required = true)
    protected QueryResultTypeType queryResultType;
    @XmlElement(name = "set_size", defaultValue = "-1")
    protected int setSize;
    @XmlElement(name = "obfuscate_method", required = true)
    protected String obfuscateMethod;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected XmlValueType message;
    @XmlElement(name = "query_status_type", required = true)
    protected QueryStatusTypeType queryStatusType;

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
     * Gets the value of the queryInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryInstanceId() {
        return queryInstanceId;
    }

    /**
     * Sets the value of the queryInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryInstanceId(String value) {
        this.queryInstanceId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the queryResultType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultTypeType }
     *     
     */
    public QueryResultTypeType getQueryResultType() {
        return queryResultType;
    }

    /**
     * Sets the value of the queryResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultTypeType }
     *     
     */
    public void setQueryResultType(QueryResultTypeType value) {
        this.queryResultType = value;
    }

    /**
     * Gets the value of the setSize property.
     * 
     */
    public int getSetSize() {
        return setSize;
    }

    /**
     * Sets the value of the setSize property.
     * 
     */
    public void setSetSize(int value) {
        this.setSize = value;
    }

    /**
     * Gets the value of the obfuscateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObfuscateMethod() {
        return obfuscateMethod;
    }

    /**
     * Sets the value of the obfuscateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObfuscateMethod(String value) {
        this.obfuscateMethod = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValueType }
     *     
     */
    public XmlValueType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValueType }
     *     
     */
    public void setMessage(XmlValueType value) {
        this.message = value;
    }

    /**
     * Gets the value of the queryStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryStatusTypeType }
     *     
     */
    public QueryStatusTypeType getQueryStatusType() {
        return queryStatusType;
    }

    /**
     * Sets the value of the queryStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStatusTypeType }
     *     
     */
    public void setQueryStatusType(QueryStatusTypeType value) {
        this.queryStatusType = value;
    }

}
