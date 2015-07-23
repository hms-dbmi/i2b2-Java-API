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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for constrainDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constrainDateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="time" use="required" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}constrainDateTimeType" />
 *       &lt;attribute name="inclusive" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}inclusiveType" default="YES" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constrainDateType", propOrder = {
    "value"
})
public class ConstrainDateType {

    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "time", required = true)
    protected ConstrainDateTimeType time;
    @XmlAttribute(name = "inclusive")
    protected InclusiveType inclusive;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link ConstrainDateTimeType }
     *     
     */
    public ConstrainDateTimeType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstrainDateTimeType }
     *     
     */
    public void setTime(ConstrainDateTimeType value) {
        this.time = value;
    }

    /**
     * Gets the value of the inclusive property.
     * 
     * @return
     *     possible object is
     *     {@link InclusiveType }
     *     
     */
    public InclusiveType getInclusive() {
        if (inclusive == null) {
            return InclusiveType.YES;
        } else {
            return inclusive;
        }
    }

    /**
     * Sets the value of the inclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusiveType }
     *     
     */
    public void setInclusive(InclusiveType value) {
        this.inclusive = value;
    }

}
