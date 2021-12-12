package com.example.abcService.Config;

import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;

@Configuration
public class AppConfig{

    @Bean
    public CqlSessionBuilderCustomizer start(){
        return new CqlSessionBuilderCustomizer() {
            @SneakyThrows
            @Override
            public void customize(CqlSessionBuilder cqlSessionBuilder) {
                SSLContext sc = SSLContext.getInstance("TLSv1.2");
                sc.init(null, null ,null);
                cqlSessionBuilder.withSslContext(sc);
            }
        };
    }
}
