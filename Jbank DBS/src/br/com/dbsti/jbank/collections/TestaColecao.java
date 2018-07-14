package br.com.dbsti.jbank.collections;

import java.util.ArrayList;
import java.util.List;

public class TestaColecao {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("josé");
		nomes.add("ana");
		
		String nome = nomes.get(1);
		System.out.println(nome);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
		
		
		

	}

}
