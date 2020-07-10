package com.algaworks.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.erp.model.Funcionario;
import com.algaworks.erp.repository.Funcionarios;
import com.algaworks.erp.util.Transacional;

public class CadastroFuncionarioService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Funcionarios funcionarios;
	
	@Transacional
	public void salvar(Funcionario funcionario) {
		funcionarios.guardar(funcionario);
	}
	
	@Transacional
	public void excluir(Funcionario funcionario) {
		funcionarios.remover(funcionario);
	}

}