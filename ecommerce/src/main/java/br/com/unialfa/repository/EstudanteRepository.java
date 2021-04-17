package br.com.unialfa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unialfa.domain.Estudante;
  @Repository
  public interface EstudanteRepository extends CrudRepository<Estudante, Long>{

 } 


