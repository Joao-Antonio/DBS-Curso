package br.com.dbsti.jbank.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import br.com.dbsti.jbank.modelo.Conta;
import br.com.dbsti.jbank.modelo.ContaCorrente;
import br.com.dbsti.jbank.modelo.ContaPoupanca;

public class TestandoMapa {

	public static void main(String[] args) {
		
		Map<String, String> empresas = new HashMap<String, String>();
		empresas.put("informatica", "DBS");
		empresas.put("farmacia", "Nossa");
		
		String nomeEmpresa = empresas.get("informatica");
		System.out.println(nomeEmpresa);
		
		Map<Integer, Conta> contas = new HashMap<Integer, Conta>();
		contas.put(1, new ContaPoupanca(null));
		contas.put(2, new ContaCorrente(null));
		
		Conta conta = contas.get(1);
		System.out.println(conta);
		
		
		Properties propriedades = new Properties();
		propriedades.put("user.name", "daniel");
		propriedades.put("user.senha", "secreta");
		
		String nomeUsuario = (String) propriedades.get("user.name");
		
		System.out.println(nomeUsuario);
		
		
		
		
		
		
		
		
		

	}

}
