package br.pucrs.engsw.springstudcontrolsys.model;

// import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="HORARIO_TURMA_DISCIPLINA")
public class HorarioTurmaDisc {
    public HorarioTurmaDisc(TurmaId turmaId, String h) {
        this.setHorarioTurmaId(turmaId);
        this.setHorario(h);
    }

    @EmbeddedId
    private TurmaId horarioTurmaId;
    private String horario;

    @ManyToOne
    // @JsonBackReference
    @JoinColumn(name = "codDisciplina", insertable=false, updatable=false)
    private Disciplina disciplinaH;

    @ManyToOne
    // @JsonIgnore
    @JoinColumn(name = "codTurma", insertable=false, updatable=false)
    private Turma turmaH;

    public String toString(){
        return this.getHorarioTurmaId().getCodTurma() + " - " + this.getHorarioTurmaId().getCodDisciplina() + " - " + this.getHorario();
    }
}
