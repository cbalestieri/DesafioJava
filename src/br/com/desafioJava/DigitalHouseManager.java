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

    //Registrar curso de forma dinâmica:
    public static void registrarCurso() {
//Iniciando o Scanner
        Scanner scanner = new Scanner(System.in);
//Nome do curso
        System.out.print("Informe o nome do Curso");
        String nomeCurso = scanner.next();

        if (nomeCurso == "") {
            System.out.println("Dados inválidos!");
        }
//Código do curso
        System.out.print("Informe o código do curso");
        Integer codCurso = scanner.nextInt();

        if (codCurso == 0) {
            System.out.println("Dados inválidos!");
        }

//Número máximo de alunos
        System.out.print("Informe o número máximo de alunos");
        Integer maximoAlunos = scanner.nextInt();

        if (maximoAlunos == 0) {
            System.out.println("Dados inválidos!");
        }
//Adicionando o curso novo à lista de cursos:
        Curso curso = new Curso(nomeCurso, codCurso, maximoAlunos);
        listaCursos.add(curso);
        System.out.println("Curso registrado com sucesso!");
    }

    //Excluir curso de forma dinâmica
    public static void excluirCurso() {

        Scanner scanner = new Scanner(System.in);
//Informar código
        System.out.print("Informe o código do curso");
        Integer codCurso = scanner.nextInt();

        if (codCurso == 0) {
            System.out.println("Dados inválidos!");
        }

//Efetuando remoção
        listaCursos.remove(Curso);
        System.out.println("Curso excluído com sucesso!");
    }

    //Registrar professor adjunto

    public static void registrarProfessorAdjunto() {

        Scanner scanner = new Scanner(System.in);
//Nome Professor
        System.out.print("Informe o nome do Professor Adjunto");
        String noProf = scanner.next();
        if (noProf == "") {
            System.out.println("Dados inválidos!");
        }

//Sobrenome Professor
        System.out.print("Informe o sobrenome do Professor Adjunto");
        String sobProf = scanner.next();

        if (sobProf == "") {
            System.out.println("Dados inválidos!");
        }

//Código do professor
        System.out.print("Informe o código do Professor Adjunto");
        Integer codProf = scanner.nextInt();

        if (codProf == 0) {
            System.out.println("Dados inválidos!");
        }

//Tempo de casa
        System.out.print("Informe o tempo de casa do Professor Adjunto");
        Integer tempoCasa = scanner.nextInt();

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(noProf, sobProf, tempoCasa, codProf);
        listaProfessores.add((br.com.desafio.Professor) ProfessorAdjunto);
    }

    //Registrar Professor Titular
    public static void registrarProfessorTitular() {

        Scanner scanner = new Scanner(System.in);
//Nome Professor
        System.out.print("Informe o nome do Professor Titular");
        String noProf = scanner.next();
        if (noProf == "") {
            System.out.println("Dados inválidos!");
        }

//Sobrenome Professor
        System.out.print("Informe o sobrenome do Professor Titular");
        String sobProf = scanner.next();

        if (sobProf == "") {
            System.out.println("Dados inválidos!");
        }

//Código do professor
        System.out.print("Informe o código do Professor Titular");
        Integer codProf = scanner.nextInt();

        if (codProf == 0) {
            System.out.println("Dados inválidos!");
        }

//Especialidade
        System.out.print("Informe a especialidade do Professor Titular");
        String especialidade = scanner.next();

        ProfessorTitular professorTitular = new ProfessorTitular(noProf, sobProf, codProf, especialidade);
        listaProfessores.add(ProfessorTitular);
    }

    //Excluir professor de forma dinâmica
    public static void excluirProfessor() {

        Scanner scanner = new Scanner(System.in);
//Informar código
        System.out.print("Informe o código do professor");
        Integer codProf = scanner.nextInt();

        if (codProf == 0) {
            System.out.println("Dados inválidos!");
        }

//Efetuando remoção
        listaProfessores.remove(Professor);
        System.out.println("Professor excluído com sucesso!");
    }

    //Registrar aluno

    public static void registrarAluno() {

        Scanner scanner = new Scanner(System.in);
//Nome Aluno
        System.out.print("Informe o nome do Aluno");
        String nomAl = scanner.next();
        if (nomAl == "") {
            System.out.println("Dados inválidos!");
        }

//Sobrenome Aluno
        System.out.print("Informe o sobrenome do Aluno");
        String sobAl = scanner.next();

        if (sobAl == "") {
            System.out.println("Dados inválidos!");
        }

//Código do aluno
        System.out.print("Informe o código do Aluno");
        Integer cod = scanner.nextInt();

        if (cod == 0) {
            System.out.println("Dados inválidos!");
        }

        Aluno aluno = new aluno(nomAl, sobAl, cod);
        listaAlunos.add(Aluno);
    }

    //Matricular aluno em um curso
    public void matricularAluno() {

        Scanner scanner = new Scanner(System.in);

        //Informar e verificar o código do Curso
        System.out.print("Informe o código do Curso");
        Integer codCurso = scanner.nextInt();

        if (codCurso == 0) {
            System.out.println("Dados inválidos!");
        } else if (!verificaCurso(codCurso)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        }
        //Informar e verificar o código do aluno
        System.out.print("Informe o código do Aluno");
        Integer cod = scanner.nextInt();

        if (cod == 0) {
            System.out.println("Dados inválidos!");
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

    public void alocarProfessores() {

        Scanner scanner = new Scanner(System.in);

        //Informar e verificar o código do Curso
        System.out.print("Informe o código do Curso");
        Integer codCurso = scanner.nextInt();

        if (codCurso == 0) {
            System.out.println("Dados inválidos!");
        } else if (!verificaCurso(codCurso)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        }
        //Informar e verificar o código do Professor Titular
        System.out.print("Informe o código do Professor titular");
        int codProfessorTitular = scanner.nextInt();

        if (codProfessorTitular == 0) {
            System.out.println("Dados inválidos!");
        } else if (!verificaProfessor(codProfessorTitular)) {
            System.out.println("Código não cadastrado, favor informar dados válidos.");
        }

//Informar e verificar o código do Professor Adjunto
        System.out.print("Informe o código do Professor adjunto");
        int codProfessorAdjunto = scanner.nextInt();

        if (codProfessorAdjunto == 0) {
            System.out.println("Dados inválidos!");
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
    public void consultarMatriculaAluno(int cod) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o código do Aluno");
        Integer cod = scanner.nextInt();

        if (cod == 0) {
            System.out.println("Dados inválidos!");
        }else if (!verificaAluno(cod)) {
            System.out.println("Dados inválidos!");
        }

        for (Matricula matricula : listaMatriculas) {
            if (matricula.getAluno().getCodAluno() == cod) {
                System.out.println("O(a) aluno(a) consultado(a) está matriculado(a) no curso " + matricula.getCurso().getNomeCurso());
            }
        }
    }
}

