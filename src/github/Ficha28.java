package github;

import java.util.Scanner;

public class Ficha28 {
//Escreva uma função chamada convertSeconds que recebe um número (segundos) e imprimeo númerode minutos, horas, dias e meses 
	//(considere que um mês tem 30 dias).
	
	public static void convertSeconds(int segundos) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
	    
        System.out.println("escreva os segundos");  
        int segundos = input.nextInt(); 
        input.close();
        
        convertSeconds(segundos);
	}

}
