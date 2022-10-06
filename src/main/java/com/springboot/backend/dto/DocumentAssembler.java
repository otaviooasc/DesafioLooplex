package com.springboot.backend.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.lang.NonNull;

public class DocumentAssembler {
	
	@NonNull
	private List<Branch> listBranch = new ArrayList<Branch>();

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch> getListBranch() {
		return listBranch;
	}

	public void setListBranch(List<Branch> listBranch) {
		this.listBranch = listBranch;
	}
}