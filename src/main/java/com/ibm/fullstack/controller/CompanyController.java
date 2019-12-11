package com.ibm.fullstack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fullstack.entity.Company;
import com.ibm.fullstack.service.CompanyService;

@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @DeleteMapping(value = "/{code}")
    public boolean delete(@PathVariable("code") String code) {
    	companyService.delete(code);
        return true;
    }
    
    @GetMapping(value = "/find/{code}")
    public Optional<Company> findByCompanyCode(@PathVariable("code") String code) {
        return companyService.findByCompanyCode(code);
    }
    
    @PostMapping(value = "/")
    public Company save(@RequestBody Company company) {
        return companyService.save(company);
    }
    
    @GetMapping(value = "/findAll")
    public List<Company> findAll() {
        return companyService.findAll();
    }
}