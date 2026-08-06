package dev.anvilcraft.addon.project_anvilon.init

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilon.Companion.REGISTRUM
import dev.anvilcraft.lib.v2.registrum.util.entry.BlockEntry
import net.minecraft.world.level.block.Block

class ProjectAnvilonBlocks {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRUM.defaultCreativeTab(ProjectAnvilonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_BLOCK: BlockEntry<Block> = REGISTRUM
            .block("example_block") { Block(it) }
            .simpleItem()
            .register()

        fun register() {
        }
    }
}