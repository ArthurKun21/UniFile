plugins {
    `maven-publish`
    alias(libs.plugins.android.library)
}
android {
    namespace = "com.hippo.unifile"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
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
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    implementation(libs.jspecify)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.arthurkun21"
            artifactId = "unifile"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}