package com.github.filipdabrowski.erp_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;

/**
 * DatabaseConfig is a configuration class that defines the database connection
 * settings for the system. It sets up a DataSource bean using environment
 * variables and enables Spring Data JPA repositories.
 */
@Configuration  // Marks this class as a configuration file for Spring Boot
@EnableJpaRepositories(basePackages = "com.github.filipdabrowski.erp_system.repository")
public class DatabaseConfig {

    /**
     * Defines the DataSource bean responsible for database connections.
     * This bean is automatically used by Spring Boot to manage connections.
     *
     * @return DataSource - Configured database connection object.
     */

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(System.getenv("DATABASE_URL"))
                .username(System.getenv("DATABASE_USERNAME"))
                .password(System.getenv("DATABASE_PASSWORD"))
                .driverClassName("org.postgresql.Driver")
                .build();
    }
}
