package com.springboot.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.backend.model.BranchModel;
import com.springboot.backend.model.DocumentosModel;
import com.springboot.backend.model.LeafModel;
import com.springboot.backend.repository.DocumentoRepository;

@SpringBootApplication
public class DesafioLooplexApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioLooplexApplication.class, args);
	}

	@Autowired
	private DocumentoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		List<LeafModel> leaf = new ArrayList<LeafModel>();
		leaf.add(new LeafModel("Leaf 1"));
		leaf.add(new LeafModel("Leaf 2"));
		
		List<LeafModel> leaf1 = new ArrayList<LeafModel>();
		leaf1.add(new LeafModel("Leaf 2"));
		
		List<BranchModel> branch = new ArrayList<BranchModel>();
		branch.add(new BranchModel("Branch 1", leaf));

		branch.add(new BranchModel("Branch 2", leaf1));
		
		this.repository.save(new DocumentosModel(1, "Documento 1", branch));
		
		//this.repository.save(new Documentos("Dona", "Maria", "donaMaria@gmail.com"));
		//this.repository.save(new Documentos("Seu", "José", "seuJosé@gmail.com"));
		//this.repository.save(new Documentos("Agua", "Molhada", "aguaMolhada@gmail.com"));
		//this.repository.save(new Documentos("Pinas", "perdes", "pinasEperdes@gmail.com"));
	
	}

}
