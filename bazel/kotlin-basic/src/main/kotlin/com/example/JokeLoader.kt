package com.example

class JokeLoader {
    private val fileReader = FileReader()

    fun loadJoke(id: Int): List<String> {
        return fileReader.readFile("joke_$id.txt")
            ?: error("Joke with id $id not found!")
    }

    companion object {
        const val NUMBER_OF_JOKES = 3
    }
}
