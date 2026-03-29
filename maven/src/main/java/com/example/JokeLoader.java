package com.example;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public class JokeLoader {

    public List<String> loadJoke(int id) {
        InputStream stream = ClassLoader.getSystemResourceAsStream("joke_" + id + ".txt");
        if (stream != null) {
            return IOUtils.readLines(stream, Charset.defaultCharset());
        } else {
            throw new RuntimeException("Joke with id " + id + " not found!");
        }
    }
}
