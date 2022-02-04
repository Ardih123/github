package Ficha3;

/*Ex. 3: Crie uma classe Casa, a qual deverá ter os seguintes atributos e métodos:
 * 
+a) Um atributo privado de tipo String, morada, para a morada da casa.

+b) Dois atributos de acesso privado, precoCusto e precoVenda, com tipo double, para 
conterem respetivamente o preço de custo e o preço de venda da casa.

+c) Um construtor de instâncias da classe, sem argumentos, que cria uma casa.

+d) Um construtor de instâncias da classe que recebe por parâmetro a morada da casa e 
cria uma casa com essa morada.

+e) Os métodos getters e setters dos três atributos definidos anteriormente.

+f) Um método de instância getLucro() que retorna o lucro da casa (diferença entre o 
preço de venda e o preço de custo).

+g) Um método de instância getPercentMargemLucro() que retorna a percentagem da 
margem de lucro (a razão entre o preço de venda e o preço de custo).

+Escreva a função main() para testar a classe Casa. Crie três casas com diferentes valores 
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
