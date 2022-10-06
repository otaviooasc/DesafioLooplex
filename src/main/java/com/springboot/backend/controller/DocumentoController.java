package com.springboot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.dto.DocumentAssembler;
import com.springboot.backend.model.DocumentosModel;
import com.springboot.backend.repository.DocumentoRepository;
import com.springboot.backend.service.DocumentoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class DocumentoController {
	
	@Autowired
	private DocumentoRepository docRepository;
	
	@Autowired
	private DocumentoService docService;
	
	@GetMapping("documentos")
	public List<DocumentosModel> getDocumentos() {
		return this.docRepository.findAll();
	}
	
	@PostMapping("inserir")
	@Transactional
	public ResponseEntity<DocumentosModel> postDocumentos(@RequestBody @Validated DocumentAssembler documento) {
		return ResponseEntity.ok(docService.postDocumentos(documento));
	}
}
