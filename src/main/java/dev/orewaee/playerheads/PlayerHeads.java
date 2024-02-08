package dev.orewaee.playerheads;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev.orewaee.playerheads.commands.GetCommandExecutor;
import dev.orewaee.playerheads.commands.GetTabCompleter;

public class PlayerHeads extends JavaPlugin {
    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();
    }

    private void registerEvents() {
        PluginManager pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(new EventListener(), this);
    }

    private void registerCommands() {
        PluginCommand command = getCommand("playerheads");

        if (command == null) return;

        command.setExecutor(new GetCommandExecutor());
        command.setTabCompleter(new GetTabCompleter());
    }
}
