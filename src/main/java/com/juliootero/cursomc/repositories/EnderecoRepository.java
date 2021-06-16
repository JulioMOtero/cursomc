package com.juliootero.cursomc.repositories;

import com.juliootero.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer> {


}
