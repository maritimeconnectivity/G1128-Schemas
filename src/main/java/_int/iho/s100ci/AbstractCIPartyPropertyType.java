//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.10 at 12:40:55 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractCI_Party_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCI_Party_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.iho.int/S100CI}AbstractCI_Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCI_Party_PropertyType", propOrder = {
    "abstractCIParty"
})
public class AbstractCIPartyPropertyType {

    @XmlElementRef(name = "AbstractCI_Party", namespace = "http://www.iho.int/S100CI", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCIPartyType> abstractCIParty;

    /**
     * Gets the value of the abstractCIParty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CIIndividualType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CIOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCIPartyType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCIPartyType> getAbstractCIParty() {
        return abstractCIParty;
    }

    /**
     * Sets the value of the abstractCIParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CIIndividualType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CIOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCIPartyType }{@code >}
     *     
     */
    public void setAbstractCIParty(JAXBElement<? extends AbstractCIPartyType> value) {
        this.abstractCIParty = value;
    }

}
