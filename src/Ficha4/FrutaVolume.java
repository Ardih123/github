package Ficha4;

public class FrutaVolume extends Fruta implements Descontavel {
	
	private double percentagemDesconto;

	public FrutaVolume(String aNomeFruta, double aPreco, float aVolume) {
		super(aNomeFruta, aPreco, aVolume);
		// TODO Auto-generated constructor stub
		percentagemDesconto = 0;
	}
	
	public double pagar() {
		double total = 0, totalDisconto = 0;
		total = super.getPreco() * super.getUnidade();
		totalDisconto = total - descontar();
		return totalDisconto;
	}

	@Override
	public double descontar() {
		// TODO Auto-generated method stub
		double total = 0;
		total = (super.getPreco() * super.getUnidade()) * (percentagemDesconto / 100);
		return total;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

}
