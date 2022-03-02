package ProjetoExtra1;

import java.util.UUID;

public class Utilizador {

	/*
	 * Cada utilizador � caraterizado por um nome, idade, e n�mero de utilizador
	 * �nico. Os clientes realizam compras na App Store
	 */
	//Registar novos utilizadores e atribuir automaticamente n�meros �nicos.
	
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
