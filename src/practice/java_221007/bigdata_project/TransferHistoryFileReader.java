package practice.java_221007.bigdata_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransferHistoryFileReader {
    private String filename;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    private List<TransferHistory> transferHistoryList;

    public TransferHistoryFileReader(String filename) {
        this.filename = filename;
        transferHistoryList = new ArrayList<>();
        readFile();
    }

    private TransferHistory nextTransferHistory() {
        try {
            String line = bufferedReader.readLine();
            return (line != null) ? TransferHistory.parse(line) : null;
        } catch (IOException e) {
            return null;
        }
    }

    public List<TransferHistory> toList() {
        if (transferHistoryList.size() != 0) return transferHistoryList;
        TransferHistory data;
        while ((data = nextTransferHistory()) != null) {
            this.transferHistoryList.add(data);
            TransferCounter.increaseCnt(data.getFromCity(), data.getToCity());
        }
        return transferHistoryList;
    }
    private void readFile() {
        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

}
