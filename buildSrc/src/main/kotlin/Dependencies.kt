object BuildPlugins {
    const val ANDROID = "com.android.tools.build:gradle:${Versions.GRADLE_VERSION_PLUGIN}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val NAVIGATION_SAFE_ARGS =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}"
}

object Dependencies {
    //Android
    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROID_CORE_KTX}"
    const val LIFECYCLE_VIEWMODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"

    //Net
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val OKHTTP_BOM = "com.squareup.okhttp3:okhttp-bom:${Versions.OKHTTP}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor"

    //DI
    const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
    const val DAGGER_ANDROID =  "com.google.dagger:dagger-android:${Versions.DAGGER}"
    const val DAGGER_ANDROID_SUPPORT =  "com.google.dagger:dagger-android-support:${Versions.DAGGER}"
    const val DAGGER_PROCESSOR =  "com.google.dagger:dagger-android-processor:${Versions.DAGGER}"

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

    //Detekt
    const val DETEKT = "io.gitlab.arturbosch.detekt"
    const val DETEKT_FORMATTING = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.DETEKT}"

    //Tests
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}
