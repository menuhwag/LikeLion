package practice.java_221006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public char readAChar(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return (char)br.read();
    }

    public String read2Char(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += (char)br.read();
        }
        return result;
    }

    public String readToString(String filename, int n) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = "";
        for (int i = 0; i < n; i++) {
            result += (char)br.read();
        }
        return result;
    }

    public String readALine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return br.readLine();
    }
}
