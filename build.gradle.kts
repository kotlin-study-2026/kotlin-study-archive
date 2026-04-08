plugins {
    kotlin("jvm") version "2.1.10"
}

group = "kos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}