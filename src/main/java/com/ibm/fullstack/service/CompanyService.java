package com.ibm.fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.ibm.fullstack.entity.Company;
import com.ibm.fullstack.repository.CompanyRepository;

@Service("companyService")
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	public List<Company> findAll() {
		return companyRepository.findAll();
	}

	public Company save(Company company) {
		return companyRepository.save(company);
	}

	public void delete(String code) {
		try {
			companyRepository.deleteByCompanyCode(code);
		} catch (EmptyResultDataAccessException e) {
			return;
		}
	}

	public Optional<Company> findByCompanyCode(String code) {
		return companyRepository.findByCompanyCode(code);
	}
}
