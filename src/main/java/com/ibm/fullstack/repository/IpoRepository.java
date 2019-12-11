package com.ibm.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fullstack.entity.Ipo;

@Repository
public interface IpoRepository extends JpaRepository<Ipo, Long> {

}
