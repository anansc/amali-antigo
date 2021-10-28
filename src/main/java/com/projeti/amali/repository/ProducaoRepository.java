package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.ProducaoBean;

@Repository
public interface ProducaoRepository extends JpaRepository<ProducaoBean, Long> {

}