package io.github.sojakstudio.nexorianew.npcinteract.shopinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.*
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent

@Name("크로노스 물약 상점")
class ChronosPotionShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val witherHealPotion = MakeItem.createPotionStack(
                    arrayOf(
                        "위더 회복 포션이다. ${ChatColor.RED}(금괴 35개)",
                        "${ChatColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
                    ),
                    "${ChatColor.LIGHT_PURPLE}위더 회복 포션",
                    Color.GRAY
                )

                purchaseItem(
                    player,
                    witherHealPotion,
                    35,
                    "위더 회복 포션을 구매했습니다 ${ChatColor.RED}(-금괴 35개)"
                )
            }
        }
    }
}