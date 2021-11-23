package testes;

import dominio.Aluno;
import exceptions.NomeIncompletoException;
import exceptions.NumeroInvalidoException;

public class AlunoTestes {
	
    public static void main(String[] args) throws NumeroInvalidoException {
        
        Aluno primeiroAluno = new Aluno();
        try {
	        primeiroAluno.setNome("Rodolfo");
	        primeiroAluno.setSobrenome("D'Avila");
	        primeiroAluno.setNotaAV1(5.5);
	        primeiroAluno.setNotaAV2(7);
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
        System.out.println(primeiroAluno);
        System.out.println("");
	    primeiroAluno.impressao();

	    System.out.println("____________________________");
	    System.out.println("");
	    
        Aluno segundoAluno = new Aluno();
        try {
	        segundoAluno.setNome("Matheuszin");
	        segundoAluno.setSobrenome("Do Berequenblack");
	        segundoAluno.setNotaAV1(9);
	        segundoAluno.setNotaAV2(10);
		}catch(NomeIncompletoException  e) {
			System.out.println(e.getMessage());
		}
        System.out.println(segundoAluno);
	    System.out.println("");
	    segundoAluno.impressao();
    }
}
