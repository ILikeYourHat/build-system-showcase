plugins {
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.example.JokeApp"
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(libs.apache.commons.io)
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform)
}
