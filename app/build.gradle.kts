plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.mapd"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mapd"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.mapbox.navigation:android:2.15.2")
    implementation ("com.mapbox.search:mapbox-search-android-ui:1.0.0-rc.6")
    implementation ("com.mapbox.maps:android:10.14.1")
}