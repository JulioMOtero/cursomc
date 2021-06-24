package com.juliootero.cursomc.domain;

import com.juliootero.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento{
    private static final long serialVersionUID = 1L;

    private Date dataVenciemnto;
    private Date dataPagamento;

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVenciemnto, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVenciemnto = dataVenciemnto;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(){

    }

    public Date getDataVenciemnto() {
        return dataVenciemnto;
    }

    public void setDataVenciemnto(Date dataVenciemnto) {
        this.dataVenciemnto = dataVenciemnto;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
