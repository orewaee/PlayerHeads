package dev.orewaee.playerheads;

import com.destroystokyo.paper.profile.PlayerProfile;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Utils {
    public static ItemStack getPlayerHead(Player player) {
        String name = player.getName();

        PlayerProfile profile = Bukkit.createProfile(name);

        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1);

        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setPlayerProfile(profile);

        item.setItemMeta(meta);

        return item;
    }
}
