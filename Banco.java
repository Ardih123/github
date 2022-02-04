package github;

import java.util.ArrayList;
import java.util.List;

public class Banco {
/* Codifique a classe Banco com os seguintes atributos e m�todos:
 * +a)Um nome  e  um array de contas de  objetos  do  tipo  ContaBanc�ria  (ver  exerc�cio anterior).
 * 
 * +b)Um construtor de inst�ncias da classe, que recebe por par�metro o nome do banco e que inicializa o array para cem itens.
 * 
 * +c)Os m�todos getters e setters para o array contas.
 * 
 * +d)O m�todo criaConta(...) que recebe uma contaBanc�ria por par�metro e acrescenta ao array.
 * 
 * +e)O m�todo getConta(...) que recebeo titular por par�metro e devolve a conta desse titular.
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
				conta = contas.getInforma��oConta();
			}
		}
		return conta;
	}

}
