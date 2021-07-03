package com.juliootero.cursomc.dto;

import com.juliootero.cursomc.domain.Cliente;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import java.io.Serializable;

public class ClienteDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotEmpty(message = "Preenchimento obrigatório")
    @Length(min = 5, max = 120,message = "O Nome deve conter de 5 a 120 caracteres")
    private String nome;

    @NotEmpty(message = "Preenchimento obrigatório")
    @Email   @NotEmpty(message = "Email inválido")
    private String email;

    public ClienteDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteDTO(Cliente obj){
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
    }
}
