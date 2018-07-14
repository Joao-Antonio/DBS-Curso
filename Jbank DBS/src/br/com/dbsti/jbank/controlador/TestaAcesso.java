package br.com.dbsti.jbank.controlador;

import br.com.dbsti.jbank.modelo.Cliente;
import br.com.dbsti.jbank.modelo.Diretor;
import br.com.dbsti.jbank.modelo.Gerente;

public class TestaAcesso {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor("Pedro", "CEO");
		ControladoraDeAcesso controladora = new ControladoraDeAcesso();
		
		controladora.login(diretor);
		
		Gerente gerente = new Gerente("Ana", "Contas");
		
		controladora.login(gerente);
		
		Cliente cliente = new Cliente("Zé Mané", "11111");
		
		controladora.login(cliente);

	}

}
