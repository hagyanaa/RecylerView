plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.recylerview"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sqliterecyclerviewapp"
        minSdk = 26
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

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.recyclerview:recyclerview:1.3.0") // Versi terbaru
    implementation("androidx.appcompat:appcompat:1.6.1") // Versi terbaru
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Versi terbaru
    implementation("com.google.android.material:material:1.9.0")
    implementation("junit:junit:4.13.2")
    implementation(libs.androidx.junit.ktx)
}
