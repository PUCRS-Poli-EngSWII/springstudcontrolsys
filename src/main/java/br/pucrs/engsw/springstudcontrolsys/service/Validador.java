package br.pucrs.engsw.springstudcontrolsys.service;

import br.pucrs.engsw.springstudcontrolsys.model.Estudante;

public class Validador {
    public boolean eEstudanteValido(Estudante std) {
        return std != null && std.getNroDocumento() != null && std.getNome() != null && std.getEndereco() != null;
    }
}
