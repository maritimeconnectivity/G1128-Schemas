//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import _int.iho.s100base.Locale;
import _int.iho.s100ci.CIOnlineResourceType;


/**
 * <p>Java class for RegisterInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatingLanguage" type="{http://www.iho.int/S100Base}Locale"/&gt;
 *         &lt;element name="contentSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URI" type="{http://www.iho.int/S100CI}CI_OnlineResource_Type"/&gt;
 *         &lt;element name="dateOfLastChange" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterInformation", propOrder = {
    "operatingLanguage",
    "contentSummary",
    "uri",
    "dateOfLastChange"
})
public class RegisterInformation {

    @XmlElement(required = true)
    protected Locale operatingLanguage;
    protected String contentSummary;
    @XmlElement(name = "URI", required = true)
    protected CIOnlineResourceType uri;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfLastChange;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the operatingLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getOperatingLanguage() {
        return operatingLanguage;
    }

    /**
     * Sets the value of the operatingLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setOperatingLanguage(Locale value) {
        this.operatingLanguage = value;
    }

    /**
     * Gets the value of the contentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentSummary() {
        return contentSummary;
    }

    /**
     * Sets the value of the contentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentSummary(String value) {
        this.contentSummary = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourceType }
     *     
     */
    public CIOnlineResourceType getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourceType }
     *     
     */
    public void setURI(CIOnlineResourceType value) {
        this.uri = value;
    }

    /**
     * Gets the value of the dateOfLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLastChange() {
        return dateOfLastChange;
    }

    /**
     * Sets the value of the dateOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLastChange(XMLGregorianCalendar value) {
        this.dateOfLastChange = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
