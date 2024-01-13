package io.github.sojakstudio.nexorianew

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.lists.commandList
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class OnCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        for (_command in commandList) {
            val commandName = _command.javaClass.getAnnotation(Name::class.java).value
            if (commandName != command.name) continue

            _command.execute(sender, command, label, args)
        }

        return true
    }
}