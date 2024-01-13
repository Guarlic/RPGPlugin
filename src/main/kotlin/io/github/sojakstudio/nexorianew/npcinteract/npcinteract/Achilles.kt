package io.github.sojakstudio.nexorianew.npcinteract.npcinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player

@Name("[ 무기 상인 ] 아킬레스")
class Achilles : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${ChatColor.GOLD}아킬레스: ${ChatColor.WHITE}크로노스의 무기들은 품질이 좋기로 유명하지...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 무기 상점")

        val expertSword = MakeItem.createUnbreakableItemStack(
            Material.DIAMOND_SWORD,
            arrayOf(
                "숙련자의 검이다. ${ChatColor.RED}(금괴 100개)",
            ),
            "${ChatColor.GOLD}숙련자의 검"
        )

        val shabbyBow = MakeItem.createUnbreakableItemStack(
            Material.BOW,
            arrayOf(
                "허름한 활이다. ${ChatColor.RED}(금괴 30개)",
            ),
            "허름한 활"
        )

        shabbyBow.addEnchantment(Enchantment.ARROW_INFINITE, 1)

        val noobStaff = MakeItem.createUnbreakableItemStack(
            Material.WOODEN_HOE,
            arrayOf(
                "초심자의 스태프다. ${ChatColor.RED}(금괴 40개)",
            ),
            "초심자의 스태프"
        )

        inventory.setItem(11, expertSword)
        inventory.setItem(13, shabbyBow)
        inventory.setItem(15, noobStaff)

        player.openInventory(inventory)
    }
}