package io.github.sojakstudio.nexoria.npcinteract.shopinteract

import io.github.sojakstudio.nexoria.lists.duplicatePurchaseItemList
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

open class ShopInteract {
    open fun execute(event: InventoryClickEvent, player: Player) {}

    fun getPlayerGold(player: Player): Int {
        var count = 0
        val inventory = player.inventory
        val contents = inventory.contents

        for (i in contents) {
            val type = i!!.type
            if (type != Material.GOLD_INGOT) continue

            val amount = i.amount
            count += amount
        }

        return count
    }

    fun getPlayerEmpty(player: Player): Int {
        var count = 0
        val inventory = player.inventory
        val contents = inventory.contents

        for (i in contents) {
            if (i != null) continue

            count++
        }

        player.sendMessage("$count")

        return count - 1
    }

    fun removePlayerGold(player: Player, amount: Int) {
        var removeAmount = amount
        val inventory = player.inventory
        val golds = inventory.all(Material.GOLD_INGOT).values

        for (i in golds) {
            val type = i.type
            if (type != Material.GOLD_INGOT) continue

            if (i.amount < removeAmount) {
                removeAmount -= i.amount

                i.amount = 0

                continue
            }

            i.amount -= removeAmount

            break
        }
    }

    fun purchaseItem(player: Player, item: ItemStack, requireGoldAmount: Int, purchaseMessage: String?) {
        val inventory = player.inventory
        val hasItem = inventory.contains(item)
        val location = player.location
        val type = item.type
        val world = player.world

        if (getPlayerEmpty(player) == 0) {
            player.sendMessage("${NamedTextColor.RED}구매 실패; 인벤토리 공간 부족")
            world.playSound(location, Sound.ITEM_TRIDENT_HIT, 5f, 0f)

            return
        }

        var canDuplicatePurchase = false

        for (material in duplicatePurchaseItemList) {
            if (type != material) continue

            canDuplicatePurchase = true
            break
        }

        if (hasItem && !canDuplicatePurchase) {
            player.sendMessage("${NamedTextColor.RED}구매 실패; 중복된 아이템")
            world.playSound(location, Sound.ITEM_TRIDENT_HIT, 5f, 0f)

            return
        }

        if (getPlayerGold(player) < requireGoldAmount) {
            player.sendMessage("${NamedTextColor.RED}구매 실패; 재료 부족")
            world.playSound(location, Sound.ITEM_TRIDENT_HIT, 5f, 0f)

            return
        }

        player.sendMessage(purchaseMessage!!)
        world.playSound(location, Sound.BLOCK_CHAIN_BREAK, 5f, 1f)
        inventory.addItem(item)

        removePlayerGold(player, requireGoldAmount)
    }
}