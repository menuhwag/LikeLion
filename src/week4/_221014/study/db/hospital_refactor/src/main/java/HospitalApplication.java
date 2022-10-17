import context.filehandler.FileHandlerContext;
import context.filehandler.FileRead;
import context.filehandler.FileReadImpl;
import context.filehandler.FileWriteImpl;
import context.sqlfilegenerator.SQLFileGenerator;
import context.sqlfilegenerator.SQLFileGeneratorImpl;
import dao.HospitalDao;
import domain.Hospital;
import parser.HospitalParser;
import parser.Parser;

import java.sql.SQLException;

public class HospitalApplication {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Parser<Hospital> hospitalParser = new HospitalParser();
//        FileRead<Hospital> hospitalFileRead = new FileReadImpl<>(hospitalParser);
//        FileWriteImpl fileWrite = new FileWriteImpl();
//        FileHandlerContext<Hospital> hospitalFileHandlerContext = new FileHandlerContext<>(hospitalFileRead, fileWrite);
//        SQLFileGenerator<Hospital> hospitalSQLFileGenerator = new SQLFileGeneratorImpl(hospitalFileHandlerContext, "hospital", "seoul");
//        hospitalSQLFileGenerator.generate("seoul_hospital_info.csv", "test.sql");

        HospitalDao hospitalDao = new HospitalDao();

        Hospital hospital = new Hospital();
        hospital.setId("D1000000");
        hospital.setAddress("인천광역시 남동구 구월동");
        hospital.setName("사랑내과");

        hospitalDao.add(hospital);

        Hospital findHospital = hospitalDao.findById("D1000000");

        System.out.println(findHospital);
    }
}
