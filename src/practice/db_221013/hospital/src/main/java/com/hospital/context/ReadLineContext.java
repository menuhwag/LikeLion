package com.hospital.context;

import com.hospital.parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    private Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> toList(String filename) {
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

    public void save(String filename, String body) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(body);
            writer.close();
            System.out.println("파일 저장 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
