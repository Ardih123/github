package Extra1;

import java.util.UUID;

public class Utilizador {

	/*
	 * Cada utilizador é caraterizado por um nome, idade, e número de utilizador
	 * único. Os clientes realizam compras na App Store
	 */
	
	private String nome;
	private int idade;
	private static UUID id;
	
	public Utilizador(String nome, int idade) {
		UUID.randomUUID();
		this.nome = nome;
		this.idade = idade;
	}

	public String getnome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public static UUID getId() {
		return id;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void setId(UUID id) {
		Utilizador.id = id;
	}
	
	
}
