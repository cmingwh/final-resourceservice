package com.ibm.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fullstack.entity.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {

}
