package github;

import java.util.ArrayList;
import java.util.List;

public class Main {
//Escreva  a  função  main()  para  testar  a  classe  ContaBancária.  
//Crie  uma  conta,  efetue depósitos e levantamentos e imprima no ecrã a informação da conta sempre que atualiza o saldo.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
		
		listaContas.add(new ContaBancaria("joao"));

		for (ContaBancaria contas : listaContas) {
			System.out.println(contas.getInformaçãoConta());
		}
		
		for (ContaBancaria contas : listaContas) {
			contas.depositar(250.22);
			System.out.printf("saldo depois deposito : %.2f \n\n", contas.getSaldo());
		}
		
		for (ContaBancaria contas : listaContas) {
			contas.levantar(101.22);
			System.out.printf("saldo depois levantamento : %.2f \n", contas.getSaldo());
		}
	}

}
