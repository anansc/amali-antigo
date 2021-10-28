package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.RepasseBean;

@Repository
public interface RepasseRepository extends JpaRepository<RepasseBean, Long> {

}