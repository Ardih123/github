package github;

import java.util.Scanner;

public class Ficha23 {
//Crie uma fun��o chamada areaCal que recebe tr�s argumentos (x, y, z)e retorna a �rea do
	//triangulo caso z = 1 e retorna a �rea do ret�ngulo caso contr�rio.
	
	public static int areaCal (int x, int y, int z) {
		if (z == 1) {
			int total = x * y;
			return total;
		}
		else {
			int total = x * y;
			return total;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("x? ");  
        int x = input.nextInt(); 
        System.out.println("y? ");  
        int y = input.nextInt(); 
        System.out.println("z? ");  
        int z = input.nextInt(); 
        input.close();
        
        int area = areaCal(x, y, z);
        
        if (z == 1) {
            System.out.println("a area do triangulo � " + area);	
        }
        else {
            System.out.println("a area do retangulo � " + area);
        }	
	}

}
