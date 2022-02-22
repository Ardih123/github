package Ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {

	/*
	 * +a) Uma variável de instância para o total de items no cesto e uma constante
	 * que determina a capacidade máxima do cesto como sendo 100. Inclua também um
	 * array de Fruta para representar o cesto, que é um conjunto de frutas.
	 * 
	 * +b) Um método que insere no cesto diferentes tipos de fruta.
	 * 
	 * +c) Um método que calcula o valor total da fruta no cesto.
	 * 
	 * +d) Um método que determina o número de frutos de um dado tipo existentes no
	 * cesto.
	 * 
	 * +e) Um método que determina o valor total gasto em frutos de um dado tipo.
	 * 
	 * +Na classe principal, crie um cesto e insira vários tipos de fruta. Teste
	 * todos os métodos.
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
			System.out.println("Cesto está cheio! 100 artigos");
		}
	}
	
	public void valorTotalCesto() {
		double total = 0;
		for(Fruta frutas : listaFruta) {
			total += frutas.getPreco();
		}
		System.out.println("Preço total do cesto: " + total + "€");
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
		System.out.println("O cesto tem " + valorUnidade +"€ tipo unidade, "+ valorPeso +"€ tipo peso, "+ valorVolume +"€ tipo volume.");
	}
	
	public void valorTotal(String aTipo) {
		double total = 0;
		for(Fruta frutas : listaFruta) {
			if(frutas.getClass().getSimpleName().equals(aTipo)) {
				total += frutas.getPreco();
			}
		}
		System.out.println("O cesto tem " + total + "€ do tipo " + aTipo);
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
