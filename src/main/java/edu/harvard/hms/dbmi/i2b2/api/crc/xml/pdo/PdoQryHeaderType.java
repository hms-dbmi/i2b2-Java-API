/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pdo_qry_headerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdo_qry_headerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}headerType">
 *       &lt;sequence>
 *         &lt;element name="request_type" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pdoRequest_typeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdo_qry_headerType", propOrder = {
    "requestType"
})
public class PdoQryHeaderType
    extends HeaderType
{

    @XmlElement(name = "request_type", required = true)
    @XmlSchemaType(name = "string")
    protected PdoRequestTypeType requestType;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link PdoRequestTypeType }
     *     
     */
    public PdoRequestTypeType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdoRequestTypeType }
     *     
     */
    public void setRequestType(PdoRequestTypeType value) {
        this.requestType = value;
    }

}
