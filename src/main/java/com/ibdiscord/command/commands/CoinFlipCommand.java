/* Copyright 2017-2019 Jarred Vardy
 *
 * This file is part of IB.ai.
 *
 * IB.ai is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * IB.ai is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with IB.ai. If not, see http://www.gnu.org/licenses/.
 */

package com.ibdiscord.command.commands;

import com.ibdiscord.command.Command;
import com.ibdiscord.command.CommandContext;
import com.ibdiscord.command.permissions.CommandPermission;

import java.util.Random;
import java.util.Set;

public class CoinFlipCommand extends Command {

    /**
     * Creates a new coinflip command.
     */
    public CoinFlipCommand() {
        super("coinflip",
                Set.of("flip", "headsortails", "coin"),
                CommandPermission.discord(),
                Set.of()
        );
    }

    @Override
    protected void execute(CommandContext context) {
        context.reply(new Random().nextInt(2) == 0 ? "Heads" : "Tails");
    }
}
