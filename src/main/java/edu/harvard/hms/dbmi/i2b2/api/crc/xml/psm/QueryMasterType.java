/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for query_masterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query_masterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query_master_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_master_idType"/>
 *         &lt;element name="name" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}nameType"/>
 *         &lt;element name="user_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}user_idType"/>
 *         &lt;element name="group_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}group_idType"/>
 *         &lt;element name="master_type_cd" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}master_cdType"/>
 *         &lt;element name="create_date" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}create_dateType"/>
 *         &lt;element name="delete_date" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}delete_dateType"/>
 *         &lt;element name="request_xml" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}request_xmlType"/>
 *         &lt;element name="generated_sql" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}generated_sqlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query_masterType", propOrder = {
    "queryMasterId",
    "name",
    "userId",
    "groupId",
    "masterTypeCd",
    "createDate",
    "deleteDate",
    "requestXml",
    "generatedSql"
})
public class QueryMasterType {

    @XmlElement(name = "query_master_id", required = true)
    protected String queryMasterId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "user_id", required = true)
    protected String userId;
    @XmlElement(name = "group_id", required = true)
    protected String groupId;
    @XmlElement(name = "master_type_cd", required = true)
    protected String masterTypeCd;
    @XmlElement(name = "create_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "delete_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deleteDate;
    @XmlElement(name = "request_xml", required = true)
    protected RequestXmlType requestXml;
    @XmlElement(name = "generated_sql", required = true)
    protected String generatedSql;

    /**
     * Gets the value of the queryMasterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMasterId() {
        return queryMasterId;
    }

    /**
     * Sets the value of the queryMasterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMasterId(String value) {
        this.queryMasterId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the masterTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterTypeCd() {
        return masterTypeCd;
    }

    /**
     * Sets the value of the masterTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterTypeCd(String value) {
        this.masterTypeCd = value;
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
     * Gets the value of the deleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the value of the deleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeleteDate(XMLGregorianCalendar value) {
        this.deleteDate = value;
    }

    /**
     * Gets the value of the requestXml property.
     * 
     * @return
     *     possible object is
     *     {@link RequestXmlType }
     *     
     */
    public RequestXmlType getRequestXml() {
        return requestXml;
    }

    /**
     * Sets the value of the requestXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestXmlType }
     *     
     */
    public void setRequestXml(RequestXmlType value) {
        this.requestXml = value;
    }

    /**
     * Gets the value of the generatedSql property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedSql() {
        return generatedSql;
    }

    /**
     * Sets the value of the generatedSql property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedSql(String value) {
        this.generatedSql = value;
    }

}
