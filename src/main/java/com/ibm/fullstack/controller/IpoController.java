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

import com.ibm.fullstack.entity.Ipo;
import com.ibm.fullstack.service.IpoService;

@RestController
@CrossOrigin
@RequestMapping("/ipo")
public class IpoController {

    @Autowired
    private IpoService ipoService;

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
    	ipoService.delete(id);
        return true;
    }
    
    @GetMapping(value = "/find/{id}")
    public Optional<Ipo> findById(@PathVariable("id") Long id) {
        return ipoService.findById(id);
    }
    
    @PostMapping(value = "/")
    public Ipo save(@RequestBody Ipo ipo) {
        return ipoService.save(ipo);
    }
    
    @GetMapping(value = "/findAll")
    public List<Ipo> findAll() {
        return ipoService.findAll();
    }
}