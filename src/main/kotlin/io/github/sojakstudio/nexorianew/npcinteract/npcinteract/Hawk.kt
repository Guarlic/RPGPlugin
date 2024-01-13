package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("[ 상가 주인 ] 하크")
class Hawk : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.GRAY}하크: ${ChatColor.WHITE}위 층에는 많은 상점들이 있지.. 한 번 가보지 않겠나..?")
    }
}