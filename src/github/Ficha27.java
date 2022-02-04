package github;

import java.util.Scanner;

public class Ficha27 {
//Crie  uma  função chamada  numVogais que  recebe  uma  String  (frase)  e imprime  a quantidade de cada vogal na mesma.
	
	public static void numVogais(String texto) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		texto = texto.toLowerCase();
		for (int count = 0; count < texto.length(); count++) {
			if (texto.charAt(count) == 'a') {
				a++;
			}
			else if(texto.charAt(count) == 'e') {
				e++;
			}
			else if(texto.charAt(count) == 'i') {
				i++;
			}
			else if(texto.charAt(count) == 'o') {
				o++;
			}
			else if(texto.charAt(count) == 'u') {
				u++;
			}
		}
		System.out.println(" a = "+a);
		System.out.println(" e = "+e);
		System.out.println(" i = "+i);
		System.out.println(" o = "+o);
		System.out.println(" u = "+u);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("escreva uma frase");  
        String texto = input.nextLine(); 
        input.close();
        
        numVogais(texto);
	}

}
