package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("헤라")
class Hera : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.LIGHT_PURPLE}헤라: ${ChatColor.WHITE}꺅!!! (찰싹)")

        player.damage(1.0)
    }
}