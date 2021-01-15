// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delimited text write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextWriteSettings")
@Fluent
public final class DelimitedTextWriteSettings extends FormatWriteSettings {
    /*
     * Indicates whether string values should always be enclosed with quotes.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "quoteAllText")
    private Object quoteAllText;

    /*
     * The file extension used to create the files. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "fileExtension", required = true)
    private Object fileExtension;

    /**
     * Get the quoteAllText property: Indicates whether string values should always be enclosed with quotes. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the quoteAllText value.
     */
    public Object getQuoteAllText() {
        return this.quoteAllText;
    }

    /**
     * Set the quoteAllText property: Indicates whether string values should always be enclosed with quotes. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param quoteAllText the quoteAllText value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setQuoteAllText(Object quoteAllText) {
        this.quoteAllText = quoteAllText;
        return this;
    }

    /**
     * Get the fileExtension property: The file extension used to create the files. Type: string (or Expression with
     * resultType string).
     *
     * @return the fileExtension value.
     */
    public Object getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Set the fileExtension property: The file extension used to create the files. Type: string (or Expression with
     * resultType string).
     *
     * @param fileExtension the fileExtension value to set.
     * @return the DelimitedTextWriteSettings object itself.
     */
    public DelimitedTextWriteSettings setFileExtension(Object fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
}
