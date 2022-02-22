package Ficha4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Fruta(String aNomeFruta, double aPreco, double aUnidade)
		
		//List<Fruta> listaFruta = new ArrayList<Fruta>();
		//List<Cesto> listaCesto = new ArrayList<Cesto>();
		
		Fruta PeraUnidade = new FrutaUnidade("Pera", 0.50, 1);
		Fruta PeraPeso = new FrutaPeso("Pera", 2, 1);
		Fruta PeraVolume = new FrutaVolume("Pera", 1.50, 1);
		
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
		
		//public double descontar(double aPercentagem)
		System.out.println("\nValor Desconto");
		System.out.println("Pera Peso Desconto: " + ((FrutaPeso) PeraPeso).descontar(10) + "€");
		System.out.println("Pera Volume Desconto: " + ((FrutaVolume) PeraVolume).descontar(10) + "€");
		
		//public double descontar(double aPercentagem)
		System.out.println("\nTotal com desconto");
		System.out.println("Pera Peso Total: " + (PeraPeso.pagar() - ((FrutaPeso) PeraPeso).descontar(10)) + "€");
		System.out.println("Pera Volume Total: " + (PeraVolume.pagar() - ((FrutaVolume) PeraVolume).descontar(10)) + "€");
	}

}
