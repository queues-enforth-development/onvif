//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r EventCapabilities complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="EventCapabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="WSSubscriptionPolicySupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="WSPullPointSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="WSPausableSubscriptionManagerInterfaceSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventCapabilities", propOrder = { "xAddr", "wsSubscriptionPolicySupport", "wsPullPointSupport",
		"wsPausableSubscriptionManagerInterfaceSupport", "any" })
public class EventCapabilities {

    /**
     *
     */
    @XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;

    /**
     *
     */
    @XmlElement(name = "WSSubscriptionPolicySupport")
	protected boolean wsSubscriptionPolicySupport;

    /**
     *
     */
    @XmlElement(name = "WSPullPointSupport")
	protected boolean wsPullPointSupport;

    /**
     *
     */
    @XmlElement(name = "WSPausableSubscriptionManagerInterfaceSupport")
	protected boolean wsPausableSubscriptionManagerInterfaceSupport;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der wsSubscriptionPolicySupport-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isWSSubscriptionPolicySupport() {
		return wsSubscriptionPolicySupport;
	}

	/**
	 * Legt den Wert der wsSubscriptionPolicySupport-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setWSSubscriptionPolicySupport(boolean value) {
		this.wsSubscriptionPolicySupport = value;
	}

	/**
	 * Ruft den Wert der wsPullPointSupport-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isWSPullPointSupport() {
		return wsPullPointSupport;
	}

	/**
	 * Legt den Wert der wsPullPointSupport-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setWSPullPointSupport(boolean value) {
		this.wsPullPointSupport = value;
	}

	/**
	 * Ruft den Wert der wsPausableSubscriptionManagerInterfaceSupport-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isWSPausableSubscriptionManagerInterfaceSupport() {
		return wsPausableSubscriptionManagerInterfaceSupport;
	}

	/**
	 * Legt den Wert der wsPausableSubscriptionManagerInterfaceSupport-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setWSPausableSubscriptionManagerInterfaceSupport(boolean value) {
		this.wsPausableSubscriptionManagerInterfaceSupport = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
