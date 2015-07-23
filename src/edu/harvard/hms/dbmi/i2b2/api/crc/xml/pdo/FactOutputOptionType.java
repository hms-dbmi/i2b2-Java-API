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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for fact_output_optionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fact_output_optionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType">
 *       &lt;attribute name="before" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="after" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="selectionfilter" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionSelectionFilterType" />
 *       &lt;attribute name="withmodifiers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fact_output_optionType")
public class FactOutputOptionType
    extends OutputOptionType
{

    @XmlAttribute(name = "before")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar before;
    @XmlAttribute(name = "after")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar after;
    @XmlAttribute(name = "value")
    protected Integer value;
    @XmlAttribute(name = "selectionfilter")
    protected OutputOptionSelectionFilterType selectionfilter;
    @XmlAttribute(name = "withmodifiers")
    protected Boolean withmodifiers;

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBefore(XMLGregorianCalendar value) {
        this.before = value;
    }

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAfter(XMLGregorianCalendar value) {
        this.after = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Gets the value of the selectionfilter property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionSelectionFilterType }
     *     
     */
    public OutputOptionSelectionFilterType getSelectionfilter() {
        return selectionfilter;
    }

    /**
     * Sets the value of the selectionfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionSelectionFilterType }
     *     
     */
    public void setSelectionfilter(OutputOptionSelectionFilterType value) {
        this.selectionfilter = value;
    }

    /**
     * Gets the value of the withmodifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWithmodifiers() {
        if (withmodifiers == null) {
            return true;
        } else {
            return withmodifiers;
        }
    }

    /**
     * Sets the value of the withmodifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithmodifiers(Boolean value) {
        this.withmodifiers = value;
    }

}
