package br.com.dbsti.jbank.modelo;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, int numero) {
		super(cliente, numero);
	}

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void taxa() {
		double taxa = 1.0 / 100;
		saldo = saldo.multiply(new BigDecimal(taxa));
	}

	@Override
	public int compareTo(Conta outraConta) {
		if (this.numero > outraConta.numero) {
			return 1;
		}
		if (this.numero < outraConta.numero) {
			return -1;
		}
		return 0;
	}

	
	
}
