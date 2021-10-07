package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

import br.senai.sp.jandira.lista.TipoConta;

public class App {

	public static void main(String[] args) {

		// Criar agencia Maria
		Agencia agenciaMaria = new Agencia();
		agenciaMaria.setNumero("4214-9");
		agenciaMaria.setCidade(null);
		agenciaMaria.setNomeGerente(null);
		agenciaMaria.setTelefone(null);

		// Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("Maria@email.com");
		clienteMaria.setSalario(5000);

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agenciaMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);

		// Criar agencia Pedro
		Agencia agenciaPedro = new Agencia();
		agenciaPedro.setNumero("4214-9");
		agenciaPedro.setCidade(null);
		agenciaPedro.setNomeGerente(null);
		agenciaPedro.setTelefone(null);

		// Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@uol.com.br");
		clientePedro.setSalario(2865.98);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agenciaPedro);

		// Criar agencia Ana
		Agencia agenciaAna = new Agencia();
		agenciaAna.setNumero("4214-9");
		agenciaAna.setCidade(null);
		agenciaAna.setNomeGerente(null);
		agenciaAna.setTelefone(null);

		// Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@ig.com.br");
		clienteAna.setSalario(2500);

		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agenciaAna);

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		System.out.println();
		System.out.println("===========================");
		System.out.println();

		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("===========================");
		System.out.println();

		// Sacar 100 reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("========== TRASFERINDO ===========");
		System.out.println();

		// Transferir 200 reais da conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();

	}

}
