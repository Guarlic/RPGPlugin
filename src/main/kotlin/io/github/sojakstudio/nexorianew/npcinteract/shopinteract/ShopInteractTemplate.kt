package io.github.sojakstudio.nexorianew.npcinteract.shopinteract

import io.github.sojakstudio.nexorianew.interfaces.Name
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryClickEvent

@Name("template")
class ShopInteractTemplate : ShopInteract() {
    override fun execute(event: InventoryClickEvent, player: Player) {
        player.sendMessage("니가 누른건 ${event.rawSlot}번 칸이다!")
    }
}