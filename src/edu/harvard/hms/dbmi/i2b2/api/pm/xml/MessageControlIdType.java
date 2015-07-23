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

package edu.harvard.hms.dbmi.i2b2.api.pm.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message_control_idType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message_control_idType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instance_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message_control_idType", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "sessionId",
    "messageNum",
    "instanceNum"
})
public class MessageControlIdType {

    @XmlElement(name = "session_id", required = true)
    protected String sessionId;
    @XmlElement(name = "message_num", required = true)
    protected String messageNum;
    @XmlElement(name = "instance_num")
    protected int instanceNum;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the messageNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNum() {
        return messageNum;
    }

    /**
     * Sets the value of the messageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageNum(String value) {
        this.messageNum = value;
    }

    /**
     * Gets the value of the instanceNum property.
     * 
     */
    public int getInstanceNum() {
        return instanceNum;
    }

    /**
     * Sets the value of the instanceNum property.
     * 
     */
    public void setInstanceNum(int value) {
        this.instanceNum = value;
    }

}
