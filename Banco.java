package github;

import java.util.ArrayList;
import java.util.List;

public class Banco {
/* Codifique a classe Banco com os seguintes atributos e m�todos:
 * a)Um nome  e  um array de contas de  objetos  do  tipo  ContaBanc�ria  (ver  exerc�cio anterior).
 * 
 * b)Um construtor de inst�ncias da classe,que recebe por par�metro o nome do banco e que inicializa o array para cem itens.
 * 
 * c)Os m�todos getters e setters para o array contas.
 * 
 * d)O m�todo criaConta(...) que recebe uma contaBanc�ria por par�metro e acrescenta ao array.
 * 
 * e)O m�todo getConta(...) que recebeo titular por par�metro e devolve a conta desse titular.
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
				contas.getInforma��oConta();
			}
			else {
				System.out.println("nao tem conta");
			}
		}
	}
}
