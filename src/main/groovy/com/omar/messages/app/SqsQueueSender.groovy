package com.omar.messages.app

import com.amazonaws.services.sqs.AmazonSQS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder


class OmarSqsQueueSender {

    private final QueueMessagingTemplate queueMessagingTemplate;

    @Autowired
    OmarSqsQueueSender(AmazonSQS amazonSqs) {
        this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
    }

    void send(String message) {
        this.queueMessagingTemplate.send("aaron-queue", MessageBuilder.withPayload(message).build())
        println"\n\n ------------------ ${message} ----------------------\n\n"
    }

}
