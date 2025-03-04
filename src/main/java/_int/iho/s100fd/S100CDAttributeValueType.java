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
 * <p>Java class for S100_CD_AttributeValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_CD_AttributeValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="enumeration"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="dateTime"/&gt;
 *     &lt;enumeration value="URI"/&gt;
 *     &lt;enumeration value="URL"/&gt;
 *     &lt;enumeration value="URN"/&gt;
 *     &lt;enumeration value="S100_CodeList"/&gt;
 *     &lt;enumeration value="S100_TruncatedDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "S100_CD_AttributeValueType")
@XmlEnum
public enum S100CDAttributeValueType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("enumeration")
    ENUMERATION("enumeration"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    URI("URI"),
    URL("URL"),
    URN("URN"),
    @XmlEnumValue("S100_CodeList")
    S_100_CODE_LIST("S100_CodeList"),
    @XmlEnumValue("S100_TruncatedDate")
    S_100_TRUNCATED_DATE("S100_TruncatedDate");
    private final String value;

    S100CDAttributeValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100CDAttributeValueType fromValue(String v) {
        for (S100CDAttributeValueType c: S100CDAttributeValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
