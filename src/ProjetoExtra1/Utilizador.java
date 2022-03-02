package ProjetoExtra1;

import java.util.UUID;

public class Utilizador {

	/*
	 * Cada utilizador é caraterizado por um nome, idade, e número de utilizador
	 * único. Os clientes realizam compras na App Store
	 */
	//Registar novos utilizadores e atribuir automaticamente números únicos.
	
	private String nome;
	private int idade;
	private UUID id;
	
	public Utilizador(String nome, int idade) {
		id = UUID.randomUUID();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public UUID getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
