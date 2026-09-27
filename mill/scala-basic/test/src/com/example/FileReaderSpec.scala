package com.example

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe

class FileReaderSpec extends AnyFunSuite:

  test("should load file"):
    val fileReader = FileReader()
    val content = fileReader.readFile("test.txt")
    content shouldBe Some(List("Hello World!"))

  test("should return None when file does not exist"):
    val fileReader = FileReader()
    val content = fileReader.readFile("invalid.txt")
    content shouldBe None

