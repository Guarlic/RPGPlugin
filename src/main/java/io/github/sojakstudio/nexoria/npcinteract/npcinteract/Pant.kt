package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player

@Name("[ 대장장이 ] 판트")
class Pant : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.DARK_GRAY}판트: ${NamedTextColor.WHITE}자네는 아직 자격이 부족해..")
    }
}