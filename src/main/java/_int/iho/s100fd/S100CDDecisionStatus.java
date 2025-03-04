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
 * <p>Java class for S100_CD_DecisionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_CD_DecisionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="tentative"/&gt;
 *     &lt;enumeration value="final"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_CD_DecisionStatus")
@XmlEnum
public enum S100CDDecisionStatus {

    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),
    @XmlEnumValue("final")
    FINAL("final");
    private final String value;

    S100CDDecisionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100CDDecisionStatus fromValue(String v) {
        for (S100CDDecisionStatus c: S100CDDecisionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
