package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("[ 대장장이 ] 판트")
class Pant : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.DARK_GRAY}판트: ${ChatColor.WHITE}자네는 아직 자격이 부족해..")
    }
}