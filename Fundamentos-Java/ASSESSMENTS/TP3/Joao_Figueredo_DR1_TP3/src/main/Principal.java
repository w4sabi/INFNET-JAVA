package main;

import java.util.ArrayList;
import auxiliar.Constantes;
import dominio.Aluno;
import dominio.Professor;
import exceptions.NomeIncompletoException;
import exceptions.NumeroInvalidoException;

import java.util.Scanner;

public class Principal {

    private static ArrayList<Aluno> listaAluno;
    private static ArrayList<Professor> listaProfessor;
    private static int quantidadeAluno = 0;
    private static int quantidadeProfessor = 0;
    
    private static boolean verificaTamanhoId(int id) {
        if(id < 0 || id > Constantes.quantidadeMaxima){
            System.out.println("ERROR");
            return true;
        }
        return false;
    }
    
    
    private static void imprimir(){
            System.out.println("---- Listagem de Alunos e Professores ----");
            System.out.println("");            
            System.out.println("ALUNOS: ");            
            for(Aluno aluno: listaAluno) {
                System.out.println(aluno);
            }
            System.out.println("");
            System.out.println("Professores: ");
            for(Professor prof: listaProfessor) {
            	System.out.println(prof);
            }
            System.out.println("");
            System.out.println("------------------------------------------");
    }
            
    public static void main(String[] args) throws NomeIncompletoException, NumeroInvalidoException {

    	listaProfessor = new ArrayList<Professor>();
    	listaAluno = new ArrayList<Aluno>();
        
        int opcao = 0;
        
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("[1] Cadastrar Aluno");
            System.out.println("[2] Cadastrar Professor");
            System.out.println("[3] Consulta Individual");
            System.out.println("[4] Consultar todos");
            System.out.println("[5] Sair");
            System.out.print("Informa a Op��o: ");
            try{
                opcao = Integer.valueOf(in.next());
            } catch (NumberFormatException e){
                System.out.println("Op��o Inv�lida!");
                opcao = 5;
            }
            
            switch(opcao){
                case 1:
                    if(quantidadeAluno < Constantes.quantidadeMaxima){
                        Aluno novoAluno = new Aluno();
                    
                        System.out.println("Informe o nome: ");
                        novoAluno.setNome(in.next());
                        
                        System.out.println("Informe o sobrenome: ");
                        novoAluno.setSobrenome(in.next());

                        System.out.println("Informe a nota da AV1: ");
                        novoAluno.setNotaAV1(in.nextInt());
                        
                        System.out.println("Informe a nota da AV2: ");
                        novoAluno.setNotaAV2(in.nextInt());
                        
                        listaAluno.add(novoAluno);
                        
                        novoAluno.impressao();
                        
                        quantidadeAluno++;
                    }else{
                        System.out.println("N�mero m�ximo de alunos atingido!");
                    }
                    break;
                case 2:
                    if(quantidadeProfessor < Constantes.quantidadeMaxima){
                        Professor novoProf = new Professor();
                    
                        System.out.println("Informe o nome: ");
                        novoProf.setNome(in.next());
                        
                        System.out.println("Informe o sobrenome: ");
                        novoProf.setSobrenome(in.next());

                        System.out.println("Informe a mat�ria que ir� lecionar: ");
                        novoProf.setMateria(in.next());
                        
                        listaProfessor.add(novoProf);
                        
                        novoProf.impressao();
                        
                        quantidadeProfessor++;
                    }else{
                        System.out.println("N�mero m�ximo de professores atingido!");
                    }
                    break;
                case 3:
                	System.out.println("[1] Aluno");
                	System.out.println("[2] Professor");

                	System.out.print("Informe o digito: ");
                	int AlunoProf = in.nextInt();

                	System.out.println("Informe o ID: ");
                    int id = in.nextInt();
                    
                    if(verificaTamanhoId(id)) {
                    	break;
                    }else {
	                    if (AlunoProf == 1){
	    					listaAluno.get(id).impressao();
	                    }else if(AlunoProf == 2){
	    					listaProfessor.get(id).impressao();
	                    }else{
	                        System.out.println("ERROR");
	                    }                	
                    }
                    break;
                case 4:
                	imprimir();
                    break;
                case 5:
                    System.out.println("Saindo!");
                    break;
                default:                    
                    System.out.println("Op��o Inv�lida!");
                    break;
            }
        }while(opcao != 5);
        in.close();
        
        System.out.println("Processamento finalizado!");
    }
    
}
