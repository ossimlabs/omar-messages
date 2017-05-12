package com.omar.messages.app

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(AwsCredentialsProperties)
class AwsCredentialsConfiguration {

    @Autowired
    private AwsCredentialsProperties awsCredentialsProperties;

    @PostConstruct
    void init() {
        System.setProperty("aws.accessKeyId", awsCredentialsProperties.accessKey);
        System.setProperty("aws.secretKey", awsCredentialsProperties.secretKey);
        println"\n${'#'*10} ${awsCredentialsProperties} ${'#'*10}\n"
    }


}