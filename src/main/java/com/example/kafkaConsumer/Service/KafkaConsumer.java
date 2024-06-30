package com.example.kafkaConsumer.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    private AllTradesDumpService tradesDumpService;

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "myTopic",groupId = "test")
    public void consume(String message){
        try {
            logger.info(String.format("Message received -> %s", message));

            tradesDumpService.insertDumpData(message);

        }catch(Exception e){
            logger.info(e.getMessage());
        }
    }
}
