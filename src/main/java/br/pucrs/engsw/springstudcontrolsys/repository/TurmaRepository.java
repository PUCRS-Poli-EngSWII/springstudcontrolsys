package br.pucrs.engsw.springstudcontrolsys.repository;

import org.springframework.data.repository.CrudRepository;
import br.pucrs.engsw.springstudcontrolsys.model.Turma;
import br.pucrs.engsw.springstudcontrolsys.model.TurmaId;

public interface TurmaRepository extends CrudRepository<Turma, TurmaId> {
    
}
