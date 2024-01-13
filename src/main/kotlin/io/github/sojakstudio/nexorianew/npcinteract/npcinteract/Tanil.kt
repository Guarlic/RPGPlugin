package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.*
import org.bukkit.entity.Player

@Name("[ 물약 상인 ] 타닐")
class Tanil : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.AQUA}타닐: ${ChatColor.WHITE}크로노스의 물약들은 품질이 좋기로 유명하지...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 물약 상점")

        val witherHealPotion = MakeItem.createPotionStack(
            arrayOf(
                "위더 회복 포션이다. ${ChatColor.RED}(금괴 35개)",
                "${ChatColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
            ),
            "${ChatColor.LIGHT_PURPLE}위더 회복 포션",
            Color.GRAY
        )

        inventory.setItem(11, witherHealPotion)

        player.openInventory(inventory)
    }
}