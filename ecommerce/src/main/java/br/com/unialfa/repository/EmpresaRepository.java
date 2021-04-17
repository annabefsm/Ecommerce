package br.com.unialfa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.unialfa.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long>{

}
