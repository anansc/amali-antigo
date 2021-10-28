package com.projeti.amali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeti.amali.model.ProdutosBean;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosBean, Long> {

}