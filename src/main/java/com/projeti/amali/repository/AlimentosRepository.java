package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.AlimentosBean;

@Repository
public interface AlimentosRepository extends JpaRepository<AlimentosBean, Long> {

}