package br.com.desafioJava;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager dhmanager = new DigitalHouseManager();
        System.out.println("Registrar dois professores titulares");
        dhmanager.registrarProfessorTitular("Juliana", "Souza", 5245, "C++");
        dhmanager.registrarProfessorTitular("Maria Tereza", "Nunes da Silva", 2101, "Javascript");

        System.out.println("Registrar dois professores adjuntos");
        dhmanager.registrarProfessorAdjunto("João Carlos", "Machado", 2155, 25);
        dhmanager.registrarProfessorAdjunto("Darci", "Reis", 3699, 30);

        System.out.println("Registrar dois cursos");
        dhmanager.registrarCurso("Front End", 123, 30);
        dhmanager.registrarCurso("PHP", 121, 20);

        System.out.println("Alocar um professor titular e um adjunto");
        dhmanager.alocarProfessores(123, 5245, 2155);
        dhmanager.alocarProfessores(121, 5245, 2155);
        dhmanager.alocarProfessores(123, 2101, 3699);
        dhmanager.alocarProfessores(121, 2101, 3699);

        System.out.println("Matricular dois alunos no curso de Front End");
        dhmanager.registrarAluno("Maria", "da Graça", 100);
        dhmanager.matricularAluno(100, 123);
        dhmanager.registrarAluno("Katiúscia", "Lavrov, 101");
        dhmanager.matricularAluno(101, 123);

        System.out.println("Matricular três alunos no curso de PHP");
        dhmanager.registrarAluno("Jacinta", "das Dores", 103);
        dhmanager.matricularAluno(103, 121);
        dhmanager.registrarAluno("Maxwell", "Ferreira", 104);
        dhmanager.matricularAluno(104, 121);
        dhmanager.registrarAluno("Valdisnei", "Bispo", 105);
        dhmanager.matricularAluno(105, 121);

        System.out.println("Consultar Matricula de aluno");
        dhmanager.consultarMatriculaAluno(100);
    }
}

