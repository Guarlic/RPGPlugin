package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player

@Name("[ 갑옷 상인 ] 프루트")
class Prut : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.RED}프루트: ${ChatColor.WHITE}크로노스의 갑옷들은 품질이 좋기로 유명하지...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 갑옷 상점")

        val chronosArmorSet = MakeItem.createUnbreakableItemStack(
            Material.CHAINMAIL_CHESTPLATE,
            arrayOf(
                "크로노스 군사훈련소 군복이다. ${ChatColor.RED}(총합 금괴 50개)",
            ),
            "크로노스 군복세트"
        )

        val chronosUpgradedArmorSet = MakeItem.createUnbreakableItemStack(
            Material.IRON_CHESTPLATE,
            arrayOf(
                "크로노스 강화된 군복이다. ${ChatColor.RED}(총합 금괴 100개)",
            ),
            "${ChatColor.GREEN}크로노스 강화된 군복세트"
        )

        inventory.setItem(11, chronosArmorSet)
        inventory.setItem(13, chronosUpgradedArmorSet)

        player.openInventory(inventory)
    }
}