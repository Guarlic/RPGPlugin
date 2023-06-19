package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player

@Name("[ 상점 주인 ] 칼리스")
class Kalis : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.GOLD}칼리스: ${NamedTextColor.WHITE}팝니다 팔아요~")

        val inventory = Bukkit.createInventory(null, 54, "넥시리아 상점")

        val noobSword = MakeItem.createUnbreakableItemStack(
            Material.WOODEN_SWORD,
            arrayOf(
                "초심자의 검이다. ${NamedTextColor.RED}(금괴 1개)",
            ),
            "초심자의 검"
        )

        val intermediateSword = MakeItem.createUnbreakableItemStack(
            Material.STONE_SWORD,
            arrayOf(
                "중급자의 검이다. ${NamedTextColor.RED}(금괴 10개)",
            ),
            "${NamedTextColor.GREEN}중급자의 검"
        )

        inventory.setItem(11, noobSword)
        inventory.setItem(13, intermediateSword)

        player.openInventory(inventory)
    }
}