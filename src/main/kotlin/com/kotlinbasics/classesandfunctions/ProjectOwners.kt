package com.kotlinbasics.classesandfunctions

enum class ProjectOwners(fullName: String, isDev: Boolean) {
    GUIGA("Guilherme Ribeiro", isDev = true),
    PUTZEYS("Guilherme Putzeys", isDev = false),
    MARIN("Matheus Marin", isDev = true);
}