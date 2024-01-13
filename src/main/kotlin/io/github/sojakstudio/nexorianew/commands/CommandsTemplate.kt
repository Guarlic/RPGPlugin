package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("template")
class CommandsTemplate : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val player = sender as Player

        player.sendMessage("이것이 바로 명령어 템플릿???")
    }
}