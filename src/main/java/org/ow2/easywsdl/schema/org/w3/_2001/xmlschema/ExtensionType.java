//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 09:57:53 AM CET 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for extensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}typeDefParticle" minOccurs="0"/>
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}attrDecls"/>
 *       &lt;/sequence>
 *       &lt;attribute name="base" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extensionType", propOrder = {
    "group",
    "all",
    "choice",
    "sequence",
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    SimpleExtensionType.class
})
public class ExtensionType
    extends Annotated
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    protected GroupRef group;
    protected All all;
    protected ExplicitGroup choice;
    protected ExplicitGroup sequence;
    @XmlElements({
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attributeGroup", type = AttributeGroupRef.class)
    })
    protected List<Annotated> attributeOrAttributeGroup;
    protected Wildcard anyAttribute;
    @XmlAttribute(required = true)
    protected QName base;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupRef }
     *     
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRef }
     *     
     */
    public void setGroup(GroupRef value) {
        this.group = value;
    }

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link All }
     *     
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link All }
     *     
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Gets the value of the choice property.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * Sets the value of the choice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setChoice(ExplicitGroup value) {
        this.choice = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setSequence(ExplicitGroup value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the attributeOrAttributeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeOrAttributeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOrAttributeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * {@link AttributeGroupRef }
     * 
     * 
     */
    public List<Annotated> getAttributeOrAttributeGroup() {
        if (attributeOrAttributeGroup == null) {
            attributeOrAttributeGroup = new ArrayList<Annotated>();
        }
        return this.attributeOrAttributeGroup;
    }

    /**
     * Gets the value of the anyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Wildcard }
     *     
     */
    public Wildcard getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wildcard }
     *     
     */
    public void setAnyAttribute(Wildcard value) {
        this.anyAttribute = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBase(QName value) {
        this.base = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            GroupRef theGroup;
            theGroup = this.getGroup();
            toStringBuilder.append("group", theGroup);
        }
        {
            All theAll;
            theAll = this.getAll();
            toStringBuilder.append("all", theAll);
        }
        {
            ExplicitGroup theChoice;
            theChoice = this.getChoice();
            toStringBuilder.append("choice", theChoice);
        }
        {
            ExplicitGroup theSequence;
            theSequence = this.getSequence();
            toStringBuilder.append("sequence", theSequence);
        }
        {
            List<Annotated> theAttributeOrAttributeGroup;
            theAttributeOrAttributeGroup = this.getAttributeOrAttributeGroup();
            toStringBuilder.append("attributeOrAttributeGroup", theAttributeOrAttributeGroup);
        }
        {
            Wildcard theAnyAttribute;
            theAnyAttribute = this.getAnyAttribute();
            toStringBuilder.append("anyAttribute", theAnyAttribute);
        }
        {
            QName theBase;
            theBase = this.getBase();
            toStringBuilder.append("base", theBase);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof ExtensionType)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final ExtensionType that = ((ExtensionType) object);
        equalsBuilder.append(this.getGroup(), that.getGroup());
        equalsBuilder.append(this.getAll(), that.getAll());
        equalsBuilder.append(this.getChoice(), that.getChoice());
        equalsBuilder.append(this.getSequence(), that.getSequence());
        equalsBuilder.append(this.getAttributeOrAttributeGroup(), that.getAttributeOrAttributeGroup());
        equalsBuilder.append(this.getAnyAttribute(), that.getAnyAttribute());
        equalsBuilder.append(this.getBase(), that.getBase());
    }

    public boolean equals(Object object) {
        if (!(object instanceof ExtensionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getGroup());
        hashCodeBuilder.append(this.getAll());
        hashCodeBuilder.append(this.getChoice());
        hashCodeBuilder.append(this.getSequence());
        hashCodeBuilder.append(this.getAttributeOrAttributeGroup());
        hashCodeBuilder.append(this.getAnyAttribute());
        hashCodeBuilder.append(this.getBase());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final ExtensionType copy = ((target == null)?((ExtensionType) createCopy()):((ExtensionType) target));
        super.copyTo(copy, copyBuilder);
        {
            GroupRef sourceGroup;
            sourceGroup = this.getGroup();
            GroupRef copyGroup = ((GroupRef) copyBuilder.copy(sourceGroup));
            copy.setGroup(copyGroup);
        }
        {
            All sourceAll;
            sourceAll = this.getAll();
            All copyAll = ((All) copyBuilder.copy(sourceAll));
            copy.setAll(copyAll);
        }
        {
            ExplicitGroup sourceChoice;
            sourceChoice = this.getChoice();
            ExplicitGroup copyChoice = ((ExplicitGroup) copyBuilder.copy(sourceChoice));
            copy.setChoice(copyChoice);
        }
        {
            ExplicitGroup sourceSequence;
            sourceSequence = this.getSequence();
            ExplicitGroup copySequence = ((ExplicitGroup) copyBuilder.copy(sourceSequence));
            copy.setSequence(copySequence);
        }
        {
            List<Annotated> sourceAttributeOrAttributeGroup;
            sourceAttributeOrAttributeGroup = this.getAttributeOrAttributeGroup();
            List<Annotated> copyAttributeOrAttributeGroup = ((List<Annotated> ) copyBuilder.copy(sourceAttributeOrAttributeGroup));
            copy.attributeOrAttributeGroup = null;
            List<Annotated> uniqueAttributeOrAttributeGroupl = copy.getAttributeOrAttributeGroup();
            uniqueAttributeOrAttributeGroupl.addAll(copyAttributeOrAttributeGroup);
        }
        {
            Wildcard sourceAnyAttribute;
            sourceAnyAttribute = this.getAnyAttribute();
            Wildcard copyAnyAttribute = ((Wildcard) copyBuilder.copy(sourceAnyAttribute));
            copy.setAnyAttribute(copyAnyAttribute);
        }
        {
            QName sourceBase;
            sourceBase = this.getBase();
            QName copyBase = ((QName) copyBuilder.copy(sourceBase));
            copy.setBase(copyBase);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new ExtensionType();
    }

}
