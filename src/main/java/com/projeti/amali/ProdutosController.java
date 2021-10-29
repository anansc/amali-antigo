package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.ProdutosBean;
import com.projeti.amali.repository.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	@GetMapping
	public List<ProdutosBean> listar() {
		return produtosRepository.findAll();
	}
	
	@PostMapping
	public ProdutosBean adicionar (@RequestBody ProdutosBean produtosBean) {
		return produtosRepository.save(produtosBean);
	}

}