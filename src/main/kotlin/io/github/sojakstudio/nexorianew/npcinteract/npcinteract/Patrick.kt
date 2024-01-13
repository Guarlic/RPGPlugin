package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.ChatColor
import org.bukkit.entity.Player

@Name("[ 여관 주인 ] 패트릭")
class Patrick : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("""${ChatColor.DARK_GRAY}패트릭: ${ChatColor.WHITE}어서오세요! 외부인은 처음인데요?!
       위로 가서 휴식을 취하는건 어떠세요? (세이브포인트 저장완료)""")
    }
}