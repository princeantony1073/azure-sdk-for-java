/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.maintenance.v2018_06_01_preview.ApplyUpdate;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.UpdateStatus;

class ApplyUpdateImpl extends WrapperImpl<ApplyUpdateInner> implements ApplyUpdate {
    private final MaintenanceManager manager;
    ApplyUpdateImpl(ApplyUpdateInner inner, MaintenanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MaintenanceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastUpdateTime() {
        return this.inner().lastUpdateTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public UpdateStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
