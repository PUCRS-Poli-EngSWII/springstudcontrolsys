package br.pucrs.engsw.springstudcontrolsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsw.springstudcontrolsys.model.Estudante;
import br.pucrs.engsw.springstudcontrolsys.repository.EstudanteRepository;
import br.pucrs.engsw.springstudcontrolsys.service.Validador;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/estudante/")
public class EstudanteController {
    @Autowired
    private EstudanteRepository repoEs;
    private Validador validador = new Validador();

    @PostMapping(value = "/regestu/")
    public ResponseEntity<String> registerStudent(@RequestBody Estudante std) {

        log.info("Estudante recebido: " + std);

        if (validador.eEstudanteValido(std))
            if (repoEs.findByNroDocumento(std.getNroDocumento()) != null)
                return ResponseEntity.badRequest().body("Estudante já registrado!");
            else {
                repoEs.save(std);
                return ResponseEntity.ok("Estudante registrado!");
            }
        else
            return ResponseEntity.badRequest().body("Estudante inválido!");

    }
}
