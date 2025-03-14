// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.eventgrid.models.PrivateLinkResource;
import com.azure.resourcemanager.eventgrid.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName,
        String parentType,
        String parentName,
        String privateLinkResourceName,
        Context context) {
        Response<PrivateLinkResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, parentType, parentName, privateLinkResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource get(
        String resourceGroupName, String parentType, String parentName, String privateLinkResourceName) {
        PrivateLinkResourceInner inner =
            this.serviceClient().get(resourceGroupName, parentType, parentName, privateLinkResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateLinkResource> listByResource(
        String resourceGroupName, String parentType, String parentName) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByResource(resourceGroupName, parentType, parentName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByResource(
        String resourceGroupName, String parentType, String parentName, String filter, Integer top, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByResource(resourceGroupName, parentType, parentName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}
