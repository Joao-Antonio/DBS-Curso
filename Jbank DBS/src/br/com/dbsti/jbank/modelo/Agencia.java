package br.com.dbsti.jbank.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agencia {
	
	private int numero;
	private Date dataFundacao;
	private List<Conta> contas = new ArrayList<Conta>();
	
	public void adicionaConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removeConta(Conta conta) {
		contas.remove(conta);
	}
	
	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public List<Conta> todasContas() {
		
		contas.add(new ContaPoupanca(null, 1));
		contas.add(new ContaPoupanca(null, 14));
		contas.add(new ContaPoupanca(null, 11));
		contas.add(new ContaPoupanca(null, 61));
		contas.add(new ContaPoupanca(null, 17));
		contas.add(new ContaPoupanca(null, 10));
		contas.add(new ContaPoupanca(null, 21));
		contas.add(new ContaPoupanca(null, 102));
		contas.add(new ContaPoupanca(null, 6));
		contas.add(new ContaPoupanca(null, 35));
		
		ContaCorrente cc1 = new ContaCorrente(null, 51);
		cc1.deposita(100);
		
		
		ContaCorrente cc2 = new ContaCorrente(null, 49);
		cc2.deposita(200);
		
		ContaCorrente cc3 = new ContaCorrente(null, 48);
		cc3.deposita(150);
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		
		return contas;
	}
	
	public void atualizaContas(List<Conta> contas) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void imprimeContas() {
		System.out.println("Agência: " + numero);
		System.out.println("Contas: ");
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}

}
