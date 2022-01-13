package com.redoc.playground
import org.bukkit.plugin.java.JavaPlugin

/**
 * @author RedoC
 * */

class Playground : JavaPlugin() {
    override fun onEnable() {
        println("§aWelcome to RedoC's Playground")
        server.apply {
            pluginManager.registerEvents(PluginListener(), this@Playground)
        }

    }

    override fun onDisable() {

    }
}