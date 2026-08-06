package dev.anvilcraft.addon.project_anvilon.data.lang

import dev.anvilcraft.addon.project_anvilon.ProjectAnvilonConfig
import dev.anvilcraft.lib.v2.config.ConfigData
import dev.anvilcraft.lib.v2.registrum.providers.RegistrumLangProvider

class ProjectAnvilonLangHandler {
    companion object {
        /**
         * 语言文件初始化
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrumLangProvider) {
            ConfigData.readConfigClass(provider, ProjectAnvilonConfig::class.java)
        }
    }
}