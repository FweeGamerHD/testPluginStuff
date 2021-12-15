package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MyListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.AQUA + "[" + ChatColor.RED + "+" + ChatColor.AQUA + "] " + ChatColor.GRAY + event.getPlayer().getName());
    }
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        event.setQuitMessage(ChatColor.AQUA + "[" + ChatColor.RED + "-" + ChatColor.AQUA + "] " + ChatColor.GRAY + event.getPlayer().getName());
    }
}
