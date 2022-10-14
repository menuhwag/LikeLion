package context.filehandler;

import java.util.List;

public class FileHandlerContext<T> {
    private FileRead<T> fileRead;
    private FileWrite fileWrite;

    public FileHandlerContext(FileRead<T> fileRead, FileWrite fileWrite) {
        this.fileRead = fileRead;
        this.fileWrite = fileWrite;
    }

    public List<T> fileToObjectList(String filename) {
        return fileRead.readLines(filename);
    }

    public void save(String filename, String body) {
        fileWrite.save(filename, body);
    }
}
