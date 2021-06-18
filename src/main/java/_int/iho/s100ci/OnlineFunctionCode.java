//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.18 at 04:40:38 PM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineFunctionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnlineFunctionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="download"/&gt;
 *     &lt;enumeration value="information"/&gt;
 *     &lt;enumeration value="offlineAccess"/&gt;
 *     &lt;enumeration value="order"/&gt;
 *     &lt;enumeration value="search"/&gt;
 *     &lt;enumeration value="completeMetadata"/&gt;
 *     &lt;enumeration value="browseGraphic"/&gt;
 *     &lt;enumeration value="upload"/&gt;
 *     &lt;enumeration value="emailService"/&gt;
 *     &lt;enumeration value="browsing"/&gt;
 *     &lt;enumeration value="fileAccess"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnlineFunctionCode")
@XmlEnum
public enum OnlineFunctionCode {


    /**
     * online instructions for transferring data from one storage device or system to another
     * 
     */
    @XmlEnumValue("download")
    DOWNLOAD("download"),

    /**
     * online information about the resource
     * 
     */
    @XmlEnumValue("information")
    INFORMATION("information"),

    /**
     * online instructions for requesting the resource from the provider
     * 
     */
    @XmlEnumValue("offlineAccess")
    OFFLINE_ACCESS("offlineAccess"),

    /**
     * online order process for obtaining the resource
     * 
     */
    @XmlEnumValue("order")
    ORDER("order"),

    /**
     * online search interface for seeking out information about the resource
     * 
     */
    @XmlEnumValue("search")
    SEARCH("search"),

    /**
     * complete metadata provided
     * 
     */
    @XmlEnumValue("completeMetadata")
    COMPLETE_METADATA("completeMetadata"),

    /**
     * browse graphic provided
     * 
     */
    @XmlEnumValue("browseGraphic")
    BROWSE_GRAPHIC("browseGraphic"),

    /**
     * online resource upload capability provided
     * 
     */
    @XmlEnumValue("upload")
    UPLOAD("upload"),

    /**
     * online email service provided
     * 
     */
    @XmlEnumValue("emailService")
    EMAIL_SERVICE("emailService"),

    /**
     * online browsing provided
     * 
     */
    @XmlEnumValue("browsing")
    BROWSING("browsing"),

    /**
     * online file access provided
     * 
     */
    @XmlEnumValue("fileAccess")
    FILE_ACCESS("fileAccess");
    private final String value;

    OnlineFunctionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlineFunctionCode fromValue(String v) {
        for (OnlineFunctionCode c: OnlineFunctionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
