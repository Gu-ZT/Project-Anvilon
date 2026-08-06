package dev.anvilcraft.addon.project_anvilon.init

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilon.Companion.REGISTRUM
import dev.anvilcraft.lib.v2.registrum.util.entry.ItemEntry
import net.minecraft.world.item.Item

class ProjectAnvilonItems {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRUM.defaultCreativeTab(ProjectAnvilonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_ITEM: ItemEntry<Item> = REGISTRUM
            .item("example_item") { Item(it) }
            .register()

        fun register() {
        }
    }
}