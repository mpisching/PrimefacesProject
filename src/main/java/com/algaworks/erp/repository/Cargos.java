package com.algaworks.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.algaworks.erp.model.Cargo;

public class Cargos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Cargo porId(Long id) {
		return manager.find(Cargo.class, id);
	}
	
	public List<Cargo> todos() {
		return manager.createQuery("from Cargo", Cargo.class).getResultList();
	}
	
	public Cargo guardar(Cargo cargo) {
		return manager.merge(cargo);
	}
	
	public void remover(Cargo cargo) {
		cargo = porId(cargo.getId());
		manager.remove(cargo);
	}

}