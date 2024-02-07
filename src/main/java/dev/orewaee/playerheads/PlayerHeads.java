package dev.orewaee.playerheads;

import org.bukkit.plugin.java.JavaPlugin;

public class PlayerHeads extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}
