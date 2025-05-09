package main;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import Pessoa.Cliente;

public class Main {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Cliente> clientes = new ArrayList<>();
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		Main main = new Main();
		
		main.cadastro(null, null, null);
		main.login(null, null);
		
	}
	
	public void cadastro(String nome, String login, String senha) {
		System.out.println("Informe seu nome: ");
		nome = scanner.nextLine();
		System.out.println("Crie seu login: ");
		login = scanner.nextLine();
		System.out.println("Crie sua senha:");
		senha = scanner.nextLine();
		clientes.add(new Cliente(nome, login, senha));
		logger.log(Level.INFO, "Cliente cadastrado com sucesso");
	}
	
	public void login(String login, String senha) {
		System.out.println("Informe seu login ou seu código de funcionário: ");
		login = scanner.nextLine();
		System.out.println("Informe sua senha");
		senha = scanner.nextLine();
		
		for (Cliente cliente : clientes) {
			if(cliente.getLogin() == login && cliente.getSenha() == senha) {
				logger.log(Level.INFO, "Login bem-sucedido!");
			}else {
				logger.log(Level.WARNING, "Login ou senha incorretos.");
			}
		} 
	}

}
