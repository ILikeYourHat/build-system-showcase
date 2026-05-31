package com.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class JokeLoaderTest {
    private val loader = JokeLoader()

    @Test
    fun allJokesShouldHaveStandardFormat() {
        IntRange(1, JokeLoader.NUMBER_OF_JOKES).forEach { id ->
            val joke = loader.loadJoke(id)
            assertEquals(2, joke.size, "Joke $id has invalid size")
            assertTrue(joke[0].startsWith("Q: "), "Missing question in joke $id")
            assertTrue(joke[1].startsWith("A: "), "Missing answer in joke $id")
        }
    }
}
