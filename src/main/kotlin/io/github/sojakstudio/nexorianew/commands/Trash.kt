package io.github.sojakstudio.nexorianew.commands

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@Name("쓰레기통")
class Trash : Commands() {
    override fun execute(sender: CommandSender, command: Command?, label: String?, args: Array<String>?) {
        val inventory = Bukkit.createInventory(null, 9, "쓰레기통")
        val player = sender as Player

        player.openInventory(inventory)
    }
}