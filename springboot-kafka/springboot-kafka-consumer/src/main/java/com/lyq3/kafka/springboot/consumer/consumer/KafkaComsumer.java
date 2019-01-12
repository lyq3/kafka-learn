package com.lyq3.kafka.springboot.consumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author 卡卢比
 * @createTime 2019年01月12日 20:58
 * @description
 */
@Component
public class KafkaComsumer {
    @KafkaListener(topics = {"test"})
    public void get(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("----------------- record =" + record);
            System.out.println("------------------ message =" + message);
        }
    }
}
