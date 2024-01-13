package io.github.sojakstudio.nexorianew.items.itemuse

import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.*
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class WitherHealPotion : ItemUse() {
    override fun execute(player: Player) {
        val inventory = player.inventory
        val location = player.location
        val world = player.world

        val witherHealPotion = MakeItem.createPotionStack(
            arrayOf(
                "위더 회복 포션이다. ${ChatColor.RED}(금괴 35개)",
                "${ChatColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
            ),
            "${ChatColor.LIGHT_PURPLE}위더 회복 포션",
            Color.GRAY
        )

        player.sendMessage("${ChatColor.LIGHT_PURPLE}위더 회복 포션을 사용하였습니다!")

        player.setCooldown(Material.POTION, 200)

        player.removePotionEffect(PotionEffectType.WITHER)
        player.addPotionEffect(PotionEffect(PotionEffectType.HEAL, 60, 1))

        world.playSound(location, Sound.UI_TOAST_IN, 5f, 1f)
        world.spawnParticle(Particle.HEART, location.add(0.0, 2.0, 0.0), 100)

        inventory.removeItem(witherHealPotion)
    }

    override val itemStack: ItemStack
        get () =
            MakeItem.createPotionStack(
                arrayOf(
                    "위더 회복 포션이다. ${ChatColor.RED}(금괴 35개)",
                    "${ChatColor.YELLOW}위더 효과를 제거하며, 재생 효과를 부여한다.",
                ),
                "${ChatColor.LIGHT_PURPLE}위더 회복 포션",
                Color.GRAY
            )
}