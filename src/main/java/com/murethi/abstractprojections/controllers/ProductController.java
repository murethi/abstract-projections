package com.murethi.abstractprojections.controllers;

import com.murethi.abstractprojections.dto.ProductAbstraction;
import com.murethi.abstractprojections.dto.ProductRequest;
import com.murethi.abstractprojections.repository.ProductRepository;
import com.murethi.abstractprojections.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductAbstraction> getAllAbstraction(){
        return productService.findAllAbstraction();
    }

    @PostMapping("/products/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void getAllAbstraction(@RequestBody ProductRequest productRequest){
        productService.save(productRequest);
    }
}
