// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The IpAddressAsset model. */
@Immutable
public final class IpAddressAsset extends InventoryAsset {

    /*
     * The ipAddress property.
     */
    @Generated
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The asns property.
     */
    @Generated
    @JsonProperty(value = "asns")
    private List<ObservedLong> asns;

    /*
     * The reputations property.
     */
    @Generated
    @JsonProperty(value = "reputations")
    private List<Reputation> reputations;

    /*
     * The webComponents property.
     */
    @Generated
    @JsonProperty(value = "webComponents")
    private List<WebComponent> webComponents;

    /*
     * The netRanges property.
     */
    @Generated
    @JsonProperty(value = "netRanges")
    private List<ObservedString> netRanges;

    /*
     * The headers property.
     */
    @Generated
    @JsonProperty(value = "headers")
    private List<ObservedHeader> headers;

    /*
     * The attributes property.
     */
    @Generated
    @JsonProperty(value = "attributes")
    private List<Attribute> attributes;

    /*
     * The cookies property.
     */
    @Generated
    @JsonProperty(value = "cookies")
    private List<Cookie> cookies;

    /*
     * The sslCerts property.
     */
    @Generated
    @JsonProperty(value = "sslCerts")
    private List<SslCertAsset> sslCerts;

    /*
     * The services property.
     */
    @Generated
    @JsonProperty(value = "services")
    private List<Service> services;

    /*
     * The ipBlocks property.
     */
    @Generated
    @JsonProperty(value = "ipBlocks")
    private List<IpBlock> ipBlocks;

    /*
     * The sources property.
     */
    @Generated
    @JsonProperty(value = "sources")
    private List<Source> sources;

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The banners property.
     */
    @Generated
    @JsonProperty(value = "banners")
    private List<Banner> banners;

    /*
     * The scanMetadata property.
     */
    @Generated
    @JsonProperty(value = "scanMetadata")
    private List<ScanMetadata> scanMetadata;

    /*
     * The nsRecord property.
     */
    @Generated
    @JsonProperty(value = "nsRecord")
    private List<ObservedBoolean> nsRecord;

    /*
     * The mxRecord property.
     */
    @Generated
    @JsonProperty(value = "mxRecord")
    private List<ObservedBoolean> mxRecord;

    /*
     * The location property.
     */
    @Generated
    @JsonProperty(value = "location")
    private List<ObservedLocation> location;

    /*
     * The hosts property.
     */
    @Generated
    @JsonProperty(value = "hosts")
    private List<ObservedString> hosts;

    /*
     * The nxdomain property.
     */
    @Generated
    @JsonProperty(value = "nxdomain")
    private List<ObservedBoolean> nxdomain;

    /*
     * The sslServerConfig property.
     */
    @Generated
    @JsonProperty(value = "sslServerConfig")
    private List<SslServerConfig> sslServerConfig;

    /*
     * The ipv4 property.
     */
    @Generated
    @JsonProperty(value = "ipv4")
    private Boolean ipv4;

    /*
     * The ipv6 property.
     */
    @Generated
    @JsonProperty(value = "ipv6")
    private Boolean ipv6;

    /** Creates an instance of IpAddressAsset class. */
    @Generated
    private IpAddressAsset() {}

    /**
     * Get the ipAddress property: The ipAddress property.
     *
     * @return the ipAddress value.
     */
    @Generated
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Get the asns property: The asns property.
     *
     * @return the asns value.
     */
    @Generated
    public List<ObservedLong> getAsns() {
        return this.asns;
    }

    /**
     * Get the reputations property: The reputations property.
     *
     * @return the reputations value.
     */
    @Generated
    public List<Reputation> getReputations() {
        return this.reputations;
    }

    /**
     * Get the webComponents property: The webComponents property.
     *
     * @return the webComponents value.
     */
    @Generated
    public List<WebComponent> getWebComponents() {
        return this.webComponents;
    }

    /**
     * Get the netRanges property: The netRanges property.
     *
     * @return the netRanges value.
     */
    @Generated
    public List<ObservedString> getNetRanges() {
        return this.netRanges;
    }

    /**
     * Get the headers property: The headers property.
     *
     * @return the headers value.
     */
    @Generated
    public List<ObservedHeader> getHeaders() {
        return this.headers;
    }

    /**
     * Get the attributes property: The attributes property.
     *
     * @return the attributes value.
     */
    @Generated
    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * Get the cookies property: The cookies property.
     *
     * @return the cookies value.
     */
    @Generated
    public List<Cookie> getCookies() {
        return this.cookies;
    }

    /**
     * Get the sslCerts property: The sslCerts property.
     *
     * @return the sslCerts value.
     */
    @Generated
    public List<SslCertAsset> getSslCerts() {
        return this.sslCerts;
    }

    /**
     * Get the services property: The services property.
     *
     * @return the services value.
     */
    @Generated
    public List<Service> getServices() {
        return this.services;
    }

    /**
     * Get the ipBlocks property: The ipBlocks property.
     *
     * @return the ipBlocks value.
     */
    @Generated
    public List<IpBlock> getIpBlocks() {
        return this.ipBlocks;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the banners property: The banners property.
     *
     * @return the banners value.
     */
    @Generated
    public List<Banner> getBanners() {
        return this.banners;
    }

    /**
     * Get the scanMetadata property: The scanMetadata property.
     *
     * @return the scanMetadata value.
     */
    @Generated
    public List<ScanMetadata> getScanMetadata() {
        return this.scanMetadata;
    }

    /**
     * Get the nsRecord property: The nsRecord property.
     *
     * @return the nsRecord value.
     */
    @Generated
    public List<ObservedBoolean> getNsRecord() {
        return this.nsRecord;
    }

    /**
     * Get the mxRecord property: The mxRecord property.
     *
     * @return the mxRecord value.
     */
    @Generated
    public List<ObservedBoolean> getMxRecord() {
        return this.mxRecord;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    @Generated
    public List<ObservedLocation> getLocation() {
        return this.location;
    }

    /**
     * Get the hosts property: The hosts property.
     *
     * @return the hosts value.
     */
    @Generated
    public List<ObservedString> getHosts() {
        return this.hosts;
    }

    /**
     * Get the nxdomain property: The nxdomain property.
     *
     * @return the nxdomain value.
     */
    @Generated
    public List<ObservedBoolean> getNxdomain() {
        return this.nxdomain;
    }

    /**
     * Get the sslServerConfig property: The sslServerConfig property.
     *
     * @return the sslServerConfig value.
     */
    @Generated
    public List<SslServerConfig> getSslServerConfig() {
        return this.sslServerConfig;
    }

    /**
     * Get the ipv4 property: The ipv4 property.
     *
     * @return the ipv4 value.
     */
    @Generated
    public Boolean isIpv4() {
        return this.ipv4;
    }

    /**
     * Get the ipv6 property: The ipv6 property.
     *
     * @return the ipv6 value.
     */
    @Generated
    public Boolean isIpv6() {
        return this.ipv6;
    }
}
