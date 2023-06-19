package io.github.sojakstudio.nexoria.npcinteract.shopinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
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
                        "수상한 검이다. ${NamedTextColor.RED}(금괴 200개)",
                    ),
                    "${NamedTextColor.GRAY}수상한 검"
                )

                purchaseItem(
                    player,
                    strangeSword,
                    200,
                    "수상한 검을 구매했습니다 ${NamedTextColor.RED}(-금괴 200개)"
                )
            }
        }
    }
}