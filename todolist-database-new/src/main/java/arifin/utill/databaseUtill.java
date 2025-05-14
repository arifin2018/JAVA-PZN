package arifin.utill;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class databaseUtill {

    private static HikariDataSource hikariDataSource;

    static{
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3312/Todolist");
        config.setUsername("root");
        config.setPassword("arifin");


        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(60 * 60 * 1000);

        hikariDataSource = new HikariDataSource(config);

    }

    public static HikariDataSource getDataSource(){
        return hikariDataSource;
    }
}
