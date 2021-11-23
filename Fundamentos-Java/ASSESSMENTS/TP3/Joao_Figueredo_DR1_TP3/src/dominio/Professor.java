package dominio;

import java.util.ArrayList;
import java.util.List;

import exceptions.NomeIncompletoException;

public class Professor extends Pessoa{
	
    private String materia;
    private static int indexID;
    private static List<String> listaMaterias;
    
    public Professor(){
		this.setId(indexID++);
    }
    
    public Professor(String nome, String sobrenome, String materia){
    	super(nome, sobrenome);
        this.materia = materia;
    }

    @Override
    public void impressao() {
    	super.impressao();
    	System.out.println("Mat�ria: "+this.materia);
    }
    
    
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) throws NomeIncompletoException {
		listaMaterias = new ArrayList<String>();
		
		listaMaterias.add("Portugues"+"Matematica"+"Geografia"+"Historia"+"Fisica"+
		         "Quimica"+"Biologia"+"Educa��o Fisica"+"Filosofia"+"Ingl�s"+"Java");
		
		for(int i = 0; i < listaMaterias.size() ; i++) {
			if(materia != listaMaterias.get(i)) {
	    		throw new NomeIncompletoException("Mat�ria indispon�vel!");
	    	}
		}
		this.materia = materia;
	}

	public static int getIndexID() {
		return indexID;
	}

}

