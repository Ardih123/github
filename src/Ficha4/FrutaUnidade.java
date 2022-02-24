package Ficha4;

public class FrutaUnidade extends Fruta {

	public FrutaUnidade(String aNomeFruta, double aPreco, int aUnidade) {
		super(aNomeFruta, aPreco, aUnidade);
		// TODO Auto-generated constructor stub
	}
	
	public double pagar() {
		double total = 0;
		total = getPreco() * getUnidade();
		return total;
	}

}
