package com.example.abcService.Config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{

    @Bean
    public CqlSession session() {
        return CqlSession.builder().withKeyspace("pad").withLocalDatacenter("datacenter1").build();
    }
}
