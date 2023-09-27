package ru.fecore;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class EventListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        byte[] integer = new byte[0];
        String uuid = String.valueOf(UUID.nameUUIDFromBytes(integer));
        FeCORE.getData().getConfig().set(uuid, player); // Здесь я хочу потом попробовать сделать /join, но я долбоеб, не умею
        FeCORE.getData().save();
        player.sendMessage(ChatColor.YELLOW +  player.getName() + ChatColor.WHITE + " Добро пожаловать на сервер!");
    }


}
