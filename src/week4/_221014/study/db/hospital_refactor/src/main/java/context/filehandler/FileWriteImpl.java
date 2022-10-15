package context.filehandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteImpl implements FileWrite {
    @Override
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
