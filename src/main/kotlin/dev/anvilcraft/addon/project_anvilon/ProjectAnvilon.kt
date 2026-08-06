package dev.anvilcraft.addon.project_anvilon

import com.mojang.logging.LogUtils
import dev.anvilcraft.addon.project_anvilon.data.ProjectAnvilonDatagen
import dev.anvilcraft.addon.project_anvilon.init.ProjectAnvilonBlocks
import dev.anvilcraft.addon.project_anvilon.init.ProjectAnvilonItemGroups
import dev.anvilcraft.addon.project_anvilon.init.ProjectAnvilonItems
import dev.anvilcraft.lib.v2.config.ConfigManager
import dev.anvilcraft.lib.v2.registrum.Registrum
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.jetbrains.annotations.NotNull
import org.slf4j.Logger

@Mod(ProjectAnvilon.MOD_ID)
class ProjectAnvilon(modEventBus: IEventBus, modContainer: ModContainer) {
    companion object {
        const val MOD_ID: String = "project_anvilon"
        val LOGGER: Logger = LogUtils.getLogger()
        val CONFIG: ProjectAnvilonConfig = ConfigManager.register(MOD_ID, ::ProjectAnvilonConfig)
        val REGISTRUM: Registrum = Registrum.create(MOD_ID)

        @NotNull
        fun of(path: String): ResourceLocation {
            return ResourceLocation.fromNamespaceAndPath(MOD_ID, path)
        }
    }

    init {
        ProjectAnvilonItemGroups.register(modEventBus)
        ProjectAnvilonBlocks.register()
        ProjectAnvilonItems.register()
        ProjectAnvilonDatagen.init()
    }
}