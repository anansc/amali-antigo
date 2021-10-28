package com.projeti.amali;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.projeti.amali.model.DemandaEscolasBean;
import com.projeti.amali.repository.DemandaEscolasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/repasse")

public class DemandaEscolasController {
	
	@Autowired
	private DemandaEscolasRepository repasseRepository;
	
	@GetMapping
	public List<DemandaEscolasBean> listar() {
		return repasseRepository.findAll();
	}
	
	@PostMapping
	public DemandaEscolasBean adicionar (@RequestBody DemandaEscolasBean repasseBean) {
		return repasseRepository.save(repasseBean);
	}

}
