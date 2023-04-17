package br.pucrs.engsw.springstudcontrolsys.repository;

import org.springframework.data.repository.CrudRepository;

import br.pucrs.engsw.springstudcontrolsys.model.Disciplina;

public interface DisciplinaRepository extends CrudRepository<Disciplina, String> {
    public Disciplina findByCodDisciplina(String codDisciplina);
    public Disciplina findByNome(String nome);
}
