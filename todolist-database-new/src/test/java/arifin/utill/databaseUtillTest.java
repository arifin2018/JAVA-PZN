package arifin.utill;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

class databaseUtillTest {
    
    @Test
    void testConnection()throws SQLException{
        HikariDataSource dataSource = databaseUtill.getDataSource();

        Connection connection = dataSource.getConnection();

        connection.close();


        dataSource.close();
    }
}
