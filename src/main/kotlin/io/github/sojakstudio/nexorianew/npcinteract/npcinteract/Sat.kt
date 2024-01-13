package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("사트")
class Sat : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.DARK_GRAY}사트: ${ChatColor.WHITE}부대에 있는 우리 형.. 괜찮은거겠지...")
    }
}