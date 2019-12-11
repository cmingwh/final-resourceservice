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

import com.ibm.fullstack.entity.Sector;
import com.ibm.fullstack.service.SectorService;

@RestController
@CrossOrigin
@RequestMapping("/sector")
public class SectorController {

    @Autowired
    private SectorService sectorService;

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
    	sectorService.delete(id);
        return true;
    }
    
    @GetMapping(value = "/find/{id}")
    public Optional<Sector> findById(@PathVariable("id") Long id) {
        return sectorService.findById(id);
    }
    
    @PostMapping(value = "/")
    public Sector save(@RequestBody Sector sector) {
        return sectorService.save(sector);
    }
    
    @GetMapping(value = "/findAll")
    public List<Sector> findAll() {
        return sectorService.findAll();
    }
}