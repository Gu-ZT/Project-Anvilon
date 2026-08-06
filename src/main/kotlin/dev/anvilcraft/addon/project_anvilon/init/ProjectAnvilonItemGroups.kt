package dev.anvilcraft.addon.project_anvilon.init

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilon
import dev.dubhe.anvilcraft.init.item.ModItemGroups
import net.minecraft.core.registries.Registries
import net.minecraft.world.item.CreativeModeTab
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

class ProjectAnvilonItemGroups {
    companion object {
        val DEFERRED_REGISTER: DeferredRegister<CreativeModeTab?> = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            ProjectAnvilon.MOD_ID
        )

        val ADDON_ITEMS: DeferredHolder<CreativeModeTab?, CreativeModeTab?> =
            DEFERRED_REGISTER.register(
                "project_anvilon_items",
                Supplier {
                    CreativeModeTab.builder()
                        .icon { ProjectAnvilonItems.EXAMPLE_ITEM.asStack() }
                        .displayItems { _, _ -> }
                        .title(
                            ProjectAnvilon.REGISTRUM.addLang(
                                "itemGroup",
                                ProjectAnvilon.of("project_anvilon_items"),
                                "Project: Anvilon"
                            )
                        )
                        .withTabsBefore(ModItemGroups.ANVILCRAFT_BUILD_BLOCK.id)
                        .build()
                }
            )

        fun register(modEventBus: IEventBus) {
            DEFERRED_REGISTER.register(modEventBus)
        }
    }
}