package com.algaworks.erp.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.algaworks.erp.model.ESituacao;
import com.algaworks.erp.model.Funcionario;
import com.algaworks.erp.repository.Funcionarios;
import com.algaworks.erp.service.CadastroFuncionarioService;
import com.algaworks.erp.util.FacesMessages;

@Named
@ViewScoped
public class GestaoFuncionariosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Funcionarios funcionarios;
	
	@Inject
	private CadastroFuncionarioService cadastroFuncionarioService;
	
	@Inject
	private FacesMessages facesMessages;	
	
	private List<Funcionario> todosFuncionarios;
	
	private Funcionario funcionarioEdicao = new Funcionario(); 
	
	private Funcionario funcionarioSelecionado;
	
	public void prepararNovoCadastro( ) {
		funcionarioEdicao = new Funcionario();
	}
	
	public void salvar() {
		cadastroFuncionarioService.salvar(funcionarioEdicao);
		
		consultar();
		
		facesMessages.info("Cadastro realizado com sucesso!");
		
		RequestContext.getCurrentInstance().update(
				Arrays.asList("frm:msgs", "frm:funcionarios-table"));
		
	}
	
	public void excluir() {
		cadastroFuncionarioService.excluir(funcionarioSelecionado);
		funcionarioSelecionado = null;
		consultar();
		facesMessages.info("Exclusão realizada com sucesso!");
		
	}
	
	public void consultar() {
		todosFuncionarios = funcionarios.todos();
	}

	public List<Funcionario> getTodosFuncionarios() {
		return todosFuncionarios;
	}
	
	public ESituacao[] getSituacoes() {
		return ESituacao.values();
	}
	

	public Funcionario getFuncionarioEdicao() {
		return funcionarioEdicao;
	}

	public void setFuncionarioEdicao(Funcionario funcionarioEdicao) {
		this.funcionarioEdicao = funcionarioEdicao;
	}

	public Funcionario getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}

	public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
		this.funcionarioSelecionado = funcionarioSelecionado;
	}
	
	
	
}