package com.ibm.fullstack.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockPriceDto {
	private Long id;

	private String companyCode;

	private String stockExchange;

	private Double price;
	
	private Date happenDate;
	
	private String happenTime;
}
