package br.com.devsouza.producer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import br.com.devsouza.commons.dtos.ProductDTO;

import static br.com.devsouza.commons.constants.RabbitMQConstants.*;

@Log4j2
@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final RabbitTemplate rabbitTemplate;

    public void createProduct(ProductDTO dto){
        log.info("Sending a message to exchange " + dto.toString());
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, dto);
    }
}
