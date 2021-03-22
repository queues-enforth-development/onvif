//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onvif.ver10.schema.BinaryData;

/**
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         <element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Attributes" type="{http://www.onvif.org/ver10/schema}BinaryData" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certificateID", "subject", "attributes" })
@XmlRootElement(name = "GetPkcs10Request")
public class GetPkcs10Request {

    /**
     *
     */
    @XmlElement(name = "CertificateID", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "token")
	protected String certificateID;

    /**
     *
     */
    @XmlElement(name = "Subject")
	protected String subject;

    /**
     *
     */
    @XmlElement(name = "Attributes")
	protected BinaryData attributes;

	/**
	 * Ruft den Wert der certificateID-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCertificateID() {
		return certificateID;
	}

	/**
	 * Legt den Wert der certificateID-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCertificateID(String value) {
		this.certificateID = value;
	}

	/**
	 * Ruft den Wert der subject-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Legt den Wert der subject-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubject(String value) {
		this.subject = value;
	}

	/**
	 * Ruft den Wert der attributes-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BinaryData }
	 * 
	 */
	public BinaryData getAttributes() {
		return attributes;
	}

	/**
	 * Legt den Wert der attributes-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BinaryData }
	 * 
	 */
	public void setAttributes(BinaryData value) {
		this.attributes = value;
	}

}
