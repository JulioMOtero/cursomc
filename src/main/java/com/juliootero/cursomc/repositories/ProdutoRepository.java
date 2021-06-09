package com.juliootero.cursomc.repositories;

import com.juliootero.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {


}
