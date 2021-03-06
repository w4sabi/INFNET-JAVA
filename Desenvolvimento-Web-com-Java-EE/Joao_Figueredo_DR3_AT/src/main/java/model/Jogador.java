package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import exception.IdadeInvalidaException;
import exception.InvalidEmailException;
import exception.InvalidNameException;
import exception.PersonagensNulosExceptions;

@Entity
@Table(name = "jogadores")
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private int idade;
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "id_personagem")
	private List<Personagem> personagens;
	
	public Jogador() {}
	
	public Jogador(String nome, String email, int idade) throws InvalidNameException, InvalidEmailException, IdadeInvalidaException, PersonagensNulosExceptions {
		
		if(nome == null || nome.length() < 0) {
			throw new InvalidNameException("Nome invalido, insira um valor.");}
		if(email == null || email.length() < 0) {
			throw new InvalidEmailException("Email invalido, insira um valor.");}
		if(idade == 0) {throw new IdadeInvalidaException("Idade invalida, insira um valor.");}
		if(personagens.isEmpty()) {throw new PersonagensNulosExceptions("A lista de personagens está nula!");}
		
		this.nome = nome;
		this.email = email;
		this.idade = idade;
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
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public List<Personagem> getPersonagens() {
		return personagens;
	}
	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

	@Override
	public String toString() {
		return String.format("Jogador [nome=%s, email=%s, idade=%s, personagens=%s]", nome, email, idade, personagens.size());
	}
	

}
