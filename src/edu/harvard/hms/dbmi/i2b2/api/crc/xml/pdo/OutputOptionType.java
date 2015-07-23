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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output_optionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output_optionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="onlykeys" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="blob" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="techdata" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="select" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionSelectType" default="using_filter_list" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "output_optionType")
@XmlSeeAlso({
    DimensionOutputOptionType.class,
    FactOutputOptionType.class
})
public class OutputOptionType {

    @XmlAttribute(name = "onlykeys")
    protected Boolean onlykeys;
    @XmlAttribute(name = "blob")
    protected Boolean blob;
    @XmlAttribute(name = "techdata")
    protected Boolean techdata;
    @XmlAttribute(name = "select")
    protected OutputOptionSelectType select;

    /**
     * Gets the value of the onlykeys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOnlykeys() {
        if (onlykeys == null) {
            return true;
        } else {
            return onlykeys;
        }
    }

    /**
     * Sets the value of the onlykeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlykeys(Boolean value) {
        this.onlykeys = value;
    }

    /**
     * Gets the value of the blob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBlob() {
        if (blob == null) {
            return false;
        } else {
            return blob;
        }
    }

    /**
     * Sets the value of the blob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlob(Boolean value) {
        this.blob = value;
    }

    /**
     * Gets the value of the techdata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTechdata() {
        if (techdata == null) {
            return false;
        } else {
            return techdata;
        }
    }

    /**
     * Sets the value of the techdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTechdata(Boolean value) {
        this.techdata = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionSelectType }
     *     
     */
    public OutputOptionSelectType getSelect() {
        if (select == null) {
            return OutputOptionSelectType.USING_FILTER_LIST;
        } else {
            return select;
        }
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionSelectType }
     *     
     */
    public void setSelect(OutputOptionSelectType value) {
        this.select = value;
    }

}
