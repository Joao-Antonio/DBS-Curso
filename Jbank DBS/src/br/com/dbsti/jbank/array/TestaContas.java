package br.com.dbsti.jbank.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.dbsti.jbank.modelo.Agencia;
import br.com.dbsti.jbank.modelo.Cliente;
import br.com.dbsti.jbank.modelo.Conta;
import br.com.dbsti.jbank.modelo.ContaCorrente;

public class TestaContas {

	public static void main(String[] args) {

		Agencia agencia = new Agencia();
		
		Conta conta1 = getConta(1);
		Conta conta2 = getConta(2);
		
		agencia.adicionaConta(conta1);
		agencia.adicionaConta(conta2);
		
		agencia.removeConta(getConta(1));
		
		agencia.imprimeContas();
		
		List<Conta> contasDaAgencia = agencia.todasContas();
		
	}
	
	private static Conta getConta(int numero) {
		Cliente cliente = new Cliente("José", "11111");
		Conta conta = new ContaCorrente(cliente);
		conta.setNumero(numero);
		
		return conta;
	}

}
