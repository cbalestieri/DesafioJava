package br.com.desafioJava;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private List<Aluno> listaAlunos = new ArrayList();
    private Integer maximoAlunos;
    private int totalAlunos = 0;

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = (ProfessorAdjunto) professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = (ProfessorTitular) professorTitular;
    }

    public Curso(){}
    public Curso(String nomeCurso, Integer codigoCurso, Integer max) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.maximoAlunos= max;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (totalAlunos < maximoAlunos) {
            System.out.println("Aluno adicionado com sucesso");
            listaAlunos.add(umAluno);
            totalAlunos++;
            return true;
        } else {
            System.out.println("Impossível adicionar. Curso alcançou a lotação máxima!");
            return false;
        }
    } public void excluirAluno(Aluno umAluno) {
        listaAlunos.remove(umAluno);
        System.out.println("Aluno excluído com sucesso!");
    }
}