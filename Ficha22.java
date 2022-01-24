package github;

import java.util.Scanner;

public class Ficha22 {
//Crie  uma  função chamada areaRetang que recebe  dois  argumentos  (altura  e comprimento) e retornaa área do retângulo.
	
	public static int areaRetang (int altura, int comp) {
		int total = altura * comp;
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("altura retangulo? ");  
        int altura = input.nextInt(); 
        System.out.println("comp retangulo? ");  
        int comp = input.nextInt(); 
        input.close();
        
        int area = areaRetang(altura, comp);
        
        System.out.println("a area do retangulo é " + area);	
	}

}
