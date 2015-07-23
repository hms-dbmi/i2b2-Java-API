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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for headerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="headerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}userType"/>
 *         &lt;element name="data_source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patient_set_limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimated_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="create_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="submit_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="complete_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="query_mode" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}queryModeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "headerType", propOrder = {
    "user",
    "dataSource",
    "patientSetLimit",
    "estimatedTime",
    "createDate",
    "submitDate",
    "completeDate",
    "queryMode"
})
@XmlSeeAlso({
    PsmQryHeaderType.class
})
public class HeaderType {

    @XmlElement(required = true)
    protected UserType user;
    @XmlElement(name = "data_source", required = true)
    protected String dataSource;
    @XmlElement(name = "patient_set_limit")
    protected int patientSetLimit;
    @XmlElement(name = "estimated_time")
    protected int estimatedTime;
    @XmlElement(name = "create_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "submit_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDate;
    @XmlElement(name = "complete_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeDate;
    @XmlElement(name = "query_mode", required = true)
    @XmlSchemaType(name = "string")
    protected QueryModeType queryMode;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the patientSetLimit property.
     * 
     */
    public int getPatientSetLimit() {
        return patientSetLimit;
    }

    /**
     * Sets the value of the patientSetLimit property.
     * 
     */
    public void setPatientSetLimit(int value) {
        this.patientSetLimit = value;
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     */
    public int getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     */
    public void setEstimatedTime(int value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the completeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the value of the completeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteDate(XMLGregorianCalendar value) {
        this.completeDate = value;
    }

    /**
     * Gets the value of the queryMode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryModeType }
     *     
     */
    public QueryModeType getQueryMode() {
        return queryMode;
    }

    /**
     * Sets the value of the queryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryModeType }
     *     
     */
    public void setQueryMode(QueryModeType value) {
        this.queryMode = value;
    }

}
