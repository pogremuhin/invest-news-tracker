plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    // precompile plugins
    implementation(libs.lombok.plugin)
}