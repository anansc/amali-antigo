package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.EscolasBean;
import com.projeti.amali.repository.EscolasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/escolas")

public class EscolasController {
	
	@Autowired
	private EscolasRepository escolasRepository;
	
	@GetMapping
	public List<EscolasBean> listar() {
		return escolasRepository.findAll();
	}
	
	@PostMapping
	public EscolasBean adicionar (@RequestBody EscolasBean escolasBean) {
		return escolasRepository.save(escolasBean);
	}

}
