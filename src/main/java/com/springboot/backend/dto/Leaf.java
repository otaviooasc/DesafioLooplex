package com.springboot.backend.dto;

import java.util.Date;

public class Leaf {
	private String nome;
	
	private Date date;
	
	public Leaf() {}

	public Leaf(String nome) {
		this.nome = nome;
		this.date = new Date(System.currentTimeMillis());
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
}
