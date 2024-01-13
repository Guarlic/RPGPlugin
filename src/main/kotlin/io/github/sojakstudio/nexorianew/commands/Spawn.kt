package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.Location
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("스폰")
class Spawn : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val player = sender as Player
        val world = player.world
        val location = Location(world, 0.5, -8.0, 0.5)

        player.teleport(location)

        player.removeScoreboardTag("pvp_player")
        player.removeScoreboardTag("cemetry_boss_bar")
    }
}