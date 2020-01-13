package br.com.desafioJava;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager dhmanager = new DigitalHouseManager();

        dhmanager.registrarProfessorTitular("Maria", "Da Cunha", 111,  "C++");
        dhmanager.registrarProfessorTitular("Joana", "Da Silva", 112,  "HTML");
        dhmanager.registrarProfessorAdjunto("Carla", "Santos", 113, 8);
        dhmanager.registrarProfessorAdjunto("Silvana", "Oliveira", 114,  20);

        dhmanager.alocarProfessores(20001, 111,113);
        dhmanager.alocarProfessores(20002, 112,114);

        dhmanager.registrarAluno("Mariana", "das Dores", 221);
        dhmanager.registrarAluno("Julia", "Moreira", 222);
        dhmanager.registrarAluno("Alana", "Pereira", 223);
        dhmanager.registrarAluno("Diana", "Lopez", 224);
        dhmanager.registrarAluno("Hanna", "Camargo", 225);

        dhmanager.registrarCurso("C++", 20001, 3);
        dhmanager.registrarCurso("Front End", 20002, 2);

        dhmanager.matricularAluno(221, 20001);
        dhmanager.matricularAluno(222, 20001);
        dhmanager.matricularAluno(223,20002);
        dhmanager.matricularAluno(224,20002);
        dhmanager.matricularAluno(225, 20002);
    }
}
