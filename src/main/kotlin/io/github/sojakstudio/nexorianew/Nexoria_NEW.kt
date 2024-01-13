package io.github.sojakstudio.nexorianew

import io.github.sojakstudio.nexorianew.ew.EventListener
import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.lists.commandList
import org.bukkit.plugin.java.JavaPlugin

class Nexoria_NEW : JavaPlugin() {
    override fun onEnable() {
        logger.info("$name Enabled")
        server.pluginManager.registerEvents(EventListener(), this)

        for (command in commandList) {
            val commandName = command.javaClass.getAnnotation(Name::class.java).value

            getCommand(commandName)!!.setExecutor(OnCommand())
        }
    }

    override fun onDisable() {
        logger.info("$name Disabled")
    }
}