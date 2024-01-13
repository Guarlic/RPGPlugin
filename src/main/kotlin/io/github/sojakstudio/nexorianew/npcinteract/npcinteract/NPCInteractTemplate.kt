package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.entity.Player

@Name("template")
class NPCInteractTemplate : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("이건 템플릿이다 이 멍청아")
    }
}