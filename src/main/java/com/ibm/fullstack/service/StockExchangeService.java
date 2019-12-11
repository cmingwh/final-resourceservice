package com.ibm.fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.ibm.fullstack.entity.StockExchange;
import com.ibm.fullstack.repository.StockExchangeRepository;

@Service("stockExchangeService")
public class StockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepository;

	public void delete(Long stockExchangeId) {
		try {
			stockExchangeRepository.deleteById(stockExchangeId);
		} catch (EmptyResultDataAccessException e) {
			return;
		}
	}

	public List<StockExchange> findAll() {
		return stockExchangeRepository.findAll();
	}

	public Optional<StockExchange> findById(Long stockExchangeId) {
		return stockExchangeRepository.findById(stockExchangeId);
	}
	
	public StockExchange save(StockExchange stockExchange) {
		return stockExchangeRepository.save(stockExchange);
	}

}
