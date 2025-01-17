// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ObservedPortState model. */
@Immutable
public final class ObservedPortState extends ObservedValue {

    /*
     * The value property.
     */
    @Generated
    @JsonProperty(value = "value")
    private ObservedPortStateValue value;

    /*
     * The port property.
     */
    @Generated
    @JsonProperty(value = "port")
    private Integer port;

    /** Creates an instance of ObservedPortState class. */
    @Generated
    private ObservedPortState() {}

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    @Generated
    public ObservedPortStateValue getValue() {
        return this.value;
    }

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    @Generated
    public Integer getPort() {
        return this.port;
    }
}
