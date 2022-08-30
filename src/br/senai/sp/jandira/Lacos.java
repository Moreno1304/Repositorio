package br.senai.sp.jandira;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Lacos {


	public static void main(String[] args) {
		
		int repeticao = 8;
		
		while(repeticao <= 258) {
			System.out.println(repeticao +" - Moreno César");
		}
		
			repeticao++;
			
			int valor = 9;
			int fibonacci = valor * (valor - 1);
			
			while(valor > 2) {
				valor--;
				fibonacci = fibonacci * (valor -1);
				}
			System.out.println(fibonacci);
			
			Scanner leitor = new Scanner(System.in);
			String resposta = "s";
			
			while(resposta.equalsIgnoreCase("s")) {
				System.out.println("Legal, mais uma volta. Uhuuuuuu!!!!!");
				System.out.println("Mais uma volta(s/n)");
				resposta = leitor.next();
				
			}
			System.out.println("A brincadeira acabou!!!");
			

}
}