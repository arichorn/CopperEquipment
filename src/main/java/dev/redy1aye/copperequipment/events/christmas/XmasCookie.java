package dev.redy1aye.copperequipment.events.christmas;

import static dev.redy1aye.copperequipment.Mod.xmasEventCongrats;

import org.jetbrains.annotations.Nullable;
import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.world.World;

public class XmasCookie extends Item {
    public XmasCookie(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(xmasEventCongrats));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
