package practice.java_221006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public char readAChar(String filename) throws IOException {
        return readToString(filename, 1).charAt(0);
    }

    public String read2Char(String filename) throws IOException {
        return readToString(filename, 2);
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
        return readLines(filename, 1);
    }

    public String readLines(String filename, int lines) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String result = "";
        for (int i = 0; i < lines; i++) {
            result += br.readLine() + "\n";
        }
        return result.substring(0, result.length() - 1); // 마지막 줄바꿈 제거
    }
}
