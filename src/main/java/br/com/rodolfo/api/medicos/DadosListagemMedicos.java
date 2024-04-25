package br.com.rodolfo.api.medicos;

public record DadosListagemMedicos(Long id,String nome, String email, String crm, String especialidade) {
    public DadosListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), String.valueOf(medico.getEspecialidade()));
    }
}
