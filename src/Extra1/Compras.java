package Extra1;

import java.util.Date;

public class Compras {

	/*
	 * As compras das aplicações ocorrem numa determinada data e com um preço
	 * determinado. Cada compra pode conter várias aplicações e está sempre
	 * associado a um cliente.
	 */
	
	Date dataCompra = new Date();
	private double preco;
	
	public Compras(Date dataCompra, double preco) {
		this.dataCompra = dataCompra;
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
	
	
}
