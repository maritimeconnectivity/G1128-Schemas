//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package _int.iho.s100fd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_CD_EnumeratedValueConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CD_EnumeratedValueConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FD}S100_CD_RegisterItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numericCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="associatedAttribute" type="{http://www.iho.int/S100FD}CamelCaseId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CD_EnumeratedValueConcept", propOrder = {
    "numericCode",
    "associatedAttribute"
})
public class S100CDEnumeratedValueConcept
    extends S100CDRegisterItem
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numericCode;
    @XmlElement(required = true)
    protected String associatedAttribute;

    /**
     * Gets the value of the numericCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumericCode() {
        return numericCode;
    }

    /**
     * Sets the value of the numericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumericCode(BigInteger value) {
        this.numericCode = value;
    }

    /**
     * Gets the value of the associatedAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedAttribute() {
        return associatedAttribute;
    }

    /**
     * Sets the value of the associatedAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedAttribute(String value) {
        this.associatedAttribute = value;
    }

}
