package br.pucrs.engsw.springstudcontrolsys.repository;

import org.springframework.data.repository.CrudRepository;

import br.pucrs.engsw.springstudcontrolsys.model.Estudante;

public interface EstudanteRepository extends CrudRepository<Estudante, String> {
    
}
