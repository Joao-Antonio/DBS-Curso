package br.com.dbsti.jbank.modelo;

import br.com.dbsti.jbank.controlador.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {

	public Diretor(String nome, String cargo) {
		super(nome, cargo);
	}

	@Override
	public boolean autentica(int senha) {
		return true;
	}


}
