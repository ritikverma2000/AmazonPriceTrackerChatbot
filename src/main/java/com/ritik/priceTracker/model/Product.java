package com.ritik.priceTracker.model;


import java.util.List;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Product")
public class Product {
	
	@Id
    public String id;
    
    public String name;
    public String url;
    public List<Integer>prices;
    public List<String>usersTracking;

    public Product () {}

    public Product (String name, String url, Integer price, String userTracking) {
        super();
        this.name = name;
        this.url = url;
        this.prices = new ArrayList<Integer>();
        this.usersTracking = new ArrayList<String>();
        this.prices.add(price);
        this.usersTracking.add(userTracking);
    }

}
