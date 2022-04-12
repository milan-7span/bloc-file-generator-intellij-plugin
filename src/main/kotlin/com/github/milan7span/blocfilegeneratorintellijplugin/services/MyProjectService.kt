package com.github.milan7span.blocfilegeneratorintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.milan7span.blocfilegeneratorintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
