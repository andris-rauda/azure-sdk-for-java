// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ReportAssetSummaryResult model. */
@Immutable
public final class ReportAssetSummaryResult {

    /*
     * The collection of asset summaries.
     */
    @Generated
    @JsonProperty(value = "assetSummaries")
    private List<AssetSummaryResult> assetSummaries;

    /** Creates an instance of ReportAssetSummaryResult class. */
    @Generated
    private ReportAssetSummaryResult() {}

    /**
     * Get the assetSummaries property: The collection of asset summaries.
     *
     * @return the assetSummaries value.
     */
    @Generated
    public List<AssetSummaryResult> getAssetSummaries() {
        return this.assetSummaries;
    }
}
