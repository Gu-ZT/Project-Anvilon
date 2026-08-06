package dev.anvilcraft.addon.project_anvilon.client

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilon
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod

@Mod(value = ProjectAnvilon.MOD_ID, dist = [Dist.CLIENT])
class ProjectAnvilonClient(modBus: IEventBus, container: ModContainer) {
    init {}
}