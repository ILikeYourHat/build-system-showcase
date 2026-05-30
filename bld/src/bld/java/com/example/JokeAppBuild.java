package com.example;

import rife.bld.Project;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class JokeAppBuild extends Project {
    public JokeAppBuild() {
        pkg = "com.example";
        name = "joke-app";
        mainClass = "com.example.JokeApp";
        version = version(0,1,0);

        javaRelease = 21;

        downloadSources = true;
        autoDownloadPurge = true;

        repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES);

        scope(compile)
            .include(dependency("commons-io", "commons-io", version(2,22,0)));
        scope(test)
            .include(dependency("org.junit.jupiter", "junit-jupiter-engine", version(6,1,0)))
            .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(6,1,0)));
    }

    public static void main(String[] args) {
        new JokeAppBuild().start(args);
    }
}
