object Kotlin {
    // Kotlin: https://kotlinlang.org/docs/releases.html#release-details
    const val version = "1.7.10"

    // stdlib
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"

    // Coroutines: https://github.com/Kotlin/kotlinx.coroutines/releases
    private const val coroutinesVersion = "1.6.4"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"

    // KotlinSerialization: https://github.com/Kotlin/kotlinx.serialization/releases
    private const val kotlinSerializationVersion = "1.4.0"
    const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinSerializationVersion"
}