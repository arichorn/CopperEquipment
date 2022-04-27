package dev.redy1aye.copperequipment.events.skins;

import static dev.redy1aye.copperequipment.Mod.*;

import org.jetbrains.annotations.Nullable;
import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.world.World;

public class CandySwordSkin extends Item {
    public CandySwordSkin(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(xmasEventCongrats));
        tooltip.add(Text.translatable(" "));
        tooltip.add(Text.translatable(skinInfo));
        tooltip.add(Text.translatable(skinSuitable + "candy_sword_skin"));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
