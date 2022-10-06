package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.backend.model.DocumentosModel;

@Repository
public interface DocumentoRepository extends JpaRepository<DocumentosModel, Long>{	
}
