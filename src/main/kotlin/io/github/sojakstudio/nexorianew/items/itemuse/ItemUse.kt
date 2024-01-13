package io.github.sojakstudio.nexorianew.items.itemuse

import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

open class ItemUse {
    open fun execute(player: Player) {}
    open val itemStack: ItemStack?
        get () = null
}