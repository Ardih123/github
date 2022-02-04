package github;

import java.util.ArrayList;
import java.util.List;

public class Banco {
/* Codifique a classe Banco com os seguintes atributos e métodos:
 * +a)Um nome  e  um array de contas de  objetos  do  tipo  ContaBancária  (ver  exercício anterior).
 * 
 * +b)Um construtor de instâncias da classe, que recebe por parâmetro o nome do banco e que inicializa o array para cem itens.
 * 
 * +c)Os métodos getters e setters para o array contas.
 * 
 * +d)O método criaConta(...) que recebe uma contaBancária por parâmetro e acrescenta ao array.
 * 
 * +e)O método getConta(...) que recebeo titular por parâmetro e devolve a conta desse titular.
 */
	
	private List<ContaBancaria> listaContas;
	private String banco;
	
	public Banco(String nomeBanco) {
		banco = nomeBanco;
		listaContas = new ArrayList<ContaBancaria>(100);
	}

	public List<ContaBancaria> getListaContas() {
		return listaContas;
	}

	public void setListaContas(List<ContaBancaria> listaContas) {
		this.listaContas = listaContas;
	}
	
	public void criaConta(ContaBancaria aConta) {
		listaContas.add(aConta);
	}
	
	public String getConta(String aTitular) {
		String conta = null;
		
		for(ContaBancaria contas : listaContas) {
			if (contas.getTitular() == aTitular) {
				conta = contas.getInformaçãoConta();
			}
		}
		return conta;
	}

}
