plugins {
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "2.1.10"
    kotlin("plugin.spring") version "1.9.23"
    id("org.jetbrains.kotlinx.kover") version "0.8.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-validation:3.3.1")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")

    // Jackson
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.32")

    // MongoDB
    implementation("org.mongodb:mongodb-driver-kotlin-sync:5.0.1")
    implementation("org.springframework.data:spring-data-mongodb:4.2.5")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")

    // Unit Tests
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.2")
    testImplementation("io.mockk:mockk:1.13.11")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}