package br.pucrs.engsw.springstudcontrolsys.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="TURMAS")
public class Turma {
    public Turma(String t) {
        this.setCodTurma(t);
    }
    @Id
    private String codTurma;
    @OneToMany(mappedBy="turmaH")
    @JsonIgnore
    private List<HorarioTurmaDisc> disciplinasHorario;
}
