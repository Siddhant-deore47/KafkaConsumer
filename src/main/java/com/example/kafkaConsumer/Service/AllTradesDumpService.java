package com.example.kafkaConsumer.Service;

import com.example.kafkaConsumer.Model.AllTradesDump;
import com.example.kafkaConsumer.Repository.AllTradesDumpRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class AllTradesDumpService {

    @Autowired
    private AllTradesDumpRepository allTradesDumpRepository;

    private static final Logger logger = LoggerFactory.getLogger(AllTradesDumpService.class);

    public void insertDumpData(String message){

        AllTradesDump tradesDump = new AllTradesDump();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        tradesDump.setTrades(message);
        tradesDump.setDwh_date(timestamp.toString());
        try {
            allTradesDumpRepository.save(tradesDump);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
}
