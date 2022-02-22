package Ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {

	/*
	 * +a) Uma vari�vel de inst�ncia para o total de items no cesto e uma constante
	 * que determina a capacidade m�xima do cesto como sendo 100. Inclua tamb�m um
	 * array de Fruta para representar o cesto, que � um conjunto de frutas.
	 * 
	 * +b) Um m�todo que insere no cesto diferentes tipos de fruta.
	 * 
	 * +c) Um m�todo que calcula o valor total da fruta no cesto.
	 * 
	 * +d) Um m�todo que determina o n�mero de frutos de um dado tipo existentes no
	 * cesto.
	 * 
	 * +e) Um m�todo que determina o valor total gasto em frutos de um dado tipo.
	 * 
	 * +Na classe principal, crie um cesto e insira v�rios tipos de fruta. Teste
	 * todos os m�todos.
	 */
	
	private int totalItems, capacidadeMaxima;
	List<Fruta> listaFruta;
	
	public Cesto() {
		this.totalItems = 0;
		this.capacidadeMaxima = 100;
		listaFruta = new ArrayList<Fruta>();
	}
	
	public void insereFrutaCesto(Fruta aFruta) {
		if(listaFruta.size() <= capacidadeMaxima) {
			listaFruta.add(aFruta);
		}
		else {
			System.out.println("Cesto est� cheio! 100 artigos");
		}
	}
	
	public void valorTotalCesto() {
		double total = 0;
		for(Fruta frutas : listaFruta) {
			total += frutas.getPreco();
		}
		System.out.println("Pre�o total do cesto: " + total + "�");
	}
	
	public void tipoFrutaCesto() {
		int totalUnidade=0, totalPeso=0, totalVolume=0;
		for(Fruta frutas : listaFruta) {
			if(frutas instanceof FrutaUnidade) {
				totalUnidade++;
			}
			if(frutas instanceof FrutaPeso) {
				totalPeso++;
			}
			if(frutas instanceof FrutaVolume) {
				totalVolume++;
			}
		}
		System.out.println("O cesto tem " + totalUnidade +" tipo unidade, "+ totalPeso +" tipo peso, "+ totalVolume +" tipo volume.");
	}
	
	public void totalFrutaCesto(String aTipo) {
		int total = 0;
		for(Fruta frutas : listaFruta) {
			if(frutas.getClass().getSimpleName().equals(aTipo)) {
				total++;
			}
		}
		System.out.println("O cesto tem " + total + " do tipo " + aTipo);
	}
	
	public void valorTotalTipo() {
		double valorUnidade=0, valorPeso=0, valorVolume=0;
		for(Fruta frutas : listaFruta) {
			if(frutas instanceof FrutaUnidade) {
				valorUnidade += frutas.getPreco();
			}
			if(frutas instanceof FrutaPeso) {
				valorPeso += frutas.getPreco();
			}
			if(frutas instanceof FrutaVolume) {
				valorVolume += frutas.getPreco();
			}
		}
		System.out.println("O cesto tem " + valorUnidade +"� tipo unidade, "+ valorPeso +"� tipo peso, "+ valorVolume +"� tipo volume.");
	}
	
	public void valorTotal(String aTipo) {
		double total = 0;
		for(Fruta frutas : listaFruta) {
			if(frutas.getClass().getSimpleName().equals(aTipo)) {
				total += frutas.getPreco();
			}
		}
		System.out.println("O cesto tem " + total + "� do tipo " + aTipo);
	}

	public int getTotalItems() {
		return totalItems;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public List<Fruta> getListaFruta() {
		return listaFruta;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public void setListaFruta(List<Fruta> listaFruta) {
		this.listaFruta = listaFruta;
	}
	
	
}
