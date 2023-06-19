package io.github.sojakstudio.nexoria

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.lists.commandList
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("RPGPlugin Enabled")
        server.pluginManager.registerEvents(EventListener(), this)

        for (command in commandList) {
            val commandName = command.javaClass.getAnnotation(Name::class.java).value

            getCommand(commandName)!!.setExecutor(OnCommand())
        }
    }

    override fun onDisable() {
        logger.info("RPGPlugin Disabled")
    }
}