package br.pucrs.engsw.springstudcontrolsys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.pucrs.engsw.springstudcontrolsys.model.Disciplina;
import br.pucrs.engsw.springstudcontrolsys.model.Estudante;
import br.pucrs.engsw.springstudcontrolsys.model.HorarioTurmaDisc;
import br.pucrs.engsw.springstudcontrolsys.model.Turma;
import br.pucrs.engsw.springstudcontrolsys.model.TurmaId;
import br.pucrs.engsw.springstudcontrolsys.repository.DisciplinaRepository;
import br.pucrs.engsw.springstudcontrolsys.repository.EstudanteRepository;
import br.pucrs.engsw.springstudcontrolsys.repository.HorarioTurmaDiscRepository;
import br.pucrs.engsw.springstudcontrolsys.repository.TurmaRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class Logs {
    public void display(EstudanteRepository repoEs, TurmaRepository repoTu, HorarioTurmaDiscRepository repoHu, DisciplinaRepository repoDi){
        

			log.info("*************************************************");
			log.info("**********  Finds *******************************");
			log.info("=================================================");

			log.info("*************************************************");
			log.info("Estudantes com findAll():");
			log.info("-------------------------------");
			for (Estudante est : repoEs.findAll()) {
				log.info(est.toString());
			}
			log.info("===============================");

			log.info("*************************************************");
			log.info("Estudantes com findByMatricula():");
			log.info("-------------------------------");
			log.info(repoEs.findByNroDocumento("00001").toString());
			log.info(repoEs.findByNroDocumento("00002").toString());
			log.info(repoEs.findByNroDocumento("00003").toString());
			log.info(repoEs.findByNroDocumento("00004").toString());
			log.info("===============================");

			log.info("*************************************************");
			log.info("Rel Horarios com findAll():");
			log.info("-------------------------------");
			for (HorarioTurmaDisc est : repoHu.findAll()) {
				log.info(est.toString());
			}
			log.info("===============================");

			log.info("*************************************************");
			log.info("Disciplinas com findAll():");
			log.info("-------------------------------");
			for (Disciplina est : repoDi.findAll()) {
				log.info(est.toString());
			}
			log.info("===============================");


			log.info("*************************************************");
			log.info("Turmas com findAll():");
			log.info("-------------------------------");
			for (Turma est : repoTu.findAll()) {
				log.info(est.toString());
			}
			log.info("===============================");

			log.info(repoHu.findByHorarioTurmaId(new TurmaId("130", "45000")).toString());

    }
}
