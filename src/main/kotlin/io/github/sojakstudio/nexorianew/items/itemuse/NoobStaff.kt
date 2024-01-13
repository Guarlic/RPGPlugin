package io.github.sojakstudio.nexorianew.items.itemuse

import io.github.sojakstudio.nexorianew.items.itemmake.MakeItem
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.Particle
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.entity.Snowball
import org.bukkit.inventory.ItemStack

class NoobStaff : ItemUse() {
    override fun execute(player: Player) {
        val world = player.world
        val location = player.location

        val magmaBall = player.launchProjectile(Snowball::class.java)

        magmaBall.item = ItemStack(Material.MAGMA_BLOCK)
        magmaBall.customName = "magma-ball"

        player.setCooldown(Material.WOODEN_HOE, 5)

        world.playSound(location, Sound.ITEM_FIRECHARGE_USE, 5f, 1f)

        world.spawnParticle(Particle.FLAME, location.add(0.0, 0.5, 0.0), 10)
    }

    override val itemStack: ItemStack
        get () =
            MakeItem.createUnbreakableItemStack(
                Material.WOODEN_HOE,
                arrayOf(
                    "초심자의 스태프다. ${ChatColor.RED}(금괴 40개)",
                ),
                "초심자의 스태프"
            )
}