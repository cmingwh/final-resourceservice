package com.ibm.fullstack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ibm.fullstack.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String>,JpaSpecificationExecutor<Company> {

	void deleteByCompanyCode(String companyCode);

	Optional<Company> findByCompanyCode(String code);

}
