//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 If the service is S-100 compliant it shall link to an existing Feature Catalogue in the
 *                 featureCatalogue element. The other elements are then not used.
 *                 If the service is not S-100 compliant: The serviceDataModel is formally described in the
 *                 sub-element modelDefinition to achieve interoperability and decouple it from implementing physical
 *                 data models described in e.g. SOAP or REST. Encodings are formally described using sub-element
 *                 encoding. The model can either be described in-line, or existing schemata can be imported.
 *                 One service specification has one logical service model. Sub-element modelDefinition has to be
 *                 provided. Elements of a serviceDataModel are:
 *                 - featureCatalogue Reference to an S-100 compliant logical data model description. To be used to
 *                 be S-100 compliant, otherwise the modelDefinition attribute has to be used
 *                 - modelDefinition Only used if not S-100 compliant. The definition of the service data model
 *                 described
 *                 - encoding Only used if not S-100 compliant. The encoding of the attribute modelDefinition
 *             
 * 
 * <p>Java class for ServiceDataModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDataModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="modelDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDataModel", propOrder = {

})
public class ServiceDataModel {

    protected String modelDefinition;
    protected String encoding;

    /**
     * Gets the value of the modelDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDefinition() {
        return modelDefinition;
    }

    /**
     * Sets the value of the modelDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDefinition(String value) {
        this.modelDefinition = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
