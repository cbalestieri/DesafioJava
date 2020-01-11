package br.com.desafioJava;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    public static List<Curso> listaCursos = new ArrayList<>();
    public static List<Aluno> listaAlunos = new ArrayList<>();
    public static List<Matricula> listaMatriculas = new ArrayList<>();
    public static List<Professor> listaProfessores = new ArrayList<>();

    //Verificações

    private boolean verificaCurso(int codCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getCodCurso() == codCurso) {
                return true;
            }
        }
        return false;
    }

    private boolean verificaAluno(int codAluno) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCodAluno() == codAluno) {
                return true;
            }
        }
        return false;
    }

    private boolean verificaProfessor(int codProfessor) {
        for (Professor professor : listaProfessores) {
            if (professor.getCodProfessor() == codProfessor) {
                return true;
            }
        }
        return false;
    }


    //Métodos Especiais

    //Inicia Menu

    //Registrar curso
    public void registrarCurso(String nomeCurso, Integer codCurso, Integer maximoAlunos) {
        Curso curso = new Curso(nomeCurso, codCurso, maximoAlunos);
        listaCursos.add(curso);
        System.out.println("Curso registrado com sucesso!");
    }

    //Excluir curso
    public void excluirCurso(Integer codCurso) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (codCurso == listaCursos.get(i).getCodCurso()) {
                listaCursos.remove(listaCursos.get(i));
                System.out.println("Curso excluido com sucesso!");
            }
        }
    }

    //Registrar professor adjunto
    public void registrarProfessorAdjunto(String noProf, String sobProf, Integer codProf, Integer tempoCasa) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(noProf, sobProf, tempoCasa, codProf);
        listaProfessores.add(professorAdjunto);
        System.out.println("Professor Adjunto registrado com sucesso!");
    }

    //Registrar Professor Titular
    public void registrarProfessorTitular(String noProf, String sobProf, Integer codProf, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(noProf, sobProf, codProf, 0, especialidade);
        listaProfessores.add(ProfessorTitular);
        System.out.println("Professor Titular registrado com sucesso!");
    }

    //Excluir professor
    public void excluirProfessor(Integer codProf) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (codProf == listaProfessores.get(i).getCodProfessor()) {
                listaProfessores.remove(listaProfessores.get(i));
        System.out.println("Professor excluído com sucesso!");
    }

    //Registrar aluno

    public boolean registrarAluno(String nomAl, String sobAl, Integer cod) {
        if (verificaAluno(cod)) {
            System.out.println("Impossível cadastrar, código já existe!");
            return false;
        }
        Aluno aluno = new aluno(nomAl, sobAl, cod);
        listaAlunos.add(Aluno);
        System.out.println("Aluno registrado com sucesso!");
        return true;
    }

    //Matricular aluno em um curso
    public void matricularAluno(Integer cod, Integer codCurso) {
        if (!verificaCurso(codCurso)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        } else if (!verificaAluno(cod)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        }
        for (Curso curso : listaCursos) {
            if (curso.getCodCurso() == codCurso) {
                for (Aluno aluno : listaAlunos) {
                    if (aluno.getCodAluno() == cod) {
                        if (curso.adicionarUmAluno(aluno)) {
                            Matricula matricula = new Matricula(aluno, curso);
                            listaMatriculas.add(matricula);
                            System.out.println("Aluno matriculado com sucesso");
                        } else {
                            System.out.println("Nao foi possível realizar a matrícula");
                        }
                    }
                }
            }
        }
    }
//Alocar Professores

    public void alocarProfessores(Integer codCurso, int codProfessorTitular, int codProfessorAdjunto) {
        if (!verificaCurso(codCurso)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        } else if (!verificaProfessor(codProfessorTitular)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        } else if (!verificaProfessor(codProfessorAdjunto)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        }
        for (Curso curso : listaCursos) {
            if (curso.getCodCurso() == codCurso) {
                for (Professor professor : listaProfessores) {
                    if (professor.getCodProfessor() == codProfessorTitular) {
                        curso.setProfessorTitular((ProfessorTitular) professor);
                        System.out.println("Professor Titular alocado com sucesso!");
                    } else if (professor.getCodProfessor() == codProfessorAdjunto) {
                        curso.setProfessorAdjunto((ProfessorAdjunto) professor);
                        System.out.println("Professor Adjunto alocado com sucesso!");
                    }
                }
            }
        }
    }

    public void consultarMatriculaAluno(Integer cod) {
        if (!verificaAluno(cod)) {
            System.out.println("Dados inválidos!");
            for (Matricula matricula : listaMatriculas) {
                if (matricula.getAluno().getCodAluno() == cod) {
                    System.out.println("O(a) aluno(a) consultado(a) está matriculado(a) no curso " + matricula.getCurso().getNomeCurso());
                }
            }
        }
    }
}