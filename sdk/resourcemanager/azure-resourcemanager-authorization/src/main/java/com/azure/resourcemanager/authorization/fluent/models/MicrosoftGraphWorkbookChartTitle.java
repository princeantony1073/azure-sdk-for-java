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

/** workbookChartTitle. */
@Fluent
public final class MicrosoftGraphWorkbookChartTitle extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookChartTitle.class);

    /*
     * Boolean value representing if the chart title will overlay the chart or
     * not.
     */
    @JsonProperty(value = "overlay")
    private Boolean overlay;

    /*
     * Represents the title text of a chart.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * A boolean value the represents the visibility of a chart title object.
     */
    @JsonProperty(value = "visible")
    private Boolean visible;

    /*
     * workbookChartTitleFormat
     */
    @JsonProperty(value = "format")
    private MicrosoftGraphWorkbookChartTitleFormat format;

    /*
     * workbookChartTitle
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the overlay property: Boolean value representing if the chart title will overlay the chart or not.
     *
     * @return the overlay value.
     */
    public Boolean overlay() {
        return this.overlay;
    }

    /**
     * Set the overlay property: Boolean value representing if the chart title will overlay the chart or not.
     *
     * @param overlay the overlay value to set.
     * @return the MicrosoftGraphWorkbookChartTitle object itself.
     */
    public MicrosoftGraphWorkbookChartTitle withOverlay(Boolean overlay) {
        this.overlay = overlay;
        return this;
    }

    /**
     * Get the text property: Represents the title text of a chart.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: Represents the title text of a chart.
     *
     * @param text the text value to set.
     * @return the MicrosoftGraphWorkbookChartTitle object itself.
     */
    public MicrosoftGraphWorkbookChartTitle withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the visible property: A boolean value the represents the visibility of a chart title object.
     *
     * @return the visible value.
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set the visible property: A boolean value the represents the visibility of a chart title object.
     *
     * @param visible the visible value to set.
     * @return the MicrosoftGraphWorkbookChartTitle object itself.
     */
    public MicrosoftGraphWorkbookChartTitle withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * Get the format property: workbookChartTitleFormat.
     *
     * @return the format value.
     */
    public MicrosoftGraphWorkbookChartTitleFormat format() {
        return this.format;
    }

    /**
     * Set the format property: workbookChartTitleFormat.
     *
     * @param format the format value to set.
     * @return the MicrosoftGraphWorkbookChartTitle object itself.
     */
    public MicrosoftGraphWorkbookChartTitle withFormat(MicrosoftGraphWorkbookChartTitleFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartTitle.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartTitle.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartTitle object itself.
     */
    public MicrosoftGraphWorkbookChartTitle withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphWorkbookChartTitle withId(String id) {
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
        if (format() != null) {
            format().validate();
        }
    }
}
