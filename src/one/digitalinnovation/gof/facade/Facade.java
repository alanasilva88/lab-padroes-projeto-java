package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {

		nome = nome.trim();
    	cep = cep.trim();


		if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }

        if (cep == null || cep.length() != 8) {
            throw new IllegalArgumentException("CEP inválido.");
        }

		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
