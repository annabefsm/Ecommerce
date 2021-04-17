package br.com.unialfa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.unialfa.domain.Empresa;
import br.com.unialfa.repository.EmpresaRepository;

@RestController
@RequestMapping(path="/api/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Empresa> ListarEmpresa(){
		return empresaRepository.findAll();	
	}

	@PostMapping(path="/add")
    public void cadastrarEmpresa (@RequestBody Empresa empresa) {
		empresaRepository.save(empresa);
	}
	
	@PutMapping(path="/add")
    public void editarEmpresa (@RequestBody Empresa empresa) {
		empresaRepository.save(empresa);
	}
	
	@DeleteMapping(value="/delete/{id}")
    public @ResponseBody void deletarEmpresa (@PathVariable(name="id")long id) {
		empresaRepository.deleteById(id);
	}
}
