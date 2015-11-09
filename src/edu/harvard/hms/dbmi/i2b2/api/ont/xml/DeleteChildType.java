/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delete_childType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delete_childType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synonym_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visualattribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="include_children" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delete_childType", propOrder = {
    "level",
    "key",
    "name",
    "synonymCd",
    "basecode",
    "visualattribute"
})
public class DeleteChildType {

    protected int level;
    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "synonym_cd", required = true)
    protected String synonymCd;
    @XmlElement(required = true)
    protected String basecode;
    @XmlElement(required = true)
    protected String visualattribute;
    @XmlAttribute(name = "include_children")
    protected Boolean includeChildren;

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the synonymCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynonymCd() {
        return synonymCd;
    }

    /**
     * Sets the value of the synonymCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynonymCd(String value) {
        this.synonymCd = value;
    }

    /**
     * Gets the value of the basecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasecode() {
        return basecode;
    }

    /**
     * Sets the value of the basecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasecode(String value) {
        this.basecode = value;
    }

    /**
     * Gets the value of the visualattribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualattribute() {
        return visualattribute;
    }

    /**
     * Sets the value of the visualattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualattribute(String value) {
        this.visualattribute = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeChildren() {
        if (includeChildren == null) {
            return false;
        } else {
            return includeChildren;
        }
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildren(Boolean value) {
        this.includeChildren = value;
    }

}
