//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:40:38 PM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.serviceinstanceschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema.ServiceStatus;
import org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema.VendorInfo;


/**
 * 
 *                 A service instance description. One service implementation may be deployed
 *                 at several places by same or different service providers; each such deployment
 *                 represents a different service instance.
 * 
 *                 Elements of a serviceInstance are:
 * 
 *                 - name The human readable name of the service instance. The service name shall be
 *                 at maximum a one line brief label. Newer versions of the same service
 *                 specification shall adopt the same name.
 * 
 *                 - id Globally unique identification of the service instance. Newer versions of
 *                 the same service instance shall adopt the same id.
 * 
 *                 - version Version of the service instance. A service specification is uniquely
 *                 identified by its id and version. Any change in the service instance data model
 *                 or in the service specification reference requires a new version of the
 *                 service instance.
 * 
 *                 - status Status of the service instance. One of the values 'provisional', 'released',
 *                 'deprecated', 'deleted'.
 * 
 *                 - description A human readable short description of the service instance. The description
 *                 shall contain an abstract of what a service implementation actually does.
 * 
 *                 - keywords A list of keywords associated to the service.
 * 
 *                 - endpoint Endpoint that describes where the service endpoint is located (e.g. URL)
 * 
 *                 - MMSI Optional Maritime Mobile Service Identity
 * 
 *                 - IMO Optional International Maritime Organization (IMO) number
 * 
 *                 - serviceType Optional field to categorize the service type. Example: “VIS”
 * 
 *                 - requiresAuthorization
 *                 Indicates whether authorization is required or not.
 * 
 *                 - implementsServiceDesign
 *                 Refers to the service design that is implemented by this service instance.
 *                 Exactly one service design shall be referenced.
 * 
 *                 - serviceLevel Refers to the definition of the service level fulfilled by the service instance.
 *                 Exactly one service level definition shall be provided.
 * 
 *                 - coversAreas Mandatory reference to the geographical area covered by the service instance.
 *                 Defines a geographical area from which the service instance is accessible.
 *                 This is a choice between a geographical area defined by coordinates or a
 *                 United Nations location code (UN/LOCODE). One of the two options has to
 *                 be provided. Worldwide accessibility is indicated by a “coversArea” element
 *                 with a missing “geometryAsWKT” element.
 * 
 *                 - producedBy Optional reference to information about the producer of the service
 *                 implementation
 * 
 *                 - providedBy Mandatory reference to information about the service provider of the service
 *                 instance.
 *             
 * 
 * <p>Java class for ServiceInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ServiceIdentifier"/&gt;
 *         &lt;element name="version" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ServiceVersion"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}ServiceStatus"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endpoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requiresAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="offersServiceLevel" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd}ServiceLevel"/&gt;
 *         &lt;element name="coversAreas" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd}CoverageInfo"/&gt;
 *         &lt;element name="implementsServiceDesign" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceInstanceSchema.xsd}ServiceDesignReference"/&gt;
 *         &lt;element name="producedBy" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}VendorInfo"/&gt;
 *         &lt;element name="providedBy" type="{http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd}VendorInfo"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstance", propOrder = {

})
public class ServiceInstance {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceStatus status;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String keywords;
    @XmlElement(required = true)
    protected String endpoint;
    @XmlElement(name = "MMSI")
    protected String mmsi;
    @XmlElement(name = "IMO")
    protected String imo;
    protected String serviceType;
    protected boolean requiresAuthorization;
    @XmlElement(required = true)
    protected ServiceLevel offersServiceLevel;
    @XmlElement(required = true)
    protected CoverageInfo coversAreas;
    @XmlElement(required = true)
    protected ServiceDesignReference implementsServiceDesign;
    @XmlElement(required = true)
    protected VendorInfo producedBy;
    @XmlElement(required = true)
    protected VendorInfo providedBy;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setStatus(ServiceStatus value) {
        this.status = value;
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
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the mmsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSI() {
        return mmsi;
    }

    /**
     * Sets the value of the mmsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSI(String value) {
        this.mmsi = value;
    }

    /**
     * Gets the value of the imo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMO() {
        return imo;
    }

    /**
     * Sets the value of the imo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMO(String value) {
        this.imo = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the requiresAuthorization property.
     * 
     */
    public boolean isRequiresAuthorization() {
        return requiresAuthorization;
    }

    /**
     * Sets the value of the requiresAuthorization property.
     * 
     */
    public void setRequiresAuthorization(boolean value) {
        this.requiresAuthorization = value;
    }

    /**
     * Gets the value of the offersServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel }
     *     
     */
    public ServiceLevel getOffersServiceLevel() {
        return offersServiceLevel;
    }

    /**
     * Sets the value of the offersServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel }
     *     
     */
    public void setOffersServiceLevel(ServiceLevel value) {
        this.offersServiceLevel = value;
    }

    /**
     * Gets the value of the coversAreas property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageInfo }
     *     
     */
    public CoverageInfo getCoversAreas() {
        return coversAreas;
    }

    /**
     * Sets the value of the coversAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageInfo }
     *     
     */
    public void setCoversAreas(CoverageInfo value) {
        this.coversAreas = value;
    }

    /**
     * Gets the value of the implementsServiceDesign property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDesignReference }
     *     
     */
    public ServiceDesignReference getImplementsServiceDesign() {
        return implementsServiceDesign;
    }

    /**
     * Sets the value of the implementsServiceDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDesignReference }
     *     
     */
    public void setImplementsServiceDesign(ServiceDesignReference value) {
        this.implementsServiceDesign = value;
    }

    /**
     * Gets the value of the producedBy property.
     * 
     * @return
     *     possible object is
     *     {@link VendorInfo }
     *     
     */
    public VendorInfo getProducedBy() {
        return producedBy;
    }

    /**
     * Sets the value of the producedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorInfo }
     *     
     */
    public void setProducedBy(VendorInfo value) {
        this.producedBy = value;
    }

    /**
     * Gets the value of the providedBy property.
     * 
     * @return
     *     possible object is
     *     {@link VendorInfo }
     *     
     */
    public VendorInfo getProvidedBy() {
        return providedBy;
    }

    /**
     * Sets the value of the providedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorInfo }
     *     
     */
    public void setProvidedBy(VendorInfo value) {
        this.providedBy = value;
    }

}
