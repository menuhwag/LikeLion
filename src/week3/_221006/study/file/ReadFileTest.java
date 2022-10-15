package week3._221006.study.file;

import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        try {
            System.out.println(readFile.readAChar("a_file.txt")); // 한 글자 읽기
            System.out.println(readFile.read2Char("a_file.txt")); // 두 글자 읽기
            System.out.println(readFile.readToString("a_file.txt",5)); // n 글자 읽기
            System.out.println(readFile.readALine("a_file.txt")); // 한 개 라인 읽기
            System.out.println(readFile.readLines("a_file.txt", 2));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        File dir = new File("./");
//        for (File file : dir.listFiles()) {
//            System.out.println(file);
//        }
//        /*
//        .\.git
//        .\.gitignore
//        .\.idea
//        .\a_file.txt
//        .\LikeLion.iml
//        .\out
//        .\Readme.md
//        .\src
//        */
    }
}
