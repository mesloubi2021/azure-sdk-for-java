// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedAlertInner;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedAlert;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedAlertPropertiesTopDevicesListItem;
import com.azure.resourcemanager.security.models.ReportedSeverity;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IoTSecurityAggregatedAlertImpl implements IoTSecurityAggregatedAlert {
    private IoTSecurityAggregatedAlertInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    IoTSecurityAggregatedAlertImpl(
        IoTSecurityAggregatedAlertInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String alertType() {
        return this.innerModel().alertType();
    }

    public String alertDisplayName() {
        return this.innerModel().alertDisplayName();
    }

    public LocalDate aggregatedDateUtc() {
        return this.innerModel().aggregatedDateUtc();
    }

    public String vendorName() {
        return this.innerModel().vendorName();
    }

    public ReportedSeverity reportedSeverity() {
        return this.innerModel().reportedSeverity();
    }

    public String remediationSteps() {
        return this.innerModel().remediationSteps();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Long count() {
        return this.innerModel().count();
    }

    public String effectedResourceType() {
        return this.innerModel().effectedResourceType();
    }

    public String systemSource() {
        return this.innerModel().systemSource();
    }

    public String actionTaken() {
        return this.innerModel().actionTaken();
    }

    public String logAnalyticsQuery() {
        return this.innerModel().logAnalyticsQuery();
    }

    public List<IoTSecurityAggregatedAlertPropertiesTopDevicesListItem> topDevicesList() {
        List<IoTSecurityAggregatedAlertPropertiesTopDevicesListItem> inner = this.innerModel().topDevicesList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IoTSecurityAggregatedAlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
