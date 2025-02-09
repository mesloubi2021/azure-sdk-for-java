// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the network interface update. */
@Fluent
public final class NetworkInterfaceUpdate {
    /*
     * Gets or sets the name of the network interface.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the ARM Id of the network resource to connect the virtual machine.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /*
     * NIC type
     */
    @JsonProperty(value = "nicType")
    private NicType nicType;

    /*
     * Gets or sets the power on boot.
     */
    @JsonProperty(value = "powerOnBoot")
    private PowerOnBootOption powerOnBoot;

    /*
     * Gets or sets the device key value.
     */
    @JsonProperty(value = "deviceKey")
    private Integer deviceKey;

    /**
     * Get the name property: Gets or sets the name of the network interface.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the network interface.
     *
     * @param name the name value to set.
     * @return the NetworkInterfaceUpdate object itself.
     */
    public NetworkInterfaceUpdate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the networkId property: Gets or sets the ARM Id of the network resource to connect the virtual machine.
     *
     * @return the networkId value.
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId property: Gets or sets the ARM Id of the network resource to connect the virtual machine.
     *
     * @param networkId the networkId value to set.
     * @return the NetworkInterfaceUpdate object itself.
     */
    public NetworkInterfaceUpdate withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the nicType property: NIC type.
     *
     * @return the nicType value.
     */
    public NicType nicType() {
        return this.nicType;
    }

    /**
     * Set the nicType property: NIC type.
     *
     * @param nicType the nicType value to set.
     * @return the NetworkInterfaceUpdate object itself.
     */
    public NetworkInterfaceUpdate withNicType(NicType nicType) {
        this.nicType = nicType;
        return this;
    }

    /**
     * Get the powerOnBoot property: Gets or sets the power on boot.
     *
     * @return the powerOnBoot value.
     */
    public PowerOnBootOption powerOnBoot() {
        return this.powerOnBoot;
    }

    /**
     * Set the powerOnBoot property: Gets or sets the power on boot.
     *
     * @param powerOnBoot the powerOnBoot value to set.
     * @return the NetworkInterfaceUpdate object itself.
     */
    public NetworkInterfaceUpdate withPowerOnBoot(PowerOnBootOption powerOnBoot) {
        this.powerOnBoot = powerOnBoot;
        return this;
    }

    /**
     * Get the deviceKey property: Gets or sets the device key value.
     *
     * @return the deviceKey value.
     */
    public Integer deviceKey() {
        return this.deviceKey;
    }

    /**
     * Set the deviceKey property: Gets or sets the device key value.
     *
     * @param deviceKey the deviceKey value to set.
     * @return the NetworkInterfaceUpdate object itself.
     */
    public NetworkInterfaceUpdate withDeviceKey(Integer deviceKey) {
        this.deviceKey = deviceKey;
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
