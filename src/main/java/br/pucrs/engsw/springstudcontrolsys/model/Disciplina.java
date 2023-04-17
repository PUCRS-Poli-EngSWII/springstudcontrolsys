package br.pucrs.engsw.springstudcontrolsys.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="DISCIPLINAS")
public class Disciplina {
    public Disciplina(String c, String n) {
        this.setCodDisciplina(c);
        this.setNome(n);
    }
    @Id
    private String codDisciplina;
    private String nome;
    @OneToMany(mappedBy="disciplinaH")
    // @JsonManagedReference
    private List<HorarioTurmaDisc> turmasHorarios;
 }
