package com.algaworks.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.erp.model.Cargo;
import com.algaworks.erp.repository.Cargos;

@Named
@ViewScoped
public class GestaoCargosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cargos cargos;
	
	private Cargo selectedCargo;
	
	private List<Cargo> todosCargos;
	
	public void consultar() {
		todosCargos = cargos.todos();
	}

	public List<Cargo> getTodosCargos() {
		return todosCargos;
	}
	
	public Cargo getSelectedCargo() {  
        return selectedCargo;  
    } 
    
	public void setSelectedCargo(Cargo selectedCargo) {
		this.selectedCargo = selectedCargo;
		System.out.println("Cargo selecionado: " + selectedCargo.getDescricao()); 
	}
}