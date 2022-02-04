package github;

import java.util.ArrayList;
import java.util.List;

public class Main {
//Escreva  a  função  main()  para  testar  a  classe  ContaBancária.  
//Crie  uma  conta,  efetue depósitos e levantamentos e imprima no ecrã a informação da conta sempre que atualiza o saldo.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
		List<Banco> bancoListaContas = new ArrayList<Banco>();
		
		listaContas.add(new ContaBancaria("joao"));
		
		for (ContaBancaria contas : listaContas) {
			System.out.println(contas.getInformaçãoConta());
			
			contas.depositar(250.22);
			System.out.printf("saldo depois deposito : %.2f \n\n", contas.getSaldo());
			
			contas.levantar(101.22);
			System.out.printf("saldo depois levantamento : %.2f \n", contas.getSaldo());
			
			//bancoListaContas.add(new Banco(contas.getTitular()));
		}
		
		
		//banco
		System.out.println("\nbanco");
		
		bancoListaContas.add(new Banco("seila"));
		bancoListaContas.get(0).criaConta(listaContas.get(0));
		
		System.out.println(bancoListaContas.get(0).getConta("joao"));
		
		
		//casa
		System.out.println("\ncasa");
		
		List<Casa> listaCasas = new ArrayList<Casa>();
		
		listaCasas.add(new Casa("Rua das peras"));
		listaCasas.get(0).setPrecoCusto(20.5);
		listaCasas.get(0).setPrecoVenda(100.5);
		
		listaCasas.add(new Casa("Rua das macas"));
		listaCasas.get(1).setPrecoCusto(50.7);
		listaCasas.get(1).setPrecoVenda(150.3);
		
		listaCasas.add(new Casa("Rua do lado de la"));
		listaCasas.get(2).setPrecoCusto(80.4);
		listaCasas.get(2).setPrecoVenda(200.2);
		
		for (Casa casas : listaCasas) {
			System.out.printf("Morada: %s  Custo: %.2f  Venda: %.2f  Lucro: %.2f  LucroPercent: %.2f%% \n", 
							casas.getMorada(), casas.getPrecoCusto(), casas.getPrecoVenda(), casas.getLucro(), casas.getPercentMargemLucro());
		}
		
	}

}
