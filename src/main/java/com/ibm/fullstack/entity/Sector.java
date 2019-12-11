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
@Table(name = "sector", schema = "fullstack")
public class Sector {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="sector_name")
	private String sectorName;
	
	@Column(name = "brief")
	private String brief;
}
