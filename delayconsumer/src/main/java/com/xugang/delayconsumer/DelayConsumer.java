package com.xugang.delayconsumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

/**
 * @author xugangq
 * @description
 * @createTime 2019/8/29 0029 20:53
 */
@Component
public class DelayConsumer {
    @RabbitListener(queues = "MQ.LazyQueue")
    @RabbitHandler
    public void onLazyMessage(Message msg, Channel channel) throws IOException {
        long deliveryTag = msg.getMessageProperties().getDeliveryTag();
        channel.basicAck(deliveryTag, false);
        System.out.println(new Date()+ " :lazy receive " + new String(msg.getBody())+" deliveryTag: "+ deliveryTag);

    }
}
