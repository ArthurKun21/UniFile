plugins {
    alias(libs.plugins.android.library)
}
android {
    namespace = "com.hippo.unifile"
    compileSdk = 35

    defaultConfig {
        minSdk = 35
        versionCode = 8
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {
    compileOnly(libs.androidx.annotation)
}
