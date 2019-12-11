package com.ibm.fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.ibm.fullstack.entity.Sector;
import com.ibm.fullstack.repository.SectorRepository;

@Service("sectorService")
public class SectorService {

	@Autowired
	private SectorRepository sectorRepository;

	public void delete(Long sectorId) {
		try {
			sectorRepository.deleteById(sectorId);
		} catch (EmptyResultDataAccessException e) {
			return;
		}
	}

	public List<Sector> findAll() {
		return sectorRepository.findAll();
	}

	public Optional<Sector> findById(Long sectorId) {
		return sectorRepository.findById(sectorId);
	}
	
	public Sector save(Sector sector) {
		return sectorRepository.save(sector);
	}

}
