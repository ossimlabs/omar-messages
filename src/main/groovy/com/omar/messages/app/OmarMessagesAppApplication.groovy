package com.omar.messages.app

import com.amazonaws.services.sqs.AmazonSQS
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class OmarMessagesAppApplication {

    @Autowired
    AmazonSQS amazonSqs

    @Bean
    OmarSqsQueueSender omarSqsQueueSender() {
        return new OmarSqsQueueSender(amazonSqs);
    }

    static void main(String[] args) {
        SpringApplication.run OmarMessagesAppApplication, args
    }
}
