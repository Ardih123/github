package github;

import java.util.Scanner;

public class Ficha26 {
//Crie uma função chamada numTotalVogais que recebe uma String (frase) e retorna o número total de vogais na mesma.
	
	public static int numTotalVogais(String texto) {
		int totalVogais = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
				totalVogais += 1;
			}
		}
		return totalVogais;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("escreva uma frase");  
        String texto = input.nextLine(); 
        input.close();
        
        int total = numTotalVogais(texto);
        System.out.println("total vogais " + total);
	}

}
