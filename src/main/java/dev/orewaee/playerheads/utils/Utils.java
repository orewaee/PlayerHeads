package dev.orewaee.playerheads.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.destroystokyo.paper.profile.PlayerProfile;

public class Utils {
    public static ItemStack getHead(String name, int quantity) {
        PlayerProfile profile = Bukkit.createProfile(name);

        ItemStack item = new ItemStack(Material.PLAYER_HEAD, quantity);

        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setPlayerProfile(profile);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack getHead(Player player, int quantity) {
        String name = player.getName();

        return getHead(name, quantity);
    }
}
