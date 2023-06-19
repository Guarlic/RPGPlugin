package io.github.sojakstudio.nexoria.npcinteract.shopinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent

@Name("크로노스 갑옷 상점")
class ChronosArmorShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val chronosArmorHelmet = MakeItem.createUnbreakableItemStack(
                    Material.CHAINMAIL_HELMET,
                    null,
                    "크로노스 군모"
                )

                val chronosArmorChestplate = MakeItem.createUnbreakableItemStack(
                    Material.CHAINMAIL_CHESTPLATE,
                    null,
                    "크로노스 군복 상의"
                )

                val chronosArmorLeggings = MakeItem.createUnbreakableItemStack(
                    Material.CHAINMAIL_LEGGINGS,
                    null,
                    "크로노스 군복 하의"
                )

                val chronosArmorBoots = MakeItem.createUnbreakableItemStack(
                    Material.CHAINMAIL_BOOTS,
                    null,
                    "크로노스 군화"
                )

                purchaseItem(
                    player,
                    chronosArmorHelmet,
                    10,
                    "크로노스 군모를 구매했습니다 ${NamedTextColor.RED}(-금괴 10개)"
                )

                purchaseItem(
                    player,
                    chronosArmorChestplate,
                    20,
                    "크로노스 군복 상의를 구매했습니다 ${NamedTextColor.RED}(-금괴 20개)"
                )

                purchaseItem(
                    player,
                    chronosArmorLeggings,
                    15,
                    "크로노스 군복 바지를 구매했습니다 ${NamedTextColor.RED}(-금괴 15개)"
                )

                purchaseItem(player,
                    chronosArmorBoots,
                    5,
                    "크로노스 군화를 구매했습니다 ${NamedTextColor.RED}(-금괴 5개)"
                )
            }

            13 -> {
                val chronosUpgradedArmorHelmet = MakeItem.createUnbreakableItemStack(
                    Material.IRON_HELMET,
                    null,
                    "${NamedTextColor.GREEN}크로노스 강화된 군모"
                )

                val chronosUpgradedArmorChestplate = MakeItem.createUnbreakableItemStack(
                    Material.IRON_CHESTPLATE,
                    null,
                    "${NamedTextColor.GREEN}크로노스 강화된 군복 상의"
                )

                val chronosUpgradedArmorLeggings = MakeItem.createUnbreakableItemStack(
                    Material.IRON_LEGGINGS,
                    null,
                    "${NamedTextColor.GREEN}크로노스 강화된 군복 바지"
                )

                val chronosUpgradedArmorBoots = MakeItem.createUnbreakableItemStack(
                    Material.IRON_BOOTS,
                    null,
                    "${NamedTextColor.GREEN}크로노스 강화된 군화"
                )

                purchaseItem(
                    player,
                    chronosUpgradedArmorHelmet,
                    20,
                    "크로노스 강화된 군모를 구매했습니다 ${NamedTextColor.RED}(-금괴 20개)"
                )

                purchaseItem(
                    player,
                    chronosUpgradedArmorChestplate,
                    40,
                    "크로노스 강화된 군복 상의를 구매했습니다 ${NamedTextColor.RED}(-금괴 40개)"
                )

                purchaseItem(
                    player,
                    chronosUpgradedArmorLeggings,
                    30,
                    "크로노스 강화된 군복 바지를 구매했습니다 ${NamedTextColor.RED}(-금괴 30개)"
                )

                purchaseItem(
                    player,
                    chronosUpgradedArmorBoots,
                    10,
                    "크로노스 강화된 군화를 구매했습니다 ${NamedTextColor.RED}(-금괴 10개)"
                )
            }
        }
    }
}