//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:50:43 PM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100base.S100Multiplicity;


/**
 * 
 *                 Definition of a data type by providing a reference into the logical service data model.
 *                 A value type data model mapping is used either in a service operation parameter or return value.
 * 
 *                 Elements of a valueTypeDataModelMapping are:
 * 
 *                 - typeReference Reference to the logical service data model.
 *                 It references a type (or element, though type is preferred) in the logical
 *                 service model by the type's name attribute.
 * 
 *                 - parameter Reference to a S-100 parameter. Used if service is S-100 compliant.
 * 
 *                 - multiplicity Minimum and maximum number of provided instances, where the maximum number may be
 *                 infinitive.
 *                 If no multiplicity is provided a multiplicity of 1 is assumed.
 * 
 *                 - direction Determining the direction. Can be one of:
 *                 in
 *                 out
 *                 inout
 * 
 *                 - encoding Encoding of the parameter
 *             
 * 
 * <p>Java class for ValueTypeDataModelMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueTypeDataModelMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="typeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplicity" type="{http://www.iho.int/S100Base}S100_Multiplicity" minOccurs="0"/&gt;
 *         &lt;element name="direction" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="IN "/&gt;
 *               &lt;enumeration value="OUT"/&gt;
 *               &lt;enumeration value="INOUT"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "ValueTypeDataModelMapping", propOrder = {

})
public class ValueTypeDataModelMapping {

    protected String typeReference;
    protected S100Multiplicity multiplicity;
    protected String direction;
    protected String encoding;

    /**
     * Gets the value of the typeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeReference() {
        return typeReference;
    }

    /**
     * Sets the value of the typeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeReference(String value) {
        this.typeReference = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link S100Multiplicity }
     *     
     */
    public S100Multiplicity getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100Multiplicity }
     *     
     */
    public void setMultiplicity(S100Multiplicity value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
