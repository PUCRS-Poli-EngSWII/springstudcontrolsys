package br.pucrs.engsw.springstudcontrolsys.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TurmaId implements Serializable {
    private String codTurma;
    private String codDisciplina;
}
