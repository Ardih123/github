package FichaExtra1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Navio> listaNavios = new ArrayList<Navio>();
		List<PortaContentores> listaPC = new ArrayList<PortaContentores>();
		List<Petroleiro> listaP = new ArrayList<Petroleiro>();
		//List<Porto> listaPortos = new ArrayList<Porto>();
		
		//public PortaContentores(String nome, float comprimento, int contentores)
		listaPC.add(new PortaContentores("TrasMais", 1000, 350));
		listaPC.add(new PortaContentores("AcartaCoisas", 800, 200));
		
		System.out.println("Porta Contentores");
		for(PortaContentores pc : listaPC) {
			System.out.println("Nome " + pc.getNome() + "\nComprimento " + pc.getComprimento() + " metros \nNúmero Contentores " + pc.getContentores() + "\nID " + pc.getId() +"\n");
			listaNavios.add(new PortaContentores(pc.getNome(), pc.getComprimento(), pc.getContentores()));
		}
		
		//public Patroleiro(String nome, float comprimento, float carga)
		listaP.add(new Petroleiro("MaisOleo", 875, 1456));
		listaP.add(new Petroleiro("TaCaro", 500, 760));
		
		System.out.println("\n\nPetroleiros");
		for(Petroleiro p : listaP) {
			System.out.println("Nome " + p.getNome() + "\nComprimento " + p.getComprimento() + " metros \nPetróleo " + p.getCarga() + " toneladas" + "\nID " + p.getId() +"\n");
			listaNavios.add(new Petroleiro(p.getNome(), p.getComprimento(), p.getCarga()));
		}
		
		//public Porto(List<PortaContentores> listaPC, List<Petroleiro> listaP)
		Porto Funchal = new Porto(listaPC, listaP, listaNavios);
		
		System.out.println("\nPorto");
		System.out.println("Número de contentores (PC) no porto: " + Funchal.contaContentores());
		System.out.println("Total de contentores (PC+P) no porto: " + Funchal.contaTodos() + " toneladas");
		
		System.out.println("Tem navios duplicados? " + Funchal.isDupe(listaNavios));
	}

}
