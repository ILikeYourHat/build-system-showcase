package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JokeAppTest {

    private final JokeLoader loader = new JokeLoader();

    @Test
    public void allJokesShouldHaveStandardFormat() {
        for (int id = 1; id < JokeApp.NUMBER_OF_JOKES; id++) {
            List<String> joke = loader.loadJoke(id);
            assertEquals("Joke " + id + " has invalid size", 2, joke.size());
            assertTrue("Missing question in joke " + id, joke.get(0).startsWith("Q: "));
            assertTrue("Missing answer in joke " + id, joke.get(1).startsWith("A: "));
        }
    }
}
