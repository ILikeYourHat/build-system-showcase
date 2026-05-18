package com.example;

import java.io.IOException;
import java.util.List;

public class JokeLoader {

    private final FileReader fileReader = new FileReader();

    public List<String> loadJoke(int id) {
        try {
            return fileReader.readFile("joke_" + id + ".txt");
        } catch (IOException e) {
            throw new RuntimeException("Joke with id " + id + " not found!", e);
        }
    }

    public int getNumberOfJokes() {
        return 3;
    }
}
