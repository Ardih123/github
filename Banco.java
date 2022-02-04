package github;

import java.util.ArrayList;
import java.util.List;

public class Banco {
/* Codifique a classe Banco com os seguintes atributos e métodos:
 * a)Um nome  e  um array de contas de  objetos  do  tipo  ContaBancária  (ver  exercício anterior).
 * 
 * b)Um construtor de instâncias da classe,que recebe por parâmetro o nome do banco e que inicializa o array para cem itens.
 * 
 * c)Os métodos getters e setters para o array contas.
 * 
 * d)O método criaConta(...) que recebe uma contaBancária por parâmetro e acrescenta ao array.
 * 
 * e)O método getConta(...) que recebeo titular por parâmetro e devolve a conta desse titular.
 */
	
	private String[] contas;
	private String banco;
	private String[] bancos;
	
	public Banco(String banco) {
		for ( int i = 0; i <= 100; i++) {
			bancos[i] = banco;
		}
	}

	public String[] getContas() {
		return contas;
	}

	public void setContas(String[] contas) {
		this.contas = contas;
	}
	
	public void criaConta(String[] contas) {
		contas[contas.length+1] = contas;
	}
	
	public void getConta(String titular) {
		for(ContaBancaria contas : listaContas) {
			if (contas.getTitular() == titular) {
				contas.getInformaçãoConta();
			}
			else {
				System.out.println("nao tem conta");
			}
		}
	}
}
