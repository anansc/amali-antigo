package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.OrganizacoesBean;
import com.projeti.amali.repository.OrganizacoesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/repasse")

public class OrganizacoesController {
	
	@Autowired
	private OrganizacoesRepository repasseRepository;
	
	@GetMapping
	public List<OrganizacoesBean> listar() {
		return repasseRepository.findAll();
	}
	
	@PostMapping
	public OrganizacoesBean adicionar (@RequestBody OrganizacoesBean repasseBean) {
		return repasseRepository.save(repasseBean);
	}

}
