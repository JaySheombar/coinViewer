object Testing {
    private const val junitVersion = "4.13.2"
    const val junit = "junit:junit:$junitVersion"

    private const val junitAndroidExtVersion = "1.1.3"
    const val junitAndroidExt = "androidx.test.ext:junit:$junitAndroidExtVersion"

    private const val coroutinesTestVersion = "1.5.1"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesTestVersion"

    // Truth - https://github.com/google/truth/releases
    private const val truthVersion = "1.1.3"
    const val truth = "com.google.truth:truth:$truthVersion"

    private const val turbineVersion = "0.7.0"
    const val turbine = "app.cash.turbine:turbine:$turbineVersion"

    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Compose.version}"

    const val hiltTesting = "com.google.dagger:hilt-android-testing:${DaggerHilt.version}"

    // AndroidX - https://developer.android.com/jetpack/androidx/releases/test
    private const val androidXTestVersion = "1.4.0"
    const val core = "androidx.test:core:$androidXTestVersion"
    const val testRunner = "androidx.test:runner:$androidXTestVersion"

    private const val archCoreVersion = "2.1.0"
    const val archCore = "androidx.arch.core:core-testing:$archCoreVersion"

    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Kotlin.version}"
}