package github;

import java.util.Scanner;

public class Ficha2 {

	//funcoes
	public static int areaTriang (int altura, int base) {
		int total = altura * base;
		return total;
	}
	
	public static int areaRetang (int altura, int comp) {
		int total = altura * comp;
		return total;
	}
	
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
	
	public static int factor(int n) {
		int total = 1;
	    for (int i = 2; i <= n; i++) {
	    	total = total * i;
	    }
	    return total;
	}
	
	public static int factorRecursivo(int n) {
		if (n >= 1) {
			 return n * factorRecursivo(n - 1);
		}   
        else {
        	return 1;
        }  
	}
	
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
	
	public static void converteSegundos(int segundos) {
		int meses = segundos/(30*24*3600); 
		
		segundos = segundos%(30*24*3600);
		int dias = segundos/(24*3600); 
		  
		segundos = segundos%(24*3600); 
	    int horas = segundos/3600; 
	  
	    segundos %= 3600; 
	    int minutos = segundos/60; 
	  
	    segundos %= 60; 
	    int seg = segundos;
	    
	    System.out.println(meses+" meses, "+dias +" dias, "+horas+" horas, "+minutos+" minutos, "+seg+" segundos");
	}
	
	
	//main
	public static void main(String[] args) {
		int altura, base, comp, x, y, z, n, segundos;
		String texto;

		//triangulo
		Scanner inputInt = new Scanner(System.in); 
	    
		System.out.println("triangulo");
        System.out.println("altura triangulo? ");  
        altura = inputInt.nextInt(); 
        System.out.println("base triangulo? ");  
        base = inputInt.nextInt(); 
        
        int areaTriangulo = areaTriang(altura, base);
        System.out.println("a area do triangulo é " + areaTriangulo);
        
        
        //retangulo
        System.out.println("\nretangulo");
        System.out.println("altura retangulo? ");  
        altura = inputInt.nextInt(); 
        System.out.println("comp retangulo? ");  
        comp = inputInt.nextInt(); 
        
        int areaRetangulo = areaRetang(altura, comp);
        System.out.println("a area do retangulo é " + areaRetangulo);
        
        
        //area
        System.out.println("\narea");
        System.out.println("x? ");  
        x = inputInt.nextInt(); 
        System.out.println("y? ");  
        y = inputInt.nextInt(); 
        System.out.println("z? ");  
        z = inputInt.nextInt(); 
        
        int areaCal = areaCal(x, y, z);
        
        if (z == 1) {
            System.out.println("a area do triangulo é " + areaCal);	
        }
        else {
            System.out.println("a area do retangulo é " + areaCal);
        }	
        
        
        
        //factorial
        System.out.println("\nfactorial");
        System.out.println("factorial n? ");  
        n = inputInt.nextInt(); 
        
        int factorial = factor(n);
        System.out.println("valor do factorial é: " + factorial);
        
        
        
        //factorial recursivo
        System.out.println("\nfactorial recursivo");
        System.out.println("n? ");  
        n = inputInt.nextInt(); 
        
        int factorialRecursivo = factorRecursivo(n);
        System.out.println("valor do factorial "+n+" é: " + factorialRecursivo);
        
        
        
        //total vogais
        Scanner inputString = new Scanner(System.in);
        
        System.out.println("\ntotal vogais");
        System.out.println("escreva uma frase");  
        texto = inputString.nextLine(); 
        
        int numeroVogais = numTotalVogais(texto);
        System.out.println("total vogais " + numeroVogais);
        
        
        
        //quantidade vogais
        System.out.println("\nquantidade vogais");
        System.out.println("escreva uma frase");  
        texto = inputString.nextLine(); 
        
        numVogais(texto);
        
        
        
        //converter segundos
        System.out.println("\nconverter segundos");
        System.out.println("escreva os segundos");  
        segundos = inputInt.nextInt(); 
        inputInt.close();
        inputString.close();
        
        converteSegundos(segundos);
	}

}
