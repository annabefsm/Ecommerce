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
import br.com.unialfa.domain.Estudante;
import br.com.unialfa.repository.EstudanteRepository;

@RestController
@RequestMapping(path="/api/estudante")

public class EstudanteController {
	
	@Autowired
	private EstudanteRepository estudanteRepository;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Estudante> ListarEstudante(){
		return estudanteRepository.findAll();	
	}

	@PostMapping(path="/add")
    public void cadastrarEstudante (@RequestBody Estudante estudante) {
		estudanteRepository.save(estudante);
	}
	
	@PutMapping(path="/add")
    public void editarEstudante (@RequestBody Estudante estudante) {
		estudanteRepository.save(estudante);
	}
	
	@DeleteMapping(value="/delete/{id}")
    public @ResponseBody void deletarEstudante (@PathVariable(name="id")long id) {
		estudanteRepository.deleteById(id);
	}
}
 