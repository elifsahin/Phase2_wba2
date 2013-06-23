//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.26 at 10:08:11 PM CEST 
//


package generate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rightanswer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="falseanswer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="picturemedia" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="audiomedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "question",
    "rightanswer",
    "falseanswer",
    "picturemedia",
    "audiomedia"
})
@XmlRootElement(name = "questions")
public class Questions {

    @XmlElement(required = true)
    protected String question;
    @XmlElement(required = true)
    protected String rightanswer;
    @XmlElement(required = true)
    protected List<String> falseanswer;
    protected byte[] picturemedia;
    protected String audiomedia;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the rightanswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightanswer() {
        return rightanswer;
    }

    /**
     * Sets the value of the rightanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightanswer(String value) {
        this.rightanswer = value;
    }

    /**
     * Gets the value of the falseanswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the falseanswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFalseanswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFalseanswer() {
        if (falseanswer == null) {
            falseanswer = new ArrayList<String>();
        }
        return this.falseanswer;
    }

    /**
     * Gets the value of the picturemedia property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPicturemedia() {
        return picturemedia;
    }

    /**
     * Sets the value of the picturemedia property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPicturemedia(byte[] value) {
        this.picturemedia = value;
    }

    /**
     * Gets the value of the audiomedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudiomedia() {
        return audiomedia;
    }

    /**
     * Sets the value of the audiomedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudiomedia(String value) {
        this.audiomedia = value;
    }

}