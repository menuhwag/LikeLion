package context.filehandler;

import java.util.List;

public interface FileRead<T> {
    List<T> readLines(String filename);
}
