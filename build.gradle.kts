buildscript {
    extra.apply{
        set("compose_version", Versions.COMPOSE)
    }
    repositories {
        google()
        maven("https://plugins.gradle.org/m2/")
        mavenCentral()
    }
    dependencies {
        classpath(BuildPlugins.ANDROID)
        classpath(BuildPlugins.KOTLIN)
        classpath(BuildPlugins.NAVIGATION_SAFE_ARGS)
    }
}

plugins {
    id(Dependencies.DETEKT) version Versions.DETEKT
}

dependencies {
    // Build script dependencies
    detektPlugins(Dependencies.DETEKT_FORMATTING)
}