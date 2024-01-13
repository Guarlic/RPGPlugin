package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("[ 마법학자 ] 스콜리트")
class Skolit : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.GRAY}스콜리트: ${ChatColor.WHITE}방해하지 마. 2차 마법진 함수의 마나상수의 존재를 증명하고 있으니깐.")
    }
}