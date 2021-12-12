package com.example.abcService.Config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;
import java.security.NoSuchAlgorithmException;

@Configuration
public class AppConfig{

    @Bean
    public CqlSession session() throws NoSuchAlgorithmException {

        return CqlSession.builder()
                .withKeyspace("pad")
                .addContactPoint(new InetSocketAddress("pad-cassandra.cassandra.cosmos.azure.com", 10350))
                .withCredentials("pad-cassandra", "4xav9FZWNHuF87ELo6TIkh7UuQIzU5lAqi5jIAzTBC5VPEuqN7cVMqjN4XHkrQ1jcEb3l9K0uPBjtccRyM5Gag==")
                .build();
    }

}
