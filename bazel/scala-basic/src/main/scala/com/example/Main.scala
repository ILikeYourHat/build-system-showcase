package com.example

import scala.util.Random

private val jokeLoader = JokeLoader()

@main def main() =
  val joke = getRandomJoke()
  println("Here goes the joke:")
  joke.foreach(println(_))

private def getRandomJoke(): List[String] =
  val jokeId = Random.nextInt(JokeLoader.numberOfJokes) + 1
  jokeLoader.loadJoke(jokeId)
