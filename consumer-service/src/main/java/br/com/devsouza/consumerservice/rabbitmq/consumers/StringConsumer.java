package br.com.devsouza.consumerservice.rabbitmq.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StringConsumer {
    
    public static final String EXG_NAME_MARKETPLACE = "marketplace.direct";
    public static final String QUEUE_PRODUCT_LOG    = "product.log";
    public static final String RK_PRODUCT_LOG       = "product.log";

    @RabbitListener(queues = { QUEUE_PRODUCT_LOG })
    public void consumer(String message) {
        log.info("Consumer received a message " + message);
    }
}
