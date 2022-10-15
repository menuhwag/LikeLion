package context.sqlfilegenerator;

public interface SQLFileGenerator<T> {
    void generate(String readFilename, String saveFilename);
}
