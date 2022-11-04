package com.murethi.abstractprojections.service;

import com.murethi.abstractprojections.dto.ProductAbstraction;
import com.murethi.abstractprojections.dto.ProductRequest;
import com.murethi.abstractprojections.entities.Product;
import com.murethi.abstractprojections.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void save(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .build();
        productRepository.save(product);
    }

    public List<ProductAbstraction> findAllAbstraction() {
        return productRepository.findAllAbstraction();
    }
}
