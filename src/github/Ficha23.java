package github;

import java.util.Scanner;

public class Ficha23 {
//Crie uma função chamada areaCal que recebe três argumentos (x, y, z)e retorna a área do
	//triangulo caso z = 1 e retorna a área do retângulo caso contrário.
	
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
            System.out.println("a area do triangulo é " + area);	
        }
        else {
            System.out.println("a area do retangulo é " + area);
        }	
	}

}
