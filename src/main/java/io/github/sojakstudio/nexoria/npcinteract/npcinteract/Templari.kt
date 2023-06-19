package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player

@Name("[ 비밀 상인 ] 템플라이")
class Templari : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.DARK_GRAY}템플라이: ${ChatColor.WHITE}사람.. 오랜만이군...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 비밀 상점")

        val strangeSword = MakeItem.createBreakableItemStack(
            Material.GOLDEN_SWORD,
            arrayOf(
                "수상한 검이다. ${ChatColor.RED}(금괴 200개)",
            ),
            "${ChatColor.GRAY}수상한 검"
        )

        inventory.setItem(11, strangeSword)

        player.openInventory(inventory)
    }
}