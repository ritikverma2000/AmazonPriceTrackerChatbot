package com.ritik.priceTracker;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ritik.priceTracker.repository.ProductRepository;



import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
@EnableScheduling
public class PriceTrackerApplication {
	
	
 	@Autowired
    ProductRepository productRepository;

	public static void main(String[] args) {
	
		
		SpringApplication.run(PriceTrackerApplication.class, args);
	}

}
