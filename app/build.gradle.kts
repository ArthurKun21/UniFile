plugins {
    alias(libs.plugins.android.application)
}
android {
    namespace = "com.hippo.unifile.example"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hippo.unifile.example"
        minSdk = 35
        versionCode = 8
        versionName = "1.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(project(":library"))

    compileOnly(libs.androidx.annotation)
}
