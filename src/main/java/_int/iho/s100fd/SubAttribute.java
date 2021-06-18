//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:40:38 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100base.S100Multiplicity;


/**
 * <p>Java class for SubAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="camelCaseId" type="{http://www.iho.int/S100FD}CamelCaseId" minOccurs="0"/&gt;
 *         &lt;element name="cardinality" type="{http://www.iho.int/S100Base}S100_Multiplicity"/&gt;
 *         &lt;element name="sequential" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAttribute", propOrder = {
    "camelCaseId",
    "cardinality",
    "sequential"
})
public class SubAttribute {

    protected String camelCaseId;
    @XmlElement(required = true)
    protected S100Multiplicity cardinality;
    @XmlElement(defaultValue = "false")
    protected boolean sequential;
    @XmlAttribute(name = "attribute", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object attribute;

    /**
     * Gets the value of the camelCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamelCaseId() {
        return camelCaseId;
    }

    /**
     * Sets the value of the camelCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamelCaseId(String value) {
        this.camelCaseId = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link S100Multiplicity }
     *     
     */
    public S100Multiplicity getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100Multiplicity }
     *     
     */
    public void setCardinality(S100Multiplicity value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the sequential property.
     * 
     */
    public boolean isSequential() {
        return sequential;
    }

    /**
     * Sets the value of the sequential property.
     * 
     */
    public void setSequential(boolean value) {
        this.sequential = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttribute(Object value) {
        this.attribute = value;
    }

}
