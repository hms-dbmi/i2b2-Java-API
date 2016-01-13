/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

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
