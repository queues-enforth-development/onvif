//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//


package org.onvif.ver10.events.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.events.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "Capabilities");
    private final static QName _CreatePullPointSubscriptionInitialTerminationTime_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "InitialTerminationTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.events.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePullPointSubscription }
     * 
     * @return 
     */
    public CreatePullPointSubscription createCreatePullPointSubscription() {
        return new CreatePullPointSubscription();
    }

    /**
     * Create an instance of {@link SeekResponse }
     * 
     * @return 
     */
    public SeekResponse createSeekResponse() {
        return new SeekResponse();
    }

    /**
     * Create an instance of {@link PullMessages }
     * 
     * @return 
     */
    public PullMessages createPullMessages() {
        return new PullMessages();
    }

    /**
     * Create an instance of {@link PullMessagesResponse }
     * 
     * @return 
     */
    public PullMessagesResponse createPullMessagesResponse() {
        return new PullMessagesResponse();
    }

    /**
     * Create an instance of {@link CreatePullPointSubscriptionResponse }
     * 
     * @return 
     */
    public CreatePullPointSubscriptionResponse createCreatePullPointSubscriptionResponse() {
        return new CreatePullPointSubscriptionResponse();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     * @return 
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     * @return 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link SetSynchronizationPointResponse }
     * 
     * @return 
     */
    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    /**
     * Create an instance of {@link GetEventProperties }
     * 
     * @return 
     */
    public GetEventProperties createGetEventProperties() {
        return new GetEventProperties();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     * @return 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetEventPropertiesResponse }
     * 
     * @return 
     */
    public GetEventPropertiesResponse createGetEventPropertiesResponse() {
        return new GetEventPropertiesResponse();
    }

    /**
     * Create an instance of {@link SetSynchronizationPoint }
     * 
     * @return 
     */
    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    /**
     * Create an instance of {@link CreatePullPointSubscription.SubscriptionPolicy }
     * 
     * @return 
     */
    public CreatePullPointSubscription.SubscriptionPolicy createCreatePullPointSubscriptionSubscriptionPolicy() {
        return new CreatePullPointSubscription.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link PullMessagesFaultResponse }
     * 
     * @return 
     */
    public PullMessagesFaultResponse createPullMessagesFaultResponse() {
        return new PullMessagesFaultResponse();
    }

    /**
     * Create an instance of {@link Seek }
     * 
     * @return 
     */
    public Seek createSeek() {
        return new Seek();
    }

    /**
     * Create an instance of {@link org.onvif.ver10.events.wsdl.SubscriptionPolicy }
     * 
     * @return 
     */
    public org.onvif.ver10.events.wsdl.SubscriptionPolicy createSubscriptionPolicy() {
        return new org.onvif.ver10.events.wsdl.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "InitialTerminationTime", scope = CreatePullPointSubscription.class)
    public JAXBElement<String> createCreatePullPointSubscriptionInitialTerminationTime(String value) {
        return new JAXBElement<>(_CreatePullPointSubscriptionInitialTerminationTime_QNAME, String.class, CreatePullPointSubscription.class, value);
    }

}
