package br.com.dbsti.jbank.array;

public class TestaArray {

	public static void main(String[] args) {
		
		int[] idades = new int[10];
		
		idades[0] = 10;
		idades[1] = 20;
		idades[6] = 30;
		
		for (int idade : idades) {
			System.out.println("Idade: " + idade);
		}

	}

}
