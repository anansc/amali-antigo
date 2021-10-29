package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.ProducaoBean;
import com.projeti.amali.repository.ProducaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/producao")

public class ProducaoController {
	
	@Autowired
	private ProducaoRepository producaoRepository;
	
	@GetMapping
	public List<ProducaoBean> listar() {
		return producaoRepository.findAll();
	}
	
	@PostMapping
	public ProducaoBean adicionar (@RequestBody ProducaoBean producaoBean) {
		return producaoRepository.save(producaoBean);
	}

}
