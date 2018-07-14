package br.com.dbsti.jbank.lang;

public class ManipulandoString {

	public static void main(String[] args) {
		String texto1 = "palavra";
		String texto2 = "palavra";
		
		if (texto1 == texto2) {
			System.out.println("Os textos são iguais");
		}
		
		String texto3 = new String("Java");
		String texto4 = new String("java");
		
		if (texto3.equalsIgnoreCase(texto4)) {
			System.out.println("Os textos são iguais");
		} else {
			System.out.println("Os textos são diferentes");
		}
		
		String java = "Java é a melhor linguagem do mundo!";
		String javaUpper = java.toUpperCase();
		System.out.println(java);
		System.out.println(javaUpper);
		
		char letra = java.charAt(14);
		System.out.println(letra);
		
		String trecho = java.substring(16);
		System.out.println(trecho);
		
		trecho = java.substring(10, 20);
		System.out.println(trecho);
		
		String[] palavras = java.split(" ");
		for (String p : palavras) {
			System.out.println(p);
		}
		
		
		
		
		

	}

}
