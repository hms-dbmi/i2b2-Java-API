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
