package br.com.infnet.model;

public class User {

	private String nome;
	private String email;
	private String senha;

	public User() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "User [Nome= " + nome 
				+ ", Email= " + email 
				+ ", Senha= " + senha + "]";
	}
	
	
	
}
