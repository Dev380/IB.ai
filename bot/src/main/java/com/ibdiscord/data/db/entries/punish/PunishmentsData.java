package com.ibdiscord.data.db.entries.punish;

import de.arraying.gravity.data.types.TypeSet;

/**
 * Copyright 2018 Arraying
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
public final class PunishmentsData extends TypeSet {

    private final String guild;

    public PunishmentsData(String guild) {
        this.guild = guild;
    }

    @Override
    protected String getUniqueIdentifier() {
        return "punishments_" + guild;
    }

}
