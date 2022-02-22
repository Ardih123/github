package Ficha4;

public class FrutaPeso extends Fruta implements Descontavel {

	public FrutaPeso(String aNomeFruta, double aPreco, double aUnidade) {
		super(aNomeFruta, aPreco, aUnidade);
		// TODO Auto-generated constructor stub
	}
	
	public double pagar() {
		double total = 0;
		total = getPreco() * getUnidade();
		return total;
	}

	@Override
	public double descontar(double aPercentagem) {
		// TODO Auto-generated method stub
		double total = 0;
		total = pagar() * (aPercentagem / 100);
		return total;
	}

}
