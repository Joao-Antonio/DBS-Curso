package br.com.dbsti.jbank.collections;

import java.util.Collections;
import java.util.List;

import br.com.dbsti.jbank.modelo.Agencia;
import br.com.dbsti.jbank.modelo.Conta;

public class TestaContasOrdenadas {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		List<Conta> contas = agencia.todasContas();
		
		Collections.sort(contas);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}

	}

	
	
	
	
	
}
