// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IpRule model. */
@Fluent
public final class IpRule {
    /*
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /** Creates an instance of IpRule class. */
    public IpRule() {
    }

    /**
     * Get the addressPrefix property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the IpRule object itself.
     */
    public IpRule withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
