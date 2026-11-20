import dev.panuszewski.gradle.pluginMarker

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(pluginMarker(libs.plugins.lombok))
    implementation(pluginMarker(libs.plugins.spring.boot))
}