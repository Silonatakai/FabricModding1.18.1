package net.sshyranui.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.sshyranui.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mythril"),
            () -> new ItemStack(Moditems.MYTHRIL_INGOT));

    // To create a second group, simply copy paste line 10 to 12 and change MYTHRIL & "mythril" to NEWNAME & "new name"
}
