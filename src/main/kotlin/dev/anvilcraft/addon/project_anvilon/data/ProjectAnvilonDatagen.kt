package dev.anvilcraft.addon.project_anvilon.data

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilon
import dev.anvilcraft.addon.project_anvilon.data.lang.ProjectAnvilonLangHandler
import dev.anvilcraft.lib.v2.registrum.providers.ProviderType
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent

@EventBusSubscriber(modid = ProjectAnvilon.MOD_ID)
class ProjectAnvilonDatagen {
    companion object {
        @SubscribeEvent
        @JvmStatic
        fun gatherData(event: GatherDataEvent) {
        }

        /**
         * 初始化生成器
         */
        fun init() {
            ProjectAnvilon.REGISTRUM.addDataGenerator(ProviderType.LANG, ProjectAnvilonLangHandler::init)
        }
    }
}