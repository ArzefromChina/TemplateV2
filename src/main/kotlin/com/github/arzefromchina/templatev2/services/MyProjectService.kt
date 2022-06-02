package com.github.arzefromchina.templatev2.services

import com.intellij.openapi.project.Project
import com.github.arzefromchina.templatev2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
