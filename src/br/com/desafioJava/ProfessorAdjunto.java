package br.com.desafioJava;

public class ProfessorAdjunto extends Professor {
    private int horasMonitoria;

    public ProfessorAdjunto(String noProf, String sobProf, Integer tempoDeCasa, Integer codProfessor) {
        super(noProf, sobProf, tempoDeCasa, codProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    //Getters e Setters
    public int getHorasMonitoria() {
        return horasMonitoria;
    }
    public void setHorasMonitoria(int horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
