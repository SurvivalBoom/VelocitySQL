
version = "1.0"

plugins {
    java
    id("com.gradleup.shadow") version "8.3.0"
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {

    compileOnly("com.velocitypowered:velocity-api:3.0.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.0.0-SNAPSHOT")

    implementation("org.xerial:sqlite-jdbc:3.46.0.0")
    implementation("com.mysql:mysql-connector-j:8.4.0")

}

tasks {

    shadowJar {

        archiveBaseName.set(rootProject.name)
        archiveVersion.set(rootProject.version.toString())
        archiveClassifier.set("")

        destinationDirectory.set(rootProject.projectDir)

    }

    build {
        dependsOn(shadowJar)
    }

}