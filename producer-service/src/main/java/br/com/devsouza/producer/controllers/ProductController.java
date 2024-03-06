package br.com.devsouza.producer.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.devsouza.commons.dtos.ProductDTO;
import br.com.devsouza.producer.services.ProductService;
import lombok.RequiredArgsConstructor;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<ProductDTO> produces(@RequestBody ProductDTO dto) {
        service.createProduct(dto);
        return ResponseEntity.status(CREATED).build();
    }

}
