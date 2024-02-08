package dev.orewaee.playerheads.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class Messages {
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();

    public static final Component PLAYER_ONLY_COMMAND = miniMessage.deserialize("<#E74040>This command can only be used by players");
    public static final Component NO_PERMISSION = miniMessage.deserialize("<#E74040>You do not have permission to use this command");
    public static final Component INVALID_SYNTAX = miniMessage.deserialize("<#E74040>Incorrect command syntax");
    public static final Component SUCCESS = miniMessage.deserialize("<#16D886>Successfully");
}
