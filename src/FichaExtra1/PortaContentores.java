package FichaExtra1;

public class PortaContentores extends Navio {

	/*
	 * Um navio porta-contentoresé um navio com atributo adicional, onúmeromáximo de
	 * contentores (int).
	 */
	
	private int contentores;

	public PortaContentores(String nome, float comprimento, int contentores) {
		super(nome, comprimento);
		this.contentores = contentores;
		// TODO Auto-generated constructor stub
	}

	public int getContentores() {
		return contentores;
	}

	public void setContentores(int contentores) {
		this.contentores = contentores;
	}
	
}
