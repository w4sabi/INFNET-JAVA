package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private IClienteAPI clientAPI;
	
	@Override
	public void run(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o nome: ");
		
		String nome = entrada.nextLine();
		
		System.out.println(clientAPI.buscaGeneroPor(nome));
	}
}
