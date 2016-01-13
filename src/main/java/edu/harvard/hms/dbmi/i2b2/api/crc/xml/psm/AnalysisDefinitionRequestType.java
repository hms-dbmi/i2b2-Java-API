/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for analysis_definition_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="analysis_definition_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="analysis_definition" type="{http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/}analysis_definitionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analysis_definition_requestType", propOrder = {
    "analysisDefinition"
})
public class AnalysisDefinitionRequestType
    extends RequestType
{

    @XmlElement(name = "analysis_definition", required = true)
    protected AnalysisDefinitionType analysisDefinition;

    /**
     * Gets the value of the analysisDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisDefinitionType }
     *     
     */
    public AnalysisDefinitionType getAnalysisDefinition() {
        return analysisDefinition;
    }

    /**
     * Sets the value of the analysisDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisDefinitionType }
     *     
     */
    public void setAnalysisDefinition(AnalysisDefinitionType value) {
        this.analysisDefinition = value;
    }

}
