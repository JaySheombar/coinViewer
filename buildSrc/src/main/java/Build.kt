import groovy.xml.Entity.Dagger

object Build {
    private const val androidBuildToolsVersion = "7.2.1"
    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"
    const val androidXNavigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.navigationVersion}"

    const val hiltAndroidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${DaggerHilt.version}"

    private const val fabricToolsVersion = "1.31.2"
    const val fabricToolsGradlePlugin = "io.fabric.tools:gradle:$fabricToolsVersion"
}