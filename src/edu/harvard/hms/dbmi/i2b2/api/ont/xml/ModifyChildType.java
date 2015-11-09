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
 * <p>Java class for modifyChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="self" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}conceptType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inclSynonyms" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyChildType", propOrder = {
    "self"
})
public class ModifyChildType {

    @XmlElement(required = true)
    protected ConceptType self;
    @XmlAttribute(name = "inclSynonyms")
    protected Boolean inclSynonyms;

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptType }
     *     
     */
    public ConceptType getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptType }
     *     
     */
    public void setSelf(ConceptType value) {
        this.self = value;
    }

    /**
     * Gets the value of the inclSynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInclSynonyms() {
        if (inclSynonyms == null) {
            return true;
        } else {
            return inclSynonyms;
        }
    }

    /**
     * Sets the value of the inclSynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclSynonyms(Boolean value) {
        this.inclSynonyms = value;
    }

}
