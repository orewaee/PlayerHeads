package dev.orewaee.playerheads;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getPlayer();

        ItemStack head = Utils.getPlayerHead(player);

        Location location = player.getLocation();
        World world = player.getWorld();

        world.dropItem(location, head);
    }
}
