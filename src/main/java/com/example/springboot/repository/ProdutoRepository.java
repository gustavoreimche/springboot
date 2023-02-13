package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
