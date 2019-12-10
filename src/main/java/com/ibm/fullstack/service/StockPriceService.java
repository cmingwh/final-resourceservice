package com.ibm.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fullstack.dto.CompareDto;
import com.ibm.fullstack.entity.StockPrice;
import com.ibm.fullstack.repository.StockPriceRepository;

@Service("stockPriceService")
public class StockPriceService {
	@Autowired
    StockPriceRepository stockPriceRepository;

	public List<StockPrice> search(CompareDto compareDto) {
		return stockPriceRepository.searchByCompanies(compareDto.getCompanies(), compareDto.getFrom(), compareDto.getTo());
	}
	

}
