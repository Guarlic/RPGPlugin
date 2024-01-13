package io.github.sojakstudio.nexorianew.items.itemuse

import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class StrangeSword : ItemUse() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.DARK_RED}사기인듯 하다...")

        player.setCooldown(Material.GOLDEN_SWORD, 1)
    }

    override val itemStack: ItemStack
        get () =
            MakeItem.createBreakableItemStack(
                Material.GOLDEN_SWORD,
                arrayOf(
                    "수상한 검이다. ${ChatColor.RED}(금괴 200개)",
                ),
                "${ChatColor.GRAY}수상한 검"
            )
}