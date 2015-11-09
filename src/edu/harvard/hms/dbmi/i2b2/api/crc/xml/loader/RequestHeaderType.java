/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request_headerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request_headerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_waittime_ms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request_headerType", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "resultWaittimeMs"
})
public class RequestHeaderType {

    @XmlElement(name = "result_waittime_ms")
    protected int resultWaittimeMs;

    /**
     * Gets the value of the resultWaittimeMs property.
     * 
     */
    public int getResultWaittimeMs() {
        return resultWaittimeMs;
    }

    /**
     * Sets the value of the resultWaittimeMs property.
     * 
     */
    public void setResultWaittimeMs(int value) {
        this.resultWaittimeMs = value;
    }

}
