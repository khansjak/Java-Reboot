import com.sun.org.glassfish.external.statistics.TimeStatistic;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample2 {
    public static void main(String[] args) throws SQLException {
        System.out.println("MySQL Connection Testing ...");
        List<Employee> result = new ArrayList<Employee>();

        String SQL_SELECT ="Select * from EMPLOYEE";

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/projectdb","root","Jak@2019");
        PreparedStatement preparedStatement=conn.prepareStatement(SQL_SELECT);
        ResultSet resultSet= preparedStatement.executeQuery();

        while (resultSet.next()){
            long id = resultSet.getLong("ID");
            String name = resultSet.getString("NAME");
            BigDecimal salary = resultSet.getBigDecimal("SALARY");
            Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");


            Employee emp = new Employee();

        }

    }
}
