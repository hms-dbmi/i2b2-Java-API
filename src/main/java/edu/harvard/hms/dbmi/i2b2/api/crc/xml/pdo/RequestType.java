/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * requestType is abstract so a concrete type must be declared in the
 *                 instance document using the xsi:type attribute.
 * 
 * <p>Java class for requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestType")
@XmlSeeAlso({
    GetPDOFromInputListRequestType.class,
    GetObservationFactByPrimaryKeyRequestType.class,
    GetPatientByPrimaryKeyRequestType.class,
    GetModifierByPrimaryKeyRequestType.class,
    GetConceptByPrimaryKeyRequestType.class,
    GetObserverByPrimaryKeyRequestType.class,
    GetEventByPrimaryKeyRequestType.class,
    GetPDOTemplateRequestType.class
})
public abstract class RequestType {


}
