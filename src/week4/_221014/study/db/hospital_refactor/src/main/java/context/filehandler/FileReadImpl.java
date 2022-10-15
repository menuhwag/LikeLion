package context.filehandler;

import parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadImpl<T> implements FileRead<T> {
    private Parser<T> parser;

    public FileReadImpl(Parser<T> parser) {
        this.parser = parser;
    }

    @Override
    public List<T> readLines(String filename) {
        List<T> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while((line = br.readLine()) != null) {
                list.add(parser.parse(line));
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
        return list;
    }
}
