package com.springboot.backend.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH")
public class BranchModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String date;
	
	private String profundidade;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "branch_id")
	private List<LeafModel> leaf = new ArrayList<LeafModel>();
	
	@ManyToOne 
	@JoinColumn(name = "documento_id")
	private DocumentosModel documentosModel;

	public BranchModel() {}

	public BranchModel(String nome, List<LeafModel> leaf) {
		this.nome = nome;
		this.date = new SimpleDateFormat(("dd/MM/yyyy HH:mm:ss")).format(System.currentTimeMillis());
		this.leaf = leaf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<LeafModel> getLeaf() {
		return leaf;
	}

	public void setLeaf(List<LeafModel> leaf) {
		this.leaf = leaf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(String profundidade) {
		this.profundidade = profundidade;
	}
}
