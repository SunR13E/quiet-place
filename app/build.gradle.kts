plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    id(Dependencies.DETEKT)
}

android {
    namespace = "com.example.quietplace"
    compileSdk = ConfigData.compileSdkVersion
    buildToolsVersion = ConfigData.buildToolsVersion

    defaultConfig {
        applicationId = "com.example.quietplace"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packagingOptions {
        resources.excludes.addAll(
            listOf(
                "META-INF/*.kotlin_module",
                "META-INF/AL2.0",
                "META-INF/LGPL2.1"
            )
        )
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_COMPILER
    }
}

dependencies {
    // Kotlin
    implementation(Dependencies.KOTLIN_STD_LIB)

    //Net
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.CONVERTER_GSON)
    implementation(platform(Dependencies.OKHTTP_BOM))
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.LOGGING_INTERCEPTOR)

    // Coroutines
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_CORE)

    // Views
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.ANDROID_CORE_KTX)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation(Dependencies.CARD_VIEW)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.RECYCLERVIEW)
    implementation(Dependencies.MATERIAL)

    // Dagger
    implementation(Dependencies.DAGGER)
    implementation(Dependencies.DAGGER_COMPILER)
    implementation(Dependencies.DAGGER_ANDROID)
    implementation(Dependencies.DAGGER_ANDROID_SUPPORT)
    kapt(Dependencies.DAGGER_COMPILER)
    kapt(Dependencies.DAGGER_PROCESSOR)

    // Misc
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_UI_KTX)
    implementation(Dependencies.TIMBER_KT)

    // Jetpack Compose
    implementation(Dependencies.COMPOSE_ACTIVITY)
    implementation(Dependencies.COMPOSE_MATERIAL)
    implementation(Dependencies.COMPOSE_WINDOW_SIZE)
    implementation(Dependencies.COMPOSE_UI_TOOLING)
    implementation(Dependencies.COMPOSE_UI)
    implementation(Dependencies.COMPOSE_ANIMATION)
    implementation(Dependencies.COMPOSE_LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.SHIMMER_JETPACK_COMPOSE)

    //Tests
    implementation(Dependencies.JUNIT)
    detektPlugins(Dependencies.DETEKT_FORMATTING)
}