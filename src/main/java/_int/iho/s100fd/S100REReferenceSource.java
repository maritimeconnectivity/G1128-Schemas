//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_RE_ReferenceSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_RE_ReferenceSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100FD}S100_RE_Reference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="similarity" type="{http://www.iho.int/S100FD}SimilarityToSource"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_RE_ReferenceSource", propOrder = {
    "similarity"
})
public class S100REReferenceSource
    extends S100REReference
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SimilarityToSource similarity;

    /**
     * Gets the value of the similarity property.
     * 
     * @return
     *     possible object is
     *     {@link SimilarityToSource }
     *     
     */
    public SimilarityToSource getSimilarity() {
        return similarity;
    }

    /**
     * Sets the value of the similarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarityToSource }
     *     
     */
    public void setSimilarity(SimilarityToSource value) {
        this.similarity = value;
    }

}
