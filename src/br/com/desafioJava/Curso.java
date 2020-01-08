package br.com.desafioJava;

public class Curso {
    //Atributos
    private String nomeCurso;
    public Integer codCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer maximoAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private Integer totalAlunos;

    public Curso(String nomeCurso, Integer codCurso, Integer maximoAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.maximoAlunos = maximoAlunos;
    }

    //Métodos Especiais

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (this.maximoAlunos > this.totalAlunos) {
            listaAlunos.add(umAluno);
            this.totalAlunos = totalAlunos + 1;
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        listaAlunos.remove(umAluno);
        this.totalAlunos = totalAlunos - 1;
    }

    //Getters e Setters

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        if (existeCodigoCurso(codCurso)) {
            System.out.println("Erro! Curso já existe!");
        } else {
            this.codCurso = codCurso;
            System.out.println("Curso cadastrado com suceso!");
        }
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    private boolean existeCodigoCurso(int codCurso) {
        return codCurso == this.codCurso;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Integer getMaximoAlunos() {
        return maximoAlunos;
    }

    public void setMaximoAlunos(Integer maximoAlunos) {
        this.maximoAlunos = maximoAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
