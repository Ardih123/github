package github;

import java.util.Scanner;

public class Ficha2 {

	public static int areaTriangque (int altura, int base) {
		int total = altura * base;
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("altura triangulo? ");  
        int altura = input.nextInt(); 
        System.out.println("base triangulo? ");  
        int base = input.nextInt(); 
        input.close();
        
        int area = areaTriangque(altura, base);
        
        System.out.println("a area do triangulo é " + area);		
		
	}

}
