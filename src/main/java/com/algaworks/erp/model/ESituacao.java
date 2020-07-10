package com.algaworks.erp.model;

public enum ESituacao {

	ATIVO("Funcionário ativo"), 
	INATIVO("Funcionário inativo"),
	APOSENTADO("Funcionário aposentado"),
	AFASTADO("Funcionário temporariamente afastado");
	
	private String descricao;

	ESituacao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
