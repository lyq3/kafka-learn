package com.lyq3.kafka.springboot.producer.producter;

import com.lyq3.kafka.springboot.producer.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 卡卢比
 * @createTime 2019年01月12日 20:47
 * @description
 */
@Component
public class KafkaProduter {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息
     */
    public void sendMsg(){
        Message message = new Message();
        message.setCode(100);
        message.setDescription("kafka测试消息描述");
        message.setName("kafka消息名");
        kafkaTemplate.send("test",message.toString());
    }
}
