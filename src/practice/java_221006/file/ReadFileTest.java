package practice.java_221006.file;

import java.io.File;
import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) {
//        ReadFile readFile = new ReadFile("a_file.txt");
//        try {
//            System.out.println(readFile.readAChar()); // 한 글자 읽기
//            System.out.println(readFile.read2Char()); // 두 글자 읽기
//            System.out.println(readFile.readToString(5)); // n 글자 읽기
//            System.out.println(readFile.readALine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File dir = new File("./");
        for (File file : dir.listFiles()) {
            System.out.println(file);
        }
    }
}
