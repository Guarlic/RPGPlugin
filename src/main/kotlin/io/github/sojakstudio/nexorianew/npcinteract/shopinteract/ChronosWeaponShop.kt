package io.github.sojakstudio.nexorianew.npcinteract.shopinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.*
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

@Name("크로노스 무기 상점")
class ChronosWeaponShop : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        when (event.rawSlot) {
            11 -> {
                val expertSword = MakeItem.createUnbreakableItemStack(
                    Material.DIAMOND_SWORD,
                    arrayOf(
                        "숙련자의 검이다. ${ChatColor.RED}(금괴 100개)",
                    ),
                    "${ChatColor.GOLD}숙련자의 검"
                )

                purchaseItem(
                    player,
                    expertSword,
                    100,
                    "숙련자의 검을 구매했습니다 ${ChatColor.RED}(-금괴 100개)"
                )
            }
            13 -> {
                val hasArrow = player.inventory.contains(Material.ARROW)
                val location = player.location
                val world = player.world

                val shabbyBow = MakeItem.createUnbreakableItemStack(
                    Material.BOW,
                    arrayOf(
                        "허름한 활이다. ${ChatColor.RED}(금괴 30개)",
                    ),
                    "허름한 활"
                )

                shabbyBow.addEnchantment(Enchantment.ARROW_INFINITE, 1)

                if (!hasArrow && getPlayerEmpty(player) < 2) {
                    player.sendMessage("${ChatColor.RED}구매 실패; 인벤토리 공간 부족")
                    world.playSound(location, Sound.ITEM_TRIDENT_HIT, 5f, 0f)

                    return
                }

                if (getPlayerGold(player) < 30) {
                    player.sendMessage("${ChatColor.RED}구매 실패; 재료 부족")
                    world.playSound(location, Sound.ITEM_TRIDENT_HIT, 5f, 0f)

                    return
                }

                purchaseItem(
                    player,
                    shabbyBow,
                    30,
                    "허름한 활을 구매했습니다 ${ChatColor.RED}(-금괴 30개)"
                )

                if (hasArrow) return

                player.inventory.addItem(ItemStack(Material.ARROW, 1))
            }
            15 -> {
                val noobStaff = MakeItem.createUnbreakableItemStack(
                    Material.WOODEN_HOE,
                    arrayOf(
                        "초심자의 스태프다. ${ChatColor.RED}(금괴 40개)",
                    ),
                    "초심자의 스태프"
                )

                purchaseItem(
                    player,
                    noobStaff,
                    40,
                    "초심자의 스태프를 구매했습니다 ${ChatColor.RED}(-금괴 40개)"
                )
            }
        }
    }
}