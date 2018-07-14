package br.com.dbsti.jbank.modelo;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public ContaCorrente(Cliente cliente, int numero) {
		super(cliente, numero);
	}
	
	public void taxa() {
		double taxa = 2.0 / 100;
		saldo = saldo.multiply(new BigDecimal(taxa));
	}

	@Override
	public int compareTo(Conta outraConta) {
//		if (this.saldo > outraConta.getSaldo())
//			return 1;
//
//		if (this.saldo < outraConta.getSaldo()) 
//			return -1;

		return saldo.compareTo(outraConta.getSaldo());
	}
	
}
