package com.example

import kotlin.random.Random

fun main() {
    val joke = JokeLoader().getRandomJoke()
    println("Here goes the joke:")
    joke.forEach { println(it) }
}

private fun JokeLoader.getRandomJoke(): List<String> {
    val jokeId = Random.nextInt(JokeLoader.NUMBER_OF_JOKES) + 1
    return loadJoke(jokeId)
}
