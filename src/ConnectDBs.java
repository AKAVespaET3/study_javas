import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        Statement statement;
        Connection connection;

        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            
            // - query Edit
            statement = connection.createStatement(); // statement : 쿼리문 던져주면 받아줌
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query); // ResultSet으로 테이블로 넘어옴
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }
            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            // INSERT INTO factorys
            // (COMPANY_ID, COMPANY)
            // VALUE
            // ('CAR-01', 'AUDI'),
      
            String companyId = "CAR-02" ;
            String company = "AUDI";
            query = "INSERT INTO factorys (COMPANY_ID, COMPANY) VALUES ('" + companyId + "', '" + company + "')"; //변수 넣을 때 앞뒤로 ' ' 넣어줘야함
            int count = statement.executeUpdate(query); // 결과값이 없어서 .executeUpdate 써라
            // System.out.println();

            companyId = "CAR-01";
            company = "VESPA";
            query = "UPDATE factorys " +
                    "SET COMPANY = ('"+company+"') " +
                    "WHERE COMPANY_ID = ('"+companyId+"') ";
            count = statement.executeUpdate(query);
            
         

            // company = "VESPA";
            // query = "UPDATE factorys" + " SET COMPANY = ('"+company+"')" + "where COMPANY_ID = ('"+company+"')";
            // resultSet = statement.executeQuery(query);

            
            // query = "UPDATE factorys SET COMPANY = 'VESPA' WHERE COMPANY_ID = 'CAR-01'";
            // count = statement.executeUpdate(query);

            // query = "DELETE FROM factorys WHERE COMPANY_ID = 'CAR_01'";
            // count = statement.executeUpdate(query);

            
           
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally{
            
        }
        System.out.println();
    }
}
