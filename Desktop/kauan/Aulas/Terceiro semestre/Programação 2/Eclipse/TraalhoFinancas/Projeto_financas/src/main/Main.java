package main;



import java.util.ArrayList;
import java.util.Scanner;

import login.Cliente;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Atualizar cliente");
            System.out.println("4. Excluir cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Valor do empréstimo: R$ ");
                    double emprestimo = scanner.nextDouble();

                    Cliente novoCliente = new Cliente(nome, cpf, emprestimo);
                    clientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Clientes ---");
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Digite o CPF do cliente a ser atualizado: ");
                    String cpfAtualizar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(cpfAtualizar)) {
                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Novo valor do empréstimo: R$ ");
                            double novoEmprestimo = scanner.nextDouble();
                            scanner.nextLine(); // Limpar buffer

                            cliente.setNome(novoNome);
                            cliente.setEmprestimo(novoEmprestimo);
                            System.out.println("Cliente atualizado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente com CPF informado não encontrado.");
                    }
                    break;

                case 4: 
                    System.out.print("Digite o CPF do cliente a ser excluído: ");
                    String cpfExcluir = scanner.nextLine();
                    Cliente clienteParaRemover = null;
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(cpfExcluir)) {
                            clienteParaRemover = cliente;
                            break;
                        }
                    }
                    if (clienteParaRemover != null) {
                        clientes.remove(clienteParaRemover);
                        System.out.println("Cliente removido com sucesso!");
                    } else {
                        System.out.println("Cliente com CPF informado não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
	

	}


