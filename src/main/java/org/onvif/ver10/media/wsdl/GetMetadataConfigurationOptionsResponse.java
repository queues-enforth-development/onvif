//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MetadataConfigurationOptions;

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
 *         <element name="Options" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationOptions"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "options" })
@XmlRootElement(name = "GetMetadataConfigurationOptionsResponse")
public class GetMetadataConfigurationOptionsResponse {

    /**
     *
     */
    @XmlElement(name = "Options", required = true)
	protected MetadataConfigurationOptions options;

	/**
	 * Ruft den Wert der options-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataConfigurationOptions }
	 * 
	 */
	public MetadataConfigurationOptions getOptions() {
		return options;
	}

	/**
	 * Legt den Wert der options-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MetadataConfigurationOptions }
	 * 
	 */
	public void setOptions(MetadataConfigurationOptions value) {
		this.options = value;
	}

}
