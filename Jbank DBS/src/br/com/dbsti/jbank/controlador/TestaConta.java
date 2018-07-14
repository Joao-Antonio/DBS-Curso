package br.com.dbsti.jbank.controlador;

import javax.swing.JOptionPane;

import br.com.dbsti.jbank.excecao.SaldoInsuficienteException;
import br.com.dbsti.jbank.modelo.Cliente;
import br.com.dbsti.jbank.modelo.Conta;
import br.com.dbsti.jbank.modelo.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Daniel", "000000");
		
		Conta conta = new ContaCorrente(cliente);
		conta.setNumero(123);
		conta.setLimite(100);
		
		conta.deposita(100);
		conta.imprimeExtrato();
		
		try {
			
			conta.saca(500);
			
		} catch (SaldoInsuficienteException e) {
			JOptionPane.showMessageDialog(
					null, "Não foi possível sacar: " + e.getMessage());
		}
		
		conta.imprimeExtrato();
		
//		boolean sacou;
//		sacou = conta.saca(200);
//		verificaSeSacou(sacou);
//		
//		conta.deposita(100);
//		sacou = conta.saca(200);
//		verificaSeSacou(sacou);
//		conta.imprimeExtrato();

	}
	
//	private static void verificaSeSacou(boolean sacou) {
//		if (sacou) {
//			JOptionPane.showMessageDialog(null, "Sacou com sucesso");
//		} else {
//			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
//		}
//	}

}
