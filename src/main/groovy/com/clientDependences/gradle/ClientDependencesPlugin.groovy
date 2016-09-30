package com.clientDependences.gradle

import com.clientDependences.gradle.domain.ClientDependencesPluginExtension
import com.clientDependences.gradle.task.InstallTask
import com.clientDependences.gradle.task.NpmInstallTask
import com.clientDependences.gradle.task.UpdateTask;
import org.gradle.api.*;


class ClientDependencesPlugin implements Plugin<Project> {

    static final String TASK_GROUP = 'Client Dependencies'
    static final String INSTALL_TASK = 'clientInstall'
    static final String CLEAN_TASK = 'clientClean'
    static final String UPDATE_TASK = 'clientUpdate'

    def void apply(Project project) {
        project.extensions.create("clientDependences", ClientDependencesPluginExtension)


        project.task(INSTALL_TASK, group: TASK_GROUP, type: InstallTask){
            doFirst{
                println("---------------------------------------------")
            }
            doLast{
                println("done!")
            }
        }
        project.task(UPDATE_TASK, group: TASK_GROUP, type: UpdateTask)

    }
}


