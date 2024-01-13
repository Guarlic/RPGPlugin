package io.github.sojakstudio.nexorianew.npcinteract.shopinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent
import java.util.*

@Name("넥시리아 상점")
class NexiriaShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val noobSword = MakeItem.createUnbreakableItemStack(
                    Material.WOODEN_SWORD,
                    arrayOf(
                        "초심자의 검이다. ${ChatColor.RED}(금괴 1개)",
                    ),
                    "초심자의 검"
                )

                purchaseItem(
                    player,
                    noobSword,
                    1,
                    "초심자의 검을 구매했습니다 ${ChatColor.RED}(-금괴 1개)"
                )
            }
            13 -> {
                val intermediateSword = MakeItem.createUnbreakableItemStack(
                    Material.STONE_SWORD,
                    arrayOf(
                        "중급자의 검이다. ${ChatColor.RED}(금괴 10개)",
                    ),
                    "${ChatColor.GREEN}중급자의 검"
                )

                purchaseItem(
                    player,
                    intermediateSword,
                    10,
                    "중급자의 검을 구매했습니다 ${ChatColor.RED}(-금괴 10개)"
                )
            }
        }
    }
}