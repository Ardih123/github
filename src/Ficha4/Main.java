package Ficha4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Fruta(String aNomeFruta, double aPreco, double aUnidade)
		
		//List<Fruta> listaFruta = new ArrayList<Fruta>();
		//List<Cesto> listaCesto = new ArrayList<Cesto>();
		
		FrutaUnidade PeraUnidade = new FrutaUnidade("Pera", 0.50, 1);
		FrutaPeso PeraPeso = new FrutaPeso("Pera", 2, 1);
		FrutaVolume PeraVolume = new FrutaVolume("Pera", 1.50, 1);
		
		//public double pagar()
		System.out.println("Pera Unidade: " + PeraUnidade.pagar() + "€");
		System.out.println("Pera Peso: " + PeraPeso.pagar() + "€");
		System.out.println("Pera Volume: " + PeraVolume.pagar() + "€");
		
		
		//cesto
		Cesto cesto1 = new Cesto();
		
		//public void insereFrutaCesto(Fruta aFruta)
		cesto1.insereFrutaCesto(PeraVolume);
		cesto1.insereFrutaCesto(PeraVolume);
		cesto1.insereFrutaCesto(PeraVolume);
		
		cesto1.insereFrutaCesto(PeraPeso);
		cesto1.insereFrutaCesto(PeraPeso);
		
		cesto1.insereFrutaCesto(PeraUnidade);
		
		//public void tipoFrutaCesto()
		cesto1.tipoFrutaCesto();
		
		//public void valorTotalTipo()
		cesto1.valorTotalTipo();
		
		//public void valorTotalCesto()
		cesto1.valorTotalCesto();
		
		//public void totalFrutaCesto(String aTipo)
		System.out.println("");
		System.out.println("Com input to tipo");
		cesto1.totalFrutaCesto("FrutaUnidade");
		cesto1.totalFrutaCesto("FrutaPeso");
		cesto1.totalFrutaCesto("FrutaVolume");
		
		//public void valorTotal(String aTipo)
		System.out.println("");
		cesto1.valorTotal("FrutaUnidade");
		cesto1.valorTotal("FrutaPeso");
		cesto1.valorTotal("FrutaVolume");
		
		//public void setPercentagemDesconto(double percentagemDesconto)
		PeraPeso.setPercentagemDesconto(10);
		PeraVolume.setPercentagemDesconto(20);
		
		//public double descontar(double aPercentagem)
		System.out.println("\nValor Percentagem");
		System.out.println("Pera Peso Desconto: " + PeraPeso.descontar() + "%");
		System.out.println("Pera Volume Desconto: " + PeraVolume.descontar() + "%");
		
		//public double descontar(double aPercentagem)
		System.out.println("\nTotal com desconto");
		System.out.println("Pera Peso Total: " + PeraPeso.pagar() + "€");
		System.out.println("Pera Volume Total: " + PeraVolume.pagar() + "€");
		cesto1.valorTotalCesto();
		
		//testar limite cesto
		System.out.println("\nTestar limite do cesto");
		for(int i = 0; i <= 100; i++) {
			cesto1.insereFrutaCesto(PeraVolume);
		}
		cesto1.tipoFrutaCesto();
	}

}
