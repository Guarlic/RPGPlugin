package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player

@Name("[ 마법학자 ] 스콜리트")
class Skolit : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.GRAY}스콜리트: ${NamedTextColor.WHITE}방해하지 마. 2차 마법진 함수의 마나상수의 존재를 증명하고 있으니깐.")
    }
}