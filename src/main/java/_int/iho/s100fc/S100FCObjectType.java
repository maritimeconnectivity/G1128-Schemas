//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:28:33 AM BST 
//


package _int.iho.s100fc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_ObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_ObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FC}S100_FC_NamedType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationBinding" type="{http://www.iho.int/S100FC}S100_FC_InformationBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_ObjectType", propOrder = {
    "informationBindings"
})
@XmlSeeAlso({
    S100FCInformationType.class,
    S100FCFeatureType.class
})
public abstract class S100FCObjectType
    extends S100FCNamedType
{

    @XmlElement(name = "informationBinding")
    protected List<S100FCInformationBinding> informationBindings;

    /**
     * Gets the value of the informationBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCInformationBinding }
     * 
     * 
     */
    public List<S100FCInformationBinding> getInformationBindings() {
        if (informationBindings == null) {
            informationBindings = new ArrayList<S100FCInformationBinding>();
        }
        return this.informationBindings;
    }

}
