package Ficha3;

/*Ex. 3: Crie uma classe Casa, a qual dever� ter os seguintes atributos e m�todos:
 * 
+a) Um atributo privado de tipo String, morada, para a morada da casa.

+b) Dois atributos de acesso privado, precoCusto e precoVenda, com tipo double, para 
conterem respetivamente o pre�o de custo e o pre�o de venda da casa.

+c) Um construtor de inst�ncias da classe, sem argumentos, que cria uma casa.

+d) Um construtor de inst�ncias da classe que recebe por par�metro a morada da casa e 
cria uma casa com essa morada.

+e) Os m�todos getters e setters dos tr�s atributos definidos anteriormente.

+f) Um m�todo de inst�ncia getLucro() que retorna o lucro da casa (diferen�a entre o 
pre�o de venda e o pre�o de custo).

+g) Um m�todo de inst�ncia getPercentMargemLucro() que retorna a percentagem da 
margem de lucro (a raz�o entre o pre�o de venda e o pre�o de custo).

+Escreva a fun��o main() para testar a classe Casa. Crie tr�s casas com diferentes valores 
dos seus atributos.
*/

public class Casa {

	private String morada;
	private double precoCusto, precoVenda;
	
	public Casa() {
		
	}
	
	public Casa(String aMorada) {
		morada = aMorada;
	}
	
	public double getLucro() {
		return (precoVenda - precoCusto);
	}
	
	public double getPercentMargemLucro() {
		return (precoCusto / precoVenda)*100;
	}
	
	
	public String getMorada() {
		return morada;
	}

	public void setMorada(String aMorada) {
		this.morada = aMorada;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double aPrecoCusto) {
		this.precoCusto = aPrecoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double aPrecoVenda) {
		this.precoVenda = aPrecoVenda;
	}


}
