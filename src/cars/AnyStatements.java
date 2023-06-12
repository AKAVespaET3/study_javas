package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.Query;

public class AnyStatements {
    public ResultSet selectStatement(Statement statemt, String qy) throws SQLException{
        // statemt = statement; //main에서 넘어오는 값이 치환이 됨
        // qy = query; // main에서 넘어오는 값이 치환이 됨
        ResultSet resultSet = statemt.executeQuery(qy);
        return resultSet;
    } // 들어가고 뱉어낼 데이터 타입

}
 