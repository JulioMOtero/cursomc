package com.juliootero.cursomc.services.validation;

import com.juliootero.cursomc.domain.Cliente;
import com.juliootero.cursomc.domain.enums.TipoCliente;
import com.juliootero.cursomc.dto.ClienteNewDTO;
import com.juliootero.cursomc.repositories.ClienteRepository;
import com.juliootero.cursomc.resources.exception.FieldMessage;
import com.juliootero.cursomc.services.validation.utils.BR;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {

    @Autowired
    private ClienteRepository repo;


    @Override public void initialize(ClienteInsert ann) {
    }
    @Override
    public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {


        List<FieldMessage> list = new ArrayList<>();

        //espaço reservado para mensagens de erro de validaçao

        if(objDto.getTipo().equals(TipoCliente.PESSOAFISICA.getCodigo()) && !BR.isValidCPF(objDto.getCpfOuCnpj())){
            list.add(new FieldMessage("cpfOuCnpj", "CPF Inválido"));
        }
        if(objDto.getTipo().equals(TipoCliente.PESSOAJURIDIICA.getCodigo()) && !BR.isValidCNPJ(objDto.getCpfOuCnpj())){
            list.add(new FieldMessage("cpfOuCnpj", "CNPJ Inválido"));
        }

        Cliente aux = repo.findByEmail(objDto.getEmail());
        if(aux != null){
            list.add(new FieldMessage("email" ,"Email já cadastrado"));
          }


        //espaço reservado para mensagens de erro de validaçao


        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName()).addConstraintViolation();
        }
        return list.isEmpty();
    }



}
