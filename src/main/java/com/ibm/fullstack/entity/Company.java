package com.ibm.fullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company", schema = "fullstack")
public class Company {
	@Id
	@Column(name = "company_code")
	private String companyCode;

	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "turnover")
	private String turnover;

	@Column(name = "ceo")
	private String ceo;
	
	@Column(name = "directors")
	private String directors;
	
	@Column(name = "introduction")
	private String introduction;
	
	@Column(name = "sector_id")
	private Integer sectorId;
	
	@ManyToOne
	@JoinColumn(name="sector_id", insertable=false, updatable=false)
	private Sector sector;
}
