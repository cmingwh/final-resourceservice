package com.ibm.fullstack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

	public List<Company> search(Company company) {
	       return companyRepository.findAll(new Specification<Company>() {
			private static final long serialVersionUID = 3780352872432236879L;
			@Override
	           public Predicate toPredicate(Root<Company> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
	               List<Predicate> predicates = new ArrayList<>();
	               if(!StringUtils.isEmpty(company.getCompanyName())) {
	                   predicates.add(criteriaBuilder.and(criteriaBuilder.like(root.get("companyName"), "%"+ company.getCompanyName() +"%")));
	               }
	               if(!StringUtils.isEmpty(company.getCompanyCode())){
	                   predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("companyCode"), company.getCompanyCode())));
	               }
	               if(company.getSectorId()!=null){
	                   predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("sectorId"), company.getSectorId())));
	               }
//	               if(company!=null){
//	                   predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("sectorId"), company.getSectorId())));
//	               }
	               return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	           }
	       });
	   }
}
