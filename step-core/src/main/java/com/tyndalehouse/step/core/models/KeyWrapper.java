package com.tyndalehouse.step.core.models;

import org.crosswire.jsword.passage.Key;

/**
 * Wraps around an OSIS Key
 * 
 * @author chrisburrell
 * 
 */
public class KeyWrapper {
    private String osisKeyId;
    private String name;

    /**
     * for use by serialisation
     */
    public KeyWrapper() {
        // for use by serialisation
    }

    /**
     * Initialises a KeyWrapper with its Key
     * 
     * @param k the key
     */
    public KeyWrapper(final Key k) {
        this.name = k.getName();
        this.osisKeyId = k.getOsisID();
    }

    /**
     * @return the osisKeyId
     */
    public String getOsisKeyId() {
        return this.osisKeyId;
    }

    /**
     * @param osisKeyId the osisKeyId to set
     */
    public void setOsisKeyId(final String osisKeyId) {
        this.osisKeyId = osisKeyId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }
}
