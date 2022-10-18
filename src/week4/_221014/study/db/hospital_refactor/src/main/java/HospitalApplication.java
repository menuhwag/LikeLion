import dao.SqlConnector;
import dao.HospitalDao;
import dao.MysqlConnector;
import domain.Hospital;

import java.sql.SQLException;

public class HospitalApplication {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Parser<Hospital> hospitalParser = new HospitalParser();
//        FileRead<Hospital> hospitalFileRead = new FileReadImpl<>(hospitalParser);
//        FileWriteImpl fileWrite = new FileWriteImpl();
//        FileHandlerContext<Hospital> hospitalFileHandlerContext = new FileHandlerContext<>(hospitalFileRead, fileWrite);
//        SQLFileGenerator<Hospital> hospitalSQLFileGenerator = new SQLFileGeneratorImpl(hospitalFileHandlerContext, "hospital", "seoul");
//        hospitalSQLFileGenerator.generate("seoul_hospital_info.csv", "test.sql");

        SqlConnector mysqlConnectionFactory = new MysqlConnector();
        HospitalDao hospitalDao = new HospitalDao(mysqlConnectionFactory);

        Hospital hospital = new Hospital();
        hospital.setId("D1000000");
        hospital.setAddress("인천광역시 남동구 구월동");
        hospital.setName("사랑내과");

        hospitalDao.add(hospital);

        Hospital findHospital = hospitalDao.findById("D1000000");

        System.out.println(findHospital);
    }
}
