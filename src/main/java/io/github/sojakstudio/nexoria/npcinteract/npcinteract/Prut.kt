package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player

@Name("[ 갑옷 상인 ] 프루트")
class Prut : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.RED}프루트: ${NamedTextColor.WHITE}크로노스의 갑옷들은 품질이 좋기로 유명하지...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 갑옷 상점")

        val chronosArmorSet = MakeItem.createUnbreakableItemStack(
            Material.CHAINMAIL_CHESTPLATE,
            arrayOf(
                "크로노스 군사훈련소 군복이다. ${NamedTextColor.RED}(총합 금괴 50개)",
            ),
            "크로노스 군복세트"
        )

        val chronosUpgradedArmorSet = MakeItem.createUnbreakableItemStack(
            Material.IRON_CHESTPLATE,
            arrayOf(
                "크로노스 강화된 군복이다. ${NamedTextColor.RED}(총합 금괴 100개)",
            ),
            "${NamedTextColor.GREEN}크로노스 강화된 군복세트"
        )

        inventory.setItem(11, chronosArmorSet)
        inventory.setItem(13, chronosUpgradedArmorSet)

        player.openInventory(inventory)
    }
}