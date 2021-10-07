package br.senai.sp.jandira.model;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	//Método construtor, no caso a conta ja é criada com o número.
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
		}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito >= 1) {
			saldo += valorDeposito;
		}else {
			System.out.println("Não é possível depositar valor negativo.");
		}
	}
	
	public boolean  sacar(double valorSaque) {
		if(valorSaque >= 1 && valorSaque <= saldo) {
			saldo -= valorSaque;
			return true;
		}else {
			if(valorSaque > saldo) {
				System.out.println("Saldo insuficiente.");
				return false;
			}
			else{
				System.out.println("Valor incorreto, não foi possível efetuar o saque.");
				return false;
			}
		}
		
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if(resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possível efetuar a transferência.");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
