plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
}


tasks.register<Delete>("clean") {
    group = "build"
    description = "Deletes build directory"

    delete(rootProject.layout.buildDirectory)
}