package br.com.dbsti.jbank.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaConjunto {

	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<String>();
		nomes.add("ana");
		nomes.add("jo�o");
		nomes.add("maria");
		nomes.add("jo�o");
		
		System.out.println(nomes.size());
		System.out.println(nomes.contains("joana"));

	}

}
