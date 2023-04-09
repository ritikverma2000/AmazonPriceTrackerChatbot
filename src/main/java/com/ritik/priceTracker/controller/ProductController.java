package com.ritik.priceTracker.controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ritik.priceTracker.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;



@RestController
@RequestMapping("/track")
@AllArgsConstructor
public class ProductController {
	
	@Autowired
    ProductService service;

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public void getMessage(@RequestParam("From") String From, @RequestParam("To") String To, @RequestParam("Body") String Body) {
        service.trackAndSendReply(From, To, Body);
    }
}
