plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")

    // the apache client is the only one supporting redirects
    implementation("io.ktor:ktor-client-apache:1.4.0")
    implementation("io.ktor:ktor-client-serialization-jvm:1.4.0")
    implementation("io.ktor:ktor-client-logging-jvm:1.4.0")
    implementation("org.slf4j:slf4j-simple:1.8.0-beta4")
}