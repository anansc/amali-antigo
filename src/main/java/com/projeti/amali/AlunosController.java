package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.AlunosBean;
import com.projeti.amali.repository.AlunosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/repasse")

public class AlunosController {
	
	@Autowired
	private AlunosRepository repasseRepository;
	
	@GetMapping
	public List<AlunosBean> listar() {
		return repasseRepository.findAll();
	}
	
	@PostMapping
	public AlunosBean adicionar (@RequestBody AlunosBean repasseBean) {
		return repasseRepository.save(repasseBean);
	}

}
