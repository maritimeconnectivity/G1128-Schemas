//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.21 at 10:03:52 AM BST 
//


package _int.iho.s100ci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationFormCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationFormCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="documentDigital"/&gt;
 *     &lt;enumeration value="documentHardcopy"/&gt;
 *     &lt;enumeration value="imageDigital"/&gt;
 *     &lt;enumeration value="imageHardcopy"/&gt;
 *     &lt;enumeration value="mapDigital"/&gt;
 *     &lt;enumeration value="mapHardcopy"/&gt;
 *     &lt;enumeration value="modelDigital"/&gt;
 *     &lt;enumeration value="modelHardcopy"/&gt;
 *     &lt;enumeration value="profileDigital"/&gt;
 *     &lt;enumeration value="profileHardcopy"/&gt;
 *     &lt;enumeration value="tableDigital"/&gt;
 *     &lt;enumeration value="tableHardcopy"/&gt;
 *     &lt;enumeration value="videoDigital"/&gt;
 *     &lt;enumeration value="videoHardcopy"/&gt;
 *     &lt;enumeration value="multimediaDigital"/&gt;
 *     &lt;enumeration value="multimediaHardcopy"/&gt;
 *     &lt;enumeration value="diagramDigital"/&gt;
 *     &lt;enumeration value="diagramHardcopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PresentationFormCode")
@XmlEnum
public enum PresentationFormCode {


    /**
     * digital representation of a primarily textual item (can contain illustrations also)
     * 
     */
    @XmlEnumValue("documentDigital")
    DOCUMENT_DIGITAL("documentDigital"),

    /**
     * representation of a primarily textual item (can contain illustrations also) on paper, photographic material, or other media
     * 
     */
    @XmlEnumValue("documentHardcopy")
    DOCUMENT_HARDCOPY("documentHardcopy"),

    /**
     * likeness of natural or man-made features, objects, and activities acquired through the sensing of visual or any other segment of the electromagnetic spectrum by sensors, such as thermal infrared, and high resolution radar and stored in digital format
     * 
     */
    @XmlEnumValue("imageDigital")
    IMAGE_DIGITAL("imageDigital"),

    /**
     * likeness of natural or man-made features, objects, and activities acquired through the sensing of visual or any other segment of the electromagnetic spectrum by sensors, such as thermal infrared, and high resolution radar and reproduced on paper, photographic material, or other media for use directly by the human user
     * 
     */
    @XmlEnumValue("imageHardcopy")
    IMAGE_HARDCOPY("imageHardcopy"),

    /**
     * map represented in raster or vector form
     * 
     */
    @XmlEnumValue("mapDigital")
    MAP_DIGITAL("mapDigital"),

    /**
     * map printed on paper, photographic material, or other media for use directly by the human user
     * 
     */
    @XmlEnumValue("mapHardcopy")
    MAP_HARDCOPY("mapHardcopy"),

    /**
     * multi-dimensional digital representation of a feature, process, etc.
     * 
     */
    @XmlEnumValue("modelDigital")
    MODEL_DIGITAL("modelDigital"),

    /**
     *  3-dimensional, physical model
     * 
     */
    @XmlEnumValue("modelHardcopy")
    MODEL_HARDCOPY("modelHardcopy"),

    /**
     * vertical cross-section in digital form
     * 
     */
    @XmlEnumValue("profileDigital")
    PROFILE_DIGITAL("profileDigital"),

    /**
     * vertical cross-section printed on paper, etc.
     * 
     */
    @XmlEnumValue("profileHardcopy")
    PROFILE_HARDCOPY("profileHardcopy"),

    /**
     * digital representation of facts or figures systematically displayed, especially in columns
     * 
     */
    @XmlEnumValue("tableDigital")
    TABLE_DIGITAL("tableDigital"),

    /**
     * representation of facts or figures systematically displayed, especially in columns, printed on paper, photographic material, or other media
     * 
     */
    @XmlEnumValue("tableHardcopy")
    TABLE_HARDCOPY("tableHardcopy"),

    /**
     * digital video recording
     * 
     */
    @XmlEnumValue("videoDigital")
    VIDEO_DIGITAL("videoDigital"),

    /**
     * video recording on film
     * 
     */
    @XmlEnumValue("videoHardcopy")
    VIDEO_HARDCOPY("videoHardcopy"),

    /**
     * information representation using simultaneously various digital modes for text, sound, image
     * 
     */
    @XmlEnumValue("multimediaDigital")
    MULTIMEDIA_DIGITAL("multimediaDigital"),

    /**
     * information representation using simultaneously various analog modes for text, sound, image
     * 
     */
    @XmlEnumValue("multimediaHardcopy")
    MULTIMEDIA_HARDCOPY("multimediaHardcopy"),

    /**
     * information represented graphically by charts such as pie chart, bar chart, and other type of diagrams and recorded in digital format
     * 
     */
    @XmlEnumValue("diagramDigital")
    DIAGRAM_DIGITAL("diagramDigital"),

    /**
     * information represented graphically by charts such as pie chart, bar chart, and other type of diagrams and printed on paper, photographic material, or other media
     * 
     */
    @XmlEnumValue("diagramHardcopy")
    DIAGRAM_HARDCOPY("diagramHardcopy");
    private final String value;

    PresentationFormCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationFormCode fromValue(String v) {
        for (PresentationFormCode c: PresentationFormCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
