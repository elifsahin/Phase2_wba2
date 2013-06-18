package generate;

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
 *         &lt;element name="quizlist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Userinformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "quizlist",
    "userinformation"
})
@XmlRootElement(name = "homeview")
public class Homeview {

    @XmlElement(required = true)
    protected String quizlist;
    @XmlElement(name = "Userinformation", required = true)
    protected String userinformation;

    /**
     * Gets the value of the quizlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuizlist() {
        return quizlist;
    }

    /**
     * Sets the value of the quizlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuizlist(String value) {
        this.quizlist = value;
    }

    /**
     * Gets the value of the userinformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserinformation() {
        return userinformation;
    }

    /**
     * Sets the value of the userinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserinformation(String value) {
        this.userinformation = value;
    }

}
