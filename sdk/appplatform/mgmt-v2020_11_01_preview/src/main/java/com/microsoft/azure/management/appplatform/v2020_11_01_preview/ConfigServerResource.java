/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.AppPlatformManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.ConfigServerResourceInner;

/**
 * Type representing ConfigServerResource.
 */
public interface ConfigServerResource extends HasInner<ConfigServerResourceInner>, HasManager<AppPlatformManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ConfigServerProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
