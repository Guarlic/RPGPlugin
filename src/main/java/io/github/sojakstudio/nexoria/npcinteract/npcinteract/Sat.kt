package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player

@Name("사트")
class Sat : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.DARK_GRAY}사트: ${NamedTextColor.WHITE}부대에 있는 우리 형.. 괜찮은거겠지...")
    }
}