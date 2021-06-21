//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specification of a service interface. One service can offer several interfaces,
 *                 e.g. both a request/response interface and a publish/subscribe interface at the same time.
 *                 Different interfaces will usually provide different service operations.
 * 
 *                 Elements of a serviceInterface are:
 * 
 *                 name Human readable service interface name. The name shall be no longer than one line.
 * 
 *                 description Human readable description of the service interface
 * 
 *                 dataExchangePattern Message exchange pattern for the entire interface.
 * 
 *                 Message exchange pattern can be one of
 *                 ONE_WAY,
 *                 REQUEST_RESPONSE,
 *                 REQUEST_CALLBACK,
 *                 PUBLISH_SUBSCRIBE,
 *                 BROADCAST.
 * 
 *                 operations Refers to the specification of service operations supported by the service
 *                 interface. At least one operation shall be defined.
 * 
 *                 consumerInterfaces Optional reference to an interface definition that has to be provided by the
 *                 service consumer in order to complement the service interface.
 *                 Especially if a publish/subscribe service interface is designed, it is
 *                 necessary to describe what the service expects to be available on the
 *                 subscriber side.
 *             
 * 
 * <p>Java class for ServiceInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataExchangePattern"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ONE_WAY"/&gt;
 *               &lt;enumeration value="REQUEST_RESPONSE"/&gt;
 *               &lt;enumeration value="REQUEST_CALLBACK"/&gt;
 *               &lt;enumeration value="PUBLISH_SUBSCRIBE"/&gt;
 *               &lt;enumeration value="BROADCAST"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="operation" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}Operation" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="consumerInterface" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ConsumerInterface" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInterface", propOrder = {

})
public class ServiceInterface {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String dataExchangePattern;
    @XmlElement(required = true)
    protected ServiceInterface.Operations operations;
    protected ConsumerInterface consumerInterface;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dataExchangePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExchangePattern() {
        return dataExchangePattern;
    }

    /**
     * Sets the value of the dataExchangePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExchangePattern(String value) {
        this.dataExchangePattern = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInterface.Operations }
     *     
     */
    public ServiceInterface.Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInterface.Operations }
     *     
     */
    public void setOperations(ServiceInterface.Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the consumerInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerInterface }
     *     
     */
    public ConsumerInterface getConsumerInterface() {
        return consumerInterface;
    }

    /**
     * Sets the value of the consumerInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerInterface }
     *     
     */
    public void setConsumerInterface(ConsumerInterface value) {
        this.consumerInterface = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="operation" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}Operation" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operations"
    })
    public static class Operations {

        @XmlElement(name = "operation", required = true)
        protected List<Operation> operations;

        /**
         * Gets the value of the operations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Operation }
         * 
         * 
         */
        public List<Operation> getOperations() {
            if (operations == null) {
                operations = new ArrayList<Operation>();
            }
            return this.operations;
        }

    }

}
