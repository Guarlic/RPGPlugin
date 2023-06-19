package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player

@Name("[ 상가 주인 ] 하크")
class Hawk : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.GRAY}하크: ${NamedTextColor.WHITE}위 층에는 많은 상점들이 있지.. 한 번 가보지 않겠나..?")
    }
}