package com.kotlinbasics.classesandfunctions

import com.kotlinbasics.classesandfunctions.ProjectOwners.*

class ProjectCredits {

    fun giveCreditsToAnOwner(projectOwners: ProjectOwners) {
        println("Thanks to ${projectOwners.name}")
    }

    fun giveCreditsToADev(projectOwners: ProjectOwners) {
        if (PUTZEYS == projectOwners)
            throw RuntimeException("Its not a dev!")

        println("Thanks to developer ${projectOwners.name}")
    }

}