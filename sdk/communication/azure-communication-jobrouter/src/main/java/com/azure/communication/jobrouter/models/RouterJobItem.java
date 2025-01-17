// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of RouterJob. */
@Immutable
public final class RouterJobItem {
    /*
     * A unit of work to be routed
     */
    @Generated
    @JsonProperty(value = "job")
    private RouterJob job;

    /*
     * (Optional) The Concurrency Token.
     */
    @Generated
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Creates an instance of RouterJobItem class.
     *
     * @param job the job value to set.
     * @param etag the etag value to set.
     */
    @Generated
    @JsonCreator
    private RouterJobItem(@JsonProperty(value = "job") RouterJob job, @JsonProperty(value = "etag") String etag) {
        this.job = job;
        this.etag = etag;
    }

    /**
     * Get the job property: A unit of work to be routed.
     *
     * @return the job value.
     */
    @Generated
    public RouterJob getJob() {
        return this.job;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }
}
