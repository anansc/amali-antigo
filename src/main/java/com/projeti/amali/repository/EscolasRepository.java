package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.EscolasBean;

@Repository
public interface EscolasRepository extends JpaRepository<EscolasBean, Long> {

}