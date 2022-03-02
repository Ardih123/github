package ProjetoExtra1;

public class Aplica��o {

	/*
	 * As aplica��es t�m associado um nome, um pre�o, uma avalia��o (classifica��o
	 * de 1 a 5), um tipo (Games, Business, Education, Lifestyle, Entertainment,
	 * Utilities, Travel e Health & Fitness) e um programador.
	 */
	//Incluir novas aplica��es com a informa��o necess�ria
	
	private String nome;
	private double preco;
	private double avaliacao;
	private TipoAplica��o tipoAplicacao;
	
	public Aplica��o(String nome, double preco, double avaliacao, TipoAplica��o tipoAplicacao) {
		this.nome = nome;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.tipoAplicacao = tipoAplicacao;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public TipoAplica��o getTipoAplicacao() {
		return tipoAplicacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setTipoAplicacao(TipoAplica��o tipoAplicacao) {
		this.tipoAplicacao = tipoAplicacao;
	}
	
	
}
