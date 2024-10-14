package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.DadosCadastradosCliente;

public class DadosAberturaConta {
    public Integer numero;
    public DadosCadastradosCliente dadosCliente;


    public DadosAberturaConta(Integer numero, DadosCadastradosCliente dadosCliente){
        this.numero = numero;
        this.dadosCliente = dadosCliente;
    }

}
