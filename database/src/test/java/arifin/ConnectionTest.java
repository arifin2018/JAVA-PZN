package arifin;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConnectionTest {
    @BeforeAll
    static void beforeAll(){
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testConnection(){
        String jdbcUrl = "jdbc:mysql://localhost:3312/belajar_java_database";
        String username = "root";
        String password = "arifin";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Sukses konek ke database");
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
    
    @Test
    void testConnectionClose(){
        String jdbcUrl = "jdbc:mysql://localhost:3312/belajar_java_database";
        String username = "root";
        String password = "arifin";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Sukses konek ke database");
            connection.close();
            System.out.println("Sukses menutup");
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
}
