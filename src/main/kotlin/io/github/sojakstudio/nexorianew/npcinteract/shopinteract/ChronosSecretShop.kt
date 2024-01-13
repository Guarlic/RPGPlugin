package io.github.sojakstudio.nexorianew.npcinteract.shopinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent

@Name("크로노스 비밀 상점")
class ChronosSecretShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val strangeSword = MakeItem.createBreakableItemStack(
                    Material.GOLDEN_SWORD,
                    arrayOf(
                        "수상한 검이다. ${ChatColor.RED}(금괴 200개)",
                    ),
                    "${ChatColor.GRAY}수상한 검"
                )

                purchaseItem(
                    player,
                    strangeSword,
                    200,
                    "수상한 검을 구매했습니다 ${ChatColor.RED}(-금괴 200개)"
                )
            }
        }
    }
}