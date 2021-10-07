package br.senai.sp.jandira.model;

public class Agencia {
	
	private String numero;
	private String nomeGerente;
	private String telefone;
	private String cidade;
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	public String getNomeGerente() {
		return this.nomeGerente;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return this.cidade;
	}
	
	

}
