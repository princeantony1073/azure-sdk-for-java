// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** profilePhoto. */
@Fluent
public final class MicrosoftGraphProfilePhotoInner extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphProfilePhotoInner.class);

    /*
     * The height of the photo. Read-only.
     */
    @JsonProperty(value = "height")
    private Integer height;

    /*
     * The width of the photo. Read-only.
     */
    @JsonProperty(value = "width")
    private Integer width;

    /*
     * profilePhoto
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the height property: The height of the photo. Read-only.
     *
     * @return the height value.
     */
    public Integer height() {
        return this.height;
    }

    /**
     * Set the height property: The height of the photo. Read-only.
     *
     * @param height the height value to set.
     * @return the MicrosoftGraphProfilePhotoInner object itself.
     */
    public MicrosoftGraphProfilePhotoInner withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Get the width property: The width of the photo. Read-only.
     *
     * @return the width value.
     */
    public Integer width() {
        return this.width;
    }

    /**
     * Set the width property: The width of the photo. Read-only.
     *
     * @param width the width value to set.
     * @return the MicrosoftGraphProfilePhotoInner object itself.
     */
    public MicrosoftGraphProfilePhotoInner withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Get the additionalProperties property: profilePhoto.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: profilePhoto.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphProfilePhotoInner object itself.
     */
    public MicrosoftGraphProfilePhotoInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphProfilePhotoInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
