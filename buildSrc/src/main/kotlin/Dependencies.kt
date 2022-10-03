object BuildPlugins {
    const val ANDROID = "com.android.tools.build:gradle:${Versions.GRADLE_VERSION_PLUGIN}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val NAVIGATION_SAFE_ARGS =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}"
}

object Dependencies {
    //Android
    val KOTLIN_STD_LIB = kotlinLib("stdlib-jdk7", Versions.KOTLIN)
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROID_CORE_KTX}"
    const val LIFECYCLE_VIEWMODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"

    //DI
    const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"

    // Coroutines
    const val COROUTINES_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    //Fragment
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    //Navigation
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    //Views
    const val SHIMMER_JETPACK_COMPOSE =
        "com.valentinilk.shimmer:compose-shimmer:${Versions.SHIMMER_JETPACK_COMPOSE}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val CARD_VIEW = "androidx.cardview:cardview:${Versions.CARD_VIEW}"
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"

    //Logs
    const val TIMBER_KT = "com.github.ajalt:timberkt:${Versions.TIMBER_KT}"

    // Jetpack Compose
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val COMPOSE_MATERIAL = "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL}"
    const val COMPOSE_ANIMATION = "androidx.compose.animation:animation:${Versions.COMPOSE}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val COMPOSE_LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.COMPOSE_LIFECYCLE}"
    const val COMPOSE_WINDOW_SIZE =
        "androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL}"
}

private fun kotlinLib(module: String, version: String? = null): String {
    return "org.jetbrains.kotlin:kotlin-$module${version?.let { ":$version" } ?: ""}"
}

