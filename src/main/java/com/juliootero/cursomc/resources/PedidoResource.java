package com.juliootero.cursomc.resources;
import com.juliootero.cursomc.domain.Categoria;
import com.juliootero.cursomc.domain.Pedido;
import com.juliootero.cursomc.dto.CategoriaDTO;
import com.juliootero.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/pedidos")
class PedidoResource {

    @Autowired
    private PedidoService service;


    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Pedido> findById(@PathVariable Integer id) {
        Pedido obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody Pedido obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


}