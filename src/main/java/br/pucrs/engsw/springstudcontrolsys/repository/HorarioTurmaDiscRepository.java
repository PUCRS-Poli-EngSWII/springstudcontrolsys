package br.pucrs.engsw.springstudcontrolsys.repository;

import org.springframework.data.repository.CrudRepository;
import br.pucrs.engsw.springstudcontrolsys.model.HorarioTurmaDisc;
import br.pucrs.engsw.springstudcontrolsys.model.TurmaId;

public interface HorarioTurmaDiscRepository extends CrudRepository<HorarioTurmaDisc, TurmaId> {
    public HorarioTurmaDisc findByHorarioTurmaId(TurmaId t);
}
