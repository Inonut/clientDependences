package com.clientDependences.gradle.task

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Exec;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by Dragos on 9/30/2016.
 */
public class NpmInstallTask extends DefaultTask{

    @TaskAction
    def update() {
        println "------------npm-------------------"
        println "cashePath : ${project.clientDependences.cashePath}"
        println "packagePath : ${project.clientDependences.packagePath}"
        println "destinationPath : ${project.clientDependences.destinationPath}"

    }
}
