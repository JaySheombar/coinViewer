object Compose {
    // https://developer.android.com/jetpack/androidx/releases/compose#versions
    const val version = "1.3.0-beta03"
    const val composeCompilerVersion = "1.3.1"

    const val ui = "androidx.compose.ui:ui:$version"
    const val uiTooling = "androidx.compose.ui:ui-tooling:$version"
    const val foundation = "androidx.compose.foundation:foundation:$version"
    const val material = "androidx.compose.material:material:$version"
    const val materialIconsCore = "androidx.compose.material:material-icons-core:$version"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:$version"
    const val uiViewBinding = "androidx.compose.ui:ui-viewbinding:$version"

    // Navigation: https://developer.android.com/jetpack/androidx/releases/navigation
    const val navigation = "androidx.navigation:navigation-compose:${AndroidX.navigationVersion}"

    // HiltNavigationCompose: https://androidx.tech/artifacts/hilt/hilt-navigation-compose/
    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    // Lifecycle: https://developer.android.com/jetpack/androidx/releases/lifecycle
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${AndroidX.lifecycleVersion}"

    // Testing
    const val junit = "androidx.compose.ui:ui-test-junit4:$version"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
}