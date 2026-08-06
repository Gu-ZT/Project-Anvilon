package dev.anvilcraft.addon.project_anvilon

import dev.anvilcraft.lib.v2.config.BoundedDiscrete
import dev.anvilcraft.lib.v2.config.Comment
import dev.anvilcraft.lib.v2.config.Config

@Config(name = ProjectAnvilon.MOD_ID)
class ProjectAnvilonConfig {
    @Comment("Whether to log the dirt block on common setup")
    var logDirtBlock: Boolean = false

    @Comment("A magic number")
    @BoundedDiscrete(max = 24.0, min = 2.0)
    var magicNumber: Int = 2

    @Comment("What you want the introduction message to be for the magic number")
    var magicNumberIntroduction: String = ""
}