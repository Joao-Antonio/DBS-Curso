package br.com.dbsti.jbank.controlador;

import javax.swing.JOptionPane;


public class ControladoraDeAcesso {

	public void login(Autenticavel autenticavel) {
		if (autenticavel.autentica(123)) {
			JOptionPane.showMessageDialog(null, "Acesso Permitido");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
	}
	
	
}
