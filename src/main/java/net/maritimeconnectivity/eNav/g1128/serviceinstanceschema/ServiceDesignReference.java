//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.14 at 11:16:45 AM CEST 
//


package net.maritimeconnectivity.eNav.g1128.serviceinstanceschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A reference to the service design that is implemented by the service instance.
 *                 Has the id and the version of the respective service design.
 * 
 *                 Elements of a ServiceDesignReference are:
 * 
 *                 - id Identification of the service design implemented by the service instance.
 * 
 *                 - version Version of the service design implemented by the service instance.
 *             
 * 
 * <p>Java class for ServiceDesignReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDesignReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://iala-aism.org/g1128/v1/ServiceSpecificationSchema.xsd}ServiceIdentifier"/&gt;
 *         &lt;element name="version" type="{http://iala-aism.org/g1128/v1/ServiceSpecificationSchema.xsd}ServiceVersion"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDesignReference", propOrder = {

})
public class ServiceDesignReference {

    /**
     * Identification of the service design implemented by the service instance.
     */
    @XmlElement(required = true)
    protected String id;
    /**
     * Version of the service design implemented by the service instance.
     */
    @XmlElement(required = true)
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
