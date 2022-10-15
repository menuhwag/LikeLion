package week3._221006.study.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest2 {
    public void test1() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data3.csv"); // 1054KB, 약 77초 소요
        String buffer = "";
        while(true) {
            int read = fr.read();
            if (read == -1) break;
            buffer += (char)read;
        }
        System.out.println("Test1 : " + (System.currentTimeMillis() - startTime) + "ms");
        fr.close();
    }
    public void test2() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data3.csv"); // 1054KB, 61ms 소요
        StringBuilder buffer = new StringBuilder("");
        while(true) {
            int read = fr.read();
            if (read == -1) break;
            buffer.append((char)read);
        }
        System.out.println("Test2 : " + (System.currentTimeMillis() - startTime) + "ms");
        fr.close();
    }

    public void test3() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data2.csv"); // 27756KB, 86ms 소요
        BufferedReader br = new BufferedReader(fr); // BufferedReader size 8KB
        String read;
        while ((read = br.readLine()) != null) {
        }
        System.out.println("Test3 : " + (System.currentTimeMillis() - startTime) + "ms");
        br.close();
        fr.close();
    }

    public void test4() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data2.csv"); // 27756KB, 82ms 소요
        BufferedReader br = new BufferedReader(fr, 16 * 1024); // BufferedReader size 16KB
        String read;
        while((read = br.readLine()) != null) {
        }
        System.out.println("Test4 : " + (System.currentTimeMillis() - startTime) + "ms");
        br.close();
        fr.close();
    }

    public void test5() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data.csv"); // 157659KB, 1079ms 소요
        BufferedReader br = new BufferedReader(fr); // BufferedReader size 16KB
        StringBuilder buffer = new StringBuilder("");
        String read;
        while((read = br.readLine()) != null) {
            buffer.append(read);
        }
        System.out.println("Test5 : " + (System.currentTimeMillis() - startTime) + "ms");
        br.close();
        fr.close();
    }

    public void test6() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data.csv"); // 157659KB, 344ms 소요
        BufferedReader br = new BufferedReader(fr, 32 * 1024); // BufferedReader size 32KB
        String read;
        while((read = br.readLine()) != null) {
        }
        System.out.println("Test6 : " + (System.currentTimeMillis() - startTime) + "ms");
        br.close();
        fr.close();
    }
    public void test7() throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fr = new FileReader("data.csv"); // 157659KB, 344ms 소요
        BufferedReader br = new BufferedReader(fr, 64 * 1024); // BufferedReader size 64KB
        StringBuilder buffer = new StringBuilder("");
        String read;
        while((read = br.readLine()) != null) {
            buffer.append(read);
        }
        System.out.println("Test7 : " + (System.currentTimeMillis() - startTime) + "ms");
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        ReadFileTest2 readFileTest = new ReadFileTest2();
//        readFileTest.test1();
//        readFileTest.test2();
//        readFileTest.test3();
//        readFileTest.test4();
        readFileTest.test5();
//        readFileTest.test6();
        readFileTest.test7();
    }
}
