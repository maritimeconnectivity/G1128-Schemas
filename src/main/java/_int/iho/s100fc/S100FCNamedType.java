//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100fc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_NamedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_NamedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC}S100_FC_Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeBinding" type="{http://www.iho.int/S100FC}S100_FC_AttributeBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_NamedType", propOrder = {
    "attributeBindings"
})
@XmlSeeAlso({
    S100FCInformationAssociation.class,
    S100FCFeatureAssociation.class,
    S100FCObjectType.class
})
public abstract class S100FCNamedType
    extends S100FCItem
{

    @XmlElement(name = "attributeBinding")
    protected List<S100FCAttributeBinding> attributeBindings;
    @XmlAttribute(name = "isAbstract")
    protected Boolean isAbstract;

    /**
     * Gets the value of the attributeBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCAttributeBinding }
     * 
     * 
     */
    public List<S100FCAttributeBinding> getAttributeBindings() {
        if (attributeBindings == null) {
            attributeBindings = new ArrayList<S100FCAttributeBinding>();
        }
        return this.attributeBindings;
    }

    /**
     * Gets the value of the isAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAbstract() {
        if (isAbstract == null) {
            return false;
        } else {
            return isAbstract;
        }
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstract(Boolean value) {
        this.isAbstract = value;
    }

}
