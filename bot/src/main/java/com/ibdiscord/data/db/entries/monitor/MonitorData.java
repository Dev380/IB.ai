package com.ibdiscord.data.db.entries.monitor;

import de.arraying.gravity.data.types.TypeMap;
import lombok.AllArgsConstructor;

/**
 * Copyright 2019 Arraying
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public final @AllArgsConstructor class MonitorData extends TypeMap {

    /**
     * Whether or not the monitor is enabled.
     */
    public static final String ENABLED = "enabled";

    /**
     * The channel of the monitor channel.
     */
    public static final String CHANNEL = "channel";

    private final String guild;

    /**
     * Gets the unique identifier.
     * @return The identifier.
     */
    @Override
    protected String getUniqueIdentifier() {
        return "monitor_" + guild;
    }

}
