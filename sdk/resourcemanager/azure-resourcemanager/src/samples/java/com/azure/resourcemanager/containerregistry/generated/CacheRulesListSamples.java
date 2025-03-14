// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for CacheRules List. */
public final class CacheRulesListSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/CacheRuleList.json
     */
    /**
     * Sample code: CacheRuleList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cacheRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getCacheRules()
            .list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
