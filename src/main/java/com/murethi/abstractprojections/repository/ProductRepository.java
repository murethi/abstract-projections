package com.murethi.abstractprojections.repository;

import com.murethi.abstractprojections.dto.ProductAbstraction;
import com.murethi.abstractprojections.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("""
            select p from Product p
""")
    List<ProductAbstraction> findAllAbstraction();

}
