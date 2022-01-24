package github;

import java.util.Scanner;

public class Ficha28 {
//Escreva uma fun��o chamada convertSeconds que recebe um n�mero (segundos) e imprimeo n�merode minutos, horas, dias e meses 
	//(considere que um m�s tem 30 dias).
	
	public static void convertSeconds(int segundos) {
		int dias = segundos/(24*3600); 
		  
		segundos = segundos%(24*3600); 
	    int horas = segundos/3600; 
	  
	    segundos %= 3600; 
	    int minutos = segundos/60; 
	  
	    segundos %= 60; 
	    int seg = segundos;
	    
	    System.out.println(dias +" dias, "+horas+" horas, "+minutos+" minutos, "+seg+" segundos");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("escreva os segundos");  
        int segundos = input.nextInt(); 
        input.close();
        
        convertSeconds(segundos);
	}

}
