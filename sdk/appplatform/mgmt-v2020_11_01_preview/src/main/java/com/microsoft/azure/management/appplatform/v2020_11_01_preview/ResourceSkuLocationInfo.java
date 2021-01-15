/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Locations and availability zones where the SKU is available.
 */
public class ResourceSkuLocationInfo {
    /**
     * Gets location of the SKU.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Gets list of availability zones where the SKU is supported.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Gets details of capabilities available to a SKU in specific zones.
     */
    @JsonProperty(value = "zoneDetails")
    private List<ResourceSkuZoneDetails> zoneDetails;

    /**
     * Get gets location of the SKU.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set gets location of the SKU.
     *
     * @param location the location value to set
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get gets list of availability zones where the SKU is supported.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set gets list of availability zones where the SKU is supported.
     *
     * @param zones the zones value to set
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get gets details of capabilities available to a SKU in specific zones.
     *
     * @return the zoneDetails value
     */
    public List<ResourceSkuZoneDetails> zoneDetails() {
        return this.zoneDetails;
    }

    /**
     * Set gets details of capabilities available to a SKU in specific zones.
     *
     * @param zoneDetails the zoneDetails value to set
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZoneDetails(List<ResourceSkuZoneDetails> zoneDetails) {
        this.zoneDetails = zoneDetails;
        return this;
    }

}
