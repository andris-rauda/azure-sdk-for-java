// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * coolAccessRetrievalPolicy determines the data retrieval behavior from the cool tier to standard storage based on the
 * read pattern for cool access enabled volumes. The possible values for this field are: Default - Data will be pulled
 * from cool tier to standard storage on random reads. This policy is the default. OnRead - All client-driven data read
 * is pulled from cool tier to standard storage on both sequential and random reads. Never - No client-driven data is
 * pulled from cool tier to standard storage.
 */
public final class CoolAccessRetrievalPolicy extends ExpandableStringEnum<CoolAccessRetrievalPolicy> {
    /** Static value Default for CoolAccessRetrievalPolicy. */
    public static final CoolAccessRetrievalPolicy DEFAULT = fromString("Default");

    /** Static value OnRead for CoolAccessRetrievalPolicy. */
    public static final CoolAccessRetrievalPolicy ON_READ = fromString("OnRead");

    /** Static value Never for CoolAccessRetrievalPolicy. */
    public static final CoolAccessRetrievalPolicy NEVER = fromString("Never");

    /**
     * Creates a new instance of CoolAccessRetrievalPolicy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CoolAccessRetrievalPolicy() {
    }

    /**
     * Creates or finds a CoolAccessRetrievalPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CoolAccessRetrievalPolicy.
     */
    @JsonCreator
    public static CoolAccessRetrievalPolicy fromString(String name) {
        return fromString(name, CoolAccessRetrievalPolicy.class);
    }

    /**
     * Gets known CoolAccessRetrievalPolicy values.
     *
     * @return known CoolAccessRetrievalPolicy values.
     */
    public static Collection<CoolAccessRetrievalPolicy> values() {
        return values(CoolAccessRetrievalPolicy.class);
    }
}
