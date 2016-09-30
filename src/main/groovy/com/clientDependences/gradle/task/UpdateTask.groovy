package com.clientDependences.gradle.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by Dragos on 9/30/2016.
 */
class UpdateTask extends DefaultTask{

    @TaskAction
    def update() {
        println "------------update-------------------"
        println "cashePath : ${project.clientDependences.cashePath}"
        println "packagePath : ${project.clientDependences.packagePath}"
        println "destinationPath : ${project.clientDependences.destinationPath}"

    }
}
