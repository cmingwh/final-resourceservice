package com.ibm.fullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock_exchange", schema = "fullstack")
public class StockExchange {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name = "brief")
	private String brief;
	
	@Column(name = "contact_address")
	private String contactAddress;
	
	@Column(name = "remark")
	private String remark;
}
