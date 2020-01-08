package br.com.desafioJava;

public class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private int tempoDeCasa;
    private int codProfessor;

    public Professor(String noProf, String sobProf, int tempoDeCasa, int codProf) {
        this.nomeProfessor = noProf;
        this.sobrenomeProfessor = sobProf;
        this.tempoDeCasa = tempoDeCasa;
        this.codProfessor = codProf;
    }

    public Professor() {

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

    public int getCodProfessor() {
        return codProfessor;
    }

    public String setCodProfessor(int codProfessor) {
        if (existeCodigoProfessor(codProfessor)) {

        } else {
            this.codProfessor = codProfessor;
        }
        return null;
    }
}

