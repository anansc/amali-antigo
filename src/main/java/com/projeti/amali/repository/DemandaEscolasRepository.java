package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.DemandaEscolasBean;

@Repository
public interface DemandaEscolasRepository extends JpaRepository<DemandaEscolasBean, Long> {

}