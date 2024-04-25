package br.com.rodolfo.api.medicos;

import br.com.rodolfo.api.enderecos.DadosEnderecos;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecos endereco) {

}
