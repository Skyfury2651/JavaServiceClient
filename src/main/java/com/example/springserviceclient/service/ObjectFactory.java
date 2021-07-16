
package com.example.springserviceclient.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.springserviceclient.service package. 
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

    private final static QName _UpdateOrUpdate_QNAME = new QName("http://service.springservice.example.com/", "updateOrUpdate");
    private final static QName _AllResponse_QNAME = new QName("http://service.springservice.example.com/", "allResponse");
    private final static QName _All_QNAME = new QName("http://service.springservice.example.com/", "all");
    private final static QName _UpdateOrUpdateResponse_QNAME = new QName("http://service.springservice.example.com/", "updateOrUpdateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.springserviceclient.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link All }
     * 
     */
    public All createAll() {
        return new All();
    }

    /**
     * Create an instance of {@link AllResponse }
     * 
     */
    public AllResponse createAllResponse() {
        return new AllResponse();
    }

    /**
     * Create an instance of {@link UpdateOrUpdateResponse }
     * 
     */
    public UpdateOrUpdateResponse createUpdateOrUpdateResponse() {
        return new UpdateOrUpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateOrUpdate }
     * 
     */
    public UpdateOrUpdate createUpdateOrUpdate() {
        return new UpdateOrUpdate();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springservice.example.com/", name = "updateOrUpdate")
    public JAXBElement<UpdateOrUpdate> createUpdateOrUpdate(UpdateOrUpdate value) {
        return new JAXBElement<UpdateOrUpdate>(_UpdateOrUpdate_QNAME, UpdateOrUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springservice.example.com/", name = "allResponse")
    public JAXBElement<AllResponse> createAllResponse(AllResponse value) {
        return new JAXBElement<AllResponse>(_AllResponse_QNAME, AllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link All }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springservice.example.com/", name = "all")
    public JAXBElement<All> createAll(All value) {
        return new JAXBElement<All>(_All_QNAME, All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springservice.example.com/", name = "updateOrUpdateResponse")
    public JAXBElement<UpdateOrUpdateResponse> createUpdateOrUpdateResponse(UpdateOrUpdateResponse value) {
        return new JAXBElement<UpdateOrUpdateResponse>(_UpdateOrUpdateResponse_QNAME, UpdateOrUpdateResponse.class, null, value);
    }

}
