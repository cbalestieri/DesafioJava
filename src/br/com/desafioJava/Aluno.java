package br.com.desafioJava;

public class Aluno {

    //Atributos
    private String nomeAluno;
    private String sobrenomeAluno;
    private Integer codAluno;

    //Construtor

    public Aluno(String nomAl, String sobAl, Integer cod) {
        this.nomeAluno = nomAl;
        this.sobrenomeAluno = sobAl;
        this.codAluno = cod;
    }

    //Getters e Setters

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSobrenomeAluno() {
        return sobrenomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno) {
        this.sobrenomeAluno = sobrenomeAluno;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }
}
