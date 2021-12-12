package com.example.abcService.Config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;

@Configuration
public class AppConfig{
//
//    @Bean
//    public CqlSessionBuilderCustomizer start(){
//        return new CqlSessionBuilderCustomizer() {
//            @SneakyThrows
//            @Override
//            public void customize(CqlSessionBuilder cqlSessionBuilder) {
//                String sslKeyStorePassword = "keyStorePassword";
//                File sslKeyStoreFile = null;
//                final KeyStore keyStore = KeyStore.getInstance("JKS");
//                try (final InputStream is = new FileInputStream(sslKeyStoreFile)) {
//                    keyStore.load(is, sslKeyStorePassword.toCharArray());
//                }
//                final KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory
//                        .getDefaultAlgorithm());
//                kmf.init(keyStore, sslKeyStorePassword.toCharArray());
//                final TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory
//                        .getDefaultAlgorithm());
//                tmf.init(keyStore);
//                SSLContext sc = SSLContext.getInstance("TLSv1.2");
//                sc.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
//
//                cqlSessionBuilder.withSslContext(sc);
//            }
//        };
//    }


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
