package com.example.kafkaConsumer.Repository;

import com.example.kafkaConsumer.Model.AllTradesDump;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllTradesDumpRepository extends JpaRepository<AllTradesDump,Integer> {

    
}
