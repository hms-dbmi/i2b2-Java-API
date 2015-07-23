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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for load_optionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="load_optionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="encrypt_blob" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ignore_bad_data" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="delete_existing_data" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "load_optionType")
@XmlSeeAlso({
    FactLoadOptionType.class
})
public class LoadOptionType {

    @XmlAttribute(name = "encrypt_blob")
    protected Boolean encryptBlob;
    @XmlAttribute(name = "ignore_bad_data")
    protected Boolean ignoreBadData;
    @XmlAttribute(name = "delete_existing_data")
    protected Boolean deleteExistingData;

    /**
     * Gets the value of the encryptBlob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEncryptBlob() {
        if (encryptBlob == null) {
            return false;
        } else {
            return encryptBlob;
        }
    }

    /**
     * Sets the value of the encryptBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptBlob(Boolean value) {
        this.encryptBlob = value;
    }

    /**
     * Gets the value of the ignoreBadData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreBadData() {
        if (ignoreBadData == null) {
            return true;
        } else {
            return ignoreBadData;
        }
    }

    /**
     * Sets the value of the ignoreBadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBadData(Boolean value) {
        this.ignoreBadData = value;
    }

    /**
     * Gets the value of the deleteExistingData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeleteExistingData() {
        if (deleteExistingData == null) {
            return false;
        } else {
            return deleteExistingData;
        }
    }

    /**
     * Sets the value of the deleteExistingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteExistingData(Boolean value) {
        this.deleteExistingData = value;
    }

}
