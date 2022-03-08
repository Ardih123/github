package FichaExtra1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Navio> listaNavio = new ArrayList<Navio>();
		List<PortaContentores> listaPC = new ArrayList<PortaContentores>();
		List<Petroleiro> listaP = new ArrayList<Petroleiro>();
		List<Porto> listaPortos = new ArrayList<Porto>();
		
		//public PortaContentores(String nome, float comprimento, int contentores)
		listaPC.add(new PortaContentores("TrasMais", 1000, 200));
		
		for(PortaContentores pc : listaPC) {
			System.out.println("Porta Contentores \nNome " + pc.getNome() + "\nComprimento " + pc.getComprimento() + " metros \nNúmero Contentores " + pc.getContentores() + "\nID " + pc.getId());
		}
		
		//public Patroleiro(String nome, float comprimento, float carga)
		listaP.add(new Petroleiro("MaisOleo", 875, 1456));
		
		for(Petroleiro p : listaP) {
			System.out.println("\n\nPetroleiros \nNome " + p.getNome() + "\nComprimento " + p.getComprimento() + " metros \nPetróleo " + p.getCarga() + " toneladas" + "\nID " + p.getId());
		}
		
		//public Porto(List<PortaContentores> listaPC, List<Petroleiro> listaP)
		Porto Funchal = new Porto(listaPC, listaP);
		
		PortaContentores pc1 = new PortaContentores("TrasMais", 1000, 200);
		Petroleiro p1 = new Petroleiro("MaisOleo", 875, 1456);
		
		Funchal.add();
	}

}
