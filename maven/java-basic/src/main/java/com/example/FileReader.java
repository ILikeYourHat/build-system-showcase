package com.example;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public class FileReader {

    public List<String> readFile(String fileName) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
        if (stream != null) {
            return IOUtils.readLines(stream, Charset.defaultCharset());
        } else {
            throw new IOException("File with name " + fileName + " not found!");
        }
    }
}
