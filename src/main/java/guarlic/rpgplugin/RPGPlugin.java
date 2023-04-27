package guarlic.rpgplugin;

import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import guarlic.rpgplugin.NPCInteract.NPCInteract;
import guarlic.rpgplugin.NPCInteract.ShopInteract;

public final class RPGPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void Join(PlayerJoinEvent e) {
        // Player Join
        Player p = e.getPlayer();

        p.sendMessage(ChatColor.GREEN + "https://cdn.discordapp.com/attachments/1085437499557560411/1099305024250724524/RPGSoundPack.zip\n"
            + ChatColor.GRAY + " 리소스팩을 다운로드 하시면 브금을 들으실 수 있어여! (토글명령어: /배경음악)");
    }

    @EventHandler
    public void NPCClick(NPCRightClickEvent e) {
        // Interaction with NPC
        Player p = e.getClicker();

        switch (e.getNPC().getName()) {
            case "[ 마법학자 ] 스콜리트":
                NPCInteract.Skolit(p);
                break;

            case "[ 상점 주인 ] 칼리스":
                NPCInteract.Kalis(p);
                break;

            case "[보급관] 레이너":
                NPCInteract.Raynor(p);
                break;
        }
    }

    @EventHandler
    public void inventoryClick(InventoryClickEvent e) {
        // Interaction with Shop GUI
        switch (e.getView().getTitle()) {
            case "넥시리아 상점":
                e.setCancelled(true);
                ShopInteract.NexiriaShop(e);
                break;

            case "크로노스 보급고":
                e.setCancelled(true);
                ShopInteract.ChronosSupplyDepot(e);
                break;
        }
    }
}
