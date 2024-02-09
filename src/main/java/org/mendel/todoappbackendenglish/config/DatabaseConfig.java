package org.mendel.todoappbackendenglish.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    // Injecting database URL from application properties
    @Value("${DB_URL}")
    private String dbUrl;

    // Injecting database username from application properties
    @Value("${DB_USERNAME}")
    private String dbUsername;

    // Injecting database password from application properties
    @Value("${DB_PASSWORD}")
    private String dbPassword;

    // Configuring DataSource bean for database connection
    @Bean
    public DataSource dataSource() {
        // Creating instance of DriverManagerDataSource
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        // Setting driver class name for PostgreSQL
        dataSource.setDriverClassName("org.postgresql.Driver");

        // Setting database URL
        dataSource.setUrl(dbUrl);

        // Setting database username
        dataSource.setUsername(dbUsername);

        // Setting database password
        dataSource.setPassword(dbPassword);

        // Returning configured DataSource bean
        return dataSource;
    }

}
