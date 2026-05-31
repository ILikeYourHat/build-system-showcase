plugins {
    application
    alias(libs.plugins.kotlin.jvm)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.example.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotlin.test)
}
