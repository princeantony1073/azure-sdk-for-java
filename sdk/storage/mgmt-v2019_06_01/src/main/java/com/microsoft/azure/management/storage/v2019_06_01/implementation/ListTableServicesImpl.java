/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.ListTableServices;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class ListTableServicesImpl extends WrapperImpl<ListTableServicesInner> implements ListTableServices {
    private final StorageManager manager;
    ListTableServicesImpl(ListTableServicesInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public List<TableServicePropertiesInner> value() {
        return this.inner().value();
    }

}
