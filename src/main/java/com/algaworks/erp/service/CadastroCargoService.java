package com.algaworks.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.erp.model.Cargo;
import com.algaworks.erp.repository.Cargos;
import com.algaworks.erp.util.Transacional;

public class CadastroCargoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cargos cargos;
	
	@Transacional
	public void salvar(Cargo cargo) {
		cargos.guardar(cargo);
	}
	
	@Transacional
	public void excluir(Cargo cargo) {
		cargos.remover(cargo);
	}

}