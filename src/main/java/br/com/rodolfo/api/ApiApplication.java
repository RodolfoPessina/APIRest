package br.com.rodolfo.api;

import br.com.rodolfo.api.medicos.DadosAtualizacaoMedicos;
import br.com.rodolfo.api.medicos.DadosCadastroMedicos;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoMedicos dados) {

	}

}
