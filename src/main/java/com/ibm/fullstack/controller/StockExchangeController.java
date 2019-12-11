package com.ibm.fullstack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fullstack.entity.StockExchange;
import com.ibm.fullstack.service.StockExchangeService;

@RestController
@CrossOrigin
@RequestMapping("/stockExchange")
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeService;

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
    	stockExchangeService.delete(id);
        return true;
    }
    
    @GetMapping(value = "/find/{id}")
    public Optional<StockExchange> findById(@PathVariable("id") Long id) {
        return stockExchangeService.findById(id);
    }
    
    @PostMapping(value = "/")
    public StockExchange save(@RequestBody StockExchange stockExchange) {
        return stockExchangeService.save(stockExchange);
    }
    
    @GetMapping(value = "/findAll")
    public List<StockExchange> findAll() {
        return stockExchangeService.findAll();
    }
}