// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** HA mode supported for a server. */
public final class HaMode extends ExpandableStringEnum<HaMode> {
    /** Static value SameZone for HaMode. */
    public static final HaMode SAME_ZONE = fromString("SameZone");

    /** Static value ZoneRedundant for HaMode. */
    public static final HaMode ZONE_REDUNDANT = fromString("ZoneRedundant");

    /**
     * Creates a new instance of HaMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HaMode() {
    }

    /**
     * Creates or finds a HaMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HaMode.
     */
    @JsonCreator
    public static HaMode fromString(String name) {
        return fromString(name, HaMode.class);
    }

    /**
     * Gets known HaMode values.
     *
     * @return known HaMode values.
     */
    public static Collection<HaMode> values() {
        return values(HaMode.class);
    }
}
