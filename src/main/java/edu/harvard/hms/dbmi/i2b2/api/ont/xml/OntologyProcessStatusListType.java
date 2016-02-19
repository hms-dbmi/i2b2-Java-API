/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ontologyProcessStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ontologyProcessStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ontology_process_status" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}ontologyProcessStatusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ontologyProcessStatusListType", propOrder = {
    "ontologyProcessStatus"
})
public class OntologyProcessStatusListType {

    @XmlElement(name = "ontology_process_status", required = true)
    protected List<OntologyProcessStatusType> ontologyProcessStatus;

    /**
     * Gets the value of the ontologyProcessStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ontologyProcessStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOntologyProcessStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OntologyProcessStatusType }
     * 
     * 
     */
    public List<OntologyProcessStatusType> getOntologyProcessStatus() {
        if (ontologyProcessStatus == null) {
            ontologyProcessStatus = new ArrayList<OntologyProcessStatusType>();
        }
        return this.ontologyProcessStatus;
    }

}
