package com.juliootero.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.juliootero.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento{
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/yyy HH:mm")
    private Date dataVencimento;
    @JsonFormat(pattern = "dd/MM/yyy HH:mm")
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVenciemnto, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVenciemnto;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(){

    }

    public Date getDataVenciemnto() {
        return dataVencimento;
    }

    public void setDataVenciemnto(Date dataVenciemnto) {
        this.dataVencimento = dataVenciemnto;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
