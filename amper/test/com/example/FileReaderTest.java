package com.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileReaderTest {

    private final FileReader fileReader =  new FileReader();

    @Test
    public void shouldLoadFile() throws IOException {
        List<String> content = fileReader.readFile("test.txt");

        assertEquals(1, content.size());
        assertEquals("Hello World!", content.getFirst());
    }

    @Test
    public void shouldThrowExceptionWhenFileDoesNotExist() {
        assertThrows(IOException.class, () -> fileReader.readFile("invalid.txt"));
    }
}
