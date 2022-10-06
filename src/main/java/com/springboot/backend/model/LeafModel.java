package com.springboot.backend.model;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leaf")
public class LeafModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String date;
	
	@ManyToOne 
	@JoinColumn(name = "branch_id")
	private BranchModel branch;
	
	public LeafModel() {}

	public LeafModel(String nome) {
		this.nome = nome;
		this.date = new SimpleDateFormat(("dd/MM/yyyy HH:mm:ss")).format(System.currentTimeMillis());
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
