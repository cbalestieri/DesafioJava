package br.com.desafioJava;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas= new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaCursos.add(curso);
        System.out.println("Curso criado com sucesso!");
    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (codigoCurso == listaCursos.get(i).getCodigoCurso()) {
                listaCursos.remove(listaCursos.get(i));
                System.out.println("Curso excluído com sucesso!");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras);
        listaProfessores.add(professorAdjunto);
        System.out.println("Professor adicionado com sucesso!");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade);
        listaProfessores.add(professorTitular);
        System.out.println("Professor adicionado com sucesso!");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (codigoProfessor == listaProfessores.get(i).getCodigoProfessor()) {
                listaProfessores.remove(listaProfessores.get(i));
                System.out.println("Professor excluído com sucesso!");
            }
        }
    }

    public void gerarAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        int k = 0;
        int x = 0;
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoCurso().equals(codigoCurso)) {
                for (int i1 = 0; i1 < listaAlunos.size(); i1++) {
                    if (listaAlunos.get(i1).getCodigoAluno().equals(codigoAluno)) {

                        x= 1;
                        if (listaCursos.get(i).adicionarUmAluno(listaAlunos.get(i1))){
                            Matricula matricula = new Matricula(listaAlunos.get(i1), listaCursos.get(i));
                            listaMatriculas.add(matricula);
                        }
                    }
                }
                k= 1;
            }
        }
        if (k== 0) {
            System.out.println("Não há este curso!");
        }
        if (k== 1 && x== 0) {
            System.out.println("Aluno ainda não foi gerado, favor matriculá-lo no sistema!");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoCurso() == codigoCurso) {
                for (int i1 = 0; i1 < listaProfessores.size(); i1++) {
                    if (listaProfessores.get(i1).getCodigoProfessor() == codigoProfessorAdjunto) {
                        listaCursos.get(i).setProfessorAdjunto(listaProfessores.get(i1));
                        System.out.println("Professor Adjunto alocado com sucesso! :D");
                    }
                    if (listaProfessores.get(i1).getCodigoProfessor() == codigoProfessorTitular) {
                        listaCursos.get(i).setProfessorTitular(listaProfessores.get(i1));
                        System.out.println("Professor Titular alocado com sucesso! :D");
                    }
                }
            } else {
                System.out.println("O curso não existe! :(");
            }
        }
    }

    public void imprimirDados(){
        System.out.println(listaProfessores);
        System.out.println(listaMatriculas);
        System.out.println(listaCursos);
        System.out.println(listaAlunos);
    }

}