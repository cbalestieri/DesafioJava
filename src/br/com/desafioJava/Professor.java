package br.com.desafioJava;

public class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private int tempoDeCasa;
    private int codProfessor;

    //Construtor

    public Professor(String nomProf, String sobProf, int tempoCasa, int codProf) {
        this.nomeProfessor = nomProf;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.tempoDeCasa = tempoCasa;
        this.codProfessor = codProf;
    }

    //Getters e Setters

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    //Verifica código de professor
    private boolean existeCodigoProfessor(int codProfessor) {
        return codProfessor == this.codProfessor;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }
}

