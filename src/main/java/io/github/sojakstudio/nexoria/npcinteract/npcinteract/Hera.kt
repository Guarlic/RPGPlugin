package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player

@Name("헤라")
class Hera : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.LIGHT_PURPLE}헤라: ${NamedTextColor.WHITE}꺅!!! (찰싹)")

        player.damage(1.0)
    }
}