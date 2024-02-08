package dev.orewaee.playerheads.commands;

import dev.orewaee.playerheads.utils.Messages;
import dev.orewaee.playerheads.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GetCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage(Messages.PLAYER_ONLY_COMMAND);
            return true;
        }

        if (!player.hasPermission("playerheads.command.get")) {
            sender.sendMessage(Messages.NO_PERMISSION);
            return true;
        }

        if (args.length == 0 || args.length > 3 || !args[0].equals("get")) {
            sender.sendMessage(Messages.INVALID_SYNTAX);
            return true;
        }

        String name = args.length == 1 ? player.getName() : args[1];
        int quantity = args.length < 3 ? 1 : Math.min(Math.max(Integer.parseInt(args[2]), 1), 64);

        ItemStack head = Utils.getHead(name, quantity);

        player.getInventory().addItem(head);
        player.sendMessage(Messages.SUCCESS);

        return true;
    }
}
