package FichaExtra1;

import java.time.LocalDate;
import java.util.UUID;

public class Navio {

	/*
	 * Um navio é genericamente caracterizado pela seguinte informação:
	 * Identificadordo Navio (String), nome (String), ano de construção (Date)e
	 * comprimento (float).
	 */
	
	private String nome;
	private LocalDate anoConstrucao;
	private float comprimento;
	private LocalDate dataConstrucao = LocalDate.now();
	private UUID id;
	
	public Navio(String nome, float comprimento) {
		super();
		this.nome = nome;
		this.anoConstrucao = dataConstrucao;
		this.comprimento = comprimento;
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getAnoConstrucao() {
		return anoConstrucao;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoConstrucao(LocalDate anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
}
