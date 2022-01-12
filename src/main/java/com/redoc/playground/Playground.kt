package com.redoc.playground

import org.bukkit.plugin.java.JavaPlugin

class Playground : JavaPlugin() {
    override fun onEnable() {
        server.apply {
            pluginManager.registerEvents(PluginListener(), this@Playground)
        }
    }

    override fun onDisable() {

    }
}