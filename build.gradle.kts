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
    id("com.android.application") version Versions.ANDROID_LIB apply false
    id("com.android.library") version Versions.ANDROID_LIB apply false
    id("org.jetbrains.kotlin.android") version Versions.KOTLIN apply false
    id(Dependencies.DETEKT) version Versions.DETEKT
}

dependencies {
    // Build script dependencies
    detektPlugins(Dependencies.DETEKT_FORMATTING)
}