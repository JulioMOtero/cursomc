package com.juliootero.cursomc.services;


import com.juliootero.cursomc.domain.Pedido;
import com.juliootero.cursomc.domain.Produto;
import com.juliootero.cursomc.repositories.PedidoRepository;
import com.juliootero.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private PedidoRepository repo;

    public Produto find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new  ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
