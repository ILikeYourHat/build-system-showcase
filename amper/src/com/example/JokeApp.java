package com.example;

import java.util.List;
import java.util.Random;

public class JokeApp {

    public static final int NUMBER_OF_JOKES = 3;

    private static final Random random = new Random();

    public static void main(String[] args) {
        new JokeApp().tellJoke();
    }

    public void tellJoke() {
        JokeLoader jokeLoader = new JokeLoader();
        int jokeId = getJokeId();
        List<String> joke = jokeLoader.loadJoke(jokeId);
        System.out.println("Here goes the joke:");
        joke.forEach(System.out::println);
    }

    private int getJokeId() {
        return random.nextInt(NUMBER_OF_JOKES) + 1;
    }
}
