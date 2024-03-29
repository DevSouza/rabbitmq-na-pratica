package br.com.devsouza.consumerservice.rabbitmq.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

import static br.com.devsouza.commons.constants.RabbitMQConstants.*;

@Log4j2
@Component
public class StringConsumer {
    
    @RabbitListener(queues = { QUEUE_PRODUCT_LOG })
    public void consumer(String message) {
        log.info("Consumer received a message " + message);
    }
}
