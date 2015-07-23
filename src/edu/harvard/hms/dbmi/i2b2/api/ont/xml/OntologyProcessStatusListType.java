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
