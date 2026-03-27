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

dependencies {
    implementation(libs.apache.commons.io)
    testImplementation(libs.junit)
}
