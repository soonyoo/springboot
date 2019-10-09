package cn.chinaunicom.gz.config;

import cn.chinaunicom.gz.service.UploadService;
import cn.chinaunicom.gz.service.impl.UploadServiceImpl;
import cn.chinaunicom.gz.service.impl.UploadServiceS3Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class UploadConfig {

    @Profile("local")
    @Bean
    public UploadService local(){
        return  new UploadServiceImpl();
    }

    @Profile("S3")
    @Bean
    public UploadService S3(){
        return new UploadServiceS3Impl();
    }

}
