package com.gameland.gameland.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gameland.gameland.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	
	List <Produtos> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
