package github;

import java.util.Scanner;

public class Ficha24 {
//Crie uma função chamada factor que recebe um argumento (n) e calcula o seu fatorialusando um ciclo (for ou while).
	public static int factor(int n) {
		int total = 1;
	    for (int i = 2; i <= n; i++) {
	    	total = total * i;
	    }
	    return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("n? ");  
        int n = input.nextInt(); 
        input.close();
        
        int total = factor(n);
        
        System.out.println("valor do factorial é: " + total);
	}

}
