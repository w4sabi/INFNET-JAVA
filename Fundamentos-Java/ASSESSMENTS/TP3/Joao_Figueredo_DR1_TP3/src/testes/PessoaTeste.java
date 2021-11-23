package testes;

import dominio.Aluno;
import dominio.Professor;
import exceptions.NomeIncompletoException;
import exceptions.NumeroInvalidoException;

public class PessoaTeste {

	public static boolean verificaMedia(double nota1, double nota2) {
		if(nota1 <= 10 || nota2 >= 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws NumeroInvalidoException {
	
		Aluno a1 = new Aluno("joao", "fig");
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno("lauro", "mauro", 7, 10);
		Professor p1 = new Professor();
		Professor p2 = new Professor("Manoel", "Silveira","Filosofia");
		
		try {
			a1.setNotaAV1(-1);
			a1.setNotaAV2(20);
			System.out.println(a1);
		}catch(NumeroInvalidoException  e) {
			System.out.println(e.getMessage());
		}

		System.out.println("------------");
		
		try {
			a2.setNome("Genivaldo Santos Pedro");
			a2.setSobrenome("lOla");
			a2.setNotaAV1(200);
			a2.setNotaAV2(30);
		}catch(NumeroInvalidoException | NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
		try {
			a3.setNome("a");
			a3.setSobrenome("b");
			a3.setNotaAV1(1);
			a3.setNotaAV2(1);
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
		
		try {
			p1.setNome("lOla");
			p1.setSobrenome("luLi");
			p1.setMateria("Matematica");
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
		try {
			p2.setNome("c");
			p2.setSobrenome("d");
			p2.setMateria("tetris");
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}