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
 * <p>Java class for S100_FC_ComplexAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_ComplexAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S100_FC_ComplexAttribute" type="{http://www.iho.int/S100FC}S100_FC_ComplexAttribute" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_ComplexAttributes", propOrder = {
    "s100FCComplexAttributes"
})
public class S100FCComplexAttributes {

    @XmlElement(name = "S100_FC_ComplexAttribute", required = true)
    protected List<S100FCComplexAttribute> s100FCComplexAttributes;

    /**
     * Gets the value of the s100FCComplexAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s100FCComplexAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS100FCComplexAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCComplexAttribute }
     * 
     * 
     */
    public List<S100FCComplexAttribute> getS100FCComplexAttributes() {
        if (s100FCComplexAttributes == null) {
            s100FCComplexAttributes = new ArrayList<S100FCComplexAttribute>();
        }
        return this.s100FCComplexAttributes;
    }

}
