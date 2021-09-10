//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.10 at 12:40:55 PM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.serviceinstanceschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="coversArea" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd}CoverageArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unLoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageInfo", propOrder = {
    "unLoCode",
    "coversAreas"
})
public class CoverageInfo {

    protected String unLoCode;
    @XmlElement(name = "coversArea")
    protected List<CoverageArea> coversAreas;

    /**
     * Gets the value of the unLoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnLoCode() {
        return unLoCode;
    }

    /**
     * Sets the value of the unLoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnLoCode(String value) {
        this.unLoCode = value;
    }

    /**
     * Gets the value of the coversAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coversAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoversAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageArea }
     * 
     * 
     */
    public List<CoverageArea> getCoversAreas() {
        if (coversAreas == null) {
            coversAreas = new ArrayList<CoverageArea>();
        }
        return this.coversAreas;
    }

}
