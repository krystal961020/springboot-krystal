package com.example.demo.config;

import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
import dev.miku.r2dbc.mysql.MySqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.time.ZoneId.systemDefault;

/**
 * @author Krystal
 * @Date 2021/2/22  15:50
 */
@Configuration
public class DataConfig {
    @Bean
    public ConnectionFactory connectionFactory() {
        return MySqlConnectionFactory.from(MySqlConnectionConfiguration.builder()
                .host("127.0.0.1")
                .port(3306)
                .user("root")
                .password("root")
                .serverZoneId(systemDefault())
                .database("krystal_demo")
                .build());
    }
}
