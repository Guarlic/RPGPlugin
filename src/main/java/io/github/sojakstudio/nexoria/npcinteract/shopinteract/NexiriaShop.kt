package io.github.sojakstudio.nexoria.npcinteract.shopinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent

@Name("넥시리아 상점")
class NexiriaShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val noobSword = MakeItem.createUnbreakableItemStack(
                    Material.WOODEN_SWORD,
                    arrayOf(
                        "초심자의 검이다. ${NamedTextColor.RED}(금괴 1개)",
                    ),
                    "초심자의 검"
                )

                purchaseItem(
                    player,
                    noobSword,
                    1,
                    "초심자의 검을 구매했습니다 ${NamedTextColor.RED}(-금괴 1개)"
                )
            }
            13 -> {
                val intermediateSword = MakeItem.createUnbreakableItemStack(
                    Material.STONE_SWORD,
                    arrayOf(
                        "중급자의 검이다. ${NamedTextColor.RED}(금괴 10개)",
                    ),
                    "${NamedTextColor.GREEN}중급자의 검"
                )

                purchaseItem(
                    player,
                    intermediateSword,
                    10,
                    "중급자의 검을 구매했습니다 ${NamedTextColor.RED}(-금괴 10개)"
                )
            }
        }
    }
}