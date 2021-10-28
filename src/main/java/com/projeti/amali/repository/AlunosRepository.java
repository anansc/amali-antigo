package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.AlunosBean;

@Repository
public interface AlunosRepository extends JpaRepository<AlunosBean, Long> {

}