package model.domain;

public class Solicitante {
	
	private String nome;
	private String email;
	private String cpf;
	
	public Solicitante(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
//		formas de fazer a mesma coisa
//		return nome+";"+email+";"+cpf;
//		return String.format("%s;%s;%s", nome, email, cpf);
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" ; ");
		sb.append(email);
		sb.append(" ; ");
		sb.append(cpf);
		
		return sb.toString();
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getCpf() {
		return cpf;
	}
	
}
