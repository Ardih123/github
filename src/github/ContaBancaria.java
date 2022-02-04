package github;

import java.time.LocalDate;

public class ContaBancaria {
/*	a)Uma variável de instância de acesso privado, titular, com tipo String.
  
	b)Uma variável de instância de acesso privado, saldo, com tipo double, e com valor 0.0 por defeito.
	
	c)Uma  variável  de  instância  de  acesso  privado,  dataAbertura,  com  tipo  Date,  e  com valor por defeito a data de hoje.
	
	d)Um construtor de instânciada classe quer ecebe por parâmetro o nome do titular e cria uma conta bancária para esse titular, 
	na data de hoje, e com saldo zero.
	
	e)Os métodos getters e setters para o saldo. E, apenas o método getter para a data de abertura e para o titular.
	
	f)Um  método  getInformaçãoConta()  que  retorna  uma  String  com  o  titular,  o  saldo  da conta  com  duas  
	casas  decimais  e  a  data  de  abertura  da  conta  no  formato DD/MM/YYYY. 
	Ex.: Titular: José Fonseca Saldo: €321.50 Data Abertura: 21/2/2017.
	
	g)Um método depositar(...) 
	que recebe o valor a depositar na conta (double) e atualiza o respetivo saldo.
	
	h)Um método levantar(...) 
	que recebe o valor a levantar da conta (double) e atualiza o respetivo  saldo.  Não  devem  ser  permitidos  
	levantamentos  que  coloquem  o  saldo negativo.
*/
	
	private String titular;
	private double saldo = 0.00;
	private LocalDate dataAbertura = LocalDate.now();
	
	public ContaBancaria(String aNome) {
		titular = aNome;
		getDataAbertura();
		getSaldo();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double aSaldo) {
		this.saldo = aSaldo;
	}

	public String getTitular() {
		return titular;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	
	public String getInformaçãoConta() {
		String dados = "Titular: " + titular + " Saldo: " + saldo + " Data Abertura: " + dataAbertura + "\n";
		return dados;
	}
	
	public void depositar(double aValorDepositar) {
		saldo += aValorDepositar;
		System.out.printf("depositou %.2f \n",aValorDepositar);
	}
	
	public void levantar(double aValorLevantar) {
		if (saldo - aValorLevantar > 0) {
			saldo -= aValorLevantar;
			System.out.printf("levantou %.2f \n",aValorLevantar);
		}
		else {
			System.out.println("nao tem saldo suficiente");
		}
	}
}
