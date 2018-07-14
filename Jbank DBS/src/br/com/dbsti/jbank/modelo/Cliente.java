package br.com.dbsti.jbank.modelo;

import br.com.dbsti.jbank.controlador.Autenticavel;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return cpf + " - " + nome;
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}
	
}
