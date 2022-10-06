package practice.java_221006.file;

import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("a_file.txt");
        try {
            System.out.println(readFile.readAByte());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
