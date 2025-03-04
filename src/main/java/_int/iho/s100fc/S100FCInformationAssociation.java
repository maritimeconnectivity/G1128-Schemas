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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_InformationAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_InformationAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC}S100_FC_NamedType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="superType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://www.iho.int/S100FC}Reference" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_InformationAssociation", propOrder = {
    "superType",
    "subTypes",
    "roles"
})
public class S100FCInformationAssociation
    extends S100FCNamedType
{

    protected String superType;
    @XmlElement(name = "subType")
    protected List<String> subTypes;
    @XmlElement(name = "role")
    protected List<Reference> roles;

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
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getRoles() {
        if (roles == null) {
            roles = new ArrayList<Reference>();
        }
        return this.roles;
    }

}
