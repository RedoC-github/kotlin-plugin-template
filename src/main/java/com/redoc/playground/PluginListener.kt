package com.redoc.playground

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

/**
 * @author RedoC
 * */

class PluginListener: Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.player.kickPlayer("§4§lEMERGENCY MAINTENANCE§r\n" + "긴급 서버 점검중입니다. 불편을 드려 죄송합니다.")
        event.joinMessage = "§a[SERVER]§r " + "Welcome, " + event.player.name
    }

    @EventHandler
    fun onQuit(event: PlayerQuitEvent) {
        event.quitMessage = "§a[SERVER]§r " + "Bye, " + event.player.name
    }
}