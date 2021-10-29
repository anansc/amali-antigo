package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.AlimentosBean;
import com.projeti.amali.repository.AlimentosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/alimentos")

public class AlimentosController {
	
	@Autowired
	private AlimentosRepository repasseRepository;
	
	@GetMapping
	public List<AlimentosBean> listar() {
		return repasseRepository.findAll();
	}
	
	@PostMapping
	public AlimentosBean adicionar (@RequestBody AlimentosBean alimentosBean) {
		return repasseRepository.save(alimentosBean);
	}

}
