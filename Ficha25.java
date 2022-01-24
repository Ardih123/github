package github;

import java.util.Scanner;

public class Ficha25 {
//Crie uma função chamada factorRecursivo que recebe um argumento (n) e calcula o seu fatorial (recursivamente).
	
	public static int factorRecursivo(int n) {
		if (n >= 1) {
			 return n * factorRecursivo(n - 1);
		}   
        else {
        	return 1;
        }  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("n? ");  
        int n = input.nextInt(); 
        input.close();
        
        int total = factorRecursivo(n);
        
        System.out.println("valor do factorial "+n+" é: " + total);
	}

}
