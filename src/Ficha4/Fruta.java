package Ficha4;

public abstract class Fruta {

	/*
	 * +a) A classe abstrata dever� ter as vari�veis comuns a todas as subclasses,
	 * bem como o m�todo abstrato double pagar(). Inclua os m�todos concretos que
	 * considerar adequados.
	 * 
	 * +b) Defina as classes FrutaUnidade, FrutaPeso, e FrutaVolume, como subclasses
	 * de Fruta, dando a adequada implementa��o ao m�todo double pagar() para cada
	 * caso.
	 * 
	 * +Escreva a fun��o main() para testar as classes acima descritas.
	 */
	
	private double preco, unidade;
	private String nomeFruta;
	
	public Fruta(String aNomeFruta, double aPreco, double aUnidade) {
		this.nomeFruta = aNomeFruta;
		this.preco = aPreco;
		this.unidade = aUnidade;
	}
	
	public abstract double pagar();

	public double getPreco() {
		return preco;
	}
	
	public double getUnidade() {
		return unidade;
	}

	public String getNomeFruta() {
		return nomeFruta;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setUnidade(double unidade) {
		this.unidade = unidade;
	}

	public void setNomeFruta(String nomeFruta) {
		this.nomeFruta = nomeFruta;
	}
	
}
