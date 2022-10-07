package practice.java_221007.bigdata_project_refactor.context;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    private final Parser<T> parser;
    private final String filename;
    private List<T> result;

    public ReadLineContext(Parser<T> parser, String filename) { // TransferHistoryCounter를 주입받음으로 인해 제네릭이 무의미 해짐.
        this.parser = parser;
        this.filename = filename;
    }

    public List<T> readByLine() {
        if (result != null) {
            return result;
        }
        result = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                result.add(parser.parse(str));
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
        return result;
    }
}
