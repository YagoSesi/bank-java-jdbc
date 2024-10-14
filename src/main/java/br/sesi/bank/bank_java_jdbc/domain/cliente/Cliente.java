package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class Cliente(DadosCadastradosCliente dados) {
    this.nome = dados.nome();
    this.cpf = dados.cpf();
    this.email = dados.email();
