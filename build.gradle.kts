plugins {
    id("org.jetbrains.intellij") version "1.1.2"
    kotlin("jvm") version "1.5.20"
}

group = "cn.ryoii"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.1.3")
}

tasks {
    patchPluginXml {
        changeNotes.set("""""".trimIndent())
    }

    runIde {
        autoReloadPlugins.set(true)
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}