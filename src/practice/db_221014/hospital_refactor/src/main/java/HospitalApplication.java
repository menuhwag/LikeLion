import context.filehandler.FileHandlerContext;
import context.filehandler.FileRead;
import context.filehandler.FileReadImpl;
import context.filehandler.FileWriteImpl;
import context.sqlfilegenerator.SQLFileGenerator;
import context.sqlfilegenerator.SQLFileGeneratorImpl;
import domain.Hospital;
import parser.HospitalParser;
import parser.Parser;

public class HospitalApplication {
    public static void main(String[] args) {
        Parser<Hospital> hospitalParser = new HospitalParser();
        FileRead<Hospital> hospitalFileRead = new FileReadImpl<>(hospitalParser);
        FileWriteImpl fileWrite = new FileWriteImpl();
        FileHandlerContext<Hospital> hospitalFileHandlerContext = new FileHandlerContext<>(hospitalFileRead, fileWrite);
        SQLFileGenerator<Hospital> hospitalSQLFileGenerator = new SQLFileGeneratorImpl(hospitalFileHandlerContext, "hospital", "seoul");
        hospitalSQLFileGenerator.generate("seoul_hospital_info.csv", "test.sql");
    }
}
