// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SharePoint Online List linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SharePointOnlineList")
@JsonFlatten
@Fluent
public class SharePointOnlineListLinkedService extends LinkedService {
    /*
     * The URL of the SharePoint Online site. For example, https://contoso.sharepoint.com/sites/siteName. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.siteUrl", required = true)
    private Object siteUrl;

    /*
     * The tenant ID under which your application resides. You can find it from Azure portal Active Directory overview
     * page. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenantId", required = true)
    private Object tenantId;

    /*
     * The application (client) ID of your application registered in Azure Active Directory. Make sure to grant
     * SharePoint site permission to this application. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /*
     * The client secret of your application registered in Azure Active Directory. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of SharePointOnlineListLinkedService class. */
    public SharePointOnlineListLinkedService() {}

    /**
     * Get the siteUrl property: The URL of the SharePoint Online site. For example,
     * https://contoso.sharepoint.com/sites/siteName. Type: string (or Expression with resultType string).
     *
     * @return the siteUrl value.
     */
    public Object getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * Set the siteUrl property: The URL of the SharePoint Online site. For example,
     * https://contoso.sharepoint.com/sites/siteName. Type: string (or Expression with resultType string).
     *
     * @param siteUrl the siteUrl value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService setSiteUrl(Object siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    /**
     * Get the tenantId property: The tenant ID under which your application resides. You can find it from Azure portal
     * Active Directory overview page. Type: string (or Expression with resultType string).
     *
     * @return the tenantId value.
     */
    public Object getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant ID under which your application resides. You can find it from Azure portal
     * Active Directory overview page. Type: string (or Expression with resultType string).
     *
     * @param tenantId the tenantId value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService setTenantId(Object tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The application (client) ID of your application registered in Azure Active
     * Directory. Make sure to grant SharePoint site permission to this application. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The application (client) ID of your application registered in Azure Active
     * Directory. Make sure to grant SharePoint site permission to this application. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The client secret of your application registered in Azure Active Directory.
     * Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The client secret of your application registered in Azure Active Directory.
     * Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SharePointOnlineListLinkedService object itself.
     */
    public SharePointOnlineListLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
