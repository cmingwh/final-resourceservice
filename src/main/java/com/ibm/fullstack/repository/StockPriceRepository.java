package com.ibm.fullstack.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fullstack.entity.StockPrice;

@Repository
public interface StockPriceRepository  extends CrudRepository<StockPrice, Long> {

	@Query(value = "select s from StockPrice s where s.companyCode in :companies and s.happenTime < :to and s.happenTime > :from order by companyCode asc, happenTime asc")
	List<StockPrice> searchByCompanies(String[] companies, Date from, Date to);

}
