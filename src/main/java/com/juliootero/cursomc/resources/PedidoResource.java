package com.juliootero.cursomc.resources;
import com.juliootero.cursomc.domain.Pedido;
import com.juliootero.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}