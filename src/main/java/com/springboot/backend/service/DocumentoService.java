package com.springboot.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.dto.DocumentAssembler;
import com.springboot.backend.model.BranchModel;
import com.springboot.backend.model.DocumentosModel;
import com.springboot.backend.model.LeafModel;
import com.springboot.backend.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository docRepository;
	
	public DocumentosModel postDocumentos(DocumentAssembler doc) {
		DocumentosModel documentos = new DocumentosModel();
		List<LeafModel> listLeaf = new ArrayList<>();
		List<BranchModel> listBranch = new ArrayList<>();
		documentos.setNome(doc.getName());
		for (int i = 0; i < doc.getListBranch().size(); i++) {
			for (int j = 0; j < doc.getListBranch().get(i).getLeaf().size(); j++) {
				listLeaf.add(new LeafModel(doc.getListBranch().get(i).getLeaf().get(j).getNome()));
			}
			BranchModel branch = new BranchModel(doc.getListBranch().get(i).getNome(), listLeaf);
			branch.setProfundidade("A profundidade da branch é: " + (i + 1));
			listBranch.add(branch);
			listLeaf = new ArrayList<>();
		}
		documentos.setListBrach(listBranch);
		return docRepository.save(documentos);
	}
}
