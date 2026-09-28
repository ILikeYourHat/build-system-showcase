plugins {
    application
    id("scala")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

scala {
    scalaVersion = "3.9.0"
}

application {
    mainClass = "com.example.main"
}

tasks {
    test {
        useJUnitPlatform {
            includeEngines("scalatest")
            testLogging {
                events("passed", "skipped", "failed")
            }
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.scala.test)
    testRuntimeOnly(libs.junit.engine)
    testRuntimeOnly(libs.junit.launcher)
    testRuntimeOnly(libs.scala.test.junit5)
}
