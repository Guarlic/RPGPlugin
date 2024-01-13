package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.*
import org.bukkit.entity.Player

@Name("[ 보급관 ] 레이너")
class Raynor : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.DARK_GRAY}레이너: ${ChatColor.WHITE}가져갈거 있으면 가져가.")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 보급고")

        val adeptSword = MakeItem.createUnbreakableItemStack(
            Material.IRON_SWORD,
            arrayOf(
                "상급자의 검이다. ${ChatColor.RED}(금괴 30개)",
            ),
            "${ChatColor.AQUA}상급자의 검"
        )

        val shield = MakeItem.createBreakableItemStack(
            Material.SHIELD,
            arrayOf(
                "크로노스 군용 방패이다. ${ChatColor.RED}(금괴 40개)",
            ),
            "크로노스 군용 방패"
        )

        val witherHealPotion = MakeItem.createPotionStack(
            arrayOf(
                "위더 회복 포션이다. ${ChatColor.RED}(금괴 35개)",
                "${ChatColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
            ),
            "${ChatColor.LIGHT_PURPLE}위더 회복 포션",
            Color.GRAY
        )

        inventory.setItem(11, adeptSword)
        inventory.setItem(13, shield)
        inventory.setItem(15, witherHealPotion)

        player.openInventory(inventory)
    }
}