package br.sesi.bank.bank_java_dbc.domain.cliente;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.email = dados.email;
        this.cpf = dados.cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getemail(){
        return email;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf.equals(cliente.cpf);
    }

    public int hashCode(){
        return Objects.hash(cpf);
    }

    public String toString(){
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }
}
