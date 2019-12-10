package com.ibm.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fullstack.dto.CompareDto;
import com.ibm.fullstack.entity.StockPrice;
import com.ibm.fullstack.service.StockPriceService;

@RestController
@CrossOrigin
@RequestMapping("/price")
public class StockPriceController {

    @Autowired
    private StockPriceService stockPriceService;

    @PostMapping(value = "/search")
    public List<StockPrice> search(@RequestBody CompareDto compareDto) {
        return stockPriceService.search(compareDto);
    }
}