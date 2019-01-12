package com.lyq3.test.kafka.produter;

import com.lyq3.kafka.springboot.producer.ProducerApplication;
import com.lyq3.kafka.springboot.producer.producter.KafkaProduter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 卡卢比
 * @createTime 2019年01月12日 20:52
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
public class ProduterTest {
    @Autowired
    private KafkaProduter kafkaProduter;

    @Test
    public void testSend(){
        kafkaProduter.sendMsg();
    }
}
