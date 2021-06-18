//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:40:38 PM BST 
//


package _int.iho.s100ci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * V. 4.0.0: as defined in 19115-3 with the optional "extent" attribute omitted.
 * 
 * <p>Java class for CI_Responsibility_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Responsibility_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.iho.int/S100CI}S100_RoleCode_PropertyType"/&gt;
 *         &lt;element name="party" type="{http://www.iho.int/S100CI}AbstractCI_Party_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Responsibility_Type", propOrder = {
    "role",
    "party"
})
public class CIResponsibilityType {

    @XmlElement(required = true)
    protected S100RoleCodePropertyType role;
    @XmlElement(required = true)
    protected List<AbstractCIPartyPropertyType> party;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link S100RoleCodePropertyType }
     *     
     */
    public S100RoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100RoleCodePropertyType }
     *     
     */
    public void setRole(S100RoleCodePropertyType value) {
        this.role = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCIPartyPropertyType }
     * 
     * 
     */
    public List<AbstractCIPartyPropertyType> getParty() {
        if (party == null) {
            party = new ArrayList<AbstractCIPartyPropertyType>();
        }
        return this.party;
    }

}
