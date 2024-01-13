package io.github.sojakstudio.nexorianew.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandSender

open class Commands {
    open fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {}
}