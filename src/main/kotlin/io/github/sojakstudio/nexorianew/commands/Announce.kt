package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("공지")
class Announce : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val player = sender as Player
        val players = player.server.onlinePlayers
        val name = player.name

        var text = ""

        if (args!!.isEmpty()) return

        for (msg in args) {
            text += "$msg "
        }

        for (_player in players) {
            _player.sendMessage("${ChatColor.GOLD}[ 공지 ] ${ChatColor.GREEN}${name}: ${ChatColor.WHITE}$text")
            _player.sendTitle(
                "${ChatColor.GOLD}[ 공지 ]",
                "${ChatColor.GREEN}${name}: ${ChatColor.WHITE}$text",
                0,
                100,
                0
            )
        }
    }
}