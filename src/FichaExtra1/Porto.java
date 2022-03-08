package FichaExtra1;

import java.util.List;

public class Porto {

	/*
	 * Implemente uma classe Porto (apenas os atributos e construtor) para armazenar
	 * a informa��o sobre a atracagem de navios (use o tipo de cole��o que
	 * considerar mais apropriado). A classe deve incluir m�todos para (nota: pode
	 * adicionar m�todos �s classes anteriores se necess�rio): 
	 * �Adicionar um novo navio sem permitir a duplica��o da Identificador do Navio; 
	 * �Devolver a quantidade m�xima total de contentores de todos os navios
	 * porta-contentores atracados no porto; 
	 * �Devolver a capacidade total de carga de todos os navios porta-contentorese petroleiros atracados no porto, sabendo
	 * que um contentor tem capacidade para 10 toneladas;
	 */
	
	private List<PortaContentores> listaPC;
	private List<Petroleiro> listaP;
	
	public Porto(List<PortaContentores> listaPC, List<Petroleiro> listaP) {
		this.listaPC = listaPC;
		this.listaP = listaP;
	}

	public boolean isDupe (List<Navio> listaNavios) {
		boolean verifica = false;
		for(Navio navios : listaNavios) {
			if(navios.getId() != navios.getId()) {
				verifica = false;
			}
			else {
				verifica = true;
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
		int totalPC = contaContentores();
		for(Petroleiro p : listaP) {
			totalP += p.getCarga();
		}
		total = (totalPC * 10) + totalP;
		return total;
	}
	
	public void add(PortaContentores PC) {
		listaPC.add(PC);
	}
	
	public void add(Petroleiro P) {
		listaP.add(P);
	}
}
