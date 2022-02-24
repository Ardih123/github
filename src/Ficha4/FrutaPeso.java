package Ficha4;

public class FrutaPeso extends Fruta implements Descontavel {
	
	private double percentagemDesconto;

	public FrutaPeso(String aNomeFruta, double aPreco, float aPeso) {
		super(aNomeFruta, aPreco, aPeso);
		// TODO Auto-generated constructor stub
		percentagemDesconto = 0;
	}
	
	public double pagar() {
		double total = 0, totalDisconto = 0;
		total = super.getPreco() * super.getUnidade();
		totalDisconto = total - (total * descontar());
		return totalDisconto;
	}

	@Override
	public double descontar() {
		// TODO Auto-generated method stub
		double total = 0;
		total = percentagemDesconto / 100;
		return total;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

}
