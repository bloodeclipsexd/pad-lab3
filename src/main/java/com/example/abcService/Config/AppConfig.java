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
                cqlSessionBuilder.withSslContext(sc).withLocalDatacenter("datacenter1");
            }
        };
    }


//    @Bean
//    public CqlSession session() throws NoSuchAlgorithmException {
//
//        return CqlSession.builder()
//                .withKeyspace("pad")
//                .addContactPoint(new InetSocketAddress("pad-cassandra.cassandra.cosmos.azure.com", 10350))
//                .withCredentials("pad-cassandra", "4xav9FZWNHuF87ELo6TIkh7UuQIzU5lAqi5jIAzTBC5VPEuqN7cVMqjN4XHkrQ1jcEb3l9K0uPBjtccRyM5Gag==")
//                .build();
//    }

}
