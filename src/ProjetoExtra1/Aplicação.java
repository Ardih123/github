package ProjetoExtra1;

public class Aplicação {

	/*
	 * As aplicações têm associado um nome, um preço, uma avaliação (classificação
	 * de 1 a 5), um tipo (Games, Business, Education, Lifestyle, Entertainment,
	 * Utilities, Travel e Health & Fitness) e um programador.
	 */
	//Incluir novas aplicações com a informação necessária
	
	private String nome;
	private double preco;
	private double avaliacao;
	private TipoAplicação tipoAplicacao;
	
	public Aplicação(String nome, double preco, double avaliacao, TipoAplicação tipoAplicacao) {
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

	public TipoAplicação getTipoAplicacao() {
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

	public void setTipoAplicacao(TipoAplicação tipoAplicacao) {
		this.tipoAplicacao = tipoAplicacao;
	}
	
	
}
