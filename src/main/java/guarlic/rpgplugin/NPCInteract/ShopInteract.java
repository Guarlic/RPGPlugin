package guarlic.rpgplugin.NPCInteract;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Vector;

public class ShopInteract {
    public static void NexiriaShop(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getRawSlot() == 11) {
            ItemStack noob_sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta noob_sword_meta = noob_sword.getItemMeta();

            Vector<String> noob_sword_lore = new Vector<String>();

            noob_sword_meta.setDisplayName("초심자의 검");
            noob_sword_meta.setUnbreakable(true);
            noob_sword_lore.add("초심자의 검이다. " + ChatColor.GOLD + "(금괴 1개)");

            noob_sword.setItemMeta(noob_sword_meta);
            noob_sword.setLore(noob_sword_lore);

            if (p.getInventory().contains(Material.GOLD_INGOT)
                    && !p.getInventory().contains(noob_sword)) {
                p.sendMessage("초심자의 검을 구매했습니다 " + ChatColor.RED + "(금괴 1개)");
                p.getWorld().playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5, 1);
                p.getInventory().addItem(noob_sword);

                for (ItemStack i : p.getInventory().all(Material.GOLD_INGOT).values()) {
                    if (i.getType().equals(Material.GOLD_INGOT)) {
                        i.setAmount(i.getAmount() - 1);
                        break;
                    }
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "구매 실패; 중복된 아이템/재료 부족");
            }
        }
        else if (e.getRawSlot() == 13) {
            ItemStack intermediate_sword = new ItemStack(Material.STONE_SWORD, 1);
            ItemMeta intermediate_sword_meta = intermediate_sword.getItemMeta();
            Vector<String> intermediate_sword_lore = new Vector<String>();

            intermediate_sword_meta.setDisplayName(ChatColor.GREEN + "중급자의 검");
            intermediate_sword_meta.setUnbreakable(true);
            intermediate_sword_lore.add("중급자의 검이다. " + ChatColor.GOLD + "(금괴 10개)");

            intermediate_sword.setItemMeta(intermediate_sword_meta);
            intermediate_sword.setLore(intermediate_sword_lore);

            if (p.getInventory().contains(Material.GOLD_INGOT)
                    && !p.getInventory().contains(intermediate_sword)
                    && GoldCount(p) >= 10) {
                p.sendMessage("중급자의 검을 구매했습니다 " + ChatColor.RED + "(-금괴 10개)");
                p.getWorld().playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5, 1);
                p.getInventory().addItem(intermediate_sword);

                for (ItemStack i : p.getInventory().all(Material.GOLD_INGOT).values()) {
                    if (i.getType().equals(Material.GOLD_INGOT)) {
                        i.setAmount(i.getAmount() - 10);
                        break;
                    }
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "구매 실패; 중복된 아이템/재료 부족");
            }
        }
    }

    public static void ChronosSupplyDepot(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getRawSlot() == 11) {
            ItemStack adept_sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta adept_sword_meta = adept_sword.getItemMeta();

            Vector<String> adept_sword_lore = new Vector<String>();

            adept_sword_meta.setDisplayName(ChatColor.AQUA + "상급자의 검");
            adept_sword_meta.setUnbreakable(true);
            adept_sword_lore.add("상급자의 검이다. " + ChatColor.GOLD + "(금괴 30개)");

            adept_sword.setItemMeta(adept_sword_meta);
            adept_sword.setLore(adept_sword_lore);

            if (p.getInventory().contains(Material.GOLD_INGOT)
                    && !p.getInventory().contains(adept_sword)
                    && GoldCount(p) >= 30) {
                p.sendMessage("상급자의 검을 구매했습니다 " + ChatColor.RED + "(-금괴 30개)");
                p.getWorld().playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5, 1);
                p.getInventory().addItem(adept_sword);

                for (ItemStack i : p.getInventory().all(Material.GOLD_INGOT).values()) {
                    if (i.getType().equals(Material.GOLD_INGOT)) {
                        i.setAmount(i.getAmount() - 30);
                        break;
                    }
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "구매 실패; 중복된 아이템/재료 부족");
            }
        }
        else if (e.getRawSlot() == 13) {
            ItemStack shield = new ItemStack(Material.SHIELD, 1);
            ItemMeta shield_meta = shield.getItemMeta();

            Vector<String> shield_lore = new Vector<String>();

            shield_meta.setDisplayName("크로노스 군용 방패");
            shield_lore.add("크로노스 군용 방패이다. " + ChatColor.GOLD + "(금괴 40개)");

            shield.setItemMeta(shield_meta);
            shield.setLore(shield_lore);

            if (p.getInventory().contains(Material.GOLD_INGOT)
                    && !p.getInventory().contains(shield)
                    && GoldCount(p) >= 40) {
                p.sendMessage("크로노스 군용 방패를 구매했습니다 " + ChatColor.RED + "(-금괴 40개)");
                p.getWorld().playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 5, 1);
                p.getInventory().addItem(shield);

                for (ItemStack i : p.getInventory().all(Material.GOLD_INGOT).values()) {
                    if (i.getType().equals(Material.GOLD_INGOT)) {
                        i.setAmount(i.getAmount() - 40);
                        break;
                    }
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "구매 실패; 중복된 아이템/재료 부족");
            }
        }
    }

    public static int GoldCount(Player p) {
        int count = 0;

        PlayerInventory inv = p.getInventory();

        for (ItemStack i : inv.getContents())
            if (i != null && i.getType().equals(Material.GOLD_INGOT))
                count += i.getAmount();

        return count;
    }
}
