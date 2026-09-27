package com.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class FileReaderTest {
    private val fileReader = FileReader()

    @Test
    fun shouldLoadFile() {
        val content = fileReader.readFile("test.txt")

        assertNotNull(content)
        assertEquals(1, content.size)
        assertEquals("Hello World!", content.single())
    }

    @Test
    fun shouldReturnNullWhenFileDoesNotExist() {
        val content = fileReader.readFile("invalid.txt")

        assertNull(content)
    }
}
