package com.springboot.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENTOS")
public class DocumentosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "documento_id")
	private List<BranchModel> listBrach = new ArrayList<BranchModel>();
	
	public DocumentosModel() {} 
	
	public DocumentosModel(long id, String name, List<BranchModel> listBrach) {
		this.id = id;
		this.nome = name;
		this.listBrach = listBrach;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public List<BranchModel> getListBrach() {
		return listBrach;
	}

	public void setListBrach(List<BranchModel> listBrach) {
		this.listBrach = listBrach;
	}
}
