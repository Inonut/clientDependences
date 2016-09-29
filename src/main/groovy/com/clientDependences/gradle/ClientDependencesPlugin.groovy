package com.clientDependences.gradle;

import org.gradle.api.*;

class ClientDependencesPluginExtension {
    String cashePath = ""
    String packagePath = ""
    String destinationPath = ""
}
class ClientDependencesPlugin implements Plugin<Project> {
    def void apply(Project project) {
           project.extensions.create("clientDependences", ClientDependencesPluginExtension)
           project.task('client-install', type: ClientDependencesTask)
    }
}


