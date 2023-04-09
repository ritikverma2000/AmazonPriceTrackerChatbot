package com.ritik.priceTracker.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ritik.priceTracker.model.Product;



@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{url: '?0'}")
    Product findItemByUrl(String url);
}
