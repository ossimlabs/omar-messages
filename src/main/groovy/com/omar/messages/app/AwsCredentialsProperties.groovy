package com.omar.messages.app

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties;
import groovy.transform.ToString;

@ToString(includeNames = true)
@ConfigurationProperties(prefix = "cloud.aws.credentials")
class AwsCredentialsProperties {

    String accessKey;

    String secretKey;

}
