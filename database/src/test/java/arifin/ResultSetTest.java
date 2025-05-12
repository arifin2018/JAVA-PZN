package arifin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

public class ResultSetTest {

    @Test
    void testExecuteQuery() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
            SELECT * FROM Persons
            """;
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String id = resultSet.getString("PersonID");
            String LastName = resultSet.getString("LastName");
            String FirstName = resultSet.getString("FirstName");
            String Address = resultSet.getString("Address");
            String City = resultSet.getString("City");

            System.out.println(
                String.join(", ", id, LastName, FirstName,Address,City)
            );
        }   

        resultSet.close();
        statement.close();
        connection.close();
    }
}
