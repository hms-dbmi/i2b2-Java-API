/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConceptByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConceptByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="concept_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}concept_primary_key_Type"/>
 *         &lt;element name="concept_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConceptByPrimaryKey_requestType", propOrder = {
    "conceptPrimaryKey",
    "conceptOutputOption"
})
public class GetConceptByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "concept_primary_key", required = true)
    protected ConceptPrimaryKeyType conceptPrimaryKey;
    @XmlElement(name = "concept_output_option", required = true)
    protected OutputOptionType conceptOutputOption;

    /**
     * Gets the value of the conceptPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptPrimaryKeyType }
     *     
     */
    public ConceptPrimaryKeyType getConceptPrimaryKey() {
        return conceptPrimaryKey;
    }

    /**
     * Sets the value of the conceptPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptPrimaryKeyType }
     *     
     */
    public void setConceptPrimaryKey(ConceptPrimaryKeyType value) {
        this.conceptPrimaryKey = value;
    }

    /**
     * Gets the value of the conceptOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getConceptOutputOption() {
        return conceptOutputOption;
    }

    /**
     * Sets the value of the conceptOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setConceptOutputOption(OutputOptionType value) {
        this.conceptOutputOption = value;
    }

}
