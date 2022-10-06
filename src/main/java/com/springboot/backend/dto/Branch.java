package com.springboot.backend.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.lang.NonNull;

public class Branch {
	
	@NonNull
	private String nome;
	
	private Date date;
	
	private List<Leaf> leaf = new ArrayList<Leaf>();

	public Branch() {}

	public Branch(String nome, List<Leaf> leaf) {
		this.nome = nome;
		this.date = new Date(System.currentTimeMillis());
		this.leaf = leaf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Leaf> getLeaf() {
		return leaf;
	}

	public void setLeaf(List<Leaf> leaf) {
		this.leaf = leaf;
	}
}
