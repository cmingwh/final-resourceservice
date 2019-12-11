package com.ibm.fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.ibm.fullstack.entity.Ipo;
import com.ibm.fullstack.repository.IpoRepository;

@Service("ipoService")
public class IpoService {

	@Autowired
	private IpoRepository ipoRepository;

	public void delete(Long ipoId) {
		try {
			ipoRepository.deleteById(ipoId);
		} catch (EmptyResultDataAccessException e) {
			return;
		}
	}

	public List<Ipo> findAll() {
		return ipoRepository.findAll();
	}

	public Optional<Ipo> findById(Long ipoId) {
		return ipoRepository.findById(ipoId);
	}
	
	public Ipo save(Ipo ipo) {
		return ipoRepository.save(ipo);
	}

}
