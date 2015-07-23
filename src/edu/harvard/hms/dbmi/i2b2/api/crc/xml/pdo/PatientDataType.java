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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patient_dataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}event_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}concept_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}modifier_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}observer_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}pid_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}eid_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}patient_set"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}observation_set" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_dataType", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", propOrder = {
    "eventSet",
    "conceptSet",
    "modifierSet",
    "observerSet",
    "pidSet",
    "eidSet",
    "patientSet",
    "observationSet"
})
public class PatientDataType {

    @XmlElement(name = "event_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected EventSet eventSet;
    @XmlElement(name = "concept_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected ConceptSet conceptSet;
    @XmlElement(name = "modifier_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected ModifierSet modifierSet;
    @XmlElement(name = "observer_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected ObserverSet observerSet;
    @XmlElement(name = "pid_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected PidSet pidSet;
    @XmlElement(name = "eid_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected EidSet eidSet;
    @XmlElement(name = "patient_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected PatientSet patientSet;
    @XmlElement(name = "observation_set", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected List<ObservationSet> observationSet;

    /**
     * Gets the value of the eventSet property.
     * 
     * @return
     *     possible object is
     *     {@link EventSet }
     *     
     */
    public EventSet getEventSet() {
        return eventSet;
    }

    /**
     * Sets the value of the eventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSet }
     *     
     */
    public void setEventSet(EventSet value) {
        this.eventSet = value;
    }

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptSet }
     *     
     */
    public ConceptSet getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptSet }
     *     
     */
    public void setConceptSet(ConceptSet value) {
        this.conceptSet = value;
    }

    /**
     * Gets the value of the modifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link ModifierSet }
     *     
     */
    public ModifierSet getModifierSet() {
        return modifierSet;
    }

    /**
     * Sets the value of the modifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifierSet }
     *     
     */
    public void setModifierSet(ModifierSet value) {
        this.modifierSet = value;
    }

    /**
     * Gets the value of the observerSet property.
     * 
     * @return
     *     possible object is
     *     {@link ObserverSet }
     *     
     */
    public ObserverSet getObserverSet() {
        return observerSet;
    }

    /**
     * Sets the value of the observerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObserverSet }
     *     
     */
    public void setObserverSet(ObserverSet value) {
        this.observerSet = value;
    }

    /**
     * Gets the value of the pidSet property.
     * 
     * @return
     *     possible object is
     *     {@link PidSet }
     *     
     */
    public PidSet getPidSet() {
        return pidSet;
    }

    /**
     * Sets the value of the pidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PidSet }
     *     
     */
    public void setPidSet(PidSet value) {
        this.pidSet = value;
    }

    /**
     * Gets the value of the eidSet property.
     * 
     * @return
     *     possible object is
     *     {@link EidSet }
     *     
     */
    public EidSet getEidSet() {
        return eidSet;
    }

    /**
     * Sets the value of the eidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EidSet }
     *     
     */
    public void setEidSet(EidSet value) {
        this.eidSet = value;
    }

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSet }
     *     
     */
    public PatientSet getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSet }
     *     
     */
    public void setPatientSet(PatientSet value) {
        this.patientSet = value;
    }

    /**
     * Gets the value of the observationSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationSet }
     * 
     * 
     */
    public List<ObservationSet> getObservationSet() {
        if (observationSet == null) {
            observationSet = new ArrayList<ObservationSet>();
        }
        return this.observationSet;
    }

}
