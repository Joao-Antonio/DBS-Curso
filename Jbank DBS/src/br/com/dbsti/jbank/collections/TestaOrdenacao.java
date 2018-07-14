package br.com.dbsti.jbank.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("josé");
		nomes.add("ana");
		nomes.add("bruno");
		nomes.add("ziraldo");
		nomes.add("maria");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Lista Ordenada:");
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		List<Integer> idades = new ArrayList<Integer>();
		idades.add(21);
		idades.add(15);
		idades.add(32);
		
		Collections.sort(idades);
		
		for (Integer idade : idades) {
			System.out.println(idade);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
