// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of billable asset. */
public final class ReportBillableAssetBreakdownKind extends ExpandableStringEnum<ReportBillableAssetBreakdownKind> {

    /** Static value domain for ReportBillableAssetBreakdownKind. */
    @Generated public static final ReportBillableAssetBreakdownKind DOMAIN = fromString("domain");

    /** Static value host for ReportBillableAssetBreakdownKind. */
    @Generated public static final ReportBillableAssetBreakdownKind HOST = fromString("host");

    /** Static value ipAddress for ReportBillableAssetBreakdownKind. */
    @Generated public static final ReportBillableAssetBreakdownKind IP_ADDRESS = fromString("ipAddress");

    /**
     * Creates a new instance of ReportBillableAssetBreakdownKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ReportBillableAssetBreakdownKind() {}

    /**
     * Creates or finds a ReportBillableAssetBreakdownKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportBillableAssetBreakdownKind.
     */
    @Generated
    @JsonCreator
    public static ReportBillableAssetBreakdownKind fromString(String name) {
        return fromString(name, ReportBillableAssetBreakdownKind.class);
    }

    /**
     * Gets known ReportBillableAssetBreakdownKind values.
     *
     * @return known ReportBillableAssetBreakdownKind values.
     */
    @Generated
    public static Collection<ReportBillableAssetBreakdownKind> values() {
        return values(ReportBillableAssetBreakdownKind.class);
    }
}
