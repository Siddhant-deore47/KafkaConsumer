package com.example.kafkaConsumer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Table(name = "TableName")
public class AllTradesDump {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int transId;

    private String trades;

    private String dwh_date;

}
