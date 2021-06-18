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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI_Organisation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_Organisation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100CI}AbstractCI_Party_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individual" type="{http://www.iho.int/S100CI}CI_Individual_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Organisation_Type", propOrder = {
    "individual"
})
public class CIOrganisationType
    extends AbstractCIPartyType
{

    protected List<CIIndividualPropertyType> individual;

    /**
     * Gets the value of the individual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIIndividualPropertyType }
     * 
     * 
     */
    public List<CIIndividualPropertyType> getIndividual() {
        if (individual == null) {
            individual = new ArrayList<CIIndividualPropertyType>();
        }
        return this.individual;
    }

}
