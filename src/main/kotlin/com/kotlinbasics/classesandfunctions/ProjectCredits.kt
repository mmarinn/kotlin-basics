package com.kotlinbasics.classesandfunctions

class ProjectCredits {

    fun giveCreditsToAnOwner(projectOwners: ProjectOwners) {
        println("Thanks to ${projectOwners.name}")
    }

    fun giveCreditsToADev(projectOwners: ProjectOwners) {
        if (ProjectOwners.PUTZEYS == projectOwners)
            throw RuntimeException("Its not a dev!")

        println("Thanks to developer ${projectOwners.name}")
    }

}