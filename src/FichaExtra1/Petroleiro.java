package FichaExtra1;

public class Petroleiro extends Navio {

	/*
	 * Um navio petroleiro é um navio com atributo adicional capacidade de carga
	 * (float), em toneladas.
	 */
	
	private float carga;

	public Petroleiro(String nome, float comprimento, float carga) {
		super(nome, comprimento);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}
	
}
