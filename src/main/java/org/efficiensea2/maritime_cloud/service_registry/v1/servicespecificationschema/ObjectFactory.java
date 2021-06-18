//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:40:38 PM BST 
//


package org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceSpecification_QNAME = new QName("http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd", "serviceSpecification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.efficiensea2.maritime_cloud.service_registry.v1.servicespecificationschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ConsumerInterface }
     * 
     */
    public ConsumerInterface createConsumerInterface() {
        return new ConsumerInterface();
    }

    /**
     * Create an instance of {@link ServiceInterface }
     * 
     */
    public ServiceInterface createServiceInterface() {
        return new ServiceInterface();
    }

    /**
     * Create an instance of {@link Requirement }
     * 
     */
    public Requirement createRequirement() {
        return new Requirement();
    }

    /**
     * Create an instance of {@link ServiceSpecification }
     * 
     */
    public ServiceSpecification createServiceSpecification() {
        return new ServiceSpecification();
    }

    /**
     * Create an instance of {@link AuthorInfo }
     * 
     */
    public AuthorInfo createAuthorInfo() {
        return new AuthorInfo();
    }

    /**
     * Create an instance of {@link VendorInfo }
     * 
     */
    public VendorInfo createVendorInfo() {
        return new VendorInfo();
    }

    /**
     * Create an instance of {@link ValueTypeDataModelMapping }
     * 
     */
    public ValueTypeDataModelMapping createValueTypeDataModelMapping() {
        return new ValueTypeDataModelMapping();
    }

    /**
     * Create an instance of {@link ServiceDataModel }
     * 
     */
    public ServiceDataModel createServiceDataModel() {
        return new ServiceDataModel();
    }

    /**
     * Create an instance of {@link Operation.ParameterTypes }
     * 
     */
    public Operation.ParameterTypes createOperationParameterTypes() {
        return new Operation.ParameterTypes();
    }

    /**
     * Create an instance of {@link ConsumerInterface.Operations }
     * 
     */
    public ConsumerInterface.Operations createConsumerInterfaceOperations() {
        return new ConsumerInterface.Operations();
    }

    /**
     * Create an instance of {@link ServiceInterface.Operations }
     * 
     */
    public ServiceInterface.Operations createServiceInterfaceOperations() {
        return new ServiceInterface.Operations();
    }

    /**
     * Create an instance of {@link Requirement.AuthorInfos }
     * 
     */
    public Requirement.AuthorInfos createRequirementAuthorInfos() {
        return new Requirement.AuthorInfos();
    }

    /**
     * Create an instance of {@link ServiceSpecification.Requirements }
     * 
     */
    public ServiceSpecification.Requirements createServiceSpecificationRequirements() {
        return new ServiceSpecification.Requirements();
    }

    /**
     * Create an instance of {@link ServiceSpecification.AuthorInfos }
     * 
     */
    public ServiceSpecification.AuthorInfos createServiceSpecificationAuthorInfos() {
        return new ServiceSpecification.AuthorInfos();
    }

    /**
     * Create an instance of {@link ServiceSpecification.ServiceInterfaces }
     * 
     */
    public ServiceSpecification.ServiceInterfaces createServiceSpecificationServiceInterfaces() {
        return new ServiceSpecification.ServiceInterfaces();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceSpecification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceSpecification }{@code >}
     */
    @XmlElementDecl(namespace = "http://efficiensea2.org/maritime-cloud/service-registry/v1/ServiceSpecificationSchema.xsd", name = "serviceSpecification")
    public JAXBElement<ServiceSpecification> createServiceSpecification(ServiceSpecification value) {
        return new JAXBElement<ServiceSpecification>(_ServiceSpecification_QNAME, ServiceSpecification.class, null, value);
    }

}
