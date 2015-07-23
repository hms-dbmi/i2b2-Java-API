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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="load_observation_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}fact_load_optionType"/>
 *         &lt;element name="load_event_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_patient_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_pid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_eid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *         &lt;element name="load_modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_optionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="commit_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="clear_temp_load_tables" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadType", propOrder = {
    "loadObservationSet",
    "loadEventSet",
    "loadPatientSet",
    "loadObserverSet",
    "loadPidSet",
    "loadEidSet",
    "loadConceptSet",
    "loadModifierSet"
})
public class LoadType {

    @XmlElement(name = "load_observation_set", required = true)
    protected FactLoadOptionType loadObservationSet;
    @XmlElement(name = "load_event_set", required = true)
    protected LoadOptionType loadEventSet;
    @XmlElement(name = "load_patient_set", required = true)
    protected LoadOptionType loadPatientSet;
    @XmlElement(name = "load_observer_set", required = true)
    protected LoadOptionType loadObserverSet;
    @XmlElement(name = "load_pid_set", required = true)
    protected LoadOptionType loadPidSet;
    @XmlElement(name = "load_eid_set", required = true)
    protected LoadOptionType loadEidSet;
    @XmlElement(name = "load_concept_set", required = true)
    protected LoadOptionType loadConceptSet;
    @XmlElement(name = "load_modifier_set", required = true)
    protected LoadOptionType loadModifierSet;
    @XmlAttribute(name = "commit_flag")
    protected Boolean commitFlag;
    @XmlAttribute(name = "clear_temp_load_tables")
    protected Boolean clearTempLoadTables;

    /**
     * Gets the value of the loadObservationSet property.
     * 
     * @return
     *     possible object is
     *     {@link FactLoadOptionType }
     *     
     */
    public FactLoadOptionType getLoadObservationSet() {
        return loadObservationSet;
    }

    /**
     * Sets the value of the loadObservationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactLoadOptionType }
     *     
     */
    public void setLoadObservationSet(FactLoadOptionType value) {
        this.loadObservationSet = value;
    }

    /**
     * Gets the value of the loadEventSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadEventSet() {
        return loadEventSet;
    }

    /**
     * Sets the value of the loadEventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadEventSet(LoadOptionType value) {
        this.loadEventSet = value;
    }

    /**
     * Gets the value of the loadPatientSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadPatientSet() {
        return loadPatientSet;
    }

    /**
     * Sets the value of the loadPatientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadPatientSet(LoadOptionType value) {
        this.loadPatientSet = value;
    }

    /**
     * Gets the value of the loadObserverSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadObserverSet() {
        return loadObserverSet;
    }

    /**
     * Sets the value of the loadObserverSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadObserverSet(LoadOptionType value) {
        this.loadObserverSet = value;
    }

    /**
     * Gets the value of the loadPidSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadPidSet() {
        return loadPidSet;
    }

    /**
     * Sets the value of the loadPidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadPidSet(LoadOptionType value) {
        this.loadPidSet = value;
    }

    /**
     * Gets the value of the loadEidSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadEidSet() {
        return loadEidSet;
    }

    /**
     * Sets the value of the loadEidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadEidSet(LoadOptionType value) {
        this.loadEidSet = value;
    }

    /**
     * Gets the value of the loadConceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadConceptSet() {
        return loadConceptSet;
    }

    /**
     * Sets the value of the loadConceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadConceptSet(LoadOptionType value) {
        this.loadConceptSet = value;
    }

    /**
     * Gets the value of the loadModifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link LoadOptionType }
     *     
     */
    public LoadOptionType getLoadModifierSet() {
        return loadModifierSet;
    }

    /**
     * Sets the value of the loadModifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadOptionType }
     *     
     */
    public void setLoadModifierSet(LoadOptionType value) {
        this.loadModifierSet = value;
    }

    /**
     * Gets the value of the commitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommitFlag() {
        if (commitFlag == null) {
            return true;
        } else {
            return commitFlag;
        }
    }

    /**
     * Sets the value of the commitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitFlag(Boolean value) {
        this.commitFlag = value;
    }

    /**
     * Gets the value of the clearTempLoadTables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClearTempLoadTables() {
        if (clearTempLoadTables == null) {
            return false;
        } else {
            return clearTempLoadTables;
        }
    }

    /**
     * Sets the value of the clearTempLoadTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearTempLoadTables(Boolean value) {
        this.clearTempLoadTables = value;
    }

}
