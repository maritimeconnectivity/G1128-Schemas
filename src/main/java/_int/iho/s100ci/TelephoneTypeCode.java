//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.18 at 02:04:50 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="voice"/&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="sms"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneTypeCode")
@XmlEnum
public enum TelephoneTypeCode {


    /**
     * telephone provides voice service
     * 
     */
    @XmlEnumValue("voice")
    VOICE("voice"),

    /**
     * telephone provides facsimile service
     * 
     */
    @XmlEnumValue("fax")
    FAX("fax"),

    /**
     * telephone provides sms service
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms");
    private final String value;

    TelephoneTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneTypeCode fromValue(String v) {
        for (TelephoneTypeCode c: TelephoneTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
