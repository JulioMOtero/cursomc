package com.juliootero.cursomc.resources;
import com.juliootero.cursomc.domain.Cliente;
import com.juliootero.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
class ClienteResource {

    @Autowired
    private ClienteService service;


    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Cliente> findById(@PathVariable Integer id) {
        Cliente obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}