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
