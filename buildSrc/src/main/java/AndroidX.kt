object AndroidX {
    private const val coreKtxVersion = "1.9.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    // Lifecycle: https://developer.android.com/jetpack/androidx/releases/lifecycle
    const val lifecycleVersion = "2.6.0-alpha02"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val lifecycleRuntime= "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val lifecycleRuntimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:$lifecycleVersion"
    const val lifecycleCommonJava= "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val lifecycleSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:$lifecycleVersion"

    // Navigation: https://developer.android.com/jetpack/androidx/releases/navigation
    const val navigationVersion = "2.5.2"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"

    // SplashScreen: https://developer.android.com/guide/topics/ui/splash-screen/migrate#migrate_your_splash_screen_implementation
    private const val splashScreenVersion = "1.0.0-beta02"
    const val splashScreen = "androidx.core:core-splashscreen:$splashScreenVersion"

    private const val dataStoreVersion = "1.0.0"
    const val dataStoreCore = "androidx.datastore:datastore-preferences-core:$dataStoreVersion"
    const val dataStorePreferences = "androidx.datastore:datastore-preferences:$dataStoreVersion"

    private const val windowVersion = "1.0.0"
    const val window = "androidx.window:window:$windowVersion"

    private const val legacySupportVersion = "1.0.0"
    const val legacySupport = "androidx.legacy:legacy-support-v4:$legacySupportVersion"

    private const val junitVersion = "1.1.3"
    const val junit = "androidx.test.ext:junit:$junitVersion"

    private const val espressoVersion = "3.4.0"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
}