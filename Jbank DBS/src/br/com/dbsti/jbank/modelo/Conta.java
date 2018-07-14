package br.com.dbsti.jbank.modelo;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import br.com.dbsti.jbank.excecao.SaldoInsuficienteException;

//public: visivel em todas classes do projeto
// protected: visivel em classes do mesmo pacote e em classe filhas de qualquer pacote
// default(sem modificador): visivel em classes do mesmo pacote
// private: visivel apenas na propria classe
public abstract class Conta implements Comparable<Conta> {

	private Cliente cliente;
	protected int numero;
	protected BigDecimal saldo;
	private double limite;
	
	public Conta(Cliente cliente) {
		this(cliente, 0);
	}
	
	public Conta(Cliente cliente, int numero) {
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public abstract void taxa();
	
	public void deposita(double quantia) {
		saldo = saldo.add(new BigDecimal(quantia));
	}
	
	public void imprimeExtrato() {
		String extrato = "Extrato da Conta:\n\n";
		extrato += "Número: " + numero + "\n";
		extrato += "Cliente: " + cliente + "\n";
		extrato += "Saldo: " + saldo + "\n";
		extrato += "Limite: " + limite;
		
		JOptionPane.showMessageDialog(null, extrato);
	}
	
	public void transferePara(Conta conta, double quantia) throws SaldoInsuficienteException {
		saca(quantia);
		conta.deposita(quantia);
	}
	
	public void setCliente(Cliente nome) {
		cliente = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return numero + " - " + cliente;
	}
	
	public void saca(double quantidade) throws SaldoInsuficienteException {
		BigDecimal quantia = new BigDecimal(quantidade);
		
		BigDecimal totalQuePodeSerSacado = saldo.add(new BigDecimal(limite));
		
		if (quantia.compareTo(totalQuePodeSerSacado) >= 0) {
			saldo = saldo.subtract(quantia);
		} else {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
