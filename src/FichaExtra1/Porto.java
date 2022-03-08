package FichaExtra1;

import java.util.List;

public class Porto {

	/*
	 * Implemente uma classe Porto (apenas os atributos e construtor) para armazenar
	 * a informação sobre a atracagem de navios (use o tipo de coleção que
	 * considerar mais apropriado). A classe deve incluir métodos para (nota: pode
	 * adicionar métodos às classes anteriores se necessário): 
	 * •Adicionar um novo navio sem permitir a duplicação da Identificador do Navio; 
	 * •Devolver a quantidade máxima total de contentores de todos os navios
	 * porta-contentores atracados no porto; 
	 * •Devolver a capacidade total de carga de todos os navios porta-contentorese petroleiros atracados no porto, sabendo
	 * que um contentor tem capacidade para 10 toneladas;
	 */
	
	private List<PortaContentores> listaPC;
	private List<Petroleiro> listaP;
	
	public Porto(List<PortaContentores> listaPC, List<Petroleiro> listaP) {
		this.listaPC = listaPC;
		this.listaP = listaP;
	}

	public String isDupe (List<Navio> listaNavios) {
		String verifica = "falso";
		for(Navio navios : listaNavios) {
			if(navios.getId() != listaNavios.get(0).getId()) {
				verifica = "falso";
			}
			else {
				verifica = "verdade";
			}
		}
		return verifica;
	}
	
	public int contaContentores() {
		int total = 0;
		for(PortaContentores pc : listaPC) {
			total += pc.getContentores();
		}
		return total;
	}
	
	public int contaTodos () {
		int totalP = 0, total = 0;
		for(Petroleiro p : listaP) {
			totalP += p.getCarga();
		}
		total = (contaContentores() * 10) + totalP;
		return total;
	}
	
	public void add(PortaContentores PC) {
		listaPC.add(PC);
	}
	
	public void add(Petroleiro P) {
		listaP.add(P);
	}
}
