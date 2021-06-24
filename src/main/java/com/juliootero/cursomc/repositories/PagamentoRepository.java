package com.juliootero.cursomc.repositories;

import com.juliootero.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer> {


}
