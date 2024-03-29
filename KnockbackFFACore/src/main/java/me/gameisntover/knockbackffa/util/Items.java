package me.gameisntover.knockbackffa.util;

import com.cryptomorin.xseries.XMaterial;
import me.gameisntover.knockbackffa.configurations.ItemConfiguration;
import me.gameisntover.knockbackffa.gui.ItemBuilder;
import me.gameisntover.knockbackffa.gui.KEnchant;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public enum Items {
    WAND(ItemBuilder.builder().material(XMaterial.BLAZE_ROD.parseMaterial()).name("&6PositionSelector Wand").itemflags(ItemFlag.HIDE_ENCHANTS).enchants(new KEnchant(Enchantment.DURABILITY, 5)).build()),
    COSMETICS_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("lobbyitems.cosmetic.name")).material(Material.getMaterial(ItemConfiguration.get().getString("lobbyitems.cosmetic.material"))).lores(ItemConfiguration.get().getStringList("lobbyitems.cosmetic.lore")).buttonMeta().build()),
    KITS_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("lobbyitems.kits.name")).material(Material.getMaterial(ItemConfiguration.get().getString("lobbyitems.kits.material"))).lores(ItemConfiguration.get().getStringList("lobbyitems.kits.lore")).buttonMeta().build()),
    SHOP_MENU(ItemBuilder.builder().name(ItemConfiguration.get().getString("lobbyitems.shop.name")).material(Material.getMaterial(ItemConfiguration.get().getString("lobbyitems.shop.material"))).lores(ItemConfiguration.get().getStringList("lobbyitems.shop.lore")).buttonMeta().build()),
    KB_STICK(ItemBuilder.builder().name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBStick.name"))).material(XMaterial.STICK.parseMaterial()).enchants(new KEnchant(Enchantment.KNOCKBACK, ItemConfiguration.get().getInt("SpecialItems.KBStick.kb-level"))).buttonMeta().build()),
    KB_BOW(ItemBuilder.builder().name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBBow.name"))).buttonMeta().material(XMaterial.BOW.parseMaterial()).build()),
    KB_ARROW(ItemBuilder.builder().material(XMaterial.ARROW.parseMaterial()).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.KBArrow.name"))).build()),
    BUILDING_BLOCK(ItemBuilder.builder().material(XMaterial.WHITE_WOOL).name(ChatColor.DARK_RED + "Building Block").build()),
    JUMP_PLATE(ItemBuilder.builder().material(XMaterial.LIGHT_WEIGHTED_PRESSURE_PLATE.parseMaterial()).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.JumpPlate.name"))).build()),
    ENDER_PEARL(ItemBuilder.builder().material(XMaterial.ENDER_PEARL.parseMaterial()).name(Knocktils.translateColors(ItemConfiguration.get().getString("SpecialItems.EnderPearl.name"))).build());
    public final ItemStack item;

    Items(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return item;
    }
}
