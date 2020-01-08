package br.com.desafioJava;

public class ProfessorTitular extends Professor {
    private final String noProf;
    private final String sobProf;
    private final Integer tempoDeCasa;
    private String especialidade;
    private final Integer codProfessor;

    public ProfessorTitular(String noProf, String sobProf, Integer tempoDeCasa, String especialidade, Integer codProfessor) {
        super(noProf, sobProf, tempoDeCasa, codProfessor);
        this.noProf = noProf;
        this.sobProf = sobProf;
        this.tempoDeCasa = tempoDeCasa;
        this.especialidade = especialidade;
        this.codProfessor = codProfessor;
    }

    public ProfessorTitular(String noProf, String sobProf, Integer codProf, String especialidade) {
        super();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {

        return super.toString() +
                "{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
