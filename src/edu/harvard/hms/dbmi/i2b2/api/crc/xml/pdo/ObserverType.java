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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for observerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="observerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observer_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observer_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name_char" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observer_blob" type="{http://www.i2b2.org/xsd/hive/pdo/1.1/}blobType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "observerType", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", propOrder = {
    "observerPath",
    "observerCd",
    "nameChar",
    "observerBlob"
})
public class ObserverType {

    @XmlElement(name = "observer_path", required = true)
    protected String observerPath;
    @XmlElement(name = "observer_cd", required = true)
    protected String observerCd;
    @XmlElement(name = "name_char", required = true)
    protected String nameChar;
    @XmlElement(name = "observer_blob")
    protected BlobType observerBlob;
    @XmlAttribute(name = "update_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "download_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar downloadDate;
    @XmlAttribute(name = "import_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importDate;
    @XmlAttribute(name = "sourcesystem_cd")
    protected String sourcesystemCd;
    @XmlAttribute(name = "upload_id")
    protected String uploadId;

    /**
     * Gets the value of the observerPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverPath() {
        return observerPath;
    }

    /**
     * Sets the value of the observerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverPath(String value) {
        this.observerPath = value;
    }

    /**
     * Gets the value of the observerCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverCd() {
        return observerCd;
    }

    /**
     * Sets the value of the observerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverCd(String value) {
        this.observerCd = value;
    }

    /**
     * Gets the value of the nameChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameChar() {
        return nameChar;
    }

    /**
     * Sets the value of the nameChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameChar(String value) {
        this.nameChar = value;
    }

    /**
     * Gets the value of the observerBlob property.
     * 
     * @return
     *     possible object is
     *     {@link BlobType }
     *     
     */
    public BlobType getObserverBlob() {
        return observerBlob;
    }

    /**
     * Sets the value of the observerBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobType }
     *     
     */
    public void setObserverBlob(BlobType value) {
        this.observerBlob = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the downloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloadDate() {
        return downloadDate;
    }

    /**
     * Sets the value of the downloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloadDate(XMLGregorianCalendar value) {
        this.downloadDate = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportDate(XMLGregorianCalendar value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the sourcesystemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcesystemCd() {
        return sourcesystemCd;
    }

    /**
     * Sets the value of the sourcesystemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcesystemCd(String value) {
        this.sourcesystemCd = value;
    }

    /**
     * Gets the value of the uploadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the value of the uploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadId(String value) {
        this.uploadId = value;
    }

}
