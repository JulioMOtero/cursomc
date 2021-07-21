package com.juliootero.cursomc.services;


import com.juliootero.cursomc.domain.PagamentoComBoleto;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class BoletoService {


    public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido){
        Calendar calendar = Calendar.getInstance();
         calendar.setTime(instanteDoPedido);
         calendar.add(Calendar.DAY_OF_MONTH,7);
         pagto.setDataVenciemnto(calendar.getTime());
    }
}
