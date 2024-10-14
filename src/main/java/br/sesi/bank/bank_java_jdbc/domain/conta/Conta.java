package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;

public Conta(Integer numero, BigDecimal saldo, Cliente titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;


}
