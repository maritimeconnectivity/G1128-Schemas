//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package _int.iho.s100fd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_SimpleAttributeConcepts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_SimpleAttributeConcepts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S100_CD_SimpleAttributeConcept" type="{http://www.iho.int/S100FD}S100_CD_SimpleAttributeConcept" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_SimpleAttributeConcepts", propOrder = {
    "s100CDSimpleAttributeConcepts"
})
public class S100CDSimpleAttributeConcepts {

    @XmlElement(name = "S100_CD_SimpleAttributeConcept", required = true)
    protected List<S100CDSimpleAttributeConcept> s100CDSimpleAttributeConcepts;

    /**
     * Gets the value of the s100CDSimpleAttributeConcepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s100CDSimpleAttributeConcepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS100CDSimpleAttributeConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100CDSimpleAttributeConcept }
     * 
     * 
     */
    public List<S100CDSimpleAttributeConcept> getS100CDSimpleAttributeConcepts() {
        if (s100CDSimpleAttributeConcepts == null) {
            s100CDSimpleAttributeConcepts = new ArrayList<S100CDSimpleAttributeConcept>();
        }
        return this.s100CDSimpleAttributeConcepts;
    }

}
