package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("내스폰")
class UserSpawn : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val player = sender as Player
        val location = player.bedSpawnLocation

        if (location == null) {
            Spawn().execute(sender, command, label, args)

            return
        }

        player.teleport(location)

        player.removeScoreboardTag("pvp_player")
        player.removeScoreboardTag("cemetry_boss_bar")
    }
}