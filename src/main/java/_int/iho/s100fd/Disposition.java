//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:28:33 AM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Disposition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Disposition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="withdrawn"/&gt;
 *     &lt;enumeration value="accepted"/&gt;
 *     &lt;enumeration value="notAccepted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Disposition")
@XmlEnum
public enum Disposition {

    @XmlEnumValue("withdrawn")
    WITHDRAWN("withdrawn"),
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),
    @XmlEnumValue("notAccepted")
    NOT_ACCEPTED("notAccepted");
    private final String value;

    Disposition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Disposition fromValue(String v) {
        for (Disposition c: Disposition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
