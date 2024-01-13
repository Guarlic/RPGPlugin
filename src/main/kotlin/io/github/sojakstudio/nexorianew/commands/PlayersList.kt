package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("유저리스트")
class PlayersList : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val player = sender as Player
        val players = player.server.onlinePlayers

        var text = "< 유저 리스트 >\n"

        if (players.isEmpty()) {
            player.sendMessage("${ChatColor.RED}참여해있는 유저가 없습니다")

            return
        }

        for (_player in players) {
            val name = _player.name

            if (_player.isOp) {
                text += "${ChatColor.GOLD}${name}${ChatColor.GRAY}, ${ChatColor.RED}*\n"

                continue
            }

            text += "${name}${ChatColor.GRAY},\n"
        }

        player.sendMessage(text)
    }
}