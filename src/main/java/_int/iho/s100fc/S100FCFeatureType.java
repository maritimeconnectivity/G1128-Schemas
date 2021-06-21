//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package _int.iho.s100fc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100fd.S100CDFeatureUseType;


/**
 * <p>Java class for S100_FC_FeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_FeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC}S100_FC_ObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="superType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="featureUseType" type="{http://www.iho.int/S100FD}S100_CD_FeatureUseType"/&gt;
 *         &lt;element name="featureBinding" type="{http://www.iho.int/S100FC}S100_FC_FeatureBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="permittedPrimitives" type="{http://www.iho.int/S100FC}S100_FC_SpatialPrimitiveType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_FeatureType", propOrder = {
    "superType",
    "subTypes",
    "featureUseType",
    "featureBindings",
    "permittedPrimitives"
})
public class S100FCFeatureType
    extends S100FCObjectType
{

    protected String superType;
    @XmlElement(name = "subType")
    protected List<String> subTypes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected S100CDFeatureUseType featureUseType;
    @XmlElement(name = "featureBinding")
    protected List<S100FCFeatureBinding> featureBindings;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<S100FCSpatialPrimitiveType> permittedPrimitives;

    /**
     * Gets the value of the superType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperType() {
        return superType;
    }

    /**
     * Sets the value of the superType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperType(String value) {
        this.superType = value;
    }

    /**
     * Gets the value of the subTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubTypes() {
        if (subTypes == null) {
            subTypes = new ArrayList<String>();
        }
        return this.subTypes;
    }

    /**
     * Gets the value of the featureUseType property.
     * 
     * @return
     *     possible object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public S100CDFeatureUseType getFeatureUseType() {
        return featureUseType;
    }

    /**
     * Sets the value of the featureUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100CDFeatureUseType }
     *     
     */
    public void setFeatureUseType(S100CDFeatureUseType value) {
        this.featureUseType = value;
    }

    /**
     * Gets the value of the featureBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCFeatureBinding }
     * 
     * 
     */
    public List<S100FCFeatureBinding> getFeatureBindings() {
        if (featureBindings == null) {
            featureBindings = new ArrayList<S100FCFeatureBinding>();
        }
        return this.featureBindings;
    }

    /**
     * Gets the value of the permittedPrimitives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permittedPrimitives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedPrimitives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCSpatialPrimitiveType }
     * 
     * 
     */
    public List<S100FCSpatialPrimitiveType> getPermittedPrimitives() {
        if (permittedPrimitives == null) {
            permittedPrimitives = new ArrayList<S100FCSpatialPrimitiveType>();
        }
        return this.permittedPrimitives;
    }

}
