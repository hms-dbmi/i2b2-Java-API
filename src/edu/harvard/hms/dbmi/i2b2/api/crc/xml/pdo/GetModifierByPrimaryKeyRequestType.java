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
 * <p>Java class for GetModifierByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetModifierByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="modifier_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}modifier_primary_key_Type"/>
 *         &lt;element name="modifier_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetModifierByPrimaryKey_requestType", propOrder = {
    "modifierPrimaryKey",
    "modifierOutputOption"
})
public class GetModifierByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "modifier_primary_key", required = true)
    protected ModifierPrimaryKeyType modifierPrimaryKey;
    @XmlElement(name = "modifier_output_option", required = true)
    protected OutputOptionType modifierOutputOption;

    /**
     * Gets the value of the modifierPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link ModifierPrimaryKeyType }
     *     
     */
    public ModifierPrimaryKeyType getModifierPrimaryKey() {
        return modifierPrimaryKey;
    }

    /**
     * Sets the value of the modifierPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifierPrimaryKeyType }
     *     
     */
    public void setModifierPrimaryKey(ModifierPrimaryKeyType value) {
        this.modifierPrimaryKey = value;
    }

    /**
     * Gets the value of the modifierOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getModifierOutputOption() {
        return modifierOutputOption;
    }

    /**
     * Sets the value of the modifierOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setModifierOutputOption(OutputOptionType value) {
        this.modifierOutputOption = value;
    }

}
