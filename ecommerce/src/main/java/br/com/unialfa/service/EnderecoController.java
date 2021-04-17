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
import br.com.unialfa.domain.Endereco;
import br.com.unialfa.repository.EnderecoRepository;

@RestController
@RequestMapping(path="/api/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Endereco> ListarEndereco(){
		return enderecoRepository.findAll();	
	}

	@PostMapping(path="/add")
    public void cadastrarEndereco (@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@PutMapping(path="/add")
    public void editarEndereco (@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@DeleteMapping(value="/delete/{id}")
    public @ResponseBody void deletarEndereco (@PathVariable(name="id")long id) {
		enderecoRepository.deleteById(id);
	}
}
