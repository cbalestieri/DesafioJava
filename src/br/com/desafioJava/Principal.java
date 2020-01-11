package br.com.desafioJava;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager dhmanager = new DigitalHouseManager();

        //criando os professores no sistema
        dhmanager.registrarProfessorTitular("Maria", "Da Cunha", 111,  "C++");
        dhmanager.registrarProfessorTitular("Joana", "Da Silva", 112,  "HTML");
        dhmanager.registrarProfessorAdjunto("Carla", "Santos", 113, 8);
        dhmanager.registrarProfessorAdjunto("Silvana", "Oliveira", 114,  20);
        //alocando professores em seus cursos
        dhmanager.alocarProfessores(20001, 111,113);
        dhmanager.alocarProfessores(20002, 112,114);

        //Registrando as alunas
        dhmanager.gerarAluno("Mariana", "das Dores", 221);
        dhmanager.gerarAluno("Julia", "Moreira", 222);
        dhmanager.gerarAluno("Alana", "Pereira", 223);
        dhmanager.gerarAluno("Diana", "Lopez", 224);
        dhmanager.gerarAluno("Hanna", "Camargo", 225);

        //Registrando os cursos
        dhmanager.registrarCurso("C++", 20001, 3);
        dhmanager.registrarCurso("Front End", 20002, 2);

        //Matriculando as alunas nos cursos
        dhmanager.matricularAluno(221, 20001);
        dhmanager.matricularAluno(222, 20001);
        dhmanager.matricularAluno(223,20002);
        dhmanager.matricularAluno(224,20002);
        dhmanager.matricularAluno(225, 20002);

        //dh.imprimirDados();
    }
}
