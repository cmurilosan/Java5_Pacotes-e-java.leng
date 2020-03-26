package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";	//Object Literal
//		String outro = new String("Alura");
		
//		Substituir somente um caracter (representado por aspas simples)
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);
		
//		Troca o primeiro argumento pelo segundo
//		String outra = nome.replace("A", "a");
		
//		Transformamos tudo em letras maiúsculas		
//		String outra = nome.toUpperCase();
		
//		Transformamos tudo em letras minúsculas		
//		String outra = nome.toLowerCase();
		
//		System.out.println(outra);
		
//		Localizar a letra na posição solicitada
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		Mostra a localização solicitada
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		Mostra de qual posição quer começar
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		Mostrar e imprimir o tamanho da String. charAt vai trazer cada letra
//		System.out.println(nome.length());
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		Vericiar se há espaço vazio e traz um booleano. Um simples espaço dentro das aspas, ele considera que há algo lá dentro.
// 		Mesmo com espaço ainda é possível ele enxergar como vazio utilizando .trim()
//		String vazio= " ";
//		String outroVazio = vazio.trim();		
//		System.out.println(vazio.isEmpty());
//		System.out.println(outroVazio.isEmpty());
//		
//		String marca = "    Alura    ";
//		System.out.println(marca);
//		System.out.println(marca.trim());
		
//		Verificamos se contém o que buscamos		
		String vazio= "Alura";
		System.out.println(vazio.contains("Alu"));
		
	}

}
