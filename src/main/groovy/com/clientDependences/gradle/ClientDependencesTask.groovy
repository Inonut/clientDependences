package com.clientDependences.gradle;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ClientDependencesTask extends DefaultTask {
    
    @TaskAction
    def install() {
        println "------------install-------------------"
        println "cashePath : ${project.clientDependences.cashePath}"
        println "packagePath : ${project.clientDependences.packagePath}"
        println "destinationPath : ${project.clientDependences.destinationPath}"

    }

    @TaskAction
    def update() {
        println "------------update-------------------"
        println "cashePath : ${project.clientDependences.cashePath}"
        println "packagePath : ${project.clientDependences.packagePath}"
        println "destinationPath : ${project.clientDependences.destinationPath}"

    }
}
