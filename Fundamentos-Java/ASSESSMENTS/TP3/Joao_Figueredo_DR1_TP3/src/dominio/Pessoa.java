package dominio;

import exceptions.NomeIncompletoException;

public class Pessoa {
	private int id;
	private String nome;
	protected String sobrenome;
	
	public Pessoa() {
		this.nome = ("John");
		this.sobrenome = ("Doe");
	}
	
	public Pessoa(String nome, String sobrenome) {
		this();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	public String obterNomeCompleto(){
		StringBuilder nomeCompleto = new StringBuilder();
				 
		nomeCompleto.append(this.getSobrenome().toUpperCase());
		nomeCompleto.append(", ");
		nomeCompleto.append(this.getNome().toLowerCase());
		nomeCompleto.append("\r\n");

		return nomeCompleto.toString();
	}
	
	public void impressao(){
		System.out.println("ID: "+this.getId());
		System.out.println("Nome: " +nome);
		System.out.println("Sobrenome: " +sobrenome);
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeIncompletoException {
		if (nome.length() < 2) {
    		throw new NomeIncompletoException("Nome tem que ter mais de 2 caracteres!");
		}
		this.nome = nome.trim();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) throws NomeIncompletoException {
		if (sobrenome.length() < 2) {
    		throw new NomeIncompletoException("Sobrenome tem que ter mais de 2 caracteres!");
		}
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
        return ("Nome: "+this.nome+
                "\nSobrenome: "+this.sobrenome);	
    }
	
}
