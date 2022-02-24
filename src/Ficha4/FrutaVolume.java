package Ficha4;

public class FrutaVolume extends Fruta implements Descontavel {
	
	private double percentagemDesconto;

	public FrutaVolume(String aNomeFruta, double aPreco, float aUnidade) {
		super(aNomeFruta, aPreco, aUnidade);
		// TODO Auto-generated constructor stub
	}
	
	public double pagar() {
		double total = 0;
		total = getPreco() * getUnidade();
		return total;
	}

	@Override
	public double descontar() {
		// TODO Auto-generated method stub
		double total = 0;
		total = pagar() * (percentagemDesconto / 100);
		return total;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

}
