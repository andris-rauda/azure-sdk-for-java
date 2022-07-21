// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Emission policy destination properties. */
@Fluent
public final class EmissionPolicyDestination {
    /*
     * Emission destination type.
     */
    @JsonProperty(value = "destinationType")
    private DestinationType destinationType;

    /**
     * Get the destinationType property: Emission destination type.
     *
     * @return the destinationType value.
     */
    public DestinationType destinationType() {
        return this.destinationType;
    }

    /**
     * Set the destinationType property: Emission destination type.
     *
     * @param destinationType the destinationType value to set.
     * @return the EmissionPolicyDestination object itself.
     */
    public EmissionPolicyDestination withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
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