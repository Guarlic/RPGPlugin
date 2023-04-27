package guarlic.rpgplugin.NPCInteract;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Vector;

public class NPCInteract {
    public static void Skolit(Player p) {
        p.sendMessage(ChatColor.GRAY + "스콜리트: " + ChatColor.WHITE + "방해하지 마. 2차 마법진 함수의 마나상수의 존재를 증명하고 있으니깐.");
    }

    public static void Kalis(Player p) {
        p.sendMessage(ChatColor.GOLD + "칼리스: " + ChatColor.WHITE + "팝니다 팔아요~");

        Inventory i = Bukkit.createInventory(null, 54, "넥시리아 상점");

        ItemStack noob_sword = new ItemStack(Material.WOODEN_SWORD, 1);
        ItemMeta noob_sword_meta = noob_sword.getItemMeta();

        ItemStack intermediate_sword = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta intermediate_sword_meta = intermediate_sword.getItemMeta();

        Vector<String> noob_sword_lore = new Vector<String>();
        Vector<String> intermediate_sword_lore = new Vector<String>();

        noob_sword_meta.setDisplayName("초심자의 검");
        noob_sword_meta.setUnbreakable(true);
        noob_sword_lore.add("초심자의 검이다. " + ChatColor.GOLD + "(금괴 1개)");

        noob_sword.setItemMeta(noob_sword_meta);
        noob_sword.setLore(noob_sword_lore);

        intermediate_sword_meta.setDisplayName(ChatColor.GREEN + "중급자의 검");
        intermediate_sword_meta.setUnbreakable(true);
        intermediate_sword_lore.add("중급자의 검이다. " + ChatColor.GOLD + "(금괴 10개)");

        intermediate_sword.setItemMeta(intermediate_sword_meta);
        intermediate_sword.setLore(intermediate_sword_lore);

        i.setItem(11, noob_sword);
        i.setItem(13, intermediate_sword);

        p.openInventory(i);
    }

    public static void Raynor(Player p) {
        p.sendMessage(ChatColor.DARK_GRAY + "레이너: " + ChatColor.WHITE + "가져갈거 있으면 가져가.");

        Inventory i2 = Bukkit.createInventory(null, 54, "크로노스 보급고");

        ItemStack adept_sword = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta adept_sword_meta = adept_sword.getItemMeta();

        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        ItemMeta shield_meta = shield.getItemMeta();

        Vector<String> adept_sword_lore = new Vector<String>();
        Vector<String> shield_lore = new Vector<String>();

        adept_sword_meta.setDisplayName(ChatColor.AQUA + "상급자의 검");
        adept_sword_meta.setUnbreakable(true);
        adept_sword_lore.add("상급자의 검이다. " + ChatColor.GOLD + "(금괴 30개)");

        shield_meta.setDisplayName("크로노스 군용 방패");
        shield_lore.add("크로노스 군용 방패이다. " + ChatColor.GOLD + "(금괴 40개)");

        adept_sword.setItemMeta(adept_sword_meta);
        adept_sword.setLore(adept_sword_lore);

        shield.setItemMeta(shield_meta);
        shield.setLore(shield_lore);

        i2.setItem(11, adept_sword);
        i2.setItem(13, shield);

        p.openInventory(i2);
    }
}
