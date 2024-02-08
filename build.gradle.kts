val group: String by project
val version: String by project
val artifactName: String by project

val paperApiVersion: String by project
val foliaApiVersion: String by project

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:$paperApiVersion")
    compileOnly("dev.folia:folia-api:$foliaApiVersion")
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release = 17
    }

    shadowJar {
        archiveFileName.set("$artifactName-$version.jar")
    }
}
