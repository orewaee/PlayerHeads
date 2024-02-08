package dev.orewaee.playerheads.commands;

import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GetTabCompleter implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return null;

        String playerName = player.getName();

        return switch (args.length) {
            case 1 -> List.of("get");
            case 2 -> {
                List<String> names = new ArrayList<>();

                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    String onlinePlayerName = onlinePlayer.getName();

                    if (onlinePlayerName.equals(playerName)) continue;

                    names.add(onlinePlayerName);
                }

                yield names;
            }

            default -> List.of();
        };

        /*
        if (args.length == 2) {
            List<String> names = new ArrayList<>();

            for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                String onlinePlayerName = onlinePlayer.getName();

                if (onlinePlayerName.equals(playerName)) continue;

                names.add(onlinePlayerName);
            }

            return names;
        }

        return List.of();
        */
    }
}
