package com.ibm.fullstack.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompareDto {
	private String[] companies;

	private String[] sectors;
	
	private Date from;
	
	private Date to;
}
