package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import org.bukkit.entity.Player

@Name("template")
class NPCInteractTemplate : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("이건 템플릿이다 이 멍청아")
    }
}