package com.callor.js.config.beans;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EncConfig {

    // 환경변수를 가져와서 config를 설정
//    @Bean
    public EnvironmentStringPBEConfig envConfig() {
        EnvironmentStringPBEConfig config
                = new EnvironmentStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        // 환경변수 불러오기
        config.setPasswordEnvName("callor.com");
        return config;
    }

    //    encryptor를 사용해서 비밀번호를 복호화 시킬 설정
    @Bean
    public StandardPBEStringEncryptor encryptor() {
        StandardPBEStringEncryptor encryptor
                = new StandardPBEStringEncryptor();
        encryptor.setConfig(this.envConfig());
        return encryptor;
    }
}
