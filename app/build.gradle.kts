plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = ProjectConfig.namespace
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.applicationId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = ProjectConfig.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeCompilerVersion
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // AndroidX
    implementation(AndroidX.coreKtx)

    // Lifecycle - ViewModel
    implementation(AndroidX.lifecycleViewModel)
    implementation(AndroidX.lifecycleRuntime)
    implementation(AndroidX.lifecycleCommonJava)
    implementation(AndroidX.lifecycleLiveData)
    implementation(AndroidX.lifecycleSavedState)
    implementation(AndroidX.lifecycleService)

    // JetBrains
    implementation(Kotlin.stdlib)
    implementation(Kotlin.kotlinSerialization)
    implementation(Kotlin.coroutinesCore)
    implementation(Kotlin.coroutinesAndroid)

    // Navigation Components
    implementation(AndroidX.navigationFragment)
    implementation(AndroidX.navigationUi)

    // Data store
    implementation(AndroidX.dataStoreCore)
    implementation(AndroidX.dataStorePreferences)

    // Various
    implementation(AndroidX.splashScreen)
    implementation(AndroidX.legacySupport)
    implementation(AndroidX.lifecycleRuntimeCompose)

    // Jetpack Compose
    implementation(Compose.ui)

    implementation(Compose.foundation)
    implementation(Compose.material)
    implementation(Compose.materialIconsCore)
    implementation(Compose.materialIconsExtended)
    implementation(Compose.runtimeLiveData)
    implementation(Compose.uiViewBinding)
    implementation(Compose.viewModelCompose)
    implementation(Compose.hiltNavigationCompose)
    implementation(Compose.navigation)

    // Accompanist
    implementation(Accompanist.insets)
    implementation(Accompanist.insetsUi)
    implementation(Accompanist.systemUiController)
    implementation(Accompanist.permissions)

    // Dagger Hilt
    implementation(DaggerHilt.hiltAndroid)
    kapt(DaggerHilt.hiltCompiler)

    // HttpClient - KTOR
    implementation(Ktor.core)
    implementation(Ktor.android)
    implementation(Ktor.serialization)
    implementation(Ktor.logging)
    implementation(Ktor.auth)

    // Debug
    implementation(Logcat.core)

    testImplementation(Testing.junit)

    androidTestImplementation(AndroidX.junit)
    androidTestImplementation(AndroidX.espresso)
    androidTestImplementation(Compose.junit)

    debugImplementation(Compose.uiTooling)
    debugImplementation(Compose.uiTestManifest)
}

kapt { correctErrorTypes = true }