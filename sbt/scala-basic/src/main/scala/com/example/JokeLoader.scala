package com.example

class JokeLoader {

  private val fileReader = FileReader()

  def loadJoke(id: Int): List[String] =
    fileReader.readFile(s"joke_$id.txt")
      .getOrElse(throw new Exception(s"Joke with id $id not found!"))
}

object JokeLoader {
  val numberOfJokes = 3
}
