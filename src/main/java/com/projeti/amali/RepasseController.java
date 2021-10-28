package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.RepasseBean;
import com.projeti.amali.repository.RepasseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/repasse")

public class RepasseController {
	
	@Autowired
	private RepasseRepository repasseRepository;
	
	@GetMapping
	public List<RepasseBean> listar() {
		return repasseRepository.findAll();
	}
	
	@PostMapping
	public RepasseBean adicionar (@RequestBody RepasseBean repasseBean) {
		return repasseRepository.save(repasseBean);
	}

}
