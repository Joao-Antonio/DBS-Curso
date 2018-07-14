package br.com.dbsti.jbank.modelo;

import br.com.dbsti.jbank.controlador.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	public Gerente(String nome, String cargo) {
		super(nome, cargo);
	}
	
	public boolean autentica(int senha) {
		return false;
	}

}
