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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result_statusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result_statusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}statusType"/>
 *         &lt;element name="polling_url" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}polling_urlType"/>
 *         &lt;element name="conditions" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}conditionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result_statusType", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "status",
    "pollingUrl",
    "conditions"
})
public class ResultStatusType {

    @XmlElement(required = true)
    protected StatusType status;
    @XmlElement(name = "polling_url", required = true)
    protected PollingUrlType pollingUrl;
    @XmlElement(required = true)
    protected ConditionsType conditions;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the pollingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link PollingUrlType }
     *     
     */
    public PollingUrlType getPollingUrl() {
        return pollingUrl;
    }

    /**
     * Sets the value of the pollingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollingUrlType }
     *     
     */
    public void setPollingUrl(PollingUrlType value) {
        this.pollingUrl = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsType }
     *     
     */
    public ConditionsType getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsType }
     *     
     */
    public void setConditions(ConditionsType value) {
        this.conditions = value;
    }

}
