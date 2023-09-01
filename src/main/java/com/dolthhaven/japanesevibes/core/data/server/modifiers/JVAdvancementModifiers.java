package com.dolthhaven.japanesevibes.core.data.server.modifiers;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.registry.JVItems;
import com.teamabnormals.blueprint.common.advancement.modification.AdvancementModifierProvider;
import com.teamabnormals.blueprint.common.advancement.modification.modifiers.CriteriaModifier;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.ConsumeItemTrigger;
import net.minecraft.world.item.Item;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class JVAdvancementModifiers extends AdvancementModifierProvider {

    public JVAdvancementModifiers(GatherDataEvent e) {
        super(e.getGenerator(), JapaneseVibes.MOD_ID);
    }

    @Override
    protected void registerEntries() {
        CriteriaModifier.Builder balancedDiet = CriteriaModifier.builder(this.modId);
        JVItems.HELPER.getDeferredRegister().getEntries().forEach(registryObject -> {
            Item item = registryObject.get();
            if (item.isEdible()) {
                balancedDiet.addCriterion(ForgeRegistries.ITEMS.getKey(item).getPath(), ConsumeItemTrigger.TriggerInstance.usedItem(item));
            }
        });
        this.entry("husbandry/balanced_diet").selects("husbandry/balanced_diet").addModifier(balancedDiet.requirements(RequirementsStrategy.AND).build());

    }
}
