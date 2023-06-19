package io.github.sojakstudio.nexoria

import io.github.sojakstudio.nexoria.interfaces.Name
import io.github.sojakstudio.nexoria.lists.*
import net.citizensnpcs.api.event.NPCRightClickEvent
import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerLevelChangeEvent
import org.bukkit.event.player.PlayerVelocityEvent

class EventListener : Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player

        player.sendMessage("""${ChatColor.GREEN}https://cdn.discordapp.com/attachments/1085437499557560411/1099305024250724524/RPGSoundPack.zip
${ChatColor.GRAY} 리소스팩을 다운로드 하시면 브금을 들으실 수 있어여! (토글명령어: /배경음악)""")
    }

    @EventHandler
    fun onNPCInteract(event: NPCRightClickEvent) {
        val player = event.clicker
        val npcName = event.npc.name

        for (npcInteract in npcInteractList) {
            val npcInteractName = npcInteract.javaClass.getAnnotation(Name::class.java).value
            if (npcInteractName != npcName) continue

            npcInteract.execute(player)
        }
    }

    @EventHandler
    fun onInventoryClick(event: InventoryClickEvent) {
        val player = event.whoClicked as Player
        val inventoryName = event.view.title

        for (inventoryInteract in inventoryInteractList) {
            val inventoryInteractName = inventoryInteract.javaClass.getAnnotation(Name::class.java).value
            if (inventoryInteractName != inventoryName) continue

            event.isCancelled = true
            inventoryInteract.execute(event, player)
        }
    }

    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        val action = event.action
        if (action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) return

        val player = event.player
        val mainHandItem = player.inventory.itemInMainHand

        for (item in itemUseList) {
            val itemStack = item.itemStack

            if (itemStack != mainHandItem) continue
            if (player.getCooldown(itemStack.type) > 0) continue

            item.execute(player)
        }
    }

    @EventHandler
    fun onVelocity(event: PlayerVelocityEvent) {
        val player = event.player
        val mainHandItem = player.inventory.itemInMainHand

        for (item in velocityResistanceItemList) {
            if (mainHandItem != item) continue

            event.isCancelled = true
        }
    }

    @EventHandler
    fun onLevelChange(event: PlayerLevelChangeEvent) {
        val oldLevel = event.oldLevel
        val newLevel = event.newLevel

        if (oldLevel > newLevel) return

        val player = event.player
        val location = player.location
        val world = player.world

        player.sendMessage("${ChatColor.GREEN}레벨업 하였습니다! (${ChatColor.YELLOW} ${oldLevel} -> ${newLevel} ${ChatColor.GREEN})")

        if (newLevel % 10 == 0) world.playSound(location, Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0.toFloat(), 1.1.toFloat())
        else world.playSound(location, Sound.UI_TOAST_CHALLENGE_COMPLETE, 1f, 2f)
    }

    @EventHandler
    fun onDeath(event: PlayerDeathEvent) {
        val player = event.player
        val name = player.name

        player.sendMessage("${ChatColor.RED}${name}님, 사망하셨습니다.")
    }
}