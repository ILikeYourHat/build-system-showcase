package com.example

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe

class JokeLoaderSpec extends AnyFunSuite:

  test("all jokes should have standard format"):
    val loader = JokeLoader()
    for id <- 1 to JokeLoader.numberOfJokes do
      val joke = loader.loadJoke(id)

      withClue(s"Joke $id has invalid size: ") {
        joke.size shouldBe 2
      }
      withClue(s"Missing question in joke $id: ") {
        joke(0).startsWith("Q: ") shouldBe true
      }
      withClue(s"Missing answer in joke $id: ") {
        joke(1).startsWith("A: ") shouldBe true
      }
