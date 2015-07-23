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
 * <p>Java class for GetEventByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="event_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}event_primary_key_Type"/>
 *         &lt;element name="event_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEventByPrimaryKey_requestType", propOrder = {
    "eventPrimaryKey",
    "eventOutputOption"
})
public class GetEventByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "event_primary_key", required = true)
    protected EventPrimaryKeyType eventPrimaryKey;
    @XmlElement(name = "event_output_option", required = true)
    protected OutputOptionType eventOutputOption;

    /**
     * Gets the value of the eventPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link EventPrimaryKeyType }
     *     
     */
    public EventPrimaryKeyType getEventPrimaryKey() {
        return eventPrimaryKey;
    }

    /**
     * Sets the value of the eventPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPrimaryKeyType }
     *     
     */
    public void setEventPrimaryKey(EventPrimaryKeyType value) {
        this.eventPrimaryKey = value;
    }

    /**
     * Gets the value of the eventOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEventOutputOption() {
        return eventOutputOption;
    }

    /**
     * Sets the value of the eventOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEventOutputOption(OutputOptionType value) {
        this.eventOutputOption = value;
    }

}
