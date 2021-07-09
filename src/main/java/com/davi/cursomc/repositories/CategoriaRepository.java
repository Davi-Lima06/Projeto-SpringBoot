package com.davi.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davi.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer >{ // CLASSE DE ACESSO A DADOS
																				 // ESSA CLASSE QUE VAI ALTERAR OS DADOS DO BANCO DE DADOS 

}
