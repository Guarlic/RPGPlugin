package io.github.sojakstudio.nexoria.npcinteract.npcinteract

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.*
import org.bukkit.entity.Player

@Name("[ 물약 상인 ] 타닐")
class Tanil : NPCInteract() {
    override fun execute(player: Player) {
        player.sendMessage("${NamedTextColor.AQUA}타닐: ${NamedTextColor.WHITE}크로노스의 물약들은 품질이 좋기로 유명하지...")

        val inventory = Bukkit.createInventory(null, 54, "크로노스 물약 상점")

        val witherHealPotion = MakeItem.createPotionStack(
            arrayOf(
                "위더 회복 포션이다. ${NamedTextColor.RED}(금괴 35개)",
                "${NamedTextColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
            ),
            "${NamedTextColor.LIGHT_PURPLE}위더 회복 포션",
            Color.GRAY
        )

        inventory.setItem(11, witherHealPotion)

        player.openInventory(inventory)
    }
}