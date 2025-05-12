package arifin;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

class ConnectionPoolTest {
    
    @Test
    void testHikariCP(){
        String jdbcUrl = "jdbc:mysql://localhost:3312/belajar_java_database";
        String username = "root";
        String password = "arifin";


        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl(jdbcUrl);
        config.setUsername(username);
        config.setPassword(password);

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(4);
        config.setIdleTimeout(60_0000);
        config.setMaxLifetime(10*10);

        try {
            HikariDataSource ds = new HikariDataSource(config);
            Connection connection = ds.getConnection();
            ds.close();
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }

    @Test
    void testUtil() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        connection.close();
    }
}
