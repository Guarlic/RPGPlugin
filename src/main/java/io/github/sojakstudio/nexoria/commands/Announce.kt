package io.github.sojakstudio.nexoria.commands

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
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
            _player.sendMessage("${NamedTextColor.GOLD}[ 공지 ] ${NamedTextColor.GREEN}${name}: ${NamedTextColor.WHITE}$text")
            _player.sendTitle(
                "${NamedTextColor.GOLD}[ 공지 ]",
                "${NamedTextColor.GREEN}${name}: ${NamedTextColor.WHITE}$text",
                0,
                100,
                0
            )
        }
    }
}