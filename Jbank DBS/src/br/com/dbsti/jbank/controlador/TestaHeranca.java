package br.com.dbsti.jbank.controlador;

import br.com.dbsti.jbank.modelo.Cliente;
import br.com.dbsti.jbank.modelo.ContaCorrente;
import br.com.dbsti.jbank.modelo.ContaPoupanca;

public class TestaHeranca {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Daniel", "0000");
		ControladoraDeTaxa controladora = new ControladoraDeTaxa();
		
		ContaCorrente conta = new ContaCorrente(cliente, 456);
		conta.setLimite(100);
		conta.deposita(100);
		
		controladora.aplicaTaxa(conta);
		
		ContaPoupanca poupanca = new ContaPoupanca(cliente, 789);
		poupanca.deposita(100);
		
		controladora.aplicaTaxa(poupanca);
	}

}
