package br.com.dbsti.jbank.excecao;

import javax.swing.JOptionPane;

import br.com.dbsti.jbank.modelo.Cliente;

public class TestaException {

	public static void main(String[] args) {
//		Cliente cliente = null; NullPointerException
//		cliente.autentica(123);
		
//		Integer.parseInt("dois"); NumberFormatException
		
		metodo1();
		
		
		JOptionPane.showMessageDialog(null, "Agora chega aqui");
	}

	private static void metodo1() {
		System.out.println("inicio metodo 1");
		metodo2();
		System.out.println("fim metodo 1");
	}

	private static void metodo2() {
		System.out.println("inicio metodo 2");
		try {
			
			metodo3();
			
		} catch (NullPointerException e) {
			System.out.println("Aconteceu erro: ");
		}
		System.out.println("fim metodo 2");
		
	}

	private static void metodo3() {
		System.out.println("inicio metodo 3");
		
		Cliente cliente = null; 
		cliente.autentica(123);
	
		
		System.out.println("fim metodo 3");
	}
	
}
