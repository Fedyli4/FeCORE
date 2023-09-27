package ru.fecore;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player1 = e.getPlayer();
        player1.sendMessage(ChatColor.YELLOW +  player1.getName() + ChatColor.WHITE + " Добро пожаловать на сервер!");
    }


}
