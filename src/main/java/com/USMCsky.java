package com;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.plugin.java.JavaPlugin;

public final class USMCsky extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey recipeKey = new NamespacedKey(this, "rotten_flesh_to_leather");
        FurnaceRecipe recipe = new FurnaceRecipe(
                recipeKey,
                new ItemStack(Material.LEATHER),
                new RecipeChoice.MaterialChoice(Material.ROTTEN_FLESH),
                0.35f,
                200
        );

        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
