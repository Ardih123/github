package ProjetoExtra1;

import java.util.ArrayList;
import java.util.List;

public class AppStore {

	/*
	 * Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o
	 * nome, idade, e número de utilizador.
	 */
	//Realizar compras de aplicações

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Utilizador> listaUtilizadores = new ArrayList<Utilizador>();
		List<Aplicação> listaAplicacao = new ArrayList<Aplicação>();
		List<Compras> listaCompras = new ArrayList<Compras>();
		
		//public Utilizador(String nome, int idade)
		listaUtilizadores.add(new Utilizador("Miguel", 30));
		listaUtilizadores.add(new Utilizador("Pedro", 35));
		listaUtilizadores.add(new Utilizador("Diogo", 28));
		
		//public Aplicação(String nome, double preco, double avaliacao, TipoAplicação tipoAplicacao)
		listaAplicacao.add(new Aplicação("Tetris", 10.5, 2.5, TipoAplicação.Games));
		listaAplicacao.add(new Aplicação("Dark Souls 3", 50, 4.3, TipoAplicação.Games));
		listaAplicacao.add(new Aplicação("Aprender ABC", 21, 3.2, TipoAplicação.Education));
		
		//public Compras()
		listaCompras.add(new Compras("Miguel", "Tetris", listaUtilizadores, listaAplicacao));
		listaCompras.add(new Compras("Miguel", "Dark Souls 3", listaUtilizadores, listaAplicacao));
		
		for(Utilizador utilizador : listaUtilizadores) {
			System.out.println("utilizador " + utilizador.getNome() + " idade " + utilizador.getIdade() + " id " + utilizador.getId());
		}
		
		System.out.println(" ");
		for(Aplicação aplicacao : listaAplicacao) {
			System.out.println("aplicacao " + aplicacao.getNome() + " preco " + aplicacao.getPreco() + " avaliacao " + aplicacao.getAvaliacao() + " tipo " + aplicacao.getTipoAplicacao());
		}
		
		System.out.println(" ");
		for(Compras compra : listaCompras) {
			System.out.println("utilizador " + compra.getNomeUtilizador() + " compra aplicacao " + compra.getNomeApicacao());
			compra.comprar(compra.getNomeUtilizador(), compra.getNomeApicacao());
		}
		//listaCompras.get(1).comprar("Miguel", "Tetris");
	}

}
