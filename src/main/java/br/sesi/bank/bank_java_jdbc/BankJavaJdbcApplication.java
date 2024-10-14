package br.sesi.bank.bank_java_jdbc;

import br.sesi.bank.bank_java_jdbc.controller.BankJavaController;
import br.sesi.bank.bank_java_jdbc.service.ContaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.regex.Pattern;

@SpringBootApplication
public class BankJavaJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankJavaJdbcApplication.class, args);
	}
		ContaService service;
	Scanner teclado;
	public BankJavaController(){
		this.service = new ContaService();
		this.teclado = new Scanner(System.in).useDelimiter()



	}
}
