package ProjetoExtra1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compras {

	/*
	 * As compras das aplicações ocorrem numa determinada data e com um preço
	 * determinado. Cada compra pode conter várias aplicações e está sempre
	 * associado a um cliente.
	 */
	
	Date dataCompra = new Date();
	private double preco;
	private List<Utilizador> listaUtilizadores;
	private List<Aplicação> listaAplicacao;
	private String nomeUtilizador, nomeApicacao;
	private List<Compras> listaCompra;
	
	public Compras(String nomeUtilizador, String nomeAplicacao, List<Utilizador> listaUtilizadores, List<Aplicação> listaAplicacao) {
		this.listaUtilizadores = listaUtilizadores;
		this.listaAplicacao = listaAplicacao;
		listaCompra = new ArrayList<Compras>();
		this.nomeUtilizador = nomeUtilizador;
		this.nomeApicacao = nomeAplicacao;
		dataCompra.toString();
		this.preco = preco;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public double getPreco() {
		return preco;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNomeUtilizador() {
		return nomeUtilizador;
	}

	public String getNomeApicacao() {
		return nomeApicacao;
	}

	public void comprar(String nomeUtilizador, String nomeAplicacao) {
		for(Utilizador utilizador : listaUtilizadores) {
			if(utilizador.getNome().equals(nomeUtilizador)) {
				for(Aplicação aplicacao : listaAplicacao) {
					if(aplicacao.getNome().equals(nomeApicacao)) {
						System.out.println("preco da compra " + (this.preco += aplicacao.getPreco()));
					}
				}
			}
		}
	}
	
	
	
}
