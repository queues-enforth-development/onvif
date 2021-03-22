//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ColorCovariance complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ColorCovariance">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="XX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="YY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="ZZ" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="XY" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="XZ" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="YZ" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorCovariance")
public class ColorCovariance {

    /**
     *
     */
    @XmlAttribute(name = "XX", required = true)
	protected float xx;

    /**
     *
     */
    @XmlAttribute(name = "YY", required = true)
	protected float yy;

    /**
     *
     */
    @XmlAttribute(name = "ZZ", required = true)
	protected float zz;

    /**
     *
     */
    @XmlAttribute(name = "XY")
	protected Float xy;

    /**
     *
     */
    @XmlAttribute(name = "XZ")
	protected Float xz;

    /**
     *
     */
    @XmlAttribute(name = "YZ")
	protected Float yz;

    /**
     *
     */
    @XmlAttribute(name = "Colorspace")
	@XmlSchemaType(name = "anyURI")
	protected String colorspace;

	/**
	 * Ruft den Wert der xx-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getXX() {
		return xx;
	}

	/**
	 * Legt den Wert der xx-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setXX(float value) {
		this.xx = value;
	}

	/**
	 * Ruft den Wert der yy-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getYY() {
		return yy;
	}

	/**
	 * Legt den Wert der yy-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setYY(float value) {
		this.yy = value;
	}

	/**
	 * Ruft den Wert der zz-Eigenschaft ab.
	 * 
     * @return 
	 */
	public float getZZ() {
		return zz;
	}

	/**
	 * Legt den Wert der zz-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setZZ(float value) {
		this.zz = value;
	}

	/**
	 * Ruft den Wert der xy-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getXY() {
		return xy;
	}

	/**
	 * Legt den Wert der xy-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setXY(Float value) {
		this.xy = value;
	}

	/**
	 * Ruft den Wert der xz-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getXZ() {
		return xz;
	}

	/**
	 * Legt den Wert der xz-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setXZ(Float value) {
		this.xz = value;
	}

	/**
	 * Ruft den Wert der yz-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getYZ() {
		return yz;
	}

	/**
	 * Legt den Wert der yz-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setYZ(Float value) {
		this.yz = value;
	}

	/**
	 * Ruft den Wert der colorspace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColorspace() {
		return colorspace;
	}

	/**
	 * Legt den Wert der colorspace-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColorspace(String value) {
		this.colorspace = value;
	}

}
