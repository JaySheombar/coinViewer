buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.fabric.io/public")
    }

    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.kotlinGradlePlugin)
        classpath(Build.kotlinSerialization)
        classpath(Build.androidXNavigationSafeArgs)
        classpath(Build.fabricToolsGradlePlugin)
        classpath(Build.hiltAndroidGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}