package io.github.sojakstudio.nexorianew.lists

import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.ChatColor
import org.bukkit.Material

private val expertSword = MakeItem.createUnbreakableItemStack(
    Material.DIAMOND_SWORD,
    arrayOf(
        "숙련자의 검이다. ${ChatColor.RED}(금괴 100개)",
    ),
    "${ChatColor.GOLD}숙련자의 검"
)

val velocityResistanceItemList = arrayOf(
    expertSword,
)
