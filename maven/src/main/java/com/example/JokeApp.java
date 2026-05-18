package com.example;

import java.util.List;
import java.util.Random;

public class JokeApp {

    private final Random random = new Random();
    private final JokeLoader jokeLoader = new JokeLoader();

    public static void main(String[] args) {
        new JokeApp().tellJoke();
    }

    public void tellJoke() {
        List<String> joke = getRandomJoke();
        System.out.println("Here goes the joke:");
        joke.forEach(System.out::println);
    }

    private List<String> getRandomJoke() {
        int jokeId = random.nextInt(jokeLoader.getNumberOfJokes()) + 1;
        return jokeLoader.loadJoke(jokeId);
    }
}
