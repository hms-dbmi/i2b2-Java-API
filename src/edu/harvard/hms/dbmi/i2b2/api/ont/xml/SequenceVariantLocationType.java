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
 * <p>Java class for sequenceVariantLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sequenceVariantLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlankingSeq_5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FlankingSeq_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GeneId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GeneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceGenomeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accessions" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}accessionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sequenceVariantLocationType", propOrder = {
    "flankingSeq5",
    "flankingSeq3",
    "geneId",
    "geneName",
    "referenceGenomeVersion",
    "regionName",
    "regionType",
    "accessions"
})
public class SequenceVariantLocationType {

    @XmlElement(name = "FlankingSeq_5", required = true)
    protected String flankingSeq5;
    @XmlElement(name = "FlankingSeq_3", required = true)
    protected String flankingSeq3;
    @XmlElement(name = "GeneId", required = true)
    protected String geneId;
    @XmlElement(name = "GeneName", required = true)
    protected String geneName;
    @XmlElement(name = "ReferenceGenomeVersion", required = true)
    protected String referenceGenomeVersion;
    @XmlElement(name = "RegionName", required = true)
    protected String regionName;
    @XmlElement(name = "RegionType", required = true)
    protected String regionType;
    @XmlElement(name = "Accessions", required = true)
    protected AccessionsType accessions;

    /**
     * Gets the value of the flankingSeq5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlankingSeq5() {
        return flankingSeq5;
    }

    /**
     * Sets the value of the flankingSeq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlankingSeq5(String value) {
        this.flankingSeq5 = value;
    }

    /**
     * Gets the value of the flankingSeq3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlankingSeq3() {
        return flankingSeq3;
    }

    /**
     * Sets the value of the flankingSeq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlankingSeq3(String value) {
        this.flankingSeq3 = value;
    }

    /**
     * Gets the value of the geneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneId() {
        return geneId;
    }

    /**
     * Sets the value of the geneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneId(String value) {
        this.geneId = value;
    }

    /**
     * Gets the value of the geneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneName() {
        return geneName;
    }

    /**
     * Sets the value of the geneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneName(String value) {
        this.geneName = value;
    }

    /**
     * Gets the value of the referenceGenomeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceGenomeVersion() {
        return referenceGenomeVersion;
    }

    /**
     * Sets the value of the referenceGenomeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceGenomeVersion(String value) {
        this.referenceGenomeVersion = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionType(String value) {
        this.regionType = value;
    }

    /**
     * Gets the value of the accessions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessionsType }
     *     
     */
    public AccessionsType getAccessions() {
        return accessions;
    }

    /**
     * Sets the value of the accessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessionsType }
     *     
     */
    public void setAccessions(AccessionsType value) {
        this.accessions = value;
    }

}
