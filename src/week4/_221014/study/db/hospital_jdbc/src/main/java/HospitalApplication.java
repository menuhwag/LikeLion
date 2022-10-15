import java.sql.*;

public class HospitalApplication {
    public static void main(String[] args) {
        final String DB_SERVER_URL = ""; // "jdbc:mysql://{host}/{db-name}"
        final String DB_USERNAME = "root";
        final String DB_PASSWORD = "";
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_SERVER_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("연결 성공");
            Statement db = conn.createStatement();
            ResultSet result = db.executeQuery("SELECT * FROM hospital.seoul limit 10;");

            while(result.next()){
                // 레코드의 칼럼은 배열과 달리 0부터 시작하지 않고 1부터 시작한다.
                // 데이터베이스에서 가져오는 데이터의 타입에 맞게 getString 또는 getInt 등을 호출한다.
                String id = result.getString(1);
                String address = result.getString(2);

                System.out.println(id + " " + address);
            }
            /*
            연결 성공
            A1100001 서울특별시 동대문구 경희대로 23 (회기동)
            A1100002 서울특별시 광진구 능동로 120-1 (화양동)
            A1100003 서울특별시 동작구 흑석로 102 (흑석동)
            A1100004 서울특별시 용산구 대사관로 59 (한남동)
            A1100005 서울특별시 양천구 안양천로 1071 (목동)
            A1100006 서울특별시 종로구 새문안로 29 (평동)
            A1100007 서울특별시 서대문구 연세로 50-1 (신촌동)
            A1100008 서울특별시 성북구 고려대로 73 고려대병원 (안암동5가)
            A1100009 서울특별시 송파구 올림픽로43길 88 서울아산병원 (풍납동)
            A1100010 서울특별시 강남구 일원로 81 (일원동 삼성의료원)
            */

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
        } catch (SQLException e) {
            System.out.println("에러: " + e);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
