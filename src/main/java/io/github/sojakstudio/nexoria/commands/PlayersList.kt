package io.github.sojakstudio.nexoria.commands

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
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
            player.sendMessage("${NamedTextColor.RED}참여해있는 유저가 없습니다")

            return
        }

        for (_player in players) {
            val name = _player.name

            if (_player.isOp) {
                text += "${NamedTextColor.GOLD}${name}${NamedTextColor.GRAY}, ${NamedTextColor.RED}*\n"

                continue
            }

            text += "${name}${NamedTextColor.GRAY},\n"
        }

        player.sendMessage(text)
    }
}