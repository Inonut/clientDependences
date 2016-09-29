package com.clientDependences.gradle;

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class ClientDependencesPluginTest {
    @Test
    public void code4referencePluginAddsCode4ReferenceTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'clientDependences'
        println "code4referencePluginAddsCode4ReferenceTaskToProject"
        assertTrue(project.tasks.c4rTask instanceof Code4ReferenceTask)
    }
}
