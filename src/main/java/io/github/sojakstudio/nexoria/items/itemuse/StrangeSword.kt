package io.github.sojakstudio.nexoria.items.itemuse

import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class StrangeSword : ItemUse() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.DARK_RED}사기인듯 하다...")

        player.setCooldown(Material.GOLDEN_SWORD, 1)
    }

    override val itemStack: ItemStack
        get () =
            MakeItem.createBreakableItemStack(
                Material.GOLDEN_SWORD,
                arrayOf(
                    "수상한 검이다. ${NamedTextColor.RED}(금괴 200개)",
                ),
                "${NamedTextColor.GRAY}수상한 검"
            )
}