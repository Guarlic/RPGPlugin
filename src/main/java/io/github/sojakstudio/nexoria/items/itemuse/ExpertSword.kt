package io.github.sojakstudio.nexoria.items.itemuse

import io.github.sojakstudio.nexoria.items.itemmake.MakeItem
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.Particle
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class ExpertSword : ItemUse() {
    override fun execute(player: Player) {
        val location = player.location
        val world = player.world

        player.sendMessage("${NamedTextColor.AQUA}숙련자의 검이 울며 반응한다...")

        player.setCooldown(Material.DIAMOND_SWORD, 300)

        player.addPotionEffect(PotionEffect(PotionEffectType.SPEED, 100, 2))
        player.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 100, 0))
        player.addPotionEffect(PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 0))
        player.addPotionEffect(PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 1))

        world.playSound(location, Sound.ITEM_ARMOR_EQUIP_NETHERITE, 10f, 0f)
        world.playSound(location, Sound.ENTITY_ENDER_DRAGON_SHOOT, 5f, 1f)
        world.playSound(location, Sound.ITEM_TRIDENT_RIPTIDE_3, 5f, 0f)
        world.playSound(location, Sound.ITEM_TRIDENT_THUNDER, 5f, 2f)

        world.spawnParticle(Particle.FLAME, location.add(0.0, 0.5, 0.0), 10)
    }

    override val itemStack: ItemStack
        get () =
            MakeItem.createUnbreakableItemStack(
                Material.DIAMOND_SWORD,
                arrayOf(
                    "숙련자의 검이다. ${NamedTextColor.RED}(금괴 100개)",
                ),
                "${NamedTextColor.GOLD}숙련자의 검"
            )
}