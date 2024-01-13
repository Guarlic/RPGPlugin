package io.github.sojakstudio.nexorianew.items.itemmake

import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.PotionMeta
import java.util.*

object MakeItem {
    fun createUnbreakableItemStack(material: Material?, lore: Array<String>, displayName: String?): ItemStack {
        val resultItemStack = ItemStack(material!!, 1)
        val resultItemMeta = resultItemStack.itemMeta
        val resultItemLore = Vector<String>()

        val iteratorLore = lore.iterator()

        for (loreMessage in iteratorLore) {
            resultItemLore.add(loreMessage)
        }

        resultItemMeta.setDisplayName(displayName)
        resultItemMeta.isUnbreakable = true

        resultItemStack.itemMeta = resultItemMeta
        resultItemStack.lore = resultItemLore

        return resultItemStack
    }

    fun createBreakableItemStack(material: Material?, lore: Array<String>?, displayName: String): ItemStack {
        val resultItemStack = ItemStack(material!!, 1)
        val resultItemMeta = resultItemStack.itemMeta
        val resultItemLore = Vector<String>()

        val iteratorLore = lore!!.iterator()

        for (loreMessage in iteratorLore) {
            resultItemLore.add(loreMessage)
        }

        resultItemMeta.setDisplayName(displayName)
        resultItemMeta.isUnbreakable = false

        resultItemStack.setItemMeta(resultItemMeta)
        resultItemStack.lore = resultItemLore

        return resultItemStack
    }

    fun createPotionStack(lore: Array<String>, displayName: String?, color: Color?): ItemStack {
        val resultItemStack = ItemStack(Material.POTION, 1)
        val resultItemMeta = resultItemStack.itemMeta as PotionMeta
        val resultItemLore = Vector<String>()

        for (loreMessage in lore) {
            resultItemLore.add(loreMessage)
        }

        resultItemMeta.setDisplayName(displayName)
        resultItemMeta.color = color

        resultItemStack.itemMeta = resultItemMeta
        resultItemStack.lore = resultItemLore

        return resultItemStack
    }
}