plugins {
    java
    alias(libs.plugins.lombok)
    alias(libs.plugins.spring.boot)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.java.version.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.spring.boot.bom))
    implementation(libs.spring.boot.starter)
    implementation(libs.spring.boot.starter.kafka)
    implementation(libs.spring.boot.starter.actuator)
    implementation(libs.spring.boot.starter.micrometer.metrics)
    implementation(libs.spring.boot.starter.logging)

    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.test {
    useJUnitPlatform()
}