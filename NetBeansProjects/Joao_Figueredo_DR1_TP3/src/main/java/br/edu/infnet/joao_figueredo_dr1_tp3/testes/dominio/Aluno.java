package br.edu.infnet.joao_figueredo_dr1_tp3.testes.dominio;

/**
 *
 * @author wasabi
 */

public class Aluno {
    
    private int id;
    private String nome;
    private String sobrenome;
    private double notaAV1;
    private double notaAV2;
    private double media;
    private static int indexID;

    public Aluno() {
        this.setId(indexID++);
    }
    
    public Aluno(String nome, double av1, double av2) {
        this.nome = nome;
        this.notaAV1 = av1;
        this.notaAV2 = av2;
    }
    
    public double calculaMedia(){
        media = ((this.notaAV1+this.notaAV2)/2);
        return media;
    }
    
    public String impressao(){
        return ("Nome: "+nome+
                "\nSobrenome: "+sobrenome+
                "\nNota da AV1: "+notaAV1+
                "\nNota da AV2: "+notaAV2+
                "\nMédia: "+calculaMedia());
    }
    
    
    @Override
    public String toString() {
        return ("Nome: "+this.nome+
                "\nSobrenome: "+this.sobrenome+
                "\nNota da AV1: "+this.notaAV1+
                "\nNota da AV2: "+this.notaAV2+
                "\nMédia: "+calculaMedia());
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public static int getIndexID() {
        return indexID;
    }

    public static void setIndexID(int indexID) {
        Aluno.indexID = indexID;
    }
    
    
}
