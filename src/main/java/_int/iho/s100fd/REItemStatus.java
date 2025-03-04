//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.20 at 12:23:53 PM BST 
//


package _int.iho.s100fd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RE_ItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RE_ItemStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="valid"/&gt;
 *     &lt;enumeration value="superseded"/&gt;
 *     &lt;enumeration value="retired"/&gt;
 *     &lt;enumeration value="notValid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RE_ItemStatus")
@XmlEnum
public enum REItemStatus {

    @XmlEnumValue("valid")
    VALID("valid"),
    @XmlEnumValue("superseded")
    SUPERSEDED("superseded"),
    @XmlEnumValue("retired")
    RETIRED("retired"),
    @XmlEnumValue("notValid")
    NOT_VALID("notValid");
    private final String value;

    REItemStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REItemStatus fromValue(String v) {
        for (REItemStatus c: REItemStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
