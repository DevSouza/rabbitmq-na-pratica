package br.com.devsouza.consumerservice.rabbitmq.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

import br.com.devsouza.commons.dtos.ProductDTO;
import static br.com.devsouza.commons.constants.RabbitMQConstants.*;

@Log4j2
@Component
public class ProductConsumer {
    
    @RabbitListener(queues = { RK_PRODUCT_LOG })
    public void consumer(ProductDTO message) {
        log.info("Received message " + message.toString());
    }
}
