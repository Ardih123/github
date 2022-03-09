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
	private List<Navio> listaNavios;
	
	public Porto(List<PortaContentores> listaPC, List<Petroleiro> listaP, List<Navio> listaNavios) {
		this.listaPC = listaPC;
		this.listaP = listaP;
		this.listaNavios = listaNavios;
	}

	public boolean isDupe (List<Navio> listaNavios) {
		boolean verifica = false;
		for(int i = 1; i < listaNavios.size(); i++) {
			if(!(listaNavios.get(i).getId().equals(listaNavios.get(0).getId()))) {
				verifica = false;
			}
			else {
				verifica = true;
				break;
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
	
	public void addPC(PortaContentores PC) {
		if(isDupe(listaNavios) == false) {
			listaPC.add(PC);
		}
	}
	
	public void addP(Petroleiro P) {
		if(isDupe(listaNavios) == false) {
			listaP.add(P);
		}
	}
	
}
