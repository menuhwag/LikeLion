package practice.java_221006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readAByte() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 2024);
        return (char)br.read();
    }
}
