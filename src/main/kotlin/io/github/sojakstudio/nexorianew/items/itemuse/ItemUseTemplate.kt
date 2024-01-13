package io.github.sojakstudio.nexorianew.items.itemuse

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class ItemUseTemplate : ItemUse() {
    override fun execute(player: Player) {
        player.sendMessage("템플릿")
    }

    override val itemStack: ItemStack
        get () = ItemStack(Material.BROWN_DYE)
}