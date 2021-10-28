package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.OrganizacoesBean;

@Repository
public interface OrganizacoesRepository extends JpaRepository<OrganizacoesBean, Long> {

}