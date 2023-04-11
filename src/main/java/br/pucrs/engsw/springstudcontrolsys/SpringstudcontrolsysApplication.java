package br.pucrs.engsw.springstudcontrolsys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
import br.pucrs.engsw.springstudcontrolsys.service.Logs;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class SpringstudcontrolsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudcontrolsysApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner demo(EstudanteRepository repoEs, TurmaRepository repoTu, HorarioTurmaDiscRepository repoHu, DisciplinaRepository repoDi, Logs lg) {		
		return (args) -> {
			// Salva algumas Editoras
			Estudante es1, es2, es3, es4;
			Disciplina di1, di2;
			HorarioTurmaDisc hu1, hu2, hu3, hu4, hu5, hu6;
			Turma tu1, tu2, tu3;
			
			es1 = new Estudante("00001", "Joao", "Av da Minha Casa 11");
			es2 = new Estudante("00002", "Pedro", "Av da Minha Casa 12");
			es3 = new Estudante("00003", "Ana", "Av da Minha Casa 13");
			es4 = new Estudante("00004", "Maria", "Av da Minha Casa 14");

			tu1 = new Turma("130");
			tu2 = new Turma("131");
			tu3 = new Turma("132");

			di1 = new Disciplina("45000", "Disciplilna 1");
			di2 = new Disciplina("65000", "Disciplilna 2");

			hu1 = new HorarioTurmaDisc(new TurmaId("130", "45000"), "AB", di1, tu1);
			hu2 = new HorarioTurmaDisc(new TurmaId("131", "45000"), "CD", di1, tu2);
			hu3 = new HorarioTurmaDisc(new TurmaId("132", "45000"), "JK", di1, tu3);
			hu4 = new HorarioTurmaDisc(new TurmaId("130", "65000"), "LM", di2, tu1);
			hu5 = new HorarioTurmaDisc(new TurmaId("131", "65000"), "NP", di2, tu2);
			hu6 = new HorarioTurmaDisc(new TurmaId("132", "65000"), "EE0", di2, tu3);

			log.info("*************************************************");
			log.info("*************************************************");
			log.info("=================================================");
			log.info(es1.toString());
			log.info(es2.toString());
			log.info(es3.toString());
			log.info(es4.toString());

			repoEs.save(es1);
			repoEs.save(es2);
			repoEs.save(es3);
			repoEs.save(es4);

			log.info(tu1.toString());
			log.info(tu2.toString());
			log.info(tu3.toString());

			repoTu.save(tu1);
			repoTu.save(tu2);
			repoTu.save(tu3);

			log.info(di1.toString());
			log.info(di2.toString());

			repoDi.save(di1);
			repoDi.save(di2);

			log.info(hu1.toString());
			log.info(hu2.toString());
			log.info(hu3.toString());
			log.info(hu4.toString());
			log.info(hu5.toString());
			log.info(hu6.toString());

			repoHu.save(hu1);
			repoHu.save(hu2);
			repoHu.save(hu3);
			repoHu.save(hu4);
			repoHu.save(hu5);
			repoHu.save(hu6);

			lg.display(repoEs, repoTu, repoHu, repoDi);

		};
	}
}
