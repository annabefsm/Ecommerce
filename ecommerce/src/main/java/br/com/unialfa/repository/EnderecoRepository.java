package br.com.unialfa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.unialfa.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

}
