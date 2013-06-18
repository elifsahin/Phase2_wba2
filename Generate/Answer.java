package generate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="rightanswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usedjokers" maxOccurs="3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="50/50"/>
 *               &lt;enumeration value="Hinweis"/>
 *               &lt;enumeration value="Frage beantworten"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "rightanswer",
    "usedjokers"
})
@XmlRootElement(name = "answer")
public class Answer {

    protected boolean rightanswer;
    protected List<String> usedjokers;

    /**
     * Gets the value of the rightanswer property.
     * 
     */
    public boolean isRightanswer() {
        return rightanswer;
    }

    /**
     * Sets the value of the rightanswer property.
     * 
     */
    public void setRightanswer(boolean value) {
        this.rightanswer = value;
    }

    /**
     * Gets the value of the usedjokers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedjokers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedjokers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsedjokers() {
        if (usedjokers == null) {
            usedjokers = new ArrayList<String>();
        }
        return this.usedjokers;
    }

}
