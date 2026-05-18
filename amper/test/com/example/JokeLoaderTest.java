package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JokeLoaderTest {

    private final JokeLoader loader = new JokeLoader();

    @Test
    public void allJokesShouldHaveStandardFormat() {
        for (int id = 1; id < loader.getNumberOfJokes(); id++) {
            List<String> joke = loader.loadJoke(id);
            assertEquals(2, joke.size(), "Joke " + id + " has invalid size");
            assertTrue(joke.get(0).startsWith("Q: "), "Missing question in joke " + id);
            assertTrue(joke.get(1).startsWith("A: "), "Missing answer in joke " + id);
        }
    }
}
