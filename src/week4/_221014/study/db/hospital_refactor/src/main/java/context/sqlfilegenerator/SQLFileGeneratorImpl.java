package context.sqlfilegenerator;

import context.filehandler.FileHandlerContext;

import java.lang.reflect.Field;
import java.util.List;

public class SQLFileGeneratorImpl<T> implements SQLFileGenerator<T> {
    private FileHandlerContext<T> fileHandlerContext;
    private String databaseName;
    private String tableName;

    public SQLFileGeneratorImpl(FileHandlerContext<T> fileHandlerContext, String databaseName, String tableName) {
        this.fileHandlerContext = fileHandlerContext;
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    @Override
    public void generate(String readFilename, String saveFilename) {
        List<T> list =  fileHandlerContext.fileToObjectList(readFilename);
        StringBuilder sqlSB = new StringBuilder();
        sqlSB.append(getInsertIntoSQL(list.get(0)))
            .append("\nVALUES\n");
        for (T item : list) {
            sqlSB.append(item.toString())
                .append(",\n");
        }
        fileHandlerContext.save(saveFilename, sqlSB.substring(0, sqlSB.length() - 2) + ";");
    }

    private <C> String getInsertIntoSQL(C t) {
        StringBuilder sb = new StringBuilder(String.format("INSERT INTO `%s`.`%s` (", databaseName, tableName));

        String className = t.getClass().getName();

        Class targetClass;

        try {
            targetClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            return null;
        }

        Field[] fields = targetClass.getDeclaredFields();

        for (Field field : fields) {
            sb.append("`").append(field.getName()).append("`,");
        }
        return sb.substring(0, sb.length() - 1) + ")";
    }
}
