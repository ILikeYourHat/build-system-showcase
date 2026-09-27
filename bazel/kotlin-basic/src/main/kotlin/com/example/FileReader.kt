package com.example

class FileReader {

    fun readFile(fileName: String): List<String>? {
        return javaClass.getClassLoader().getResource(fileName)
            ?.readText()?.lines()
    }
}
