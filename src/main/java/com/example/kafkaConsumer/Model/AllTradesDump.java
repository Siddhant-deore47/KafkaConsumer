package com.example.kafkaConsumer.Model;

import jakarta.persistence.*;
import lombok.Data;

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
