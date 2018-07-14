package br.com.dbsti.jbank.controlador;

import br.com.dbsti.jbank.modelo.Conta;

public class ControladoraDeTaxa {

	public void aplicaTaxa(Conta conta) {
		conta.imprimeExtrato();
		conta.taxa();
		conta.imprimeExtrato();
	}
	
}
