/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for query_result_typeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query_result_typeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_type_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_type_idType"/>
 *         &lt;element name="name" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}nameType" minOccurs="0"/>
 *         &lt;element name="display_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visual_attribute_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}descriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query_result_typeType", propOrder = {
    "resultTypeId",
    "name",
    "displayType",
    "visualAttributeType",
    "description"
})
public class QueryResultTypeType {

    @XmlElement(name = "result_type_id", required = true)
    protected String resultTypeId;
    protected String name;
    @XmlElement(name = "display_type")
    protected String displayType;
    @XmlElement(name = "visual_attribute_type")
    protected String visualAttributeType;
    protected String description;

    /**
     * Gets the value of the resultTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultTypeId() {
        return resultTypeId;
    }

    /**
     * Sets the value of the resultTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultTypeId(String value) {
        this.resultTypeId = value;
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
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the visualAttributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualAttributeType() {
        return visualAttributeType;
    }

    /**
     * Sets the value of the visualAttributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualAttributeType(String value) {
        this.visualAttributeType = value;
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

}
