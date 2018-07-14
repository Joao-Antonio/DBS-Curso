package br.com.dbsti.jbank.modelo;

public class Funcionario {

	private String nome;
	private String cargo;
	private boolean ativo;
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		ativo = true;
	}

	public void demitir() {
		ativo = false;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	@Override
	public String toString() {
		return nome + " - " + cargo;
	}
	
}
